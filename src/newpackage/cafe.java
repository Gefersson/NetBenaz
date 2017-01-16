/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo1;

/**
 *
 * @author juan
 */
public class cafe {
    private String color;
    private String nivelAzucar;
    private String temperatura;

    public cafe(String color, String nivelAzucar, String temperatura) {
        this.color = color;
        this.nivelAzucar = nivelAzucar;
        this.temperatura = temperatura;
    }
     public cafe(){
     }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNivelAzucar() {
        return nivelAzucar;
    }

    public void setNivelAzucar(String nivelAzucar) {
        this.nivelAzucar = nivelAzucar;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

}
