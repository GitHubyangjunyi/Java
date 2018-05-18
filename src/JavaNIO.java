import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class JavaNIO {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	try{
    		FileChannel fc=new FileInputStream("./targetfile/JavaNIO.txt").getChannel();
    		ByteBuffer buf=ByteBuffer.allocate(1024);
    		fc.read(buf);
    		buf.flip();
    		fc.close();
    		String encoding=System.getProperty("file.encoding");
    		CharBuffer cb=Charset.forName(encoding).decode(buf);
    		System.out.println(cb);
    	}catch (Exception e) {
    		
    	}
    }

}
// NIO带来的速度提高主要是由于其所使用的结构更加接近操作系统执行I/O的方式:通道和缓冲
// 通道想象成火车铁轨,而缓冲就是铁轨上的火车,乘客是希望发送或接收的数据
// 火车载满了乘客回到了车站,从火车上下了大量的乘客,当希望发送乘客时,又从车库提出一列火车,搭载乘客并将火车送到相应的铁轨上
// 换句话说,程序员从来都不会和通道打交道,只是和缓冲区交互,并把缓冲区派送到通道上,通道要么从缓冲区中获得数据,要么向缓冲区发送数据
// 唯一与通道打交道的缓冲区是ByteBuffer类,顾名思义,它可以存储未加工的字节
// ByteBuffer是一个非常基础的类,它只能构造并以原始的方式输人输出基本数据类型,而无法读取对象,甚至也不包括字符串类型
// 但原始的操作换来简单的实现以及性能的提升,因为大多数操作系统的输人输出都是这样的
// java.nio.channels包定义了Channel的概念,Channel是一个可以进行I/O操作的通道(例如,通过FileChannel,可以对文件进行读写操作)
// java.nio.channels包含了文件系统和与网络通信相关的channel类,这个包通过Selector和SelectableChannel两个类
// 还定义了一个进行异步(non-blocking)I/O操作的API,这对需要高性能I/O的应用非常重要
// 为了获取Channel,旧的I/O类库中有三个类被修改了,用以产生FileChannel
// 这三个类是FileInputStream.FileOutputstream以及RandomAccessFile类
// 可以看出,Java只能从面向字节的I/O类中获取Channel,而不能从面向字符的I/O类中获取Channel
// 相反的是,通过使用java.nio.channels,Channel类中提供的方法,可以从Channel中获取Reader和Writer
// NIO中的缓冲
// 抽象的Buffer类是java.nio包支持缓冲区的基础,而ByteBuffer就是具体与通通交互的缓冲区的代表
// ByteBuffer的工作方式就像内存中用于读写基本数据类型的RandomAccessFile
// 与RandomAccessFile一样,使用ByteBuffer时，所执行的下一个操作(读/写)都是在当前某个位置发生
// 执行读写这两个操作中的任何一个都会改变那个位置,所以在写操作之后进行读操作不会读到刚才所写的内容
// 而会读到刚才所写内容之后的数据
/*
Buffer提供四个指示方法,用于访问线性结构
capacity():表明缓冲区的大小
limit():说明到目前为止已经往缓冲区填入多少字节,或者用limit(int newLimit)来改变这个限制
position():返回当前的位置,以执行下一个读/写操作
mark():为了稍后用rest()进行重新设置而记住某个位置
缓冲区的基本操作是get()和put(),用以从缓冲区中读取或向缓冲区中放人数据
ByteBuffer只能处理简单的数据类型
ByteBuffer类针对字节缓冲区定义了以下六类操作:
1.读写单个字节的绝对和相对get()和put()方法
2.将此缓冲区的连续字节序列传输到数组中的相对批量get()方法
3.将byte数组或其他字节缓冲区中的连续字节序列传输到此缓冲区的相对批量put()方法
4.读写其他基本类型值,并按照特定的字节顺序在字节序列之间转换这些值的绝对和相对get()和put()方法
5.创建视图缓冲区的方法,这些方法允许将字节缓冲区视为包含其他基本类型值的缓冲区
6.对字节缓冲区进行压缩、重复和分拆的方法
// 为了最大限度地提升Java系统I/O的速度,NIO实现了直接与非直接缓冲区
ByteBuffer字节缓冲区要么是直接的,要么是非直接的,如果为直接字节缓冲区,则Java虚拟机会尽最大努力直接在此缓冲区上执行本机I/O操作
// 也就是说,在每次调用基础操作系统的一个本机I/O操作之前(或之后),虚报机都会尽量避免将缓冲区的内容复制到中间缓冲区中(或从中间缓冲区中复制内容)
// 直接字节缓冲区可以通过调用此类的allocateDirect方法来创建,此方法返回的缓冲区进行分配和取消分配所需成本通常高于非直接缓冲区
// 直接缓冲区的内容可以驻留在常规的垃圾回收堆之外,因此,它们对应用程序的内存需求量造成的影响可能并不明显
// 建议将直接缓冲区主要分配给那些易受基础系统的本机I/O操作影响的大型的持久的缓冲区
// 一般情况下,最好仅在直接缓冲区能在程序性能方面带来明显好处时分配它们
// N1O提供了七种特定的Buffer类型,每一种类型对应着一种基本数据类型
ByteBuffer
CharBuffer
DoubleBuffer
FloatBuffer
IntBuffer
LongBuffer
ShortBuffer
只有ByteBuffer才能与通道直接交互,当应用程序从通道中接收到一个ByteBuffer后
// 为了读取其中的字符串必须首先按照字节的方式读取内容然后再构造字符串,是一种非常原始的方式
// 为了能够更加方便地操作ByteBuffer,ByteBuffer提供了视图缓冲区功能
// 所谓视图缓冲区就是通过asCharBuffer()、asIntBuffer()等方法将ByteBuffer转换为另外一种模式
// 例如CharBuffer,通过视图,完全可以按照CharBuffer提供的方法来操作缓冲区
// 但是这里并没有进行任何数据复制,CharBuffer视图和ByteBuffer共享同一块数据区域
演示如何利用NIO从一个文本文件中读取信息并打印到标准输出上
从这个例子中可以
看到,ByteBuffer申请了
的fip()方法让缓冲区的起始位
国城油区的起始位置回到起点，
read0方法获取文件的部分内容。
ByteBuffer
以通首
个代表当前文件
在转换为
ChaBufer之前，必须首先构造一
以便于下面的程序读取内容。
其中的解码方法decode(),
rBune
用以按照正确的编码方式构造
编码的Charset对象，并调用
CharBuffer.
数据部分BrdBof共享外，其他的所有属性都是独立
此时获得的CharBuffer，除了数果CharBuffer的内容打印到标准输出上。这里隐
的。最后调用System. out. printhn
)方法将
楼该方法返回一个包含缓冲区中所有字符的字
toString()方法，
含着调用了CharBufer的t
Java的I/O操1

我的手机 2018/5/18 13:58:48
符串。
8.5.3
NIO中的通道
，这些通
道表示到能够执行I/O操作的实体(如，
java. nio. channels
但定义了各种通道，
io. channels
els包还定义了用于多路复用的、
与此同时,java.'
y的一 此基础通道列表如表8.9所示，
件和网络套接字)的连接。与
包定义的一
寨I/O操作的选择器。
java. nio. channels
包定义的一些基础通道列表
表8.9 jna.nin dandst
捕
述
用于1/O操作的连接
Channel
可以将内容读人缓冲区
ReadableByteChannel
可以将内容读人
缓冲区序列
ScatteringByteC hannel
可以从缓冲区中写人内容
WritableByteChannel
可以从缓
冲区序列中写人内容
GatheringByteChannel
可以从缓冲区读取内容或向其写人内容
ByteChannel
用于通道/流进行互操作的实用工具方法
Channels
读取、写人.映射和操作文件
FileChannel
对文件(文件区域)的锁定
FileLock
映射到文件区城的直接字节缓冲区
MappedByteBuffer
通道Chnned表示程序到具体实体的连接，而连接可以处于打开或者关闭状态。
Blaindhand否定了read()方法。可以将数据从通道读取到缓冲区、
WlielbeByeChmnd与之相似，指定了可以将数据发送到通道中的write()方法，而
ByteChannel则通过简单的继承上述两个通道统一了读写操作。
Channels实用工具类定义了各种静态方法，能够实现NIO与java.io包中流类之间的
互操作。不仅能从InputStream或OutputStream中获取通道，反之，也可以根据通道构造
InputStream或OutputStream.
FileChannel类支持从连接到文件的通道读取字节或向其写人字节，以及查询和修改当
前的文件位置和将文件截取为指定大小等常见操作。它定义了在整个文件或具体文件区域
上获取锁定的方法，这些方法返回FileLock 类的实例。最后，它定义了对要写人到存储设
备的文件进行强行更新的方法、在文件和其他通道之间高效传输字节的方法，以及将文件区
域直接映射到内存中的方法。最后一个操作是创建MappedByteBuffer类的实例，该实例扩
展了ByteBuffer类，具有多种文件相关的操作。
由于Java已经向java.i包的每个FlelnpuSteamnFilOutpuStram和RandomAccsFile
类添加了BelChanne(0方法。在这些类的某个类的实例上调用此方法将返回一个连接到底
层文件的文件通道。
8.5.4阻塞模式和非阻塞模式
JoeNIO带来的一个特色就是非阻塞模式，对于一个通道而言，它要么处于阻塞根
式，要么处于非阻寒模式。所谓阻塞模式，是指每一个VO操作完成之前都会用塞在其进

我的手机 2018/5/18 13:59:02
道上
调用的其他I/O操作，传统的InpuStram和Ouputream也属于阻塞模式。而在非
模式中，永远不会阻塞1O操作，并且传输的字节可能少于请求的数量，或者可能根本
中法输字节。一个新创建的通道总是处于阻塞模式，这是符合习惯的。
非阳寨模式是一种完全不同的I/O模式，在这种模式下，如果读取的信息少于请求的
良数量，系统不会像阻塞模式一样停在那里，而是马上返回,由程序员来决定如何处理。
种1/0模式带来了全新的编程模式。
NIO的非阳塞模式家族由可选择通道、选择器和选择键组成。可选择通道是种可以
话设置“非阻塞模式的特殊类型的通道。为了能够使用非阻塞模式带来的高伸缩性，首先
要创建
个或者多个可选择通道，并将其设置成非阻塞模式。然后就需要将这些可选择通
浦注册到一个选择器中。所谓选择器，就是这些可选择通道的多路复用器，通道在注册到选
格器的时候，会返回一个选择键，标注了该通道已经被注册到选择器中。
一旦通道注册完毕，获得了选择键，就可执行选择操作以发现哪些通道(如果有)已经准
名好执行先前已声明感兴趣的一个或多个操作。 如果某个通道已准备就绪，则将注册时所
返国的键添加到该选择器的已选择键集中。为了确定每个通道已准备好执行哪些操作，可
以检在该键集和其中的键。为了执行所需的任何1O操作。可根据每个键获取相应的
通道
Java
本章介绍了在Java中非常重要的VO操作。首先学习了File类,它代表了硬住上的文
件或文件夹。
该类还提供了大量的操作文件的方法，
，可以很方
便地利用File对文件进行增
加，删除、属性修改等外部操作。
Java1/O 中最核心的部分是1/O流的概念Jva
把各种输人输出都包装成一维的流。
可以把输人流想象成自来水龙头，当需要水的时候，
，只需要打开水龙头就可以了。接收方可
不能再放回水龙头的，读取过的数据也绝
下会再在输
以处理，也可以浪费，但流出来的水是不能再放回本的
者说需要传输数据时，
人流中出现。
而输出流可以想象成下水管道，
当需要放水的时候，或
就需要按照顺序，将数据一个个放入输出流。
了面向字符的I/O类库，它
为了解决异常复杂的字符处理问题，
.JavaV/O类库专门开发了
别就是一
个负责字节的TO致上
1/0.一个负责字符的VO.
们与面向字节的流非常相似，两者的区
计动自动转储到硬盘或网络上。所有的实
A输出
上，将对象自动转储到
Stream或
对象的序列化是在输人输出流的基础控列化，
仅需要调用ObjectlnputS
自动序列化，
安
现了Silizable接口的类都可以被Javeid
方法即可。值得一提的是，序列化与
writeObject
OiectotuputSrem中的edDbiecelwwn
是序员完全是透明的。
, 其中的细节对程序年的1/O模式,更高的1/O效
还原过程能够自动处理整个对象网，其N为
ava提供了全新的
本章的最后介绍了Java的NIO.NOB
NIO为Java
复杂，编程模式更加
难以理解。但是，一旦
传统的1/O更加复
率，更精细的I/O控制，但也比传
;处也是巨大的
理解了NIO的精髓，所带来的益处
Java的I/O操作*/