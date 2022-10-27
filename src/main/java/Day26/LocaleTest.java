package Day26;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author LiGuanda
 * @date PM 4:07:03
 * @description This is a description of LocaleTest
 * @since version-1.0
 */


public class LocaleTest {


    public static void main(String[] args) {

        Locale locale = Locale.forLanguageTag("ch-CN");
        System.out.println(locale);
        String languageTag = Locale.CHINA.toLanguageTag();
        /*Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale1 : locales) {

            System.out.println(locale1.toString());

        }*/
        Locale locale2 = Locale.getDefault();
        System.out.println(locale2);
        Locale locale3 = new Locale("zh", "CN");
        String locale3DisplayLanguage = locale3.getDisplayLanguage(Locale.US);
        System.out.println(locale3DisplayLanguage);
        NumberFormat instance = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String format = instance.format(123456.78);
        System.out.println(format);

    }


}
