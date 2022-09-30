package Fibonacci_class;

import java.util.ArrayList;
import java.util.Arrays;

public class FibSequence {
    public ArrayList<Fibonacci> numbers;
    /**
     * Constructor of FibSequence class.
     * */
    public FibSequence( ) {
        numbers = new ArrayList<> ();
    }
    /**
     * This method is for creating Fibonacci objects and then adding them to numbers list.
     * @param array array whith N for object of Fibonacci class.
     * @param theBiggest the bigest N in array.
     * */
    public void GenerateFibonacciList(int []array,int theBiggest){
        int first=0,second=1;
        if(Arrays.stream(array).anyMatch(i -> i == 0)){
            Fibonacci numb = new Fibonacci(0, first);
            numbers.add(numb);
        }
        if(Arrays.stream(array).anyMatch(i -> i == -1)){
            Fibonacci numb = new Fibonacci(-1, second);
            numbers.add(numb);
        }
        int next;
        Arrays.sort(array);
        for(int i=2;i<=theBiggest;i++) {
            next = first - second;
            first = second;
            second = next;
            if(Arrays.binarySearch(array, -i)>=0){
                Fibonacci numb = new Fibonacci(-i, next);
                numbers.add(numb);
            }
        }
    }
    /**
     * This method is used for representing list of Fibonacci objects.
     */
    public void PrintFibList() {
        for (Fibonacci fib : numbers) {
            System.out.println(fib);
        }
    }
}
