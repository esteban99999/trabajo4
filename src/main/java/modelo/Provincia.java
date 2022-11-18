/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Manuel
 */
public class Provincia {
    private int codigo;
    private String nombre;
    private String letraPlaca;
    private String capital;
    private String equipoFutbol;
    private Pais country;

    public Provincia(int codigo, String nombre, String letraPlaca, String capital, String equipoFutbol, Pais country) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.letraPlaca = letraPlaca;
        this.capital = capital;
        this.equipoFutbol = equipoFutbol;
        this.country = country;
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

    public String getLetraPlaca() {
        return letraPlaca;
    }

    public void setLetraPlaca(String letraPlaca) {
        this.letraPlaca = letraPlaca;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getEquipoFutbol() {
        return equipoFutbol;
    }

    public void setEquipoFutbol(String equipoFutbol) {
        this.equipoFutbol = equipoFutbol;
    }

    public Pais getCountry() {
        return country;
    }

    public void setCountry(Pais country) {
        this.country = country;
    }

    
    private String letraPlacaValida() {
        var retorno = "";
        switch (letraPlaca) {
            case "A":
                retorno = "Ingresado Azuay";
                break;
            case "B":
                retorno = "Ingresado Bolivar";
                break;
            case "C":
                retorno = "Ingresado Carchi";
                break;
            case "E":
                retorno = "Ingresado Esmeraldas";
                break;
            case "G":
                retorno = "Ingresado Guayas";
                break;
            case "H":
                retorno = "Ingresado Chimborazo";
                break;
            case "I":
                retorno = "Ingresado Imbabura";
                break;
            case "L":
                retorno = "Ingresado Loja";
                break;
            case "P":
                retorno = "Ingresado Pichincha";
                break;
            case "O":
                retorno = "Ingresado El oro";
                break;
            case "R":
                retorno = "Ingresado Los Rios";
                break;
            case "M":
                retorno = "Ingresado Manabi";
                break;
            case "V":
                retorno = "Ingresado Morona Santiago";
                break;
            case "N":
                retorno = "Ingresado Napo";
                break;
            case "S":
                retorno = "Ingresado Pastaza";
                break;
            case "Q":
                retorno = "Ingresado Orellana";
                break;
            case "K":
                retorno = "Ingresado Sucumbios";
                break;
            case "T":
                retorno = "Ingresado Tungurahua";
                break;
            case "Z":
                retorno = "Ingresado Zamora chinchipe";
                break;
            case "Y":
                retorno = "Ingresado Santa Elena";
                break;
            case "J":
                retorno = "Ingresado Santo domingo";
                break;
            case "W":
                retorno = "Ingresado Galapagos";
                break;
            case "U":
                retorno = "Ingresado Cañar";
                break;
            case "X":
                retorno = "Ingresado Cotopaxi";
                break;
            default:
                retorno="La letra no coincide con provincias del Ecuador";
        }
        return retorno;  
    }

    @Override
    public String toString() {
        return "Provincia{" + "codigo=" + codigo + ", nombre=" + nombre + ", letraPlaca=" + letraPlaca +
                ", capital=" + capital + ", equipoFutbol=" + equipoFutbol + ", country=" + country + '}';
    }
    
}
