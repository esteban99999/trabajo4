/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Pais;
import modelo.Provincia;
import servicio.ProvinciaServiceImpl;
import servicio.PaisServiceImpl;
/**
 *
 * @author Manuel
 */
public class ProvinciaControl {
 private ProvinciaServiceImpl provinciaServiceImpl;

    public ProvinciaControl() {
        this.provinciaServiceImpl = new ProvinciaServiceImpl();
    }

    public String crear(String[] data) {
        
        var retorno = "Hubo un error al crear el Pais:";
        var codigo = Integer.valueOf(data[0]).intValue();
        var nombre = data[1];
        var letraPlaca = data[2];
        var capital = data[3];
        var equipoFutbol = data[4];
        
        var codigo1 = Integer.valueOf(data[5]).intValue();
        var habitantes = Integer.valueOf(data[6]).intValue();
        var nombre1 = data[7];
        var continente = data[8];
        var gentilicio = data[9];
         
        if (codigo < 1) {
            retorno += " Error en el codigo de Provincia.";
        } else {
            if (letraPlaca=="A" || letraPlaca=="B"|| letraPlaca=="C"|| letraPlaca=="E"||
                   letraPlaca=="G"|| letraPlaca=="H"|| letraPlaca=="I"|| letraPlaca=="L"||
                   letraPlaca=="P"|| letraPlaca=="O"|| letraPlaca=="R"|| letraPlaca=="M"||
                   letraPlaca=="V"|| letraPlaca=="N"|| letraPlaca=="S"|| letraPlaca=="Q"||
                   letraPlaca=="K"|| letraPlaca=="T"|| letraPlaca=="Z"|| letraPlaca=="Y"|| 
                   letraPlaca=="J"|| letraPlaca=="W"|| letraPlaca=="U"|| letraPlaca=="X"){
               
               var pais = new Pais(codigo1, habitantes, nombre1,
                        continente, gentilicio);
               var provincia = new Provincia(codigo, nombre,
                        letraPlaca, capital, equipoFutbol, pais);
              this.provinciaServiceImpl.crear(provincia);
                retorno = "Provincia de codigo: " + provincia.getCodigo()
                        + " Ha sido creada de la manera correcta"; 
            } else {
                retorno = " La placa no coincide con provincias del Ecuador";         
            }
        }
        return retorno;
    }
    public final List<Provincia> listar() {
        return this.provinciaServiceImpl.listar();
    }
    
    
}
