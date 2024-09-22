public class CarRunner {
    public static void main(String[] args) {
        Hybrid HybridVehicle = new Hybrid();
        HybridVehicle.setMilesfromGas(40);
        HybridVehicle.setGallonsfromGas(2);

        double MPG = HybridVehicle.calcGasMPG();
        System.out.println("Hybrid Car MPG: "+MPG);

        HybridVehicle.setCostPerGallon(3.50);
        double GasCost = HybridVehicle.totalCostForGasMiles();
        System.out.println("Hybrid Car Gas Cost: " + GasCost);

        HybridVehicle.setElectricMiles(300);
        HybridVehicle.setTotalkWh(70.0);

        double MPGe = HybridVehicle.calcMPGe();
        System.out.println("Hybrid Car MPGe: "+MPGe);

        HybridVehicle.setPricePerkWh(.35);
        double ElectricCost = HybridVehicle.calcMPGe();
        System.out.println("Hybrid Car Electric Cost: " + ElectricCost);

        double average = (MPG + MPGe)/2;
        System.out.println("Hybrid Car Average MPG: " + average);

    }
}
