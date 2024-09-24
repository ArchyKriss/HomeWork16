public class Bicycle extends Vehicle {

    public Bicycle(String modelName) {
        super(modelName, 2);
    }
    public void service() {
        System.out.println("Обслуживаем велосипед");
        updateTyre();
        checkEngine();
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }
    private void checkEngine() {
        System.out.println("У велосипеда нет двигателя.");
    }
}
