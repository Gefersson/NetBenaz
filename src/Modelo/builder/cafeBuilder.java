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
public abstract class cafeBuilder {
    protected cafe taza;
    
    public cafe getTaza(){
    return taza;
    }
    public void crearTaza(){
    taza= new cafe();
    }
public abstract  void buildColor();
public abstract  void builNivelAzucar();
public abstract  void buildTemperatura();


}

