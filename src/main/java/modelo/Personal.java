/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Personal {

    private String firsName;
    private String lastName;
    private String email;
    private String documnetType;
    private String documentNumber;
    private String cellphoneNumber;
    private String password;
    private String gender;
    private String personalType = "Tecnico Farmaceutico";

    public Personal(String firsName, String lastName, String email, String documnetType, String documentNumber, String cellphoneNumber, String password, String gender) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.documnetType = documnetType;
        this.documentNumber = documentNumber;
        this.cellphoneNumber = cellphoneNumber;
        this.password = password;
        this.gender = gender;
    }

    public Personal(String documentNumber, String password) {
        this.documentNumber = documentNumber;
        this.password = password;
    }

    public Personal(String firstName, String lastName, String documentNumber) {
        this.firsName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
    }

    public Personal(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
