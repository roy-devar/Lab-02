public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;   // gas miles
    private double gallons;
    private double dollarsPerGallon;
    private double kWh;
    private double pricePerkWh;

    private final double MPG_E = 33.7;

    // Calculate the miles per gallon for gas
    public double calcGasMPG() {
        gasMPG = miles / gallons;
        return gasMPG;
    }

    // Calculate the miles per gallon equivalent for electricity
    public double calcMPGe() {
        MpgE = (miles / kWh) * MPG_E;
        return MpgE;
    }

    // Setters for gas properties
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public void setCostPerGallon(double dollars) {
        this.dollarsPerGallon = dollars;
    }


    public void setElectricMiles(double totalElectricMiles) {
        miles = totalElectricMiles;
    }

    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }

    public void setPricePerkWh(double pricePerkWh) {
        this.pricePerkWh = pricePerkWh;
    }

    public double totalCostForGasMiles() {
        return gallons * dollarsPerGallon;
    }

    public double totalCostForElectricMiles() {
        return kWh * pricePerkWh;
    }

}
