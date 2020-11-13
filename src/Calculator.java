public class Calculator {
    public static class Calculate{
        static int sumNumber(int sum1,int sum2,int sum3){
            int arithmetic=((sum1+sum2+sum3)/3);
            return arithmetic;
        }

        public static void main(String[] args) {
            int num1=5,num2=8,num3=12;
            int arithmetic= sumNumber(num1,num2,num3);
            System.out.println(arithmetic);
        }
    }
}
