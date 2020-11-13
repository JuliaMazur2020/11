public class Arithmetics {
    static double add(double num1, double num2) {
        double addResult = num1 + num2;
        return addResult;

    }

    static double sub(double num1, double num2) {
        double subResult = num1 - num2;
        return subResult;
    }

    static double nul(double num1, double num2) {
        double nulResult = num1 * num2;
        return nulResult;
    }

    static double div(double num1, double num2) {
        double divResult;
        if (num2 != 0) {
            divResult = num1 / num2;
            return divResult;
        }
        return 0;
    }



    public static void main(String[] args) {
        double num1=12, num2=5;

        System.out.println("Добавление"+add(num1,num2));
        System.out.println("Отнимание"+sub(num1,num2));
        System.out.println("Умножение"+nul(num1,num2));
        System.out.println("Деление"+div(num1,num2));
    }

}

