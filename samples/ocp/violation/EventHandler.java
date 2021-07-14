package ocp.violation;


public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode) {
            case SPORT -> {
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
            }
            case COMFORT -> {
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
            }
            default -> {
                vehicle.setPower(450);
                vehicle.setSuspensionHeight(15);
            }
            // Yeni bir mod ekelemek istediğimizde (ör. ECONOMY) iki sınıf değişmeli, DrivingMode ve EventHandler.
        }
    }
}
