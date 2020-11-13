public class Conversation {


    static class Conversion {

        static int curr(int kurs1, int kurs2) {

            int a = (kurs1 / kurs2);
            return a;
        }


        public static void main(String[] args) {

            double currUAH = 800, curr = 28.7;

            double a = cur(currUAH, curr);

            System.out.println(a);


        }
    }
}


