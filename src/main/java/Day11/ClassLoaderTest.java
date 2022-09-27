package Day11;

/*
 ** @author LiGuanda
 ** @date  AM 8:37:13
 ** @description This is a description of ClassLoaderTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.net.MalformedURLException;
import java.security.Permission;

/**
 * @author Lenovo
 */
public class ClassLoaderTest {


    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {

        System.out.println(StringBuilder.class.getClassLoader());
        /*new URLClassLoader(new URL[]{new URL("http://localhost")}).loadClass("day1.myClass");
        Thread thread = Thread.currentThread();
        thread.setContextClassLoader(ClassLoaderTest.class.getClassLoader());*/
        System.setProperty("java.security.policy", "MyApp.policy");
        SecurityManager security = System.getSecurityManager();
        if (security != null) {

            security.checkPermission(new MyPermission("heihei"));

        }


    }

}


class MyCLassLoader extends ClassLoader {


    @Override
    public Class<String> findClass(String name) {

        byte[] b = new byte[1024];
        Class clazz = defineClass("day11.myClass", b, 0, b.length);
        return clazz;

    }


}


class MyPermission extends Permission {


    public MyPermission(String name) {
        super(name);
    }

    @Override
    public boolean implies(Permission permission) {

        return false;

    }


    @Override
    public boolean equals(Object obj) {

        return false;

    }


    @Override
    public int hashCode() {

        return 0;

    }


    @Override
    public String getActions() {

        return null;

    }


}


