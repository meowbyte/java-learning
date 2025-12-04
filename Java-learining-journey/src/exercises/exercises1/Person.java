package exercises.exercises1;

public class Person {
	String name ;
	int age ;
	public Person (String name, int age) {
		this.name=name;
		this.age=age;
	}
public void speak() {
	System.out.println("Hello my name is:" +name);
}
}
