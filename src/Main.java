//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Задание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);


        String fullName1 = "Иванов Семён Семёнович";                // не очень догнал до того, как использовать то же название для строки и чтобы всё работало в одном проекте без изменения строк в самом начале проекта
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);
    }
}