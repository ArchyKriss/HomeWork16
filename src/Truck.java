public class Truck extends Vehicle{
    public Truck(String modelName) {
       super(modelName, 6);
    }
    public void service() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
