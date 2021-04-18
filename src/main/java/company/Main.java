package company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car(280, 6);
        System.out.println(porsche.toString());

        // Accelerate Car
        porsche.changeGear(5);
        porsche.move(200);
        System.out.println(porsche.toString());
    }
}
