package pl.devopsi.akademia;

public class Meerkat extends Animal{
    private boolean isAlive;

    public Meerkat(String name, int yearOfBirth, Enum type, boolean isAlive) {
        super(name, yearOfBirth, type);
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Hieny!!!");
    }
}



