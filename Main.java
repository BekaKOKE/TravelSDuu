package Proj3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main extends Application {
    private String res = "";
    private String fl = "";
    private String ho = "";
    private String ac = "";
    private String tr = "";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BookingSubject system = new BookingSubject();

        primaryStage.setTitle("TravelSDU");

        Button flightButton = new Button("Show Flights");
        Button hotelButton = new Button("Show Hotels");
        Button activityButton = new Button("Show Activities");
        Button transportButton = new Button("Show Transports");
        Button exitButton = new Button("Finish Trip");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(flightButton, hotelButton, activityButton, transportButton, exitButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        flightButton.setOnAction(e -> handleShowOptions("Flight"));
        hotelButton.setOnAction(e -> handleShowOptions("Hotel"));
        activityButton.setOnAction(e -> handleShowOptions("Activity"));
        transportButton.setOnAction(e -> handleShowOptions("Transport"));
        exitButton.setOnAction(e -> handleExitButton(primaryStage));

        primaryStage.show();
    }

    private void handleShowOptions(String bookingType) {
        BookingFactory booking;

        try {
            if (bookingType.equalsIgnoreCase("Flight")) {
                booking = new FlightBookingFactory();
                ArrayList<Flight> flights = booking.availableList();
                showOptions("Flights", flights, bookingType);
            }

            if (bookingType.equalsIgnoreCase("Hotel")) {
                booking = new HotelBookingFactory();
                ArrayList<Hotel> hotels = booking.availableList();
                showOptions("Hotels", hotels, bookingType);
            }

            if (bookingType.equalsIgnoreCase("Activity")) {
                booking = new ActivityBookingFactory();
                ArrayList<Activity> activities = booking.availableList();
                showOptions("Activities", activities, bookingType);
            }

            if (bookingType.equalsIgnoreCase("Transport")) {
                booking = new TransportBookingFactory();
                ArrayList<Transport> transports = booking.availableList();
                showOptions("Transports", transports, bookingType);
            }

            System.out.println("Continue your trip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private <T> void showOptions(String title, ArrayList<T> options, String bookingType) {
        List<String> optionNames = new ArrayList<>();
        for (T option : options) {
            optionNames.add(option.toString());
        }

        ChoiceDialog<String> dialog = new ChoiceDialog<>(optionNames.get(0), optionNames);
        dialog.setTitle(title);
        dialog.setHeaderText(null);
        dialog.setContentText("Choose an option:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(selectedOption -> {
            System.out.println("You selected: " + selectedOption);
            decorateAndAddToTrip(bookingType, selectedOption);
        });
    }

    private void decorateAndAddToTrip(String bookingType, String selectedOption) {
        switch (bookingType.toLowerCase()) {
            case "flight":
                Flight selectedFlight = getFlightByName(selectedOption);
                if (selectedFlight != null) {
                    Decorator mealDecorator = new MealDecorator(selectedFlight);
                    fl += "Flight: " + mealDecorator.getDescription() + "\n";
                }
                break;
        }
    }

    private Flight getFlightByName(String flightName) {
        for (Flight flight : new FlightBookingFactory().availableList()) {
            if (flight.getName().equalsIgnoreCase(flightName)) {
                return flight;
            }
        }
        return null;
    }

    private void handleExitButton(Stage primaryStage) {
        try {
            res = fl + ho + ac + tr;
            System.out.println("Your trip details:\n" + res);

            primaryStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
