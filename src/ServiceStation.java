public class ServiceStation {
    public void serviceVehicle(Serviceable vehicle) {
        if (vehicle != null) {
            vehicle.service();
        }
    }
}
