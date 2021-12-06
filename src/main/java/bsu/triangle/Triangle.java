package bsu.triangle;

import function.Function;
import java.util.ArrayList;

public class Triangle {
    public static void main(String[] args) {
//        double x1,x2,y1,y2,arean,perimeter;
//        Function function = new Function();
//        arean = function.arean(1,2,4,5);
//        perimeter =function.Perimeter(1,2,4,5);
//        System.out.println("面积："+ arean +"\n" +"周长："+ perimeter);

        Function function = new Function();
        ArrayList arryList = function.Perimeter2(1,2,1,2,3,4);
        System.out.println("三角形的周长是："+arryList.get(0));
        System.out.println("三角形的面积是："+arryList.get(1));

    }
}
