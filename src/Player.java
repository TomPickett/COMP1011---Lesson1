
public class Player {

	public static void main(String[] args) {
		int year = 2015;
		System.out.println("Hello World! It's " + year + "!");
	
		Person tom = new Person("Tom", 225.3f, 6.0f);
		tom.walks();
		
		Person mike = new Person("Mike", 180.9f, 6.5f);
		mike.walks();
		
		Person matt = new Person("Matt", 190.9f, 6.1f);
		matt.eats();
		
	}

}
