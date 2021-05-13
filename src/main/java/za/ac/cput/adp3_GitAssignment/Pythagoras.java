package za.ac.cput.adp3_GitAssignment;
import java.util.*;
import java.lang.*;
public class Pythagoras {

    double adjacent=4;
    double opposite=3;
    double hypotenuse;

    public Pythagoras() {
    }

    public Pythagoras(double adjacent, double opposite, double hypotenuse) {
        this.adjacent = adjacent;
        this.opposite = opposite;
        this.hypotenuse = hypotenuse;
    }

    public double getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(double adjacent) {
        this.adjacent = adjacent;
    }

    public double getOpposite() {
        return opposite;
    }

    public void setOpposite(double opposite) {
        this.opposite = opposite;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
}
