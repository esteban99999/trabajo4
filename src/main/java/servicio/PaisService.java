/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pais;
/**
 *
 * @author Manuel
 */
public interface PaisService {
    
 public abstract void crear(Pais pais);

    public abstract void modificar(int codigoPais, Pais paisModificado);

    public abstract void eliminar(int codigoPais);

    public abstract List<Pais> listar();   
}
