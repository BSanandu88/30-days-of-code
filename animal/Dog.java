package animal;

public class Dog extends Animal
{
    public Dog(){

    	super(15);
    	System.out.println("a dog has been created");
    }

    public void ruff(){
    	System.out.println("the dog says ruff");
    }

    public void run(){
    	System.out.println("a dog is running");
    }

}