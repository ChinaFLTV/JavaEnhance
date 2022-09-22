package Day8;

/*
 ** @author LiGuanda
 ** @date  PM 2:29:03
 ** @description This is a description of User
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class User implements Cloneable {


    public String name;
    public int age;


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    @Override
    public User clone() throws CloneNotSupportedException {

        return (User) super.clone();

    }


}
