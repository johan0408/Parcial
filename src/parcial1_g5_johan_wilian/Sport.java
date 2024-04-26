/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_g5_johan_wilian;

/**
 *
 * @author 1002797447
 */
public class Sport extends Moto {
    private String motor;
    private String potencia;
    private String tanque;

    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public void motorGarantia() {
        if (motor.equals("4T")) {
            System.out.println("La garantía de la moto es por 2 años");
        } else if (motor.equals("monocilindrico")) {
            System.out.println("La garantía de la moto es por 1 año");
        }
    }
}