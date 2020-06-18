package librarycatalogue;

public class book{
//properties,fields,global variables
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedout;
	int dayCheckedout = -1;

//constructor
	public book(String bookTitle,int bookPageCount,int bookISBN){
		this.title=bookTitle;
		this.pageCount=bookPageCount;
		this.ISBN=bookISBN;
		isCheckedout=false;
	}
//getters-->instance method
	
	public String getTitle(){
		return this.title;
	}

	public int  getPageCount(){
		return this.pageCount;
	}
	public  int getISBN(){
		return this.ISBN;
	}
	public boolean getIsCheckedout(){
		return this.isCheckedout;
	}
	public int  getDayCheckedout(){
		return this.dayCheckedout;
	}

	public void setIsCheckedout(boolean newIsCheckedout, int currentDayCheckedout){
           this.isCheckedout = newIsCheckedout;
           setDayCheckedout(currentDayCheckedout);
	}
	private void setDayCheckedout(int day){
		this.dayCheckedout = day;
	}

}