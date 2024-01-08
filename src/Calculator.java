
public class Calculator {

    public Calculator() {
        System.out.println("Constructor Called");
    }

    public void add() {
        System.out.println("Adding some numbers");
    }
    public void sub() {
        System.out.println("Substracting some numbers");
    }
    public void div() {
        System.out.println("Dividing some numbers");
    }
    public void mult() {
        System.out.println("Multiplying some numbers");
    }

    public static void main(String[] args) {
//
//        Calculator calc;
        new Calculator().add();
//        calc.add();

    }

}