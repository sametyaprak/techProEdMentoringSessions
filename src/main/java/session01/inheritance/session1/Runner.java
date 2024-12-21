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
			public static Optional<String> getCurrentUserLogin(){
				SecurityContext securityContext= SecurityContextHolder.getContext();
				Authentication authentication = securityContext.getAuthentication();
				return Optional.ofNullable(extractPrincipal(authentication));
			}

			private static String extractPrincipal(Authentication authentication) {
				if(authentication==null) {
					return null;
				}else if (authentication.getPrincipal() instanceof UserDetails) {
					UserDetails securedUser= (UserDetails) authentication.getPrincipal();
					return securedUser.getUsername();
				}else if(authentication.getPrincipal() instanceof String) {
					return  (String)authentication.getPrincipal();
				}

				return null;

			}
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
