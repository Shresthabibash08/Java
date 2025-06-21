package Polymorphism;

abstract class Music{
    public abstract void playSound();
}

class Piano extends Music{

    @Override
    public void playSound() {
        System.out.println("Piano have a soft classical melody.");
    }

}

class Guitar extends Music{

    @Override
    public void playSound() {
        System.out.println("Guitar have varities of sound based on chords");
    }

}

class Violin extends Music{

    @Override
    public void playSound() {
        System.out.println("Violin have high-pitced tone.");
    }

}

public class MusicApplication {
    public static void main(String []args){

    }
}
