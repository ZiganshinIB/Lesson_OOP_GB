package seminar2.ExS.homework;

import seminar2.ExS.homework.base.Animal;
import seminar2.ExS.homework.base.ICollection;
import seminar2.ExS.homework.base.IVoice;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ICollection<Animal>, IVoice {
    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>();
    }

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public void add(Animal element) {
        animals.add(element);
    }

    @Override
    public boolean remove(Animal element) {
        return animals.remove(element);
    }

    @Override
    public Animal get(int index) {
        var result = animals.get(index);
        System.out.println(result);
        return result;
    }

    @Override
    public Animal remove(int index) {
        return animals.remove(index);
    }

    @Override
    public void infoAll() {
        for (var animal: animals) {
            System.out.println(animal);
        }
    }

    @Override
    public void getVoice() {
        for(var animal: animals){
            animal.getVoice();
        }
    }
}
