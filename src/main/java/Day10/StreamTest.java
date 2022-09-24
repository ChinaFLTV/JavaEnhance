package Day10;

/*
 ** @author LiGuanda
 ** @date  PM 4:20:49
 ** @description This is a description of StreamTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Lenovo
 */
public class StreamTest {


    public static void main(String[] args) {

        int[] array = new int[]{56, 78, 12, 66, 23, 5, 1, 60, 33};
        //Stream<int[]> s = Stream.of(array);
        Stream<Integer> s1 = Stream.generate(() -> 8).limit(5);
        //System.out.println(s1.count());
        System.out.println(Arrays.toString(s1.toArray()));
        //Stream<Integer> peek = s1.peek(System.out::println);
        // System.out.println(peek);
        Stream<Object> s2 = Stream.empty();
        System.out.println(s2.count());
        Stream<Integer> s3 = Stream.of(5, 33, 12, 6, 90, 67, 89, 33, 24, 21);
        System.out.println(s3.count());
        IntStream s4 = Arrays.stream(array);
        //s4.forEach(e->System.out.print(e+"\t"));
        IntStream intStream = s4.takeWhile(e -> e > 50);
        //System.out.println("-------------------------");
        intStream.forEach(e -> System.out.print(e + "\t"));

        Integer i = null;
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional.isPresent());
        System.out.println(optional.or(() -> Optional.of(666)));
        System.out.println(optional.orElse(88));
        try {

            System.out.println(optional.orElseThrow());

        } catch (Exception e) {

            System.out.println("数据为空！");

        }


        Optional<int[]> optional1 = Optional.of(new int[]{4, 56, 78, 12, 55, 11, 23});
        List<int[]> collect = optional1.stream().collect(Collectors.toList());
        System.out.println(collect.get(0)[5]);
        Stream<Integer> s5 = Arrays.stream(new Integer[]{8, 5, 6, 81, 12, 55, 20, 75});
/*        List<Integer> collect1 = s5.collect(Collectors.toList());
        System.out.println(collect1);*/
/*        IntSummaryStatistics collect1 = s5.collect(Collectors.summarizingInt(e -> e + 1));
        System.out.println(collect1.getMax());
        System.out.println(collect1.getAverage());
        System.out.println(collect1.getMin());
        System.out.println(collect1.getSum());*/
        Stream<String> stream6 = Arrays.stream(new String[]{"hehehe", "heiheihei", "hahaha"});
        String collect1 = stream6.collect(Collectors.joining(","));
        System.out.println(collect1);

    }

}
