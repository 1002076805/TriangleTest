package bsu.triangle;


import function.Function;
import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {

    @Test
    public  void testArea(){
        Function function = new Function();
        double aren,prerimeter;
        aren = function.arean(1,2,4,5);
        prerimeter = function.Perimeter(1,2,4,5);
        Assert.assertEquals(0.5,aren,0.01);
        Assert.assertEquals(2.0,prerimeter,0.01);
    }

    @Test
    public  void NtestArea(){
        Function function = new Function();
        double aren,prerimeter;
        aren = function.arean(1,2,4,5);
        prerimeter = function.Perimeter(1,2,4,5);
        Assert.assertEquals(8,aren,0.01);
        Assert.assertEquals(7,prerimeter,0.01);
    }

}
