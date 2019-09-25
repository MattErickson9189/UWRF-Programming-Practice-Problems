package universe;

import java.util.*;

public class Universe {

    // main
    public static void main(String[] args) {

        // open scanner
        Scanner in = new Scanner(System.in);

        // while loop that will break when x = 42
        while (true) {
            // x will = the next line
            int x = in.nextInt();
            // if x = 42 then break
            if (x == 42)
                break;
            // else print x
            System.out.println(x);
        }
        in.close();
    }
}
