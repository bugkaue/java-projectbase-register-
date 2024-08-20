/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck.Model;

public class Atleta extends Pessoa {
    private String pais;
    private double alturaSuperada;

    public Atleta(String pais, double altura_superada, String nome, char sexo) {
        super(nome, sexo);
        this.pais = pais;
        this.alturaSuperada = altura_superada;
    }
        
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAlturaSuperada() {
        return alturaSuperada;
    }

    public void setAlturaSuperada(double altura_superada) {
        this.alturaSuperada = altura_superada;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Pais: " + pais + ", Altura superada: " + alturaSuperada + "\n";
    }
}
