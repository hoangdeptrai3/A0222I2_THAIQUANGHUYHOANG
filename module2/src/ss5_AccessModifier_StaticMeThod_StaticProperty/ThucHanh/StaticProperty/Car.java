package ss5_AccessModifier_StaticMeThod_StaticProperty.ThucHanh.StaticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
    public void display(){
        System.out.println("hello");
    }
}
