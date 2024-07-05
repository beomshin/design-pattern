package memento;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        new Memento(100);

        for (int i=0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("상태:" + gamer);


            gamer.bet();

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("많이 늘었으니 현재 상태를 저장하자");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("많이 줄었으니 이전 상태를 원복하자!");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
