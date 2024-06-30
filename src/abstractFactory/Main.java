package abstractFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명 : ");
        String filename = sc.nextLine();
        System.out.println();
        System.out.print("클래스명 : ");
        String classname = sc.nextLine();
        System.out.println();

        Factory factory = Factory.getFactory(classname);

        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://example.com/blog2");
        Link blog3 = factory.createLink("Blog 3", "https://example.com/blog3");


        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link new1 = factory.createLink("News 1", "https://example.com/news1");
        Link new2 = factory.createLink("News 2", "https://example.com/news2");
        Tray news3 = factory.createTray("News Site");

        news3.add(factory.createLink("News 3(US)", "https://example.com/news3us"));
        news3.add(factory.createLink("News 3(Korea)", "https://example.com/news3kr"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(new1);
        newsTray.add(new2);
        newsTray.add(news3);

        Page page = factory.createPage("Blog and News", "Youngjin.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }
}
