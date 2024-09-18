public class Bicycle extends Vehicle {

    public Bicycle(String modelName) {
        super(modelName, 2);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine(){
        System.out.println("У велосипеда нет двигателя");
    }
}
