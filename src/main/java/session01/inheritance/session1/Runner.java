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
        }	public ByteArrayInputStream getUserReport() {
		List<User> users = userService.getUsers();
		try {
			return ExcelReporter.getUserExcelReport(users);
		} catch (IOException e) {
			throw new RuntimeException(ErrorMessage.EXCEL_REPORT_ERROR_MESSAGE);
		}
	}
	public ByteArrayInputStream getCarReport() {
		List<Car> cars = carService.getAllCar();
		try {
			return ExcelReporter.getCarExcelReport(cars);
		} catch (IOException e) {
			throw new RuntimeException(ErrorMessage.EXCEL_REPORT_ERROR_MESSAGE);
		}
	}
	public ByteArrayInputStream getReservationReport() {
		List<Reservation> reservations = reservationService.getAll();
		try {
			return ExcelReporter.getReservationExcelReport(reservations);
		} catch (IOException e) {
			throw new RuntimeException(ErrorMessage.EXCEL_REPORT_ERROR_MESSAGE);
		}
	}
        //polymorphism examples in core java library.
        List<Secretary>secretaries1 = new ArrayList<>();
        List<Secretary>secretaries2 = new LinkedList<>();
        List<Secretary>secretaries3 = new Vector<>();
        //polymorphism examples in core java library.
        List<Secretary>secretaries1 = new ArrayList<>();
        List<Secretary>secretaries2 = new LinkedList<>();
        List<Secretary>secretaries3 = new Vector<>();
    }
}
