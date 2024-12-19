package org.inhertance;

public class Shipment extends BoxWeight{
    double cost;
    Shipment(double w, double h, double d, double w1,double c) {
        super(w, h, d, w1);
        cost=c;
    }
}
