
import java.util.*;

public class day_6_Lets_review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int b;
        int i = 1;
        String a;
        do {
            String d = "";
            String c = "";
            a = sc.next();
            b = a.length();
            for (int j = 0; j < b; j++) {
                if (j % 2 == 0) {
                    d += a.charAt(j);

                } else {

                    c += a.charAt(j);
                }
            }

            System.out.println(d + " " + c);

            i++;
        } while (i <= n);
    }
}

