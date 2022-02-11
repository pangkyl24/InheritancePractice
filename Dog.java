public class Dog{
	
	private String name;
	private int age;
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void bark(){
		System.out.println("Woof Woof Woof Woof Woof BAMMMM........ *dog whimpering noises.");
	}
	
	public void eat(){
		System.out.println("nom nom nom nom nom nom nom");
	}
	
	public void sleep(){
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzz");
	}
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age;
	}
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	
	
}

class GoldenRetriever extends Dog{
	
	private String hasValue; //aka isFluffy
	
	public GoldenRetriever(String name, int age, boolean ihasValue){
		super(name, age);
		if(ihasValue){
			this.hasValue = "True";
		}
		else{
			this.hasValue = "False";
		}
	}
	
	public void pet(){
		if(hasValue.equals("True")){
			System.out.println("pet pet pet pet pet");
		}
		else{
			System.out.println("Sorry, this dog isnt fluffy");
		}
	}
	
	public String toString(){
		return "Name: " + super.getName() + "\n" + "Breed: Golden Retriever" + "\n" + "Age: " + super.getAge() + "\n" + "Fluffy: " + hasValue;
	}
	
}

class ShihTzu extends Dog{
	
	private String hyperAllergenic;
	
	public ShihTzu(String name, int age, boolean ihyperAllergenic){
		super(name, age);
		if(ihyperAllergenic){
			this.hyperAllergenic = "True";
		}
		else{
			this.hyperAllergenic = "False";
		}
	}
	
	public void makeItSneeze(){
		if(hyperAllergenic.equals("True")){
			System.out.println("Achoo!");
		}
		else{
			System.out.println("Sorry, this dog doesnt have allergies");
		}
	}
	
	public String toString(){
		return "Name: " + super.getName() + "\n" + "Breed: Golden Retriever" + "\n" + "Age: " + super.getAge() + "\n" + "HyperAllergenic: " + hyperAllergenic;
	}
	
}


