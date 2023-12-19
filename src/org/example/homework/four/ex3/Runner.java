package org.example.homework.four.ex3;

//Задача №3 - Звук вокруг
//Человек умеет издавать звук: "Я человек." (возвращается строка и в след пунктах тоже)
//Строитель умеет издавать звук: "Я строитель." + звук из человека
//Водитель умеет издавать звук: "Я водитель." (имеет связь с человеком)
//Птица умеет издавать звук: "Чирик"
//Сделать так, чтобы они все могли быть представлены к единому типу.
//Создать в этом методе человека, строителя, водителя и птицу. Заставить их издать звуки.
//Изданные звуки распечатать.
public class Runner {
    public static void main(String[] args) {

        SoundMaker[] soundMakers = {new Human(), new Builder(), new Driver(), new Bird()};

        for (SoundMaker soundMaker : soundMakers) {
            System.out.println(soundMaker.makeSound());
        }

    }
}
