import java.util.ArrayList;

public class DogTester{

	public static void main(String[] args){
		
		Dog dog1 = new Dog("Jack", 3);
		Dog dog2 = new Dog("Jeremy", 4);
		
		GoldenRetriever gd1 = new GoldenRetriever("Jeffrey", 1, false);
		GoldenRetriever gd2 = new GoldenRetriever("Jerry", 3, true);
		
		ShihTzu st1 = new ShihTzu("Jacob", 2, true);
		ShihTzu st2 = new ShihTzu("Jessica",1, false);
		
		ArrayList<Dog> doggies = new ArrayList<Dog>();
		
		doggies.add(dog1);
		doggies.add(dog2);
		doggies.add(gd1);
		doggies.add(gd2);
		doggies.add(st1);
		doggies.add(st2);
		
		for(int i = 0; i < 6; i++){
			System.out.println(doggies.get(i).toString());
		}
		
		dog1.bark();
		dog2.eat();
		dog1.sleep();
		
		gd1.pet();
		gd2.pet();
		
		st1.makeItSneeze();
		st2.makeItSneeze();
		
		System.out.println("");
		doggies.remove(2);
		doggies.add(0, gd1);
		System.out.println(doggies);
		
		
	}

}
