package Proj3;


import java.util.ArrayList;

public abstract class Flight implements Decorator {
    private String name;
    private ArrayList<Double> ratings;
    private Decorator decorator;

    public Flight(String name, ArrayList<Double> ratings) {
        this.name = name;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        double res = 0;
        for (Double i : ratings) {
            res += i;
        }
        return Math.round(res / ratings.size());
    }

    public void setRating(double rating) {
        ratings.add(rating);
    }

    @Override
    public String addService() {
        if (decorator != null) {
            return decorator.addService();
        } else {
            return "";
        }
    }

    @Override
    public String getDescription() {
        return getName() + " Rating: " + getRating() + " " + addService();
    }

    public void addDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
    public String toString() {
        return getName() + " Rating: " + getRating() + " " + addService();
    }
}
