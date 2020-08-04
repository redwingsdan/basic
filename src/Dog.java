
public class Dog {
	
	String name;
	String breed;
	
	Dog(){
		
	}
	
	Dog(String n, String b){
		name = n;
		breed = b;
	}
	
	void bark(){
		System.out.print("Woof ");
		
	}
	void dig(){
		System.out.print("woh ");
	}
	void printName(){
		System.out.println(name);
	}
	void printBreed(){
		System.out.println(breed);
	}
}
