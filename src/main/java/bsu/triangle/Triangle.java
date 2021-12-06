package bsu.triangle;

import function.Function;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Triangle {
    public static void main(String[] args) {
//        double x1,x2,y1,y2,arean,perimeter;
//        Function function = new Function();
//        arean = function.arean(1,2,4,5);
//        perimeter =function.Perimeter(1,2,4,5);
//        System.out.println("面积："+ arean +"\n" +"周长："+ perimeter);

        Function function = new Function();
        double X1,X2,X3,Y1,Y2,Y3,arean2,perimeter2;
        ArrayList<Double> arryList = new ArrayList<Double>();
        arryList = function.Perimeter2(1,2,4,5,5,7);
        System.out.println("三角形的周长是："+arryList.get(3));
        double a= arryList.get(0);
        double b= arryList.get(1);
        double c= arryList.get(2);
        double halfPerimeter2 = arryList.get(3)/2;
        arean2 = Math.sqrt(halfPerimeter2*(halfPerimeter2-a)*(halfPerimeter2-b)*(halfPerimeter2-c));
        System.out.println("三角形的面积是："+arean2);

    }
}
