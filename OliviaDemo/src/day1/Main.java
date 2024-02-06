package day1;

public class Main {

	public static void main(String[] args) {
		System.out.println(4.0 / 3.0 - 1.0 - 1.0 / 3.0 == 0.0);
		//initialize Human
		Human human = new Human();
		//assign value for attribute
//		human.name = "Jack";
//		human.age = 18;
		human.setAge(-18);
//		human.gender = "male";
//		human.nationality = "American";

//		System.out.println(human.age);
//		System.out.println(human.gender);
		
		//call methods
		human.eat();
		human.sleep();
		
		
		Human h = new Human();
		h.setAge(9);
		
		 final double d = 0.0;
		 final float f;
		 f = 1.6f;
		 System.out.println(f);
//		 f = 2;
//		 f = 3.0;
		 System.out.println(f);
	}

}

