public class CarsObjectBuilder implements CarsBuilder {
    private String color, wheels, transmission, engine;
    public CarsObjectBuilder setColor(String color) {this.color = color; return this;}
    public CarsObjectBuilder setWheels(String wheels) {this.wheels = wheels; return this;}
    public CarsObjectBuilder setTransmission(String transmission) {this.transmission = transmission; return this;}
    public CarsObjectBuilder setEngine(String engine) {this.engine = engine; return this;}
    public Cars getResult() {
        if(color == null || wheels == null ||
                transmission == null || engine == null) {
            throw new IllegalStateException("All car fields are required");
        }
        return new Cars(color,wheels,transmission,engine);
    }
}