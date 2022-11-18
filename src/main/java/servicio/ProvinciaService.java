/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Provincia;

/**
 *
 * @author Manuel
 */
public interface ProvinciaService {
    public abstract void crear(Provincia provincia);

    public abstract void modificar(int codigoProvincia, Provincia provinciaModificado);

    public abstract void eliminar(int codigoProvincia);

    public abstract List<Provincia> listar();
}
