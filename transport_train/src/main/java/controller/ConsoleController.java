package controller;


import model.Carriage;
import model.ComfortTypes;
import model.Train;
import view.ConsoleView;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * controller class
 * @author ivan
 */
public class ConsoleController implements TextConstant {
    /**
     * name properties file
     */
    private static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle messages =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
    /**
     * train with which we working now
     * it`s model main class
     */
    private Train train;
    private ConsoleView view;
    //new Locale("en"));        // English

    /**
     * constructor
     * @param train model class
     * @param view view class
     */
    public ConsoleController(Train train, ConsoleView view) {
        this.train = train;
        this.view = view;
    }

    /**
     * main controller life line
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(messages.getString(INFO_ABOUT_TICKETS));
        showTicketsInfo();
        view.printMessage(messages.getString(TRAIN));
        showInfoAboutTrain();
        view.printMessage(messages.getString(SORT_CARRIAGE));
        sortAndShowTrain();
        view.printMessage(messages.getString(COUNT_AMOUNT_PASSENGERS));
        countAndPrintAmountPassengers();
        view.printMessage(messages.getString(COUNT_TRAIN_WEIGHT));
        showWeightTrain();
        view.printMessage(messages.getString(FIND_CARRIAGE_WITH_MAX_AMOUNT_PASSENGERS_IN_RANGE));
        getAndHandleWagonsWithAmountPassengersInRange(scanner);

    }

    private void showTicketsInfo() {
        for (ComfortTypes comfortTypes : ComfortTypes.values()) {
            view.printMessage(comfortTypes.toString());
        }
    }

    private void showInfoAboutTrain() {
        Train train = this.train;
        StringBuilder trainInfoToPrint = new StringBuilder();

        trainInfoToPrint.append(train.getTrainNumber());
        trainInfoToPrint.append(" ");
        for (Carriage carriage : train.getCarriages()) {
            trainInfoToPrint.append(carriage.getStringRepresentation());
            trainInfoToPrint.append(" ");
        }
        view.printMessage(trainInfoToPrint.toString());
    }

    private void sortAndShowTrain() {
        train.sortTrainByComfortType();
        showInfoAboutTrain();
    }

    private void getAndHandleWagonsWithAmountPassengersInRange(Scanner scanner) {
        view.printMessage(messages.getString(INPUT_FLOR_PASSENGER_RANGE));
        int flor = getNumberFromUser(scanner);
        view.printMessage(messages.getString(INPUT_CEILING_PASSENGER_RANGE));
        int ceiling = getNumberFromUser(scanner);
        for (Carriage carriage : train.getPassengerCarriageWithAmountPassengerInRange(flor, ceiling)) {
            view.printMessage(carriage.getStringRepresentation());
        }

    }

    private int getNumberFromUser(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                value = Math.abs(value);
                scanner.reset();
                return value;
            }
            view.printWrongStringInput();
        }
    }

    private void countAndPrintAmountPassengers() {
        view.printMessage(Integer.toString(train.countAmountPassengers()));
    }

    private void showWeightTrain() {
        view.printMessage(Integer.toString(train.getWeightTrain()));
    }

}
