package horseRace;

import java.util.*;

public class HorseClass {
    public static void main(String[] args) throws java.lang.Exception {

        // open scanner
        Scanner sc = new Scanner(System.in);

        // initialize variables
        int T;
        int N;
        int S[];
        int diff;

        // first input is T
        T = sc.nextInt();

        // get amount of test case
        for (int i = 0; i < T; i++) {

            // the next line is the amount horses
            N = sc.nextInt();
            // make the array for the horses
            S = new int[N];
            // fill the array
            for (int j = 0; j < N; j++) {
                S[j] = sc.nextInt();
            }

            // sort the array
            Arrays.sort(S);
            // initialize diff to the largest number possible
            diff = Integer.MAX_VALUE;
            // cycle though array finding the smallest difference between 2 numbers
            for (int k = 0; k < N - 1; k++) {
                if ((S[k + 1] - S[k]) < diff) {
                    diff = S[k + 1] - S[k];
                }
            }
            // print number
            System.out.println(diff);
        }
        sc.close();
    }
}
