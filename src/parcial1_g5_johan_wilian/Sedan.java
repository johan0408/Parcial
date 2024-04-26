/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_g5_johan_wilian;

/**
 *
 * @author 1002797447
 */
public class Sedan extends Automovil {
    private double motor;
    private boolean frenos;

    public Sedan(String placa, int modelo, double precio, double motor, boolean frenos) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    // Getters
    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    // Método frenosABS
    public void frenosABS() {
        if (frenos) {
            System.out.println("El automóvil tiene frenos ABS");
        } else {
            System.out.println("El automóvil no tiene frenos ABS");
        }
    }
}
 
    

