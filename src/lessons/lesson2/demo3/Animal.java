package lessons.lesson2.demo3;

public abstract class Animal {
    private boolean eyes = true;


    public Animal() {
    }

    public Animal(boolean eyes) {
        this.eyes = eyes;
    }

    public boolean isEyes() {
        return eyes;
    }

    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return eyes == animal.eyes;
    }

    @Override
    public int hashCode() {
        return (eyes ? 1 : 0);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "eyes=" + eyes +
                '}';
    }

    public abstract void scream();

}
