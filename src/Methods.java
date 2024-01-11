public class Methods {

    /*
    Methods are block of statements which are used to perform specific tasks.
    Generally used to divide large code into reusable function, By calling it.

    Method Declaration :

    Access/Non Access Modifier, return type, method name(Parameter if any)
    {
        method body -- Code to run method.
    }



    */

    //Example :

    public int addNumbers(int x, int y) {
        return x+y;
    }

    /*
     Its not mandatory that method should return something,
     If you dont wanna return anything use : void.
     */

//    Example :
    public void displayMyName() {
        System.out.println("Danny");
    }

    /*

    Instance Varaible : Declared in Class body, Also known as Global Varaible.
    Local Varaible : Declared inside Method body.

    */

    int i = 123; //global/instance variable

    public int localVarible() {

        int j = 5; //Local Varible
        return j;
    }

    /*
    Predefined Methods :
    Methods which are already defined in java and ready to use.
    Ex : Math.random();
     */

    public int randomNumber() {
        return (int)(Math.random()*10);
    }

    /*
    This Math.random will return double values, To convert it into Integer
    we can typecast it by using

    (int)(Math.random()

     */

    public void go() {
        System.out.println("Inside Go Method");
//    go(); this gives stackoverflow error.
    }
    public void go2() {
        System.out.println("Inside Go2 Method");

    } public void go3() {
        System.out.println("Inside Go3 Method");
        go(); //We can call no static methods in non static method.

    }
    public static void main(String[] args) {
//        Methods methods = new Methods();
//        int sum = methods.addNumbers(5,3);
//        System.out.println(sum);
//        methods.displayMyName();

        Methods calc = new Methods();
        int result = calc.addNumbers(5,5);
        System.out.println("Result: " + result);

        System.out.println(calc.randomNumber());

        calc.go3();

        //we cant call non static method in static method block. ex : go();

    }

}