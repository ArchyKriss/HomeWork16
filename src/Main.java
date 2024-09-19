public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck1 = new Truck("truck1");
        Truck truck2 = new Truck("truck2");

        Bicycle bicycle1 = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");

        ServiceStation station = new ServiceStation();

        station.serviceVehicle(car1);
        station.serviceVehicle(car2);
        station.serviceVehicle(bicycle1);
        station.serviceVehicle(bicycle2);
        station.serviceVehicle(truck1);
        station.serviceVehicle(truck2);
    }
}