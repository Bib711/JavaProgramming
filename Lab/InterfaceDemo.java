package Lab1;

abstract class Animal{
	protected int legs;
	protected Animal(int legs){
		this.legs=legs;
	}
	Animal(){
	}
	abstract void eat();
	void walk(int legs) {
		if(legs==0) {
			System.out.println("Fish has no legs.");
		}
		else {
			System.out.printf("This animal walk by %d legs.\n",legs);
		}
		
	}
}

class Spider extends Animal{
	Spider(int legs ){
		super(legs);
	}
	void eat() {
		System.out.println("Spider eat insects");
	}
}

interface Pet{
	void getName();
	void setName(String name);
	void play();
}

class Cat extends Animal implements Pet{
	String name;
	public void getName() {
		System.out.println("This cat's name is "+name);
	}
	public void setName(String name) {
		System.out.println("This cat's name is "+name);
	}
	public void play() {
		System.out.println("Cat play with rats");
	}
	Cat(String name){
		this.name = name;
	}
	void eat() {
		System.out.println("Cat eat fishes");
	}
}

class Fish extends Animal implements Pet{
	String name;
	public void getName() {
		System.out.println("This fish's name is "+name);
	}
	public void setName(String name) {
		System.out.println("This fish's name is "+name);
	}
	void eat() {
		System.out.println("Fish eat plants");
	}
	Fish(String name){
		this.name = name;
	}
	
	public void play() { }
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Fish fs = new Fish("Mimi");
		System.out.println("FISH");
		fs.getName();
		fs.eat();
		fs.walk(0);
		fs.setName("Momo");
		Cat ca = new Cat("Fluffy");
		System.out.println("\nCAT");
		ca.getName();
		ca.walk(4);
		ca.play();
		ca.eat();
		ca.setName("Moose");
		Animal an = new Spider(8);
		System.out.println("\nSPIDER");
		an.eat();
		an.walk(8);
		
	}
}