package designpatterns.ex1.behavioral;

import java.util.Arrays;

interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Bubble sorting " + Arrays.toString(arr));
        Arrays.sort(arr); // Demo, just use built-in for simplicity
    }
}

class QuickSort implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Quick sorting " + Arrays.toString(arr));
        Arrays.sort(arr);
    }
}

class SortContext {
    private SortStrategy strategy;
    public void setStrategy(SortStrategy s) { strategy = s; }
    public void sort(int[] arr) { strategy.sort(arr); }
}

public class StrategySortDemo {
    public static void main(String[] args) {
        int[] data = {5, 1, 4};
        SortContext ctx = new SortContext();

        ctx.setStrategy(new BubbleSort());
        ctx.sort(data);

        ctx.setStrategy(new QuickSort());
        ctx.sort(data);
    }
}
