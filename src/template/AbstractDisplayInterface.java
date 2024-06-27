package template;

public interface AbstractDisplayInterface {

    void open();
    void print();
     void close();

     default void display() {
         open();
         for (int i=0 ; i < 5 ;i++) {
             print();
         }
         close();
     }
}
