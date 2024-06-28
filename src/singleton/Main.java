package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스 입니다.");
        } else {
            System.out.println("obj1과 obj2는 같은 인스턴스 아닙니다.");
        }
        System.out.println("End.");

        TicketMaker ticketMaker = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        if (ticketMaker == ticketMaker2) {
            System.out.println("ticketMaker ticketMaker2 같은 인스턴스 입니다.");
        } else {
            System.out.println("ticketMaker ticketMaker2 같은 인스턴스 아닙니다.");
        }

        ticketMaker.getNextTicketNumber();
        ticketMaker2.getNextTicketNumber();

        System.out.println(ticketMaker.getTicket());
        System.out.println(ticketMaker2.getTicket());

        Triple triple = Triple.getInstance("ALPHA");
        Triple triple2 = Triple.getInstance("BETA");
        Triple triple3 = Triple.getInstance("GAMMA");

        System.out.println(triple.getName());
        System.out.println(triple2.getName());
        System.out.println(triple3.getName());

    }
}
