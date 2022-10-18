package Day20;

/*
 ** @author LiGuanda
 ** @date  AM 9:44:09
 ** @description This is a description of LoggerTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.IOException;
import java.util.logging.*;

/**
 * @author Lenovo
 */
public class LoggerTest {


    public static void main(String[] args) throws IOException {

/*        Logger.getGlobal().setLevel(Level.ALL);
        Logger.getGlobal().info("IU loves Dage");
        Logger.getLogger("Heihei").info("JuJingyi loves Dage!");
        Logger.getGlobal().log(Level.ALL, "Both IU and JuJingyi loves Dage!");
        Logger.getGlobal().throwing("Day20.LoggerTest", "love", new Exception("heiheihei"));
        love();*/
        Logger logger = Logger.getGlobal();
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setEncoding("UTF-8");
        logger.addHandler(handler);
        //SocketHandler socketHandler = new SocketHandler(InetAddress.getLocalHost().getHostAddress(), 8848);
        //logger.addHandler(socketHandler);
        FileHandler fileHandler = new FileHandler("%h/heiheihei.log");
        fileHandler.setEncoding("UTF-8");
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFilter(record -> true);
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);
        fileHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                System.out.println(record.getMillis());
                System.out.println(record.getLevel());
                System.out.println(record.getThreadID());
                return "heiheihei";
            }
        });
        String husband = "Dage";
        logger.info("能不能给我一首歌的时间");
        System.out.println("----------------------");
        logger.info("Husband = " + husband);
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.out.println(t.getId() + "-->" + e.getMessage()));
        Thread.dumpStack();
        Logger hehe = Logger.getLogger("hehe");
        hehe.addHandler(new ConsoleHandler());
        hehe.setUseParentHandlers(false);
        hehe.info("能不能给我一首歌的时间");

    }


    public static void love() {

        System.out.println("love was invoked!");

    }


}
