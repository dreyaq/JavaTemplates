package Pract1;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmail = s -> Pattern.matches(".+@.+\\..+",s);

        System.out.println(isEmail.test("dreyaq@yandex.ru"));
        System.out.println(isEmail.test("dreyaqyandex.ru"));
        System.out.println(isEmail.test("dreyaq@yandex."));
        System.out.println(isEmail.test("dreyaq@.ru"));
        System.out.println(isEmail.test("@yandex.ru"));
    }
}
