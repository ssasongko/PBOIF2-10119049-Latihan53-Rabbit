package pboif2.pkg10119049.latihan53.rabbit;
/**
 * @author
 * Name  : Nur Sasongko
 * Class : PBOIF2
 * NIM   : 10119049
 * Program Description : Show some information about my pets (rabbit)
**/
import Animal.Rabbit;
public class PBOIF210119049Latihan53Rabbit {
    public static void main(String[] args) {
        Rabbit rb1 = new Rabbit("Peter",false,"grass",4,"grey");
        
        System.out.printf("Hello, His name is %s\n",rb1.getName());
        System.out.printf("%s is Vegetarian ? %b\n",rb1.getName(), rb1.isVegetarian());
        System.out.printf("%s eats %s\n",rb1.getName(), rb1.getEats());
        System.out.printf("%s has %d legs.\n",rb1.getName(), rb1.getNoOfLegs());
        System.out.printf("%s color is %s.\n",rb1.getName(), rb1.getColor());
    }
    
}
