package org.inhertance;

public class Main {
    public static void main(String[] args) {

        double volume;
        BoxWeight mybox1=new BoxWeight(1,2,3,4);
        BoxWeight mybox2=new BoxWeight(1.1,2.2,3.3,4.3);

        volume=mybox1.volume();
        System.out.println("Volume of mybox1 is "+volume);
        System.out.println("Wight of mybox1 is "+mybox1.weight);
        System.out.println();

        volume=mybox2.volume();
        System.out.println("Volume of mybox1 is "+volume);
        System.out.println("Wight of mybox1 is "+mybox2.weight);
        System.out.println();

        //Superclass variable can reference a subclass variable
        BoxWeight boxWeight=new BoxWeight(2,5.6,9,3.0);
        Box box=new Box();
        box=boxWeight;
        volume= box.volume();
        System.out.println("Volume of mybox1 is "+volume);

        //Multilevel inheritance
        Shipment shipment1=new Shipment(10,20,30,40,100);
        volume= shipment1.volume();
        System.out.println("Volume of shipment is "+volume);
        System.out.println("Cost of shipment is "+shipment1.cost);
        System.out.println();
    }
}
