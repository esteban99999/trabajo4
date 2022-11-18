/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Pais;
import servicio.PaisServiceImpl;

/**
 *
 * @author Manuel
 */
public class PaisControl {
    
    private PaisServiceImpl paisServiceImpl;

    public PaisControl() {
        this.paisServiceImpl = new PaisServiceImpl();
    }

    public String crear(String[] dato1) {
        var retorno = "Hubo un error al crear el pais:";

        var codigo = Integer.valueOf(dato1[0]).intValue();
        var habitantes = Integer.valueOf(dato1[1]).intValue();
        var nombre = dato1[2];
        var continente = dato1[3];
        var gentilicio = dato1[4];

        if (codigo < 1) {
            retorno += " Codigo de cliente incorrecto.";
        } else {
            if (habitantes < 1 || habitantes > 1400000000) {
                retorno += " La informacion de los habitantes no es valida";
            } else {
                var pais = new Pais(codigo, habitantes, nombre,
                        continente, gentilicio);
                this.paisServiceImpl.crear(pais);
                retorno = "El pais con codigo: " + pais.getCodigo()
                        + " ha sido creado de la manera correcta :D";
            }
        }
        return retorno;
    }

}
