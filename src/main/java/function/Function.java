package function;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Function {

    public double arean(double x1,double x2,double y1,double y2){

        return Math.abs(x2 - x1)*Math.abs(y2 - y1)/2;
    }

    public double Perimeter(double x1,double x2,double y1,double y2){
        double x = Math.pow(Math.abs(x2 - x1),2) ;
        double y = Math.pow(Math.abs(y2 - y1),2) ;
        return x - y  + Math.abs(x2 - x1) + Math.abs(y2 - y1) ;
    }


    public double arean2(double x1,double x2,double x3,double y1,double y2,double y3){

        return Math.abs(x2 - x1)*Math.abs(y2 - y1)/2;
    }

    public ArrayList Perimeter2(double x1,double x2,double x3,double y1,double y2,double y3){
        double length1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double length2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double length3 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double length = length1+length2+length3;
        ArrayList<Double> arryList = new ArrayList<Double>();
        arryList.add(length1);
        arryList.add(length2);
        arryList.add(length3);
        arryList.add(length);
        return  arryList;
    }
}
