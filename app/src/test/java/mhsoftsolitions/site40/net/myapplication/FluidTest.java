package mhsoftsolitions.site40.net.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mihindu on 07/22/2017.
 */

public class FluidTest {
    private Double weight = 22.0;
    @Test
    public void FluidCalulation() {
        MainActivity m = new MainActivity();
        assertEquals( "33.0" , m.setFluid(weight));
    }

    @Test
    public void CefuroximCalulation() {
        MainActivity m = new MainActivity();
        assertEquals( "660.0" , m.setCefuroxim(weight));
    }


    @Test
    public void CefuroximCalulationMoreThan750() {
        weight = 26.0;
        MainActivity m = new MainActivity();
        assertEquals( "750.0", m.setCefuroxim(weight));
    }


    @Test
    public void setFluidIV() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "22.0", m.setFluidIV(weight));
    }

    @Test
    public void setFluidOral() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "33.0" , m.setFluidOral(weight));
    }

    @Test
    public void setUOP() {
        weight = 20.0;
        MainActivity m = new MainActivity();
        assertEquals("42.0" , m.setUOP(weight));
    }

    @Test
    public void setMaintainanceMoreThan20 () {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "1540.0" , m.setMaintainance(weight));
    }

    @Test
    public void setMaintainanceMoreThan10() {
        weight = 12.0;
        MainActivity m = new MainActivity();
        assertEquals( "1100.0" , m.setMaintainance(weight));
    }
    @Test
    public void setMaintainanceLessThan10() {
        weight = 5.0;
        MainActivity m = new MainActivity();
        assertEquals( "500.0", m.setMaintainance(weight));
    }

    @Test
    public void setMaintainance6p6() {
        weight = 6.6;
        MainActivity m = new MainActivity();
        assertEquals( "660.0" , m.setMaintainance(weight));
    }
    @Test
    public void setMaintainance100p2() {
        weight = 100.2;
        MainActivity m = new MainActivity();
        assertEquals( "3104.0" , m.setMaintainance(weight));
    }

    /*   @Test
       public void setAdditional(){
           weight = 22.0;
           Double main = 1540.0;
           MainActivity m = new MainActivity();

           assertEquals( "2640.0" , m.setAdditional(weight));
       }*/
    @Test
    public void setTranexamicAcid (){
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "220.0" , m.setTranexamicAcid(weight));
    }
    @Test
    public void setOmeprazole () {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "11.0" , m.setOmeprazole(weight));
    }
    @Test
    public void setFlagyl(){
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "165.0" , m.setFlagyl(weight));
    }
    @Test
    public void setCefotaxim(){
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "1100.0" , m.setCefotaxim(weight));
    }
}
