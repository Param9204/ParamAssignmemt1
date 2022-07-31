public class P1_7 {
    private static final String string = " ";

    {
        int num = 0;
        for (int r = 0; r <= 7; r++) {

            for (int p = 1; p <= 7 - r; p++) {
                System.out.printf("%4s", string); //put a space until total row and column comes
            }

            for (int p = 0; p <= r; p++) {
                num = (int) Math.pow(2, p); //print power of 2 in the row as per row

                System.out.printf("%4d", num);
            }

            for (int p = r - 1; p >= 0; p--) {
                num = (int) Math.pow(2, p);

                System.out.printf("%4d", num); // print the power of 2 is print to make a proper pyramid
            }
            System.out.println();
            }

        }
    }

