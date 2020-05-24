package ru.elebedinskiy.java1;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static char[][] map;

    public static void main(String[] args)
    {
        initMap();
        printMap();

        while (true)
        {
            humanTurn();
            printMap();

            if (isWinner(DOT_X))
            {
                System.out.println("Победил человек.");
                break;
            }
            else if (isMapFull())
            {
                System.out.println("Ничья.");
                break;
            }

            aiTurn();
            printMap();

            if (isWinner(DOT_O))
            {
                System.out.println("Победил компьютер.");
                break;
            }
            else if (isMapFull())
            {
                System.out.println("Ничья.");
                break;
            }
        }

        System.out.println("Игра закончена.");
    }

    static void initMap()
    {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap()
    {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    static void humanTurn()
    {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Введите координаты в формате X Y");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    static void aiTurn()
    {
        int x;
        int y;

        Random random = new Random();

        do
        {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isWinner(char symbol)
    {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol)
        {
            return true;
        }
        else if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol)
        {
            return true;
        }
        else if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol)
        {
            return true;
        }
        else if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol)
        {
            return true;
        }
        else if (map[0][1] == symbol && map[1][1] == symbol && map[1][2] == symbol)
        {
            return true;
        }
        else if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol)
        {
            return true;
        }
        else if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol)
        {
            return true;
        }
        else if (map[0][2] == symbol && map[1][1] == symbol && map[2][1] == symbol)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
