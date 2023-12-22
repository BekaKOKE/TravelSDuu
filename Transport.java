package Proj3;

import java.util.ArrayList;

public class Transport {
    String name;
    ArrayList<Double> ratings;

    public Transport(String name, ArrayList<Double> ratings){
        this.name=name;
        this.ratings=ratings;
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
