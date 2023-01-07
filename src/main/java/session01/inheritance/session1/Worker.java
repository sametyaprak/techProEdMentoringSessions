package session01.inheritance.session1;

public class Worker extends BasePerson{

    //! by changing the access modifiers, you can limit the object creation.
    protected Worker() {
    }

    //! you can write custom constructor and force the developers to use this.
    //!all worker objects should be created with name and surname information
    public Worker(String name, String surname) {
        super.name = name;
        super.surname = surname;
    }

    int baseSalary = 200;
    int age;

    int calculateSalary(){
        System.out.println("this is worker");
        return baseSalary + bonusSalary;
    }





}
