package org.javaacademy.module2.homework.homework3.ex1;

import java.util.Comparator;
import java.util.TreeSet;

/**Задание №1: сортировка отзывов
 Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 дата + время отзыва (LocalDateTime)
 Создать коллекцию, которая хранит уникальные отзывы (уникальность по id),
 В данной коллекции отзывы должны быть отсортированы.
 Создать comparator через лямбда выражение, для сортировки отзывов:
 сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы

 Пример, отсортированный :
 (id, текст, кол-во лайков, дата+время)
 отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
 отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
 отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
 */
public class Runner {
    public static void main(String[] args) throws InterruptedException {
        MyReview rev1 = new MyReview(1, "отличный товар", 200);
        MyReview rev2 = new MyReview(2, "так себе товар", 100);
        MyReview rev3 = new MyReview(3, "плохой товар", 100);

        Comparator<MyReview> comparator = (o1, o2) -> {
            int result = Integer.compare(o2.getLikeCount(), o1.getLikeCount());
            if (result == 0) {
                result = o2.getDateTime().compareTo(o1.getDateTime());
            }
            return result;
        };

        TreeSet<MyReview> myReviews = new TreeSet<>(comparator);
        myReviews.add(rev1);
        myReviews.add(rev3);
        myReviews.add(rev2);

        System.out.println(myReviews);
    }
}
