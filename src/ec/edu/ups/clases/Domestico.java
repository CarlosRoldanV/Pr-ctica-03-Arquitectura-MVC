/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;


/**
 *
 * @author Carlos
 */
public abstract class Domestico extends Animal implements Acciones {

    private String tamaño;
    private int numExtremindades;
    private String sexo;
    private String alimento;

    public Domestico() {
    }

    

    public String getTamaño() {
        return tamaño;
    }

    public int getNumExtremindades() {
        return numExtremindades;
    }

    public String getSexo() {
        return sexo;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setNumExtremindades(int numExtremindades) {
        this.numExtremindades = numExtremindades;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public Domestico(int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
    }

    public Domestico(String tamaño, int numExtremindades, String sexo, String alimento, int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
        this.tamaño = tamaño;
        this.numExtremindades = numExtremindades;
        this.sexo = sexo;
        this.alimento = alimento;
    }

    public Domestico(String tamaño, int numExtremindades, String sexo, String alimento, String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.tamaño = tamaño;
        this.numExtremindades = numExtremindades;
        this.sexo = sexo;
        this.alimento = alimento;
    }
    

    public boolean jugar(){
        return true;
    }
    public boolean descansar(){
        return true;
    }
    

    @Override
    public String toString() {
        return super.toString()+"\nDomestico\n{" + "tama\u00f1o=" + tamaño + ", numExtremindades=" + numExtremindades + ", sexo=" + sexo + ", alimento=" + alimento + '}';
    }
   @Override
    public boolean nacer() {
      return true;
    }

    @Override
    public boolean morir() {
        return true;
    }
}