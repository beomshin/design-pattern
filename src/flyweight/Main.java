package flyweight;

public class Main {

    public static void main(String[] args) {
        String s = "012012";

        BigString bs  = new BigString(s);
        bs.print();
    }
}
