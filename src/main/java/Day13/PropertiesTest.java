package Day13;

/*
 ** @author LiGuanda
 ** @date  PM 3:24:41
 ** @description This is a description of PropertiesTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Properties;

/**
 * @author Lenovo
 */
public class PropertiesTest {


    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("husband", "Dage");
        properties.setProperty("wife", "JuJingyi");
        FileOutputStream outputStream = new FileOutputStream("marry.txt");
        properties.store(outputStream, "This is a newly married couple!!!/n");

        Properties defaultProperties = new Properties();
        defaultProperties.setProperty("wife2", "IU");

        Properties marryList = new Properties(defaultProperties);
        FileInputStream inputStream = new FileInputStream("marry.txt");
        marryList.load(inputStream);
        System.out.println("husband = " + marryList.getProperty("husband"));
        System.out.println("wife = " + marryList.getProperty("wife"));
        System.out.println("wife2 = " + marryList.getProperty("wife2"));

        String version = System.getProperty("java.version");
        System.out.println(version);
        String home = System.getProperty("java.home");
        System.out.println(home);
        BitSet bitSet = new BitSet();
        System.out.println(bitSet.get(1));
        bitSet.set(1);
        System.out.println(bitSet.get(1));
        bitSet.clear(1);
        System.out.println(bitSet.get(1));
        Integer[] i = {56, 12, 78, 23, 14, 47, 25, 69, 785, 23, 45};
        Arrays.sort(i, ((Comparator.comparingInt(ii->ii))));
        System.out.println(Arrays.toString(i));

    }


}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
        //这样颠倒一下，就可以实现反向排序了
        return o2.compareTo(o1);
    }
}
