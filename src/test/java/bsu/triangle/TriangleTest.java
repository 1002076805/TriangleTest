package bsu.triangle;


import function.Function;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TriangleTest {

//    @Test
//    public  void testArea(){
//        Function function = new Function();
//        double aren,prerimeter;
//        aren = function.arean(1,2,4,5);
//        prerimeter = function.Perimeter(1,2,4,5);
//        Assert.assertEquals(0.5,aren,0.01);
//        Assert.assertEquals(2.0,prerimeter,0.01);
//    }
//
//    @Test
//    public  void NtestArea(){
//        Function function = new Function();
//        double aren,prerimeter;
//        aren = function.arean(1,2,4,5);
//        prerimeter = function.Perimeter(1,2,4,5);
//        Assert.assertEquals(8,aren,0.01);
//        Assert.assertEquals(7,prerimeter,0.01);
//    }

    @Test
    public  void NtestArea(){
        Function function = new Function();
        double aren,prerimeter;
        ArrayList<Double> arryList = function.Perimeter2(1,2,1,2,3,4);
        Assert.assertEquals(4.83,arryList.get(0),0);
        Assert.assertEquals(1,arryList.get(1),0);
    }

    @Test
    public  void WrongNtestArea(){
        Function function = new Function();
        double aren,prerimeter;
        ArrayList<Double> arryList = function.Perimeter2(1,2,1,2,3,4);
        Assert.assertEquals(10,arryList.get(0),0.01);
        Assert.assertEquals(9,arryList.get(1),0.01);
    }

}
