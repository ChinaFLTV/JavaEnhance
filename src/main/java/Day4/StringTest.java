package Day4;

/*
 ** @author LiGuanda
 ** @date  PM 2:05:17
 ** @description This is a description of StringTest
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class StringTest {


    public static void main(String[] args) {

        String str = "This is a string!";
        System.out.println(str.repeat(3));
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointAt(8));
        String str1 = "😊12345";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.codePointAt(0));
        System.out.println(str1.codePointAt(2));
        System.out.println(str1.codePointAt(3));
        System.out.println(Character.isSurrogate(str1.charAt(0)));
        System.out.println(Character.isSupplementaryCodePoint(str1.codePointAt(0)));
        System.out.println(Character.isSurrogate(str.charAt(0)));
        System.out.println(Character.isSupplementaryCodePoint(str.codePointAt(0)));
        System.out.println(str1.trim());
        String str2 = " vsdvds    vsvs vsfvs  vsv    ";
        System.out.println(str2.trim());
        System.out.println(str2.strip());


    }


}
