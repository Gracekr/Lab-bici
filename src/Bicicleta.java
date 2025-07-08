import java.util.ArrayList;
import java.util.Scanner;

public class Bicicleta {

    // Propiedades
    private String make;
    private String model;
    private int MaxSpeed;
    private Boolean gears;



    // Constructores

    public Bicicleta(String make, String model, int maxSpeed, Boolean gears) {
        this.make = make;
        this.model = model;
        this.MaxSpeed = maxSpeed;
        this.gears = gears;
    }

    //Getter and setter

    public Boolean getGears() {
        return gears;
    }

    public void setGears(Boolean gears) {
        this.gears = gears;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    // Métodos


    @Override
    public String toString() {
        return "Bicicleta {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", MaxSpeed=" + MaxSpeed +
                ", gears=" + gears +
                '}';
    }

    public void honk(){
        System.out.println("Suena el claxon "+ this.model);
    }
    public void toTurn(){
        System.out.println("Gira a la derecha");
    }
    public void pedalear(Scanner scanner){

        System.out.println("¿A qué velocidad vas?");
        int normalSpeed= 0;
        normalSpeed=scanner.nextInt();

        if (normalSpeed <this.MaxSpeed)System.out.println("Pedalea mas fuerte");else System.out.println("Baja la velocidad o frena");
    }



}
