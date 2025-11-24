import javax.swing.*;

public class GUI {
    private int maxNumber;


    public int askMaxAnimals() {
        String MaxAnimals = JOptionPane.showInputDialog("How many animals will you store");
        maxNumber = Integer.parseInt(MaxAnimals);
        JOptionPane.showMessageDialog(null, "Zoo can keep " + maxNumber + " Animals");
        return maxNumber;
    }

}
