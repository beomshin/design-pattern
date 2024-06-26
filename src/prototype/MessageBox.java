package prototype;

public class MessageBox implements Product {


    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    private MessageBox(MessageBox messageBox) {
        this.decochar = messageBox.decochar;
    }

    @Override
    public void use(String s) {
        int declen = 1 + s.length() + 1;
        for (int i=0; i < declen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i=0; i < declen; i++) {
            System.out.print(decochar);
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
//        return p;
        return new MessageBox(this);
    }
}
