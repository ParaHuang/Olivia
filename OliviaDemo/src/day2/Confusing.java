package day2;

class Confusing {
    public Confusing() { //constructor: named after the class, no return type is specified
        System.out.println("default constructor");
    }
    public Confusing(int i) { //constructor: named after the class, no return type is specified
        System.out.println("another constructor");
    }

    public void Confusing() { //this is a method because there's a return type; it's an instance method
        System.out.println("non-static method");
    }
    public static void Confusing(int i) { //this is a method because there's a return type; it's an static method
        System.out.println("static method");
    }


    public static void main(String[] args) {
        Confusing d = new Confusing();//first confusing is declaring the type of the variable
                                        //second is calling a constructor because 'new' is used
                                        //calling the default constructor because no arguments are provided
        Confusing c = new Confusing(0); //this uses "another constructor"


        c.Confusing();// c is an instance of Confusing, so c.Confusing() is calling an instance method
                      //the only instance method (which uses 0 arguments)


        Confusing(0);//same as below, but don't need to type confusing  since we're already within the class interface


        Confusing.Confusing(0);//the first confusing is saying which class to look inside of
                              //the second confusing is saying the static method name
                              //uses the static method above (which takes one argument)


        Confusing errr = new Confusing(0, 0); //calls constructor with 2 arguments
        Confusing urgh = Confusing(0, 0);//calls static method with 2 arguments
        urgh = Confusing.Confusing(0, 0); //calles same static method with 2 arguments
    }


    public Confusing(int i, int j) { //constructor: named after the class, no return type is specified
        System.out.println("2-int constructor");
    }
    public static Confusing Confusing(int i, int j) { //this is a method because there's a return type; it's a static method
        System.out.println("2-int static method");
        return new Confusing();
    }
}