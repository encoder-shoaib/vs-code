package Fibonanci;

public class Fibonancis {
public static void main(String[] args) {

    int x=0,y=1,z,count=10;
    System.out.println(x+"\n "+ y);

    for(int i=2;i<count;++i)
    {
        z=x+y;
        System.out.println(z+" ");
        x=y;
        y =z;
    }

}    
}
