package seminar2.ExS.homework.base;

public abstract class Bird extends Animal{
    private double flyingHeight;

    public Bird(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.flyingHeight = 0;
    }

    protected Bird(double height, double weight, String eyeColor, double flyingHeight) {
        super(height, weight, eyeColor);
        this.flyingHeight = flyingHeight;
    }

    public void fly(){
        System.out.println("Я лечу на "+ this.flyingHeight+ " метрах");
    }
}
