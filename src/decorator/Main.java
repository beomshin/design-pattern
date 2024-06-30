package decorator;

public class Main {

    public static void main(String[] args) {
//        Display b1 = new StringDisplay("Hello. world");
//        Display b2 = new SideBorder(b1, '#');
//        Display b3 = new FullBorder(b2);
//        b1.show();
//        b2.show();
//        b3.show();
//
//        Display d4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello. world.")), '*'))), '/');
//
//        d4.show();

//        Display b4 = new StringDisplay("Hello, world.");
//        Display b5 = new UpDownBorder(b4, '-');
//        Display b6 = new SideBorder(b5, '*');
//        b4.show();
//        b5.show();
//        b6.show();
//
//
//        Display b7 = new FullBorder(
//                new UpDownBorder(
//                        new SideBorder(
//                                new UpDownBorder(
//                                        new SideBorder(
//                                                new StringDisplay("Hello world.")
//                                    ,'*')
//                            , '=')
//                    , '|'),
//            '/')
//        );
//
//        b7.show();

        MultiStrngDisplay md = new MultiStrngDisplay();

        md.add("Hi!");
        md.add("Good morning.");
        md.add("Good night!");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(d1);
        d2.show();
    }
}
