package org.inhertance;

public class Box {
    double width;
    double height;
    double depth;

    //construct clone of an object
    Box(Box ob){
        width=ob.width;
        depth= ob.depth;
        height= ob.height;
    }

    //constructor when all dimensions specified
    Box(double d,double w,double h){
        width=w;
        height=h;
        depth=d;
    }
    //constructor when no dimensions specified
    //-1 to indicate uninitialized box
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    //constructor when cube is created
    Box(double len){
        width=height=depth=len;
    }

    //compute and return volume
    double volume(){
        return  width*depth*height;
    }

}
