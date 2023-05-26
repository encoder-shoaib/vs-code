public class CompareObject {
    public static void main(String[] args) {
        Double sh = new Double(333.4545);
        Integer y = new Integer(334344);
        Long z = new Long (334344);
        System.out.println("Objects are not equal, hence it returns " + sh.equals(y));
        System.out.println("Objects are equal, hence it returns "+ sh.equals(333.4545));
        System.out.println("Objects are equal, hence it returns "+ y.equals(334344));
        System.out.println("Objects are equal, hence it returns "+ z.equals(334344));
    }
}
