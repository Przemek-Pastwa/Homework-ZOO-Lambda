package pl.devopsi.akademia;

public class Penguin extends Animal{
    private int height;

    public Penguin(String name, int yearOfBirth, Enum type, int height) {
        super(name, yearOfBirth, type);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Kowalski! Opcje!!!");
    }
}




