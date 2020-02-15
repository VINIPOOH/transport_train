package view;



import controller.TextConstant;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 26.09.2017.
 */
public class ConsoleView implements TextConstant {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    static String REGULAR_TEMPLATES = "regular_templates";

    public static final ResourceBundle messages =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    //new Locale("en"));        // English

    public static final ResourceBundle regularTemplates =
            ResourceBundle.getBundle(
                    REGULAR_TEMPLATES,
                    new Locale("ua", "UA"));  // Ukrainian
    //new Locale("en"));        // English


    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
            StringBuilder concatString = new StringBuilder();
            for(String v : message) {
                concatString = concatString.append(v);
            }
            return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                messages.getString(INPUT_STRING_DATA),
                messages.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                messages.getString(WRONG_INPUT_DATA),
                messages.getString(INPUT_STRING_DATA),
                messages.getString(message)));
    }
}
