package Encapsulasi;

public class Main {
    public static void main(String[] args) {
        LCD lcd1 = new LCD();

        lcd1.setVolume(50);
        lcd1.volumeDown();
        lcd1.Freeze();
        lcd1.setBrightness(20);
        lcd1.brightnessDown();
        lcd1.brightnessDown();
        lcd1.cableUp();

        lcd1.displayMessage();
    }
}
