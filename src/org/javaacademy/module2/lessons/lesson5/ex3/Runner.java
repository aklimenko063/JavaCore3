package org.javaacademy.module2.lessons.lesson5.ex3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Molodyko", 31);
        Student student2 = new Student("Ivanov", 29);
        Student student3 = new Student("Petrov", 35);
        Student student4 = new Student("Sidorov", 40);

        HashSet<Student> students = new HashSet<>();
        students.addAll(List.of(student1, student2, student3, student4));
        System.out.println(students);
        System.out.println("___________________________________________");

//        TreeSet<Student> treeSet = new TreeSet<>();
//        treeSet.addAll(students);
//        System.out.println(treeSet);

        System.out.println("___________________________________________");

        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        TreeSet<Student> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(students);
        System.out.println(treeSet);
        System.out.println("___________________________________________");

        TreeMap<Student, Integer> treeMap = new TreeMap<>(comparator);
        treeMap.put(student1, 3);
        treeMap.put(student2, 5);
        treeMap.put(student3, 4);
        treeMap.put(student4, 5);
        System.out.println(treeMap);
    }
}
