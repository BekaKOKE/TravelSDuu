package Proj3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    String name;
    ArrayList<Double> ratings;

    public Hotel(String name, ArrayList<Double> ratings){
        this.ratings=ratings;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public double getRating(){
        double res=0;
        for (Double d: ratings) {
            res+=d;
        }
        return Math.round(res/ratings.size());
    }

    public String toString() {
        return getName() + " Rating: " + getRating();
    }

    public void setRating(double rating){
        ratings.add(rating);
    }
}
