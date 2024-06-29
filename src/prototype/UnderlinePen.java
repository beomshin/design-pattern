package prototype;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    private UnderlinePen(UnderlinePen underlinePen) {
        this.ulchar = underlinePen.ulchar;
    }

    @Override
    public void use(String s) {
        int ulne = s.length();
        System.out.println(s);
        for (int i=0; i < ulne; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
//        Product p = null;
//        try {
//            p = (Product) clone();
//         } catch (CloneNotSupportedException e) {
//            e.printStackTrace();;
//        }
        return new UnderlinePen(this);
    }
}
