
public class ArrayDefine {
    public static void main(String[] args) {
        double [] a=new double[7];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        ////////////////////////////////////////        
        System.out.println("GetMax");
        double max=a[0];
        for(int j=1;j<a.length;j++){
            if(a[j]>max)
            max=a[j];
        }
        System.out.println(max);
        ////////////////////////////////////////
        System.out.println("Average");
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            double avg=sum/a.length;
            if (i==a.length-1) {
                System.out.println(avg);
            }
        }
        ////////////////////////////////////////
        System.out.println("Resort");
        for(int i=0;i<a.length/2;i++){
            double temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        ////////////////////////////////////////
        System.out.println("指向同一数组");        
        double[] b=a;
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}