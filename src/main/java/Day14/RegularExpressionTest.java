package Day14;

/*
 ** @author LiGuanda
 ** @date  AM 7:36:35
 ** @description This is a description of RegularExpressionTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Lenovo
 */
public class RegularExpressionTest {


    public static void main(String[] args) {

        String sample = "aabbccddefgh";
        final String regex = "a*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sample);
        /*  if (matcher.find()) {

            System.out.println(matcher);

        }*/
        System.out.println("------------------------------");
        String sample1 = "acksbdckajcldabchdsaoacds";
        final String regex1 = "a.*?s";
        String[] strings = sample1.split(regex1);
/*        for (String str : strings) {

            System.out.println(str);

        }*/
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(sample1);
        while (matcher1.find()) {

            System.out.println(matcher1.group());

        }

        String sample2 = "adj.有趣的，有吸引力的；怪异的 v.使感兴趣，引起……的关注；劝说（某人）做（或参与）（interest 的现在分词形式）";
        final String regex2 = "adj.|v.|int";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(sample2);
        while (matcher2.find()) {

            System.out.println(matcher2.group());

        }
        String[] strings1 = sample2.split(regex2);
        System.out.println(Arrays.toString(strings1));


        String sample3 = "apple banana watermelon orange lemon pear tomato potato";
        final String regex3 = "a.*? ";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(sample3);
        while (matcher3.find()) {

            System.out.println(matcher3.group());

        }

        IU lze = new IU("LZE");
        IU iu = new IU("Dage's wife");
        System.out.println(lze.name);
        System.out.println(En.IU.ordinal());


    }


}


class IU {

    public String name;

    {

        name = "LiZhien";
        System.out.println("invoke initialization block-->");

    }

    static {

        System.out.println("invoke static initialization block-->");

    }

    public IU() {

        System.out.println("invoke no-args constructor-->");

    }

    public IU(String aName) {

        System.out.println("invoke args constructor-->");
        this.name = aName;

    }


}

enum En {

    IU, JuJingyi;

}
