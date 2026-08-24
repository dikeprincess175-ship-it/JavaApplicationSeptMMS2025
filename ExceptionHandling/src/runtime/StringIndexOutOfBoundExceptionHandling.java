package runtime;

public class StringIndexOutOfBoundExceptionHandling {

    public static void main(String[] args) {
        try {
            String myName = "Mercy Ben";

            System.out.println(myName.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("There is no value at the index provided.");
        }

    }

}
