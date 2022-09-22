package Day6;

/*
 ** @author LiGuanda
 ** @date  AM 8:41:29
 ** @description This is a description of ExceptionTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Lenovo
 */
public class ExceptionTest {


    public static void main(String[] args) {


        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        classLoader.setDefaultAssertionStatus(true);
        classLoader.setClassAssertionStatus("ExceptionTest", true);


        //try {

            /*System.out.println(factorial(5));
            bugMethod();*/
        double num = 2.0;
        System.out.println(num);
        assert num < 0.5;

        /*} catch (Exception e) {

            System.out.println("Abnormity! " + e.getMessage());
*//*            MyException myException = new MyException("hehe");
            myException.initCause(e);
            throw myException;*//*
        }*/


    }


    public static void bugMethod() throws IOException {

        StackWalker stackWalker = StackWalker.getInstance();
        stackWalker.forEach(stackFrame -> System.out.println("This is the content printed by stackWalker : "
                + stackFrame.getClassName() + " "
                + stackFrame.getMethodName() + " "
                + stackFrame.getFileName() + " "
                + stackFrame));
        try (FileInputStream in = new FileInputStream("heiheihei")) {

            System.out.println("hehehe" + in.read(new byte[1024]));

        }
        System.out.println("come on......");

    }


    public static int factorial(int num) {

        StackWalker stackWalker = StackWalker.getInstance();
        stackWalker.forEach(System.out::println);
        if (num == 1) {

            return 1;

        } else {

            return num * factorial(num - 1);

        }

    }


}

class MyException extends FileNotFoundException {


    public MyException(String message) {

        super(message);

    }


}
