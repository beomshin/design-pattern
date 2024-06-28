package factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim", "5343653463");
        Product card2 = factory.create("Heungmin Son", "4565464565");
        Product card3 = factory.create("Kane", "654645645");
        card1.use();
        card2.use();
        card3.use();
    }
}
