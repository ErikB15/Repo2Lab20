public class Controller {
    private final GUI ui;
    private final ZooManager zooManager;

    public Controller(GUI ui, ZooManager zooManager) {
        this.ui = ui;
        this.zooManager = zooManager;
    }

    public void start(){
        int maxAnimals = ui.askMaxAnimals();
        zooManager.initAnimals(maxAnimals);
        zooManager.createLion();

    }


}
