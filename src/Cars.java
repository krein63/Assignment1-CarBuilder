public class Cars {
    private final String color;
    private final String wheels;
    private final String transmission;
    private final String engine;
    Cars(String color, String wheels, String transmission, String engine ){
        this.color = color;
        this.wheels = wheels;
        this.transmission = transmission;
        this.engine = engine;
    }
    @Override public String toString(){
        return "Cars["+color+", "+wheels+", "+transmission+", "+engine+"]";
    }
}
