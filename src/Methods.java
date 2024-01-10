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

    public static void main(String[] args) {
        Methods methods = new Methods();
        int sum = methods.addNumbers(5,3);
        System.out.println(sum);
        methods.displayMyName();
    }

}