public class Main {
    public static void main(String[] args) {

        CarsDirector director = new CarsDirector();

        // Sports car
        CarsObjectBuilder objBuilder = new CarsObjectBuilder();
        director.makeSportsCar(objBuilder);
        Cars sportsCar = objBuilder.getResult();
        System.out.println(sportsCar);

        CarsSpecSheetBuilder sheetBuilder = new CarsSpecSheetBuilder();
        director.makeSportsCar(sheetBuilder);
        String specSheet = sheetBuilder.getResult();
        System.out.println(specSheet);

        // Family car
        CarsObjectBuilder familyObjBuilder = new CarsObjectBuilder();
        director.makeFamilyCar(familyObjBuilder);
        Cars familyCar = familyObjBuilder.getResult();
        System.out.println(familyCar);

        CarsSpecSheetBuilder familySheetBuilder = new CarsSpecSheetBuilder();
        director.makeFamilyCar(familySheetBuilder);
        String familySpecSheet = familySheetBuilder.getResult();
        System.out.println(familySpecSheet);

    }
}