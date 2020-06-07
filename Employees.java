package ru.elebedinskiy.java1;

public class Employees {

    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

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

    public void printInfo(){
        System.out.println("ФИО: " + this.surname + " " + this.name + " " +  this.patronymic + ", должность: " + this.position +
                ", email: " + this.email + ", тел.: " + this.phone + ", зп: " + this.salary + ", возраст: " + this.age + " лет");
    }
    public int getAge(){
        return age;
    }
}
