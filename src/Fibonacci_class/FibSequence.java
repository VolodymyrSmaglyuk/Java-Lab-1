package Fibonacci_class;

import java.util.ArrayList;
import java.util.Arrays;

public class FibSequence {
    public ArrayList<Fibonacci> numbers = new ArrayList<> ();
    private final int []arr;
    /**
     * Constructor of FibSequence class.
     * @param size size of array for Fibonacci sequence .
     * */
    public FibSequence(int size) {
        this.arr = new int[size + 1];
    }
    /**
     * This method is for creating Fibonacci objects and then adding them to numbers list.
     * @param array array whith N for object of Fibonacci class.
     * */
    public void GenerateFibNumbersList(int []array){
        for (int j : array) {
            Fibonacci numb = new Fibonacci (j, 0);
            numbers.add (numb);
        }
    }
    /**
     * This method is for generating Fibonacci sequence.
     * It also sets needed values form sequence to elements of Fibonacci objects list.
     * */
    public void GenerateFibonacciSequence(){
        this.arr[0] = 0;
        this.arr[1] = 1;
        int k = 2;
        for(;k < this.arr.length;k++){
            this.arr[k] = this.arr[k - 2] - this.arr[k - 1];
        }
        for (Fibonacci number : numbers) {
            k = number.getN ();
            number.setFibnum (this.arr[-k]);
        }
    }
    /**
     * Getter for list of Fibonacci objects/
     * @return numers - list
     * */
    //щоб в main вивести масив обєктів Фібоначчі
    public ArrayList<Fibonacci> getNumbers() {
        return numbers;
    }
    /**
     * This method is used for representing Fibonacci sequence
     * */
    @Override
    public String toString() {
        return "Послідовність Фібоначчі: "+ Arrays.toString (arr);
    }
}

