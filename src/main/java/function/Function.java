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

        double halfPerimeter2 = length/2;
        double arean1 = halfPerimeter2-length1;
        double arean2 = halfPerimeter2-length2;
        double arean3 = halfPerimeter2-length3;
        double arean = Math.sqrt(halfPerimeter2 * arean1 * arean2 * arean3);

        length = Double.parseDouble(String.format("%.2f", length ));
        arean = Double.parseDouble(String.format("%.2f", arean ));

        ArrayList<Double> arryList = new ArrayList<>();
        arryList.add(length);
        arryList.add(arean);
        return  arryList;
    }
}
