package runtime;

public class ArrayOutOfBoundExceptionHandling {

    public static void main(String[] args) {
        try{
        int[] age = {16, 21, 19, 20, 14};
        System.out.println("Elements at index 2 is "+ age[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry there isn't a numner at that index. ");
        }
    }

}
