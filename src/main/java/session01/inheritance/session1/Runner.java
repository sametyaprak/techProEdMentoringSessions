package session01.inheritance.session1;

import java.util.*;

public class Runner {


    public static void main(String[] args) {


        //this is an abstract class
        //we can not create an object
        //BasePerson person =  new BasePerson();


        SalaryCalculator calculator = new SalaryCalculator();

        Worker secretary = new Manager();

        //! companySalaryCalculator method call calculateSalary() method but
        //! java does not know which method will be called.(we have overwritten methods)
        calculator.companySalaryCalculator(secretary);

        if(secretary instanceof Manager ){
            System.out.println("manager");
        } else if(secretary instanceof Secretary ){
            System.out.println("secretary");
        } else  if(secretary instanceof Worker ){
            System.out.println("worker");
        }


        //polymorphism examples in core java library.

        List<Secretary>secretaries1 = new ArrayList<>();
        List<Secretary>secretaries2 = new LinkedList<>();
        List<Secretary>secretaries3 = new Vector<>();
    }
}
