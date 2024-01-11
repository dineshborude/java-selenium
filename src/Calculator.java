
public class Calculator {

    public Calculator() {
        System.out.println("Constructor Called");
    }

    public int add(int a, int b) {
        return a+b;
    }
//    public void sub(int a, int b) {
//        System.out.println("Substracting some numbers"+ a-b);
//    }
//    public void div(int a, int b) {
//        System.out.println("Dividing some numbers"+ a/b);
//    }
//    public void mult(int a, int b) {
//        System.out.println("Multiplying some numbers"+ a*b);
//    }

    public static void main(String[] args) {
//
//        Calculator calc;
        new Calculator().add();
//        calc.add();

    }

}