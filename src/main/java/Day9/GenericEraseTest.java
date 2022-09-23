package Day9;

/*
 ** @author LiGuanda
 ** @date  PM 2:16:27
 ** @description This is a description of GenericEraseTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.lang.reflect.InvocationTargetException;

/**
 * @author Lenovo
 */
public class GenericEraseTest {


    public static void main(String[] args) {

        Heihei<String> heihei = new Heihei<>();
        int num = Heihei.<Integer>xixi(666);
        System.out.println("num = " + num);
        System.out.println(heihei instanceof Heihei);
        Heihei<String>[] heiheis = new Heihei[6];
        heiheis[0] = new Heihei<>();
        try {
            Heihei.class.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Heihei<String>[] heiheis1 = new Heihei<>[6];
        heiheis1[0] = new Haha<Integer>();

    }

}


class Heihei<T> {

    T name;
    T age;


    public T hehe(T t) {

        return t;

    }


    public static <U> U xixi(U u) {

        return u;

    }


}


class Hehe<T extends Double> {

    T name;
    T age;

    public T aa() {

        return name;

    }


}


class Haha<U> extends Heihei<String> {


    public void hehe(Integer i) {

        ;

    }


}
