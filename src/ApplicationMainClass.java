
public class ApplicationMainClass {
    public static void main(String[] args){
        System.out.println("This is main method!!!");
    }

    private static void printMyName(){
        System.out.println("My name is Dmitry!!!");
    }

    private static void printMyAge(){
        System.out.println("My age is 31 !!!");
    }

    private static void methodForPrintingNameAndAge(){
        printMyName();
        printMyAge();
    }
}
