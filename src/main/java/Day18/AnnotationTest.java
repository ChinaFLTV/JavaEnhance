package Day18;

/*
 ** @author LiGuanda
 ** @date  PM 3:45:56
 ** @description This is a description of AnnotationTest
 ** @params
 ** @return
 ** @since version-1.0  */


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import javax.annotation.Nonnull;
import java.time.LocalDate;

/**
 * @author Lenovo
 */
public class AnnotationTest {

    @Nonnull
    private final Object o = new Object();


    public static void main(String[] args) {

        love();

    }



    public static void love() {

        System.out.println("IU loves Dage");

    }


}


class visitor extends ClassVisitor {


    protected visitor(int api) {

        super(api);

    }

    protected visitor(int api, ClassVisitor classVisitor) {

        super(api, classVisitor);

    }


    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {

        System.out.println(LocalDate.now() + "invoke love");
        return super.visitMethod(access, name, descriptor, signature, exceptions);
    }


}
