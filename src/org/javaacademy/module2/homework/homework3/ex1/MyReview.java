package org.javaacademy.module2.homework.homework3.ex1;

import java.time.LocalDateTime;
import java.util.Objects;

public class MyReview {
    private final int id;
    private String text;
    private int likeCount;
    private final LocalDateTime dateTime;

    public MyReview(int id, String text, int likeCount) {
        this.id = id;
        this.text = text;
        this.likeCount = likeCount;
        this.dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getLikeCount() {
        return likeCount;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyReview myReview = (MyReview) o;
//        return id == myReview.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getClass());
//    }

    @Override
    public String toString() {
        return "MyReview{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", likeCount=" + likeCount +
                ", dateTime=" + dateTime +
                '}';
    }
}
