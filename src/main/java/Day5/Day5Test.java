package Day5;

/*
 ** @author LiGuanda
 ** @date  PM 2:29:55
 ** @description This is a description of Day5Test
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class Day5Test {


    public static void main(String[] args) {

        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = "aaa" + str2;
        String str4 = "aaa" + "aaa";
        String str5 = str1 + str2;
        System.out.println(str3==str4);
        System.out.println(str4==str5);
        System.out.println(str4=="aaaaaa");

    }


}
