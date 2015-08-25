
package inheritance;

/**
 * Lab 4A
 * @author brentgaither
 */

public class Bird extends Pet { //Bird class is child of pet
    private String color;
    private String greeting;
   
    //Constructor method
    public Bird(String n,int w, int h, 
           int bY, String c) {
    name = n;
    weight = w;
    height = h;
    birthYear = bY;
    greeting = "Chirp";
    color = c;
       
   }
    public String getColor(){
        return color;
    }
    public String getGreeting(){
        return greeting;
    }
    public int getAge(int currentYear){
        return (currentYear - birthYear) *12;
    }
}
