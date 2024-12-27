package session01.inheritance.session1;

import java.util.*;

public class Runner {


    public static void main(String[] args) {
        //this is an abstract class
        //we can not create an object
        //BasePerson person =  new BasePerson();
        SalaryCalculator calculator = new SalaryCalculator();

        book.setPublishDate( bookResponse.getPublishDate() );
        book.setBookCategory( bookResponse.getBookCategory() );
        book.setLoanable( bookResponse.getLoanable() );
        book.setShelfCode( bookResponse.getShelfCode() );
        book.setActive( bookResponse.getActive() );
        book.setFeatured( bookResponse.getFeatured() );
        book.setCreateDate( bookResponse.getCreateDate() );
        book.setBuiltIn( bookResponse.getBuiltIn() );

        return book;
    }

    @Override
    public BookResponse bookToBookResponse(Book book) {
        if ( book == null ) {
            return null;
        }


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

        BookResponse bookResponse = new BookResponse();

        bookResponse.setImage( BookMapper.getImageId( book.getImage() ) );
        bookResponse.setId( book.getId() );
        bookResponse.setName( book.getName() );
        bookResponse.setIsbn( book.getIsbn() );
        bookResponse.setPageCount( book.getPageCount() );
        bookResponse.setBookAuthor( book.getBookAuthor() );
        bookResponse.setBookPublisher( book.getBookPublisher() );
        bookResponse.setPublishDate( book.getPublishDate() );
        bookResponse.setBookCategory( book.getBookCategory() );
        bookResponse.setLoanable( book.getLoanable() );
        bookResponse.setShelfCode( book.getShelfCode() );
        bookResponse.setActive( book.getActive() );
        bookResponse.setFeatured( book.getFeatured() );
        bookResponse.setCreateDate( book.getCreateDate() );
        bookResponse.setBuiltIn( book.getBuiltIn() );

        return bookResponse;
    }



        Worker secretary = new Manager();



        //! companySalaryCalculator method call calculateSalary() method but
        //! java does not know which method will be called.(we have overwritten methods)
        calculator.companySalaryCalculator(secretary);






        List<Secretary>secretaries3 = new Vector<>();



    }
}
