package abstraction;

public class SmartPhone implements Callable, Camera, Movie, Music, Wifi, Game {

    @Override
    public void makeCall() {
        System.out.println("John is calling.");
    }

    @Override
    public void takePictures() {
        System.out.println("SmartPhone can take pictures.");
    }

    @Override
    public void playMovie() {
        System.out.println("SmartPhone can play movies.");
    }

    @Override
    public void playMusic() {
        System.out.println("SmartPhones can play music.");
    }

    @Override
    public void connectToWifi() {
        System.out.println("SmartPhone can connect to wifi.");
    }

    @Override
    public void playGame() {
        System.out.println("SmartPhone can play games.");
    }

}
