public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
