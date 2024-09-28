public class PrintClass {
    static void myMethod() {
        System.out.println("I just got executed!");
    }


    static int add() {
        System.out.println("Inside add method with return and without parameters");
        int a=10, b=5;
        //result;
        //result = a+b;
        return a+b;
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println(" ");
    }
}
