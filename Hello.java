package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {

        // Объявили массив класса Employees размером 5 элементов
        Employees[] employeesArray = new Employees[5];

        employeesArray[0] = new Employees("Петров", "Петр", "Петрович",
                "Разработчик java", "java@contoso.com", "89030001122", 150000, 25);
        employeesArray[1] = new Employees("Лебединский", "Евгений", "Геннадьевич",
                "Ведущий разработчик java", "java@contoso.com", "89031234567", 220000, 40);
        employeesArray[2] = new Employees("Иванов", "Иван", "Иванович",
                "Менеджер по продажам", "sales@contoso.com", "88005551234", 80000, 22);
        employeesArray[3] = new Employees("Сидоров", "Сидр", "Сидорович",
                "Генеральный директор", "boss@contoso.com", "88005555555", 300000, 59);
        employeesArray[4] = new Employees("Владимиров", "Владимир", "Владимирович",
                "Главный бухгалтер", "finance@contoso.com", "88005554433", 120000, 45);

        // вызов метода с условием
        final int age40AndOlder = 40; // возраст 40 и старше
        printPersonsAge40AndOlder(employeesArray, age40AndOlder);

    }

    // метод выведет список сотрудников "age" лет и старше
    static void printPersonsAge40AndOlder(Employees[] employeesArray, int age){
        System.out.println("Сотрудники, возраст которых " + age + " лет и старше:");
        int countItems = 0;
        for (int i = 0; i < employeesArray.length; i++){
            if (employeesArray[i].age >= age){

                // вызов метода класса Employees для вывода данных в консоль
                Employees.printEmployeeInfo(employeesArray[i].surname,
                        employeesArray[i].name, employeesArray[i].patronymic, employeesArray[i].position,
                        employeesArray[i].email, employeesArray[i].phone, employeesArray[i].salary,
                        employeesArray[i].age);
                countItems++;
            }
        }
        if (countItems == 0){
            System.out.println("Нет записей удовлетворяющих условию");
        } else {
            System.out.println("Кол-во сотрудников: " + countItems);
        }
    }
}