package abstraction;

public class MainInterface {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.makeCall();
        smartPhone.playGame();
        smartPhone.playMovie();
        smartPhone.playMusic();
        smartPhone.takePictures();
        smartPhone.connectToWifi();
        
        System.out.println("\n=====================================\n");
          
        System.out.println("\nNokia3310 Interface");
        Nokia3310 nokia3310 = new Nokia3310();
        nokia3310.makeCall();
        nokia3310.playGame();
        nokia3310.playMusic();
    }

}
