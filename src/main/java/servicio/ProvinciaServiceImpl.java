/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Provincia;

/**
 *
 * @author esteb
 */
public class ProvinciaServiceImpl implements ProvinciaService {
    
    private List<Provincia> provinciaList;

    public ProvinciaServiceImpl() {
        this.provinciaList = new ArrayList<>();
    }

    @Override
    public void crear(Provincia provincia) {
        this.provinciaList.add(provincia);
    }

    @Override
    public void modificar(int numeroProvincia, Provincia provinciaModificada) {

        var indice = 0;
        for (var provincia : this.provinciaList) {
            if (numeroProvincia == provincia.getCodigo()) {
                this.provinciaList.set(indice, provinciaModificada);
                break;
            } else {
                indice++;
            }
        }

    }

    @Override
    public void eliminar(int codigoProvincia) {
        var indice = 0;
        for (var provincia : this.provinciaList) {
            if (provincia.getCodigo() == codigoProvincia) {
                this.provinciaList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

    @Override
    public List<Provincia> listar() {
        return this.provinciaList;
    }
}
