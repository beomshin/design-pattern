package flyweight;

public class Main {

    public static void main(String[] args) {
        String s = "012012";

        BigString bs  = new BigString(s);
        bs.print();

        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
