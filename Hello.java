package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {
        int a1 = 100500; // от -2147483648 до 2147483647
        byte a2 = -50; // от -128 до 127
        short a3 = 850; // от -32768 до 32767
        long a4 = 9223372036854775806L; // от -9223372036854775808 до 9223372036854775807, в конце ставим L
        float a5 = 25.804993f; // как int только с плавающей точкой, в конце ставим f
        double a6 = 2; // с плавающей точкой, с двойной точностью
        char a7 = '*'; // для хранения юникод значений, размерность 16 бит
        boolean a8 = true; // правда или ложь
        String a9 = "Строковое значение"; // строковая переменная после объявления не может быть изменена

        float a = 4, b = 6, c = 8, d = -10;

        System.out.println("\nЗадание 1: метод возвратит результат вычисления формулы");
        System.out.println("a * (b + (c / d)) = " + formulaСalculation(a,b,c,d));

        System.out.println("\nЗадание 2: метод возвратит true, если сумма числе неходится между 10 и 20");
        System.out.println("a = " + a + ", b = " + b + "\nСумма a + b лежит между 10 и 20? -> " + isInIntervalFrom10To20(a,b));

        System.out.println("\nЗадание 3: метод возвратит true, если число больше или равно 0");
        System.out.println("Число c = " + c + "\nЧисло положительное? -> " + isAboveZero(c));

        System.out.println("\nЗадание 4: метод возвратит true, если число меньше 0");
        System.out.println("Число d = " + d + "\nЧисло отрицательное? -> " + isLessThanZero(d));

        System.out.println("\nЗадание 5: метод возвратит приветствие пользователя по имени");
        String name = "Евгений";
        helloName(name);

        System.out.println("\nЗадание 6: метод делает проверку високосный год или нет");
        int year = 2016;
        System.out.println("Год = " + year + "\nГод високосный? -> " + isLeapYear(year));

    }
    static float formulaСalculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean isInIntervalFrom10To20(float a, float b) {
        boolean i = false;
        if (a + b > 10) {
            if (a + b < 20) {
                i = true;
            }
        }
    return i;
    }

    static boolean isAboveZero(float a) {
        if (a >= 0) {
            return true;
        } return false;
    }

    static boolean isLessThanZero(float a) {
        if (a < 0) {
            return true;
        } return false;
    }

    static void helloName(String name){
        System.out.println("Привет, " + name);
    }

    static boolean isLeapYear(int a) {
        boolean i = false;
        if (a % 100 == 0) {
            i = true;
        } else if (a % 400 == 0){
            i = true;
        } else if (a % 4 == 0){
            i = true;
        }
        return i;
    }

}