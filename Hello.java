package ru.elebedinskiy.java1;

import java.util.ArrayList;
import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        // Задание 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1: заменить 0 на 1, 1 на 0 в исходном массиве");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(arr));

        // Задание 2
        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j; // для шага задействована вторая переменная j
        }
        System.out.println("\nЗадание 2: заполнить в цикле массив длинной 8 и шагом 3:");
        System.out.println("Результат: " + Arrays.toString(arr2));

        // Задание 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nЗадание 3: числа меньшие 6 в исходном массиве умножить на 2");
        System.out.println("Исходный массив: " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Обработанный массив: " + Arrays.toString(arr3));

        // Задание 4
        int square = 10; // длинна квадратной сетки массива
        int[][] arr4 = new int[square][square];
        System.out.println("\nЗадание 4: диагональ квадратного двумерного массива заполнить значениями 1");
        diagonalArray(arr4);
        printArray(arr4);

        // Задание 5
        int[] arr5 = new int[arr3.length];
        arr5 = arr3; // За исходный одномерный массив примем полученный из задания 3
        System.out.println("\nЗадание 5: требуется узнать максимальное и минимальное значение");
        System.out.println("Исходный массив: " + Arrays.toString(arr5));
        System.out.println("Максимальное значение: " + maxArrayValue(arr5));
        System.out.println("Минимальное значение: " + minArrayValue(arr5));

        // Задание 6
        int[] arr6 = {1, 2, 3, 3, 2, 1};
        System.out.println("\nЗадание 6: метод вернёт true, если массив можно разделить на две равные по сумме части");
        System.out.println("Исходный массив: " + Arrays.toString(arr6));
        System.out.println("В массиве есть такое место? -> " + checkBalance(arr6));

        // Задание 7
        int[] arr71 = {1, 2, 3, 4, 5, 6};
        int[] arr72 = {1, 2, 3, 4, 5, 6};
        int n1 = 2;
        int n2 = -2;
        System.out.println("\nЗадание 7: требуется сместить элементы массива на n позиций, по принципу карусели");
        System.out.print("Исходный массив " + Arrays.toString(arr71) + " сместим на n = " + n1);
        System.out.println(" получится массив: " + Arrays.toString(moveArrayElements(arr71, n1)));
        System.out.print("Исходный массив " + Arrays.toString(arr72) + " сместим на n = " + n2);
        System.out.println(" получится массив: " + Arrays.toString(moveArrayElements(arr72, n2)));
    }

    // Метод для вывода массива в консоль
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Метод для заполнения квардратного массива по диагонали значениями 1
    static void diagonalArray(int arr[][]) {
        for (int i = 0, j = 0, a = (arr.length - 1); i < arr.length; i++, j++, a--) {
            arr[i][j] = 1;
            arr[a][j] = 1; // Задействовал третью переменную "a" для перебора с конца строки
        }
    }

    // Метод возвращающий минимальное значение одномерного массива
    static int minArrayValue(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // Метод возвращающий минимальное значение одномерного массива
    static int maxArrayValue(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Метод вернёт true, если массив можно разделить на две равные по сумме части
    static boolean checkBalance(int arr[]) {

        // вычислим сумму элементов массива
        int sum = 0, sum1 = 0, sum2 = 0;
        for (int i =  0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        // по одному элементу перемещаем из одной суммы в другую
        for (int i =  0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
            sum2 = sum - sum1;
            // сравниваем суммы
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    // Метод вернёт массив смещённый на n позиций вправо или влево в зависимости от значения "n"
    // Без использования вспомогательного массива, только с одной новой переменной
    static int[] moveArrayElements(int[] arr, int n) {
        if (n >= 0){ // если n положительное, то цикл смещений будет вправо
            for (int i = 1; i <= n; i++){
                for (int j = 1, buffer = arr[arr.length - 1]; j < arr.length + 1; j++) {
                    /* если это последняя итерация, то последний сохранённый элемент
                    запишем в нулевой элемент массива и выйдем из цикла */
                    if (j == arr.length){
                        arr[0] = buffer; // сохранённый последний элемент запишем в 0 элемент массива
                        break;
                    }
                    // смещение с конца: в последний элемент запишем предыдущий элемент, и т.д.
                    arr[arr.length - j] = arr[arr.length - 1 - j];
                }
            }
        } else if (n < 0) { // если n отрицательное, то цикл смещений будет влево
            for (int i = n; i < 0; i++){
                for (int j = arr.length - 1, buffer = arr[0]; j >= 0; j--) {
                    /* если это последняя итерация, то нулевой сохранённый элемент
                    запишем в последний элемент массива и выйдем из цикла */
                    if (j == 0){
                        arr[arr.length - 1] = buffer; // сохранённый последний элемент запишем в 0 элемент массива
                        break;
                    }
                    // смещение с начала: в первый элемент запишем следующий элемент, и т.д.
                    arr[arr.length - j - 1] = arr[arr.length - j];
                }
            }
        }
        return arr;
    }
}