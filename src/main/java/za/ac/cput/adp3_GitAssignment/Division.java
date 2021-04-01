package za.ac.cput.adp3_GitAssignment;

/**
 * Assignment 1
 * Small division program
 * author: Llewelyn Klaase
 * student no: 216267072
 * date 01 April 2021
 * **/

public class Division {

    private double dividend;
    private double divisor;

    public Division() {
    }

    public Division(double dividend, double divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public double result(double a, double B){
        return dividend/divisor;
    }
}