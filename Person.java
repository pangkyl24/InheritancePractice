public class Person {

	private String name;
	private int yearOfBirth;
	
	public Person(String iName, int iYear){
		name = iName;
		yearOfBirth = iYear;
		
		
		
	}
	
	public String toString(){
		return "Name: " + name + "\n" + "Year of Birth: " + yearOfBirth;

	}
	
	public String getName(){
		return name;
	}
	public int getYear(){
		return yearOfBirth;
	}

}

class Scholar extends Person {
	
	private String major;	
	public Scholar(String name, int year, String major){
		super(name, year);
		this.major = major;
		
	}
	public String toString(){
		return "Name: " + super.getName() + "\n" + "Year of Birth: " + super.getYear() + "\n" + "Major: " + major;
	}
	
}

class Instructor extends Person {
	
	private double salary;
	public Instructor(String name, int year, double salary){
		super(name, year);
		this.salary = salary;
	}
	public String toString(){
		return "Name: " + super.getName() + "\n" + "Year of Birth: " + super.getYear() + "\n" + "Salary: " + salary;
	}
	
}


