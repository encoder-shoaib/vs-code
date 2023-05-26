package SimpleAbstruction;

public class Honda  extends Bike{
  void run()
  {
    System.out.println( "Honda can run fast more than pusler car");
  }

  public  void  quality (){
     System.out.println( "Hondas quality is very good . This is on of the fastest car in the world ");
    
  }

  public static void main(String[] args) {
    Bike obj = new Honda();
    obj.run();
    obj.spreed();
    // obj.quality(); ata hobe na because ami ai class ar jonno obj torie korini .
    

    Honda d = new Honda();
    d.quality();
  }
}
