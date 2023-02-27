import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        /*
         * The approach goes that we have to cut the paper into 1x1 unit size. First we can take any side and make cut
         * from one side to other so that the width of the left over paper is 1. Next we keep the paper as it is and change the
         * orientation of cut. So that the length (This time) of the paper becomes 1. 
         * 
         * Mathematically, to cut one edge of the paper with length n, we will need n-1 cuts. And the same for the other orientation.
         * So the resulting will be the sum of one orientation with the other. That is n-1 + m-1.
         */

        System.out.println((n - 1) + (m - 1));


    }
}
