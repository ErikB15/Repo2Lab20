import javax.swing.*;

public class ZooManager {
    private Animal[] animals;
    private int animalCount = 0;

    public void initAnimals(int maxAnimals){
        animals = new Animal[maxAnimals];
    }

    public void createLion() {
        String inputName = JOptionPane.showInputDialog(null, "What is the name of the lion?");
        Animal lion = new Lion(inputName);

        if (animalCount < animals.length) {
            animals[animalCount] = lion;
            JOptionPane.showMessageDialog(null, animals[animalCount]);
            animalCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Zoo is full!");
        }
    }
}
