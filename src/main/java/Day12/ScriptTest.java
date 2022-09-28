package Day12;

/*
 ** @author LiGuanda
 ** @date  PM 2:27:29
 ** @description This is a description of ScriptTest
 ** @params
 ** @return
 ** @since version-1.0  */


import javax.script.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.util.List;

/**
 * @author Lenovo
 */
public class ScriptTest {


    public static void main(String[] args) throws ScriptException, NoSuchMethodException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = engineManager.getEngineFactories();
        factories.forEach(System.out::println);
        ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        engine.eval("i = 666");
        Object i = engine.eval("i + 1");
        engine.put("hehehe", 666);
        System.out.println("i = " + i);
        System.out.println(engine.get("hehehe"));
        System.out.println("hehehe = " + engine.eval("hehehe"));
        Bindings bindings = engine.createBindings();
        bindings.put("hei", 88);
        System.out.println("hei = " + engine.eval("hei", bindings));

        engine.eval("function hehe(){return 'hehe,world!';}");
        Object hehe = ((Invocable) engine).invokeFunction("hehe");
        System.out.println(hehe);
        engine.eval("function Dage(){}");
        engine.eval("Dage.prototype.marry = function(wife){return 'Dage was married with '+wife;}");
        Object dage = engine.eval("new Dage()");
        Object marry = ((Invocable) engine).invokeMethod(dage, "marry", "JuJingyi");
        System.out.println(marry);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int run = compiler.run(null, null, null,  "-sourcepath","src","MarryTest.java");
        System.out.println(run);


    }


}
