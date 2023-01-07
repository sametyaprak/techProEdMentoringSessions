package session01.inheritance.session1;

public class Secretary extends Worker{


    int baseSalary = 300;

    private int age;

    private String departmentInfo;


    @Override
    int calculateSalary(){
        System.out.println("this is secretary");
        return baseSalary + bonusSalary;
    }



}
