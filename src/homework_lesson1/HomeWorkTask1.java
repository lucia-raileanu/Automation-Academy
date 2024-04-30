package homework_lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        int n1=5;
        int n2=1;
        int conter=0;
        AtomicInteger counter = new AtomicInteger();
        while (n1>=n2){
            n1-= 1;
        counter.getAndIncrement();}

        System.out.println(counter.get());

    }
}
