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
     * @param thebiggest the bigest N in array.
     * */
    public void GenerateFibonacciList(int []array,int thebiggest){
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
        for(int i=2;i<=thebiggest;i++) {
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
   * This method is used for representing Fibonacci list.
   */
    @Override
    public String toString() {
        return "Знайдені числа Фібоначчі:\n"+numbers+"\n";
    }
}
