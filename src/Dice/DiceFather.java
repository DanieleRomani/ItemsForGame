package Dice;

import java.util.Random;

public class DiceFather {
    private int faceNumbers;
    private Random random;

    public DiceFather(int faceNumbers) {
        this.faceNumbers = faceNumbers;
        random = new Random();
    }

    public int getFaceNumbers() {
        return faceNumbers;
    }

    public void setFaceNumbers(int faceNumbers) {
        this.faceNumbers = faceNumbers;
    }

    public int roll() {
        return random.nextInt(faceNumbers) + 1;
    }
}
