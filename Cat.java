package pl.devopsi.akademia;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int yearOfBirth, Enum type, String color){
        super(name, yearOfBirth, type);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Miauuuuuu");
    }
}
