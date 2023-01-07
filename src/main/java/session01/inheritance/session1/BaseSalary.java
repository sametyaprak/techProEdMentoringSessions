package session01.inheritance.session1;


//! Interface variables are static because java interfaces cannot be instantiated on their own.
//! The value of the variable must be assigned in a static context in which no instance exists.
//! The final modifier ensures the value assigned to the interface variable is a true constant that cannot be re-assigned.
//! In other words, interfaces can declare only constants, not instance variables
public interface BaseSalary {

    int bonusSalary = 500;

}
