package arrayOfObjects;

public class Person {
	
	String lastName, firstName;
	int age;
	
	public Person(String lastName,String firstName,int age){
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public String display(){
		return("Last Name:"+lastName+",First Name:"+firstName+",Age:"+age);
	}
	
	public String getLastName(){
		return lastName;
	}

}
