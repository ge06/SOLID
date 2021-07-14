package lsp.violation;


public class Plane extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if(Gear.R.equals(gear) && getGear().equals(Gear.D)){
            System.out.println("Gear is in Reverse Mode");
        }
    }
}
