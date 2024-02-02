package org.javaacademy.module2.lessons.lesson8.ex1;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Human> {
    @Override
    public void accept(Human human) {
        try {
            human.handsUp();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
