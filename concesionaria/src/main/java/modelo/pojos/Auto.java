/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 1-4
 */
@Entity
public class Auto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String clave;
    private String marca;
    private String modelo;
    private String color;
    private String motor;
    private int cant_puertas;

    public Auto() {
    }

    public Auto(String clave, String marca, String modelo, String color, String motor, int cant_puertas) {
        this.clave = clave;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.cant_puertas = cant_puertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    
}
