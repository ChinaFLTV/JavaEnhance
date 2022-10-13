package Day17;

/*
 ** @author LiGuanda
 ** @date  PM 4:02:25
 ** @description This is a description of ReflectionTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.lang.reflect.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Lenovo
 */
public class ReflectionTest {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Random random = new Random();
        System.out.println("className = " + random.getClass().getName());
        Class<?> aClass = Class.forName("java.util.Random");
        System.out.println(aClass.getName());

        Class<Random> aClass1 = Random.class;
        System.out.println(aClass1.getName());
        String name = Double[].class.getName();
        System.out.println(name);
        System.out.println(Integer[].class.getName());
        System.out.println(int[].class.getName());
        Wife iu = Wife.class.getConstructor(String.class, Integer.class).newInstance("IU", 30);
        System.out.println(iu);
        URL url = ReflectionTest.class.getResource("JuJingyi1.jpg");
        System.out.println(url);
        Field[] fields = Wife.class.getFields();
        for (Field field : fields) {

            System.out.println(field.getName() + "\t\t" + field.getType());

        }

        System.out.println("---------------");
        Field[] fields1 = Wife.class.getDeclaredFields();
        for (Field field : fields1) {

            System.out.println(field.getName() + "\t\t" + field.getType());

        }
        Constructor<?>[] constructors = Wife.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {

            System.out.println(constructor.getName() + "\t\t" + Modifier.toString(constructor.getModifiers()));

        }

        Method[] methods = Wife.class.getDeclaredMethods();
        for (Method method : methods) {

            System.out.println(method.getName() + "\t\t" + Modifier.toString(method.getModifiers()));

        }

        Class<? extends Wife> aClass2 = iu.getClass();
        Field age = aClass2.getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(iu));
        age.set(iu, 27);
        System.out.println(iu);
        System.out.println(Wife[].class.getComponentType());
        int[] i = {1, 2, 3, 4};
        int[] i1 = (int[]) copyof(i);
        System.out.println(i1.length);
        System.out.println(Arrays.toString(i1));
        Method love = Wife.class.getDeclaredMethod("love", String.class);
        love.invoke(iu, "Dage");

    }


    public static Object copyof(Object o) {

        int length = Array.getLength(o);
        Class<?> componentType = o.getClass().getComponentType();
        Object o1 = Array.newInstance(componentType, 2 * length);
        System.arraycopy(o, 0, o1, 0, length);
        return o1;

    }


}


class Wife {


    public String name;
    private Integer age;


    public Wife() {


    }


    public Wife(String name, Integer age) {

        this.name = name;
        this.age = age;

    }

    public static void love(String husband) {

        System.out.println("IU loves " + husband);

    }


    @Override
    public String toString() {

        return "Wife{" + "name='" + name + '\'' + ", age=" + age + '}';

    }


}
