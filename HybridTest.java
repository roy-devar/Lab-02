import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HybridTest {
    private Hybrid hybrid;

    @Before
    public void setUp() throws Exception{
        hybrid = new Hybrid();
        hybrid.setMilesfromGas(40);
        hybrid.setElectricMiles(40);
    }

    @Test
    public void testCalcMPG(){
        double miles = 40;
        double gallons = 1.2;
        double expectedMPG = miles/gallons;

        hybrid.setGallonsfromGas(1.2);
        
        double actualMPG = hybrid.calcGasMPG();

        assertEquals(actualMPG, expectedMPG, 0.01);
    }
    
    @Test
    public void testCalcMPGe(){

        double expectedMPGe = (40.0/70.0) * 33.7;
        hybrid.setElectricMiles(40);
        hybrid.setTotalkWh(70);

        double actualMPGe = hybrid.calcMPGe();

        assertEquals(actualMPGe, expectedMPGe, 0.01);
    }

    @Test
    public void testCostGas(){
        hybrid.setGallonsfromGas(1.2);
        hybrid.setCostPerGallon(3.50);
        double gasCost = hybrid.totalCostForGasMiles();

        double expectedGasCost = 3.50 * 1.2;
        assertEquals(gasCost, expectedGasCost, 0.01);

    }

    @Test
    public void testCostElectric(){
        hybrid.setPricePerkWh(0.35);
        hybrid.setTotalkWh(70);
        double ElectricCost = hybrid.totalCostForElectricMiles();
        double expectedElectricCost = 0.35 * 70;
        assertEquals(ElectricCost, expectedElectricCost, 0.01);

    }
}
