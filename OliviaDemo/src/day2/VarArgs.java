package day2;

class VarArgs {
    public static void main(String[] args) {
        /*
          In lecture I edited Account.updateBalance to make
          use of a parameter listed as 'double... deposits'.
          Here, I give an isolated example of using a function
          taking a variable number of arguments (varargs).
        */

        f(0, 1);
        f(2, 3, 'a');
        f(4, 5, 'a', 'b');
        f(6, 7, 'a', 'b', 'c');
        f(8, 9, new char[] {'a', 'r', 'r', 'a', 'y'});
    }


    public static void f(int i, double d, char... characters) {
        System.out.println(i);
        System.out.println(d);

        for (int j = 0; j < characters.length; ++j) {
            System.out.print(characters[j]);
        }
        System.out.println('\n');
    }
}
