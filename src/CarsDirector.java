public class CarsDirector {
    public void makeSportsCar(CarsBuilder builder) {
        builder.setColor("Black")
                .setWheels("Steel")
                .setTransmission("Manual")
                .setEngine("V12");
    }

    public void makeFamilyCar(CarsBuilder builder) {
        builder.setColor("White")
                .setWheels("Steel")
                .setTransmission("Automatic")
                .setEngine("V4");
    }
}
