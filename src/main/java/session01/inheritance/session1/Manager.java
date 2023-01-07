package session01.inheritance.session1;

public class Manager extends Secretary{


    int baseSalary = 500;

    String projectName;

    @Override
    int calculateSalary(){
        System.out.println("this is manager");
        return baseSalary + bonusSalary;
    }



}
