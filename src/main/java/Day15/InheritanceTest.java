package Day15;

/*
 ** @author LiGuanda
 ** @date  AM 7:22:57
 ** @description This is a description of InheritanceTest
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class InheritanceTest {


    public static void main(String[] args) {

        IU iu = new IU(true);
        Wife wife = new Wife();
        //IU iu1 = (IU) wife;
        System.out.println(null instanceof IU);

        int[] i = new int[]{1, 2, 3};
        System.out.println(i.getClass());

    }


}


class Wife {


    private String name;
    private int age;


    public Wife() {

        System.out.println("-->invoke super()");

    }


    public Wife(String name) {

        this.name = name;
        System.out.println("-->invoke super(String)");

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    @Override
    public String toString() {

        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }


}


class IU extends Wife {


    private boolean isMarried;


    public IU() {

        System.out.println("-->invoke this()");

    }


    public IU(boolean isMarried) {

        this.isMarried = isMarried;
        System.out.println("-->invoke this(String)");

    }


    public void setMarried(boolean married) {

        isMarried = married;

    }


    public boolean isMarried() {

        return isMarried;

    }


    @Override
    public String toString() {

        return "IU{" +
                "isMarried=" + isMarried +
                '}';

    }


}


final class Dage {


    private String wife;
    private int age;


    public void marry() {


    }


    public static void handsome() {


    }


}