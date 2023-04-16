package seminar2.ExS.homework.base;

public abstract class Animal implements IVoice {
    private double height;
    private double weight;
    private String eyeColor;

    public Animal(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void getVoice();

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Животное имеет{ Рост: " + height + ", Вес: " + weight +", Цвет глаз: "+eyeColor+"}";
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }
}
