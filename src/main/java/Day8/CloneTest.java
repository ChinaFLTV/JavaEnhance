package Day8;

/*
 ** @author LiGuanda
 ** @date  PM 2:31:02
 ** @description This is a description of CloneTest
 ** @params
 ** @return
 ** @since version-1.0  */


import javax.swing.*;
import java.util.Arrays;

/**
 * @author Lenovo
 */
public class CloneTest {


    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User();
        User user1 = user.clone();
        int[] i1 = {5, 6, 7, 1, 3, 2};
/*        for(int i = 0;i<9999;i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Toolkit.getDefaultToolkit().beep();

        }*/
        System.out.println(Arrays.toString(i1));


    }


}


class Heihei {

    public void greet() {

        Timer timer = new Timer(1000, System.out::println);

    }


}
