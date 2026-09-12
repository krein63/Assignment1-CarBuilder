public class CarsSpecSheetBuilder implements  CarsBuilder {
    private final StringBuilder sb = new StringBuilder("==== Cars spec sheet====\n");
    public CarsSpecSheetBuilder setColor(String color) {sb.append("COLOR:").append(color).append("\n"); return this;}
    public CarsSpecSheetBuilder setWheels(String wheels) {sb.append("WHEELS:").append(wheels).append("\n"); return this;}
    public CarsSpecSheetBuilder setTransmission(String transmission) {sb.append("TRANSMISSION:").append(transmission).append("\n"); return this;}
    public CarsSpecSheetBuilder setEngine(String engine) {sb.append("ENGINE:").append(engine).append("\n"); return this;}
    public String getResult() {
        return sb.toString();
    }
}