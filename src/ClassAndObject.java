class ClassAndObject {
    //Start of body

// Java Class : Template or blueprint which describes state/behavior of its object.
// Class is used to create Objects.
// Objects : Objects are nothing but instance of class.
// In Order to execute any code in Java, we need main method :


    public static void main(String[] args) {

        System.out.println("Object : Instance of class ");
        //In java, An Object is created when somaone says "new" keyword
        //Each "new" word creates a new object of class.

        //JDK : JRE(JVM+Lib Files) + JAVA Compiler

        System.out.println("Garbage Collection : It destroys the objects which are not in use");

        ClassAndObject day = new ClassAndObject();
        System.out.println(day);
        new ClassAndObject(); //Garbage Collector will collect this.
    }


}