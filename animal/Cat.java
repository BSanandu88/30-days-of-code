package animal;


public class Cat extends Animal{

public Cat(int age){

	super(7);
	System.out.println("a cat has been created");
}

public void meow(){
   System.out.println("a cat meow");
}

public void prance(){
System.out.println("a cat is prancing ");
}

}