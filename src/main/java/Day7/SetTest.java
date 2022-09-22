package Day7;

/*
 ** @author LiGuanda
 ** @date  AM 10:33:18
 ** @description This is a description of SetTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * @author Lenovo
 */
public class SetTest {


    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("hehehe");
        set.add("heiheihei");
        set.add("666");
        set.forEach(System.out::println);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.forEach(System.out::println);
        for (Integer integer : queue) {

            System.out.println(integer.toString());

        }


    }


}
