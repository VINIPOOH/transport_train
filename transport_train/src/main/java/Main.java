import controller.ConsoleController;
import model.Train;
import view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Train train = new Train(1);
        ConsoleView view = new ConsoleView();
        ConsoleController controller = new ConsoleController(train, view);
        controller.start();

    }
}
