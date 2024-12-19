package org.inhertance;

public class BoxWeight extends Box{
    double weight;

    //Constructor for BoxWeight
    BoxWeight(double w , double h, double d, double w1){
       width =w;
       height=h;
       depth=d;
       weight=w1;
    }

    //Constructor for using super keyword
//    BoxWeight(double w , double h, double d, double w1){
//        super(w,h,d);
//        weight=w1;
//    }

}
