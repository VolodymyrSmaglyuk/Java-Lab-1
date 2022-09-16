package Fibonacci_class;


/**
 * This class represents Fibonacci number and provides methods for working with it.
 * @author Volodymyr Smaglyuk
 * */
public class Fibonacci {
    private final int n;
    private int fibnum;

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
     * This method is used to get N number of Fibonacci.
     * @return N number of Fibonacci.
     * */
    public int getN() {
        return n;
    }
    /**
     * This method is used for setting counted number of Fibonacci for count attribute.
     * */
    public void setFibnum(int fibnum) {
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

