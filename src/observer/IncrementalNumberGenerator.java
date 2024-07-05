package observer;

import java.util.ArrayList;
import java.util.List;

public class IncrementalNumberGenerator extends NumberGenerator{

    public List<Observer> observers = new ArrayList<>();
    private int num;
    private int end;
    private int mul;

    public IncrementalNumberGenerator(int start, int end, int mul) {
        this.num = start;
        this.end = end;
        this.mul = mul;
    }

    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void execute() {
        for (int i=num; i < end; i = i + mul) {
            num = i;
            notifyObservers();
        }
    }


}
