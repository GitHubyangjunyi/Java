package test;

class Circle{
    private double R;

    public Circle(){
        R=0;
    }

    public Circle(double r){
        this.R=r;
    }

}

class Cy extends Circle{
    private double h;

    public Cy(double r,double h){
        super(r);
        this.h=h;
    }

    public void Show(){
        System.out.println(this.h);
    }
}

public class SuperTest {

    public static void main(String[] args) {
        Cy x=new Cy(2,2);
        System.out.println();
    }
}