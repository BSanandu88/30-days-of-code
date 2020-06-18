package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class Librarycatalogue{

    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lenghtOfCheckoutPeriod=7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;


  public Librarycatalogue(Map<String,Book> collection){
  	this.bookCollection=collection;
  }
  public Librarycatalogue(Map<String,Book> collection, int lenghtOfCheckoutPeriod,double initialLateFee,double feePerLateDay){
    this.bookCollection=collection;
    this.lenghtOfCheckoutPeriod=lenghtOfCheckoutPeriod;
    this.initialLateFee=initialLateFee;
    this.feePerLateDay=feePerLateDay;
  }


//getters/setters

  public int getCurrentDay(){
       return this.currentDay;
  }
  public Map<String,Book> getBookCollection(){
  	return this.bookCollection;

  }
  public  Book getBook(String bookTitle){
     return getBookCollection().get(bookTitle);

  	
  }
  public int getLenghtOfCheckoutPeriod(){
  	return this.lenghtOfCheckoutPeriod;
  }
  public double getInitialLateFee(){
  	return this.initialLateFee;
  }
  public double  getFeePerLateDay(){
  	return this.feePerLateDay;
  }


//setters

  public void nextDay(){
  	currentDay++;

  }

  public void setDay(int day){
  	currentDay = day;
  }

//instance method

  public void checkOutBook(String title){
   Book book = getBook(title);

   if(book.getIsCheckedOut()){
   	sorryBookAlreadyCheckedOut(book);
   }else{
         book.setIsCheckedOut(true, currentDay);
         System.out.println("you just checked out " + title + ". it is due on the day " + (getCurrentDay() + getLenghtOfCheckoutPeriod()) + ".");


   }

  }
 public void returnBook(String title){


    Book book =getBook(title);
    int daysLate = currentDay - (book.getDayCheckedOut() + getLenghtOfCheckoutPeriod());
    if(daysLate >0){
    	System.out.println("you owe the library $"+(getInitialLateFee() + daysLate + getFeePerLateDay()) + "because your book is " + daysLate +"days overdue" );

    }else{
    	System.out.println("book returned .thankyou!");
    }

    book.setIsCheckedOut(false, -1);
 }
 
 public void sorryBookAlreadyCheckedOut(Book book){
  System.out.println("sorry." + book.getTitle() + " is already checkedout.");
 }
 




	public static void main(String[] args){
     Map<String, Book> bookCollection = new HashMap<Sting,Book>();
     Book harry = new Book("harry potter",8374973,909808000);
     bookCollection.put("harry potter ",harry);
     Librarycatalogue lib = new librarycatalogue(bookCollection);
     lib.checkOutBook("harry potter");
     lib.nextDay();
     lib.nextDay();
     lib.nextDay();
     lib.checkOutBook("harry potter");
     lib.setDay(20);
     lib.returnBook("harry potter");
     lib.checkOutBook("harry potter");
	}

}