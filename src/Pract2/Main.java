package Pract2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import Pract2.Human;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human (19,"Egor", "Usov", LocalDate.of(2004,3,18), 90);
        Human person2 = new Human (12,"Sergey", "Dubnikov", LocalDate.of(2012,7,30), 60);
        Human person3 = new Human (18,"Ilya", "Petrov", LocalDate.of(2003,1,3), 50);
        Human person4 = new Human (19,"Valera", "Kurganov", LocalDate.of(2004,11,9), 70);
        Human person5 = new Human (15,"Victor", "Napoleonov", LocalDate.of(2008,6,21), 61);
        ArrayList<Human> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        Comparator<Human> comparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.getFirstName().charAt(1) - o1.getFirstName().charAt(1);
            }
        };
        Stream<Human> stream1 = list.stream();
        stream1.sorted(comparator).forEach( (obj) -> {
            System.out.println(obj.toString());
        });
        System.out.println();
        Stream<Human> stream2 = list.stream();
        stream2.filter((obj) -> obj.getWeight()>60).forEach( (obj) -> {
            System.out.println(obj.toString());
        });

        System.out.println();
        Stream<Human> stream3 = list.stream();
        stream3.sorted(Comparator.comparingInt(Human::getAge)).forEach( (obj) -> {
            System.out.println(obj.toString());
        });

        System.out.println();
        Stream<Human> stream4 = list.stream();
        System.out.println(stream4.reduce(1, (a,b) -> a*b.getAge(), (a,b) -> a*b));
    }
}
