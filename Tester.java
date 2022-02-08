import java.util.ArrayList;

public class Tester{
	
	public static void main(String[] args){
		
		Person p1 = new Person("John", 2000);
		Person p2 = new Person("Jack", 2010);
		//System.out.println(p1.toString());
		//System.out.println(p2.toString());
		
		Scholar sc1 = new Scholar("Jeremy", 1990, "Computer Science");
		Scholar sc2 = new Scholar("Jeffrey", 1995, "STATS");
		//System.out.println(sc1.toString());
		//System.out.println(sc2.toString());
		
		Instructor is1 = new Instructor("Einstein", 1920, 123456.789);
		Instructor is2 = new Instructor("Some old dude", 1, 987654.321);
		//System.out.println(is1.toString());
		//System.out.println(is2.toString());
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(sc1);
		people.add(sc2);
		people.add(is1);
		people.add(is2);
		
		for(int i = 0; i < people.size(); i++){
			System.out.println(people.get(i).toString());
			System.out.println();
		}
		
	}
	
}
