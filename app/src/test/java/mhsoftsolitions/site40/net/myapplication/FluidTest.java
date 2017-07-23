package mhsoftsolitions.site40.net.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Mihindu on 07/22/2017.
 */

public class FluidTest {
    private Double weight = 22.0;
    @Test
    public void FluidCalulation() {
        MainActivity m = new MainActivity();
        assertEquals( "33.0 ml/ hr" , m.setFluid(weight, 1.5));
    }

    @Test
    public void FluidCalulation2p5() {
        MainActivity m = new MainActivity();
        assertEquals( "55.0 ml/ hr" , m.setFluid(weight, 2.5));
    }

    @Test
    public void setFluidIVandOral1p5(){
        weight = 20.0;
        MainActivity m = new MainActivity();
        assertEquals( "O:20.0 IV:10.0" , m.setFluidIVandOral(weight, 1.5));
    }

    @Test
    public void setFluidIVandOral2p5(){
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "O:44.0 IV:11.0" , m.setFluidIVandOral(weight, 2.5));
    }



    @Test
    public void setUOPlessthan75() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("46.2 ml/ 3hr", m.setUOP(weight));
    }

    @Test
    public void CefuroximCalulationMoreThan750() {
        weight = 26.0;
        MainActivity m = new MainActivity();
        assertEquals( "750.0", m.setCefuroxim(weight));
    }

    @Test
    public void setFluid2p5() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "22.0", m.setFluid(weight,2.5));
    }

    @Test
    public void setCefuroximLessThan750() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals( "660.0 mg/ 8hr", m.setCefuroxim(weight));
    }

    @Test
    public void setCefuroximMoreThan750() {
        weight = 30.0;
        MainActivity m = new MainActivity();
        assertEquals( "750.0 mg/ 8hr", m.setCefuroxim(weight));
    }

    @Test
    public void setUOPLessThan75() {
        weight = 20.0;
        MainActivity m = new MainActivity();
        assertEquals("42.0 ml/ 3hr" , m.setUOP(weight));
    }

    @Test
    public void setUOPMoreThan75() {
        weight = 50.5;
        MainActivity m = new MainActivity();
        assertEquals("75 ml/ 3hr" , m.setUOP(weight));
    }

    @Test
    public void setMaintainanceWeightLessThan10() {
        weight = 10.0;
        MainActivity m = new MainActivity();
        assertEquals("1000  ml/ 24hr" , m.setMaintainance(weight));
    }

    @Test
    public void setMaintainanceWeight11() {
        weight = 11.0;
        MainActivity m = new MainActivity();
        assertEquals("1050.0 ml/ 24hr" , m.setMaintainance(weight));
    }

    @Test
    public void setMaintainanceWeight22() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("1540.0 ml/ 24hr" , m.setMaintainance(weight));
    }

    @Test
    public void setAdditional (){
        weight = 22.0;
        Double mainAdd = 1540.0;
        MainActivity m = new MainActivity();
        assertEquals("2640.0 ml/ 48hr" , m.setAdditional(weight, mainAdd) );
    }

    @Test
    public void setAdditionalFor80 (){
        weight = 80.0;
        Double mainAdd = 2100.0;
        MainActivity m = new MainActivity();
        assertEquals("4600.0 ml/ 48hr" , m.setAdditional(weight, mainAdd) );
    }

    @Test
    public void setTranexamicAcidLessThan500() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("220.0 mg tds" , m.setTranexamicAcid(weight) );
    }

    @Test
    public void setTranexamicAcidMoreThan500() {
        weight = 51.0;
        MainActivity m = new MainActivity();
        assertEquals("500.0 mg tds" , m.setTranexamicAcid(weight) );
    }

    @Test
    public void setOmeprazoleLessThan20() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("11.0 mg bd" , m.setOmeprazole(weight) );

    }

    @Test
    public void setOmeprazoleMoreThan20() {
        weight = 44.5;
        MainActivity m = new MainActivity();
        assertEquals("20.0 mg bd" , m.setOmeprazole(weight) );

    }

    @Test
    public void setFlagylLessThan500() {
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("165.0 mg tds" , m.setFlagyl(weight) );
    }

    @Test
    public void setFlagylMoreThan500() {
        weight = 67.0;
        MainActivity m = new MainActivity();
        assertEquals("500.0 mg tds" , m.setFlagyl(weight) );
    }

    @Test
    public void setCefotaximLessThan4000(){
        weight = 22.0;
        MainActivity m = new MainActivity();
        assertEquals("1100.0 mg/ 8hr" ,m.setCefotaxim(weight));
    }

    @Test
    public void setCefotaximMoreThan4000(){
        weight = 82.0;
        MainActivity m = new MainActivity();
        assertEquals("4000.0 mg/ 8hr" ,m.setCefotaxim(weight));
    }







  /*  @Test
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

    /*//*   @Test
       public void setAdditional(){
           weight = 22.0;
           Double main = 1540.0;
           MainActivity m = new MainActivity();

           assertEquals( "2640.0" , m.setAdditional(weight));
       }/*//*
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
    }*/
}
