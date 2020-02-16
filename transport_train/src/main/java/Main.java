import controller.ConsoleController;
import model.Carriage;
import model.CarriageManager;
import model.ComfortTypes;
import view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CarriageManager manager = new CarriageManager();
        ConsoleView view = new ConsoleView();
        ConsoleController controller = new ConsoleController(manager, view);
        controller.start();

    }
}
