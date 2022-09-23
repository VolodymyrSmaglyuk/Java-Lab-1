package Fibonacci_class;


/**
 * This class represents Fibonacci number and provides methods for working with it.
 * @author Volodymyr Smaglyuk
 * */
public class Fibonacci {
    private final int n;
    private final int fibnum;

    /**
     * This is a constructor of class Fibonacci.
     * @param n Fibonacci number which user want to find.
     * @param fibnum Value of Fibonacci number.
     * */
    public Fibonacci(int n, int fibnum) {
        this.n = n;
        this.fibnum = fibnum;
    }

    /**
     * This method is for printing all data about object of Fibonacci class.
     * */
    @Override
    public String toString() {
        return "\nN-е число Фібоначчі для заданого N: " + n + " = " + fibnum;
    }

}

