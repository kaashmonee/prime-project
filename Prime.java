
/**
 * Write a description of class Prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prime
{
    // instance variables - replace the example below with your own
    private int x;

   

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static boolean primeSum (int n, int k)
    {//for some reason, algorithm doesn't work for 11. not sure why. figure that out. 
        if (n==1) return false;
        else if (isPrime(n)) {
        return k==1 || (n/2>=k && k>1);
    }
        else
        return n/2>=k && k>1;
    }
    
    public static boolean isPrime(int a) {
        if (a%15==0 ||a%13==0 || a%11==0 || a%7==0 || a%5==0 || a%3==0 || a%2==0) return true;
        else return false;
    }
}
