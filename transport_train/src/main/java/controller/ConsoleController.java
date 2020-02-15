package controller;


import model.Carriage;
import model.CarriageManager;

import model.Train;
import view.ConsoleView;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class ConsoleController implements TextConstant {
    private CarriageManager manager;
    private ConsoleView view;

    public ConsoleController(CarriageManager manager, ConsoleView view) {
        this.manager = manager;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        showInfoAboutTrains();

    }

    private void showInfoAboutTrains (){
                Train train = manager.getTrain();
        StringBuilder trainInfoToPrint=new StringBuilder();
        trainInfoToPrint.append(TRAIN);
        trainInfoToPrint.append(train.getTrainNumber());
        trainInfoToPrint.append(" ");
        for (Carriage carriage: train.getCarriages()){
            trainInfoToPrint.append(carriage.toString());
            trainInfoToPrint.append(" ");
        }
    }

    private void waitCommand(Scanner scanner){
        int userInput = getNumberFromUser(scanner);
        switch (userInput){
            case 1:
                break;

        }
    }


    private void sortAndShowTrain(){
        manager.sortTrainByComfortType();
        showInfoAboutTrains();
    }
    private void getAndHandleWagonsWithAmountPassengersInRange(Scanner scanner){
        view.printMessage(INPUT_FLOR_PASSENGER_RANGE);
        int flor =getNumberFromUser(scanner);
        view.printMessage(INPUT_CEILING_PASSENGER_RANGE);
        int ceiling=getNumberFromUser(scanner);
        view.printMessage(manager.getWagonsWithAmountPassengersInRange(flor, ceiling).toString());
    }
    private int getNumberFromUser(Scanner scanner){
        int value;
        while (true){
            if(scanner.hasNextInt()){
                value=scanner.nextInt();
                scanner.reset();
                return value;
            }
        }
    }

    private void countAndPrintAmountPassengers(){
        view.printMessage(Integer.toString(manager.countAmountPassengers()));
    }
    private void showWeightTrain(){
        manager.WeightTrain();
    }

}
