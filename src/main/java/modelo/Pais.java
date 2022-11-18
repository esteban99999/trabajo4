/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author esteb
 */
public class Pais {
    
   private int codigo;
   private String nombre;
   private String continente;
   private String gentilicio;
   private int habitantes;

    public Pais(int codigo, int habitantes, String nombre, String continente, String gentilicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.continente = continente;
        this.gentilicio = gentilicio;
        this.habitantes = habitantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

       private String habitantesValida() {
        var retorno = "";
        var longitud = this.habitantes;
        if (longitud > 0 && longitud < 1400000000) {
            retorno = "Pais validado";

        } else {
            retorno = "Los habitantes no coincide con ningun pais del mundo";
        }
        return retorno;
    }
    
    
    @Override
    public String toString() {
        return "Pais{" + "codigo=" + codigo + ", nombre=" + nombre + ", continente=" +
                continente + ", gentilicio=" + gentilicio + ", habitantes=" + habitantes + '}';
    }

    

   
}
