import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        /*
         * The basic logic that we are using is a back tracking method to check if the conditions are satisfied. For this example
         * we are taking the white beads as +1 and black beads as -1 and whenever we will encounter a prime iteration we will add up all the beads to 
         * check if the sum is not negative. Negative sum means that there are more black beads than there are white. We will bruteforce through the 
         * beads and sum up the feasible solutions.
         */
        for (int i = 0; i < cases; i++) {
            int length = sc.nextInt();
            if (length < 1)
                System.out.println(0);
            else if (length == 1)
                System.out.println(2);
            else {
                System.out.println(valid(0, ' ', length, 0));
            }

        }
        sc.close();

    }
    
    // A utility method to check for prime
    public static boolean isPrime(int n)
    {
        if (n == 1 || n == 0)
            return false;
        if (n == 2 || n == 3)
            return true;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    /*
     * This is the recursive function where we add one character in the 'color' variable and check if our 'value' variable is negative
     * or not, if at a prime number the value comes negative, we return that series as not possible, otherwise we continue till the end of the length.
     * 'index' keeps the track of the currect iteration in the recursion that we will use when we have to check during prime position.
     * 'value' variable is our checker if the bracelet beads are not running out of the condition
     */
    public static int valid(int index, Character color, int length ,int value)
    {
        if (color == 'B')
            value--;
        else if (color == 'W')
            value++;
        if (isPrime(index) && value < 0)
            return 0;
        if(index == length)
            if(value >= 0)
                return 1;
            else
                return 0;
        else
            return valid(index + 1, 'B', length, value) + valid(index + 1, 'W', length, value);
    }
    
}
