package MethodsKlassObject.Equals;

import MethodsKlassObject.Equals.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Иван Петрович", 65);
        Human human2 = new Human("Иван Петрович", 65);
        Human human3 = new Human("Петр Иванович", 55);
        Human human4 =  human1;

        System.out.println(human1==human2);
        System.out.println(human4==human1);
        System.out.println(human1.equals(human2));
        System.out.println(human1.equals(human4));

    }

}
