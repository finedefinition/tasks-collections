package arraylist.comparetwoarraylists;

import java.util.ArrayList;

/*
В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату,
и список сотрудников alreadyGotSalaryEmployees, которые её уже получили.
Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает
имя сотрудника, желающего получить зарплату.
Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
Добавить имя сотрудника в список alreadyGotSalaryEmployees.
В списке waitingEmployees заменить имя сотрудника на null.
Требования:
•	Метод paySalary(String) должен добавлять в список alreadyGotSalaryEmployees имя сотрудника,
 если он есть в списке waitingEmployees.
•	Метод paySalary(String) должен заменять имя сотрудника на значение null,
        если он есть в списке waitingEmployees.
•	Метод paySalary(String) не должен изменять списки waitingEmployees и alreadyGotSalaryEmployees,
        если переданного имени нет в списке waitingEmployees.
•	Если в метод paySalary(String) передается null, метод не должен добавлять это значение в waitingEmployees
        или alreadyGotSalaryEmployees.
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Guinno");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Guinno");
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
          //  int index = waitingEmployees.get(name);
            System.out.println(alreadyGotSalaryEmployees);
            System.out.println(waitingEmployees);
        }
    }
}
