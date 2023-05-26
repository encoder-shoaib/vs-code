class Base {
    void getInfo() {
        System.out.println("method of Base class");
    }
}

public class Mains extends Base {
    @Override
    void getInfo() {
        System.out.println("method of Derived class");
    }

    public static void main(String[] args) {
        Mains obj = new Mains(); // Create an instance of the derived class
        obj.getInfo(); // Call the overridden method from the derived class
    }
}
