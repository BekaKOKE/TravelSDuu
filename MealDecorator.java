package Proj3;

public class MealDecorator implements Decorator {
    private Flight flight;

    public MealDecorator(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String addService() {
        // Provide the implementation for additional services related to meals
        // For example, you can return " with Meal Service" or any relevant information.
        return " with Meal Service";
    }

    @Override
    public String getDescription() {
        return flight.getDescription() + addService();
    }
}
