import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
// 演示如何利用NIO从一个文本文件中读取信息并打印到标准输出上

public class JavaNIO {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileChannel fc = new FileInputStream("./targetfile/JavaNIO.txt").getChannel();
			ByteBuffer buf = ByteBuffer.allocate(1024);// ByteBuffer申请了1024B的空间
			fc.read(buf);// 通过通道FileChannel的read()方法获取文件的部分内容
			buf.flip();// ByteBuffer的flip()方法让缓冲区的起始位置回到起点
			fc.close();
			String encoding = System.getProperty("file.encoding");// 在转换成CharBuffer之前必须构造一个代表当前文件编码的Charset对象,并调用其中的解码方法decode
			CharBuffer cb = Charset.forName(encoding).decode(buf);// 按照正确的编码方式构造CharBuffer,此时获得的CharBuffer,除了数据部分和ByteBuffer共享外,其他属性都是独立的
			System.out.println(cb);// 隐含调用了toString(),该方法返回一个包含缓冲区中所有字符的字符串
		} catch (Exception e) {

		}
	}

}
// 期末复习,理解是先让系统开放一个通道指向文件,然后开辟缓冲区,让通道将文件内容读入缓冲区
// 缓冲区回到起点,通道关闭
//
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
//
// NIO中的缓冲
// 抽象的Buffer类是java.nio包支持缓冲区的基础,而ByteBuffer就是具体与通通交互的缓冲区的代表
// ByteBuffer的工作方式就像内存中用于读写基本数据类型的RandomAccessFile
// 与RandomAccessFile一样,使用ByteBuffer时，所执行的下一个操作(读/写)都是在当前某个位置发生
// 执行读写这两个操作中的任何一个都会改变那个位置,所以在写操作之后进行读操作不会读到刚才所写的内容
// 而会读到刚才所写内容之后的数据
// Buffer提供四个指示方法,用于访问线性结构
// capacity():表明缓冲区的大小
// limit():说明到目前为止已经往缓冲区填入多少字节,或者用limit(int newLimit)来改变这个限制
// position():返回当前的位置,以执行下一个读/写操作
// mark():为了稍后用rest()进行重新设置而记住某个位置
// 缓冲区的基本操作是get()和put(),用以从缓冲区中读取或向缓冲区中放人数据
// ByteBuffer只能处理简单的数据类型
// ByteBuffer类针对字节缓冲区定义了以下六类操作:
// 1.读写单个字节的绝对和相对get()和put()方法
// 2.将此缓冲区的连续字节序列传输到数组中的相对批量get()方法
// 3.将byte数组或其他字节缓冲区中的连续字节序列传输到此缓冲区的相对批量put()方法
// 4.读写其他基本类型值,并按照特定的字节顺序在字节序列之间转换这些值的绝对和相对get()和put()方法
// 5.创建视图缓冲区的方法,这些方法允许将字节缓冲区视为包含其他基本类型值的缓冲区
// 6.对字节缓冲区进行压缩、重复和分拆的方法
// 为了最大限度地提升Java系统I/O的速度,NIO实现了直接与非直接缓冲区
// ByteBuffer字节缓冲区要么是直接的,要么是非直接的,如果为直接字节缓冲区,则Java虚拟机会尽最大努力直接在此缓冲区上执行本机I/O操作
// 也就是说,在每次调用基础操作系统的一个本机I/O操作之前(或之后),虚报机都会尽量避免将缓冲区的内容复制到中间缓冲区中(或从中间缓冲区中复制内容)
// 直接字节缓冲区可以通过调用此类的allocateDirect方法来创建,此方法返回的缓冲区进行分配和取消分配所需成本通常高于非直接缓冲区
// 直接缓冲区的内容可以驻留在常规的垃圾回收堆之外,因此,它们对应用程序的内存需求量造成的影响可能并不明显
// 建议将直接缓冲区主要分配给那些易受基础系统的本机I/O操作影响的大型的持久的缓冲区
// 一般情况下,最好仅在直接缓冲区能在程序性能方面带来明显好处时分配它们
//
// N1O提供了七种特定的Buffer类型,每一种类型对应着一种基本数据类型
// ByteBuffer
// CharBuffer
// DoubleBuffer
// FloatBuffer
// IntBuffer
// LongBuffer
// ShortBuffer
// 只有ByteBuffer才能与通道直接交互,当应用程序从通道中接收到一个ByteBuffer后
// 为了读取其中的字符串必须首先按照字节的方式读取内容然后再构造字符串,是一种非常原始的方式
// 为了能够更加方便地操作ByteBuffer,ByteBuffer提供了视图缓冲区功能
// 所谓视图缓冲区就是通过asCharBuffer()、asIntBuffer()等方法将ByteBuffer转换为另外一种模式
// 例如CharBuffer,通过视图,完全可以按照CharBuffer提供的方法来操作缓冲区
// 但是这里并没有进行任何数据复制,CharBuffer视图和ByteBuffer共享同一块数据区域
//
// NIO中的通道,通道Channel表示程序到具体实体的连接,而连接可以处于打开或关闭状态
// 这些通道表示能够执行I/O操作的实体(如文件和网络套接字),同时java.nio.channels还定义了用于多路复用/非阻塞的I/O操作选择器
// java.nio.channels包定义的一些基础通道列表表
// Channel 用于I/O操作的连接
// ReadableByteChannel 将内容读入缓冲区
// ScatteringByteChannel 将内容读入缓冲区序列
// WritableByteChannel 从缓冲区中写入内容
// GatheringByteChannel 从缓冲区序列中写入内容
// ByteChannel 从缓冲区读取内容或向其写入内容
// Channels 用于通道/流进行互操作的使用工具方法
// FileChannels 读取/写入/映射/操作文件
// FileLock 对文件(文件区域)的锁定
// MappedByteBuffer 映射到文件区域的直接字节缓冲区
//
// Channels实用工具类定义了各种静态方法,能够实现NIO与java.io包中流类之间的互操作
// 不仅能从InputStream或OutputStream中获取通道,也可以根据通道构造InputStream或OutputStream
// FileChannel类支持从连接到文件的通道读取字节或向其写人字节,以及查询和修改当前的文件位置和将文件截取为指定大小等常见操作
// 它定义了在整个文件或具体文件区域上获取锁定的方法,这些方法返回FileLock类的实例
/// 最后它定义了对要写人到存储设备的文件进行强行更新的方法、在文件和其他通道之间高效传输字节的方法,以及将文件区域直接映射到内存中的方法
// 最后一个操作是创建MappedByteBuffer类的实例,该实例扩展了ByteBuffer类,具有多种文件相关的操作
// 由于Java已经向java.io包的每个FileInpuSteam/FilOutpuStream和RandomAccessFile类添加了getChannel()方法
// 在这些类的某个类的实例上调用此方法将返回一个连接到底层文件的文件通道
//
// 阻塞模式和非阻塞模式
// Java NIO带来的一个特色就是非阻塞模式,对于一个通道而言,它要么处于阻塞模式,要么处于非阻塞模式
// 所谓阻塞模式,是指每一个I/O操作完成之前都会阻塞在其通道上调用的其他I/O操作
// 传统的InputStream和OutputSream也属于阻塞模式
// 而在非阻塞模式中永远不会阻塞I/O操作,并且传输的字节可能少于请求的数量,或者可能根本不传输字节
// 一个新创建的通道总是处于阻塞模式,这是符合习惯的
// 非阻塞模式是一种完全不同的I/O模式,在这种模式下,如果读取的信息少于请求的信息数量,系统不会像阻塞模式一样停在那里,而是马上返回,由程序员来决定如何处理
// NIO的非阻塞模式家族由可选择通道、选择器和选择键组成
// 可选择通道是种可以被设置"非阻塞模式"的特殊类型的通道,为了能够使用非阻塞模式带来的高伸缩性,首先要创建一个或者多个可选择通道,并将其设置成非阻塞模式
// 然后就需要将这些可选择通道注册到一个选择器中,所谓选择器,就是这些可选择通道的多路复用器,通道在注册到选择器的时候,会返回一个选择键,标注了该通道已经被注册到选择器中
// 一旦通道注册完毕获得了选择键,就可执行选择操作以发现哪些通道(如果有)已经准备好执行先前已声明感兴趣的一个或多个操作
// 如果某个通道已准备就绪,则将注册时所返回的键添加到该选择器的已选择键集中,为了确定每个通道已准备好执行哪些操作,可以检查该键集和其中的键
// 为了执行所需的任何I/O操作,可根据每个键获取相应的通道