package Fibonacci_class;

import java.util.Scanner;

public class Main {
    // Моє завдання:
    // Визначити N-е число Фібоначчі для заданого N≤0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size,n,biggest=0;
        System.out.println ("Введіть кількість чисел Фібоначчі значення яких бажаєте знайти: ");
        size = scanner.nextInt ();
        int[] arr = new int [size];
        for(int i=0;i<size;i++){
            do {
                System.out.println ("Введіть N (N<=0), для якого бажаєте знайти число Фібоначчі: ");
                n = scanner.nextInt ();
                if(n < 0 && biggest > n){
                    biggest = n;
                }
            } while (n > 0);
            arr[i]=n;
        }
        scanner.close ();
        FibSequence sequence =new FibSequence (-biggest);//оскільки результат найбільше від'ємне число
        sequence.GenerateFibNumbersList (arr);
        sequence.GenerateFibonacciSequence ();
        System.out.println (sequence.getNumbers ());
        System.out.println (sequence);

    }
}
