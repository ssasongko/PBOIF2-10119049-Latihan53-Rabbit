package Animal;
public class Rabbit extends Animal{
   private String color;
   private String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }  

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
