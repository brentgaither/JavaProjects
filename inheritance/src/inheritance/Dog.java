
package inheritance;

/**
 *Lab 4A
 * @author brentgaither
 */
public class Dog extends Pet {//Dog is child of pet
   private int rabiesTag;
   private String greeting;
   
   //Constructor method
   public Dog(String n,int w, int h, 
           int bY, int tN) {
     name = n;
    weight = w;
    height = h;
    birthYear = bY;
    rabiesTag = tN;
    greeting = "woof";
       
   }
   public int getRabiesTag(){
       return rabiesTag;
   }
   public String getGreeting(){
       return greeting;
   }
}
