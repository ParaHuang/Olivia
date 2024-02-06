package day1;

public class Human {
	//private:  you can only access this member inside of the present class
//				usually we make attribute private to keep them safe
//				then private attribute will be access by public method
	//public:	you can access this member no matter where
	
	
	//attribute/filed/variables
	//name,age,gender,nationality
	private String name;
	private int age;
	private String gender;
	private String nationality;
	
	//OOP
	//each private attribute would have a getter and setter(assign value for attribute)
	public void setAge(int a) {
		if(a>=1 && a<=130) {
			age = a;
		}else {
			age = 1;//age default value :1
		}
	}
	
	
	//method
	//eat,sleep
	public void eat() {
		System.out.println(age+",time to eat,"+name);
	}

	public void sleep() {
		System.out.println("time to sleep for "+nationality);
	}
}

/*
 1.variable
 2.operators   
 3.decisions    if  switch...case		
 4.loop        	while,for				
 5.array							
 6.define method (overloading) 		
 
 7.OOP
 */















