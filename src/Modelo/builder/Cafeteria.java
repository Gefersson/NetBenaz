/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.builder;

import modelo1.cafe;

/**
 *
 * @author juan
 */
public class Cafeteria {
private cafeBuilder builder;
 public void setBuilder(cafeBuilder builder){
 this.builder= builder;
 }
public  cafe getTazaCafe(){
return builder.getTaza();
}
public  void servirTazaCafe(){
builder.crearTaza();
builder.buildColor();
builder.builNivelAzucar();
builder.buildTemperatura();

}
}

