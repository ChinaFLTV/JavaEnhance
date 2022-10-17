package Day20;

/*
 ** @author LiGuanda
 ** @date  PM 5:00:07
 ** @description This is a description of TimeTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Lenovo
 */
public class TimeTest {


    public static void main(String[] args) throws InterruptedException {

        /*Instant now = Instant.now();
        System.out.println(now.toString());
        System.out.println("MIN = " + Instant.MIN);
        System.out.println("MAX = " + Instant.MAX);
        Thread.sleep(2000);
        Instant now1 = Instant.now();
        System.out.println("now1 = " + now1);
        System.out.println("diff = " + Duration.between(now, now1).toSeconds());
        Instant now2 = now1.plusSeconds(2);
        System.out.println("now2 = " + now2);*/
        Instant now = Instant.now();
        Instant min = Instant.MIN;
        Duration duration = Duration.between(min, now);
        System.out.println("duration to days = " + duration.toDays());
        System.out.println("duration*10 = " + duration.multipliedBy(10));
        System.out.println("Is duration is negative ? " + duration.isNegative());
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate = " + localDate);
        LocalDate localDate1 = LocalDate.of(2022, Month.JUNE, 6);
        System.out.println("LocalDate1 = " + localDate1);
        LocalDate localDate2 = LocalDate.of(2022, Month.JANUARY, 1).plusDays(255);
        System.out.println("LocalDate2 = " + localDate2);
        System.out.println("until = " + localDate1.until(localDate2, ChronoUnit.DAYS));
        int value = LocalDate.now().getDayOfWeek().getValue();
        System.out.println("value = " + value);
        Stream<LocalDate> localDateStream = LocalDate.of(2022, 1, 1).datesUntil(LocalDate.now(), Period.of(1, 1, 1));
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Is this year leap year ? " + leapYear);
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.lastDayOfMonth();
        Temporal temporal = temporalAdjuster.adjustInto(LocalDate.of(2022, 10, 31));
        System.out.println("temporal = " + temporal.toString());
        TemporalAdjuster temporalAdjuster1 = TemporalAdjusters.lastDayOfMonth();
        temporalAdjuster1.adjustInto(LocalDate.of(2022, 12, 31));
        LocalDate localDate3 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println("LocalDate3 = " + localDate3);
        LocalTime localTime = LocalTime.of(20, 45, 45);
        LocalTime localTime1 = localTime.plusHours(8);
        System.out.println("localTime = " + localTime);
        System.out.println("localTime1 = " + localTime1);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("-------------------");
        availableZoneIds.forEach(System.out::println);
        System.out.println("availableZoneIds ' size = " + availableZoneIds.size());
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Berlin"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        for (DayOfWeek day : DayOfWeek.values()) {

            System.out.println(day.getDisplayName(TextStyle.FULL, Locale.CHINA));

        }

        String displayName = DayOfWeek.of(LocalDate.now().getDayOfWeek().getValue()).getDisplayName(TextStyle.FULL, Locale.CHINA);
        System.out.println("-->" + displayName);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-M-d EEEE H:mm:ss a W xxx g");
        String format = dateTimeFormatter.format(ZonedDateTime.now());
        System.out.println(format);


    }


}
