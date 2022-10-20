package Day22;

/*
 ** @author LiGuanda
 ** @date  PM 3:44:07
 ** @description This is a description of ObjectTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Lenovo
 */
public class ObjectTest {


    public static void main(String[] args) {

        System.out.println(Objects.equals(null, null));
        System.out.println(new Object().equals(null));
        System.out.println("Ok".hashCode());
        System.out.println("b".hashCode());
        System.out.println("Ok".hashCode());
        System.out.println(Objects.hashCode("a"));
        System.out.println(Double.hashCode(6.66));
        System.out.println(Objects.hash("a", "a", "a"));
        System.out.println(Arrays.hashCode(new int[]{1, 2, 3}));
        System.out.println(Arrays.hashCode(new int[]{}));
        ArrayList<String> a = new ArrayList<>();
        a.add("b");
        a.add(0, "a");
        System.out.println(a);
        Integer i = 1;
        modifyWrapper(i);
        System.out.println(i);
        int n = 666;
        System.out.printf("%d\n", n);
        System.out.printf("%d %s", 666, "aaa");


    }


    public static void modifyWrapper(Integer i) {

        i++;

    }


}
