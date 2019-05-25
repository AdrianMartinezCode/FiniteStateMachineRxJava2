package utils;

public class Generators {

    public static int getRandomValueFromRange(int max, int min) {
        return ((int) (Math.random() * (max - min))) + 1 + min;
    }
}
