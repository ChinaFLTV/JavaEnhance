package Day21;

/*
 ** @author LiGuanda
 ** @date  PM 4:51:23
 ** @description This is a description of InnerTest
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class InnerTest {


    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.name();

    }


}


class Outer {


    private String name = "IU";


    class Inner {


        private final static int AGE = 22;


        public String name() {

            System.out.println(getClass().getEnclosingClass());
            return name;

        }


    }


}

interface Heihei{


    class Hehe{



    }

}
