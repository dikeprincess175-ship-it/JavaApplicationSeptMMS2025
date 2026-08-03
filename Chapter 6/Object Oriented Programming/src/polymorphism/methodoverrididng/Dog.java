
package polymorphism.methodoverrididng;


public class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("All dogs Bark");
    }
    
}
