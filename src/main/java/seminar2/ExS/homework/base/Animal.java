package seminar2.ExS.homework.base;

public abstract class Animal {
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
        return "Животное имеет: \n\tРост: " + height + ";\n\tВес: " + weight +";\n\tЦвет глаз: "+eyeColor;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }
}
