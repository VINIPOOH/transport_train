package view;


import controller.ConsoleController;
import controller.TextConstant;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 26.09.2017.
 */
public class ConsoleView implements TextConstant {





    public void printMessage(String message) {
        System.out.println(message);
    }



    public void printWrongStringInput() {
        printMessage(ConsoleController.
                messages.getString(WRONG_INPUT_DATA));
    }
}
