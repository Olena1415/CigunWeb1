import java.util.ArrayList;

public class D {


    public static void main(String[] args) {
        for (int a = 1; a < 12; a++) {

            ArrayList<Integer> ar = new ArrayList<>();
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0) {
                    ar.add(i);
                }
            }
            int m = 1;

            for (Integer ir : ar) {
                m = m + ir;
            }
            if (2 * a <= m) {
                System.out.println(a);
            }

        }


    }
}











