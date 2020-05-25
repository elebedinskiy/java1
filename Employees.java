package ru.elebedinskiy.java1;

public class Employees {

    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employees(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void printEmployeeInfo(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age){
        System.out.println("ФИО: " + surname + " " + name + " " +  patronymic + ", должность: " + position +
                ", email: " + email + ", тел.: " + phone + ", зп: " + salary + ", возраст: " + age + " лет");
    }
}
