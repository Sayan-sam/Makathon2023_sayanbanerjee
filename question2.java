import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int length = sc.nextInt();
            if (length < 1)
                System.out.println(0);
            else if(length == 1)
                System.out.println(2);
            else
            {
                System.out.println(valid(0, ' ', length, 0));
            }

        }
        sc.close();

    }
    
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
