package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    public int money;
    public List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }
}
