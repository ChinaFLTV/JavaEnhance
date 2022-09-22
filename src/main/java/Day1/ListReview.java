package Day1;

/*
 **@Author LiGuanda
 **@Data 2022/9/13 PM 6:18:21
 **@Description This is a description of ListReview
 **@Params
 **@Return
 **@Since version-1.0  */


import java.util.*;

/**
 * @author Lenovo
 */
public class ListReview {


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("JuJingyi");
        list.add("IU");
        list.add("Dage");
        ListIterator<String> iterator = list.listIterator();
        iterator.next();
        iterator.add("Taylor Swift");

        System.out.println(list);

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("JuJingyi",1);
        map.put("IU",2);
        Iterator<Map.Entry<String,Integer>> iterator1 = map.entrySet().iterator();
        System.out.println(iterator1.next());




    }


}
