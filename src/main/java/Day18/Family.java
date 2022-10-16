package Day18;

/*
 ** @author LiGuanda
 ** @date  PM 3:24:32
 ** @description This is a description of Family
 ** @params
 ** @return
 ** @since version-1.0  */


import javax.annotation.processing.Generated;
import java.lang.annotation.*;

/**
 * @author Lenovo
 */
@Heihei("heihei")
public @interface Family {


    String wife() default "IU";

    String[] hehe() default {"dd", "fefs"};

    Class<?> heihei() default Object.class;

    Ati haha() default @Ati(xixi = "heihei");


}

/**
 * @author Lenovo
 */

@interface Ati {

    String xixi();

}

/**
 * @author Lenovo
 */
@interface Heihei {

    String value();

}

/**
 * @author Lenovo
 */
@Documented()
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable(xixixi.class)
@interface haha {


}

/**
 * @author Lenovo
 */
@Documented()
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface xixixi {

    haha[] value();

}
