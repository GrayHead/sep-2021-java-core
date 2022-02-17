package lessons.lesson2.demo3;

public class Dog extends Animal {
    private int legs;


    public Dog() {
    }

    public Dog(boolean eyes, int legs) {
        super(eyes);
        this.legs = legs;
    }


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void scream() {
        System.out.println("gav gav");
    }


    public void bark() {

    }
}
