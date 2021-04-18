package company;

public class Car extends Vehicle {

    private int velocity;
    private int gear;

    private final int countGears;
    private final int topSpeed;

    public Car(int topSpeed, int countGears) {
        this.topSpeed = topSpeed;
        this.countGears = countGears;
        this.velocity = 0;
        this.gear = 0;
    }

    @Override
    public void move(int vel) {
        this.velocity = vel;
    }

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void applyBrakes(boolean isBrake) {
        this.velocity=0;
        this.gear = 0;
        System.out.println("Voll in die Eisen");
    }

    @Override
    public String toString() {
        return String.format("Das Auto hat eine Geschwindigkeit von %d, ist im %d. Gang, und erreicht ein Top Speed von %d",
                velocity, gear, topSpeed);
    }
}
