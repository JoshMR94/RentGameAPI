/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rentgameapi.pojos;

/**
 *
 * @author Josquidel
 */
public class Client {
    private int id;
    private String dni;
    private String name;
    private String birthDate;
     
    public Client() {

    }
    
    public Client(int id, String dni, String name, String birthDate) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
