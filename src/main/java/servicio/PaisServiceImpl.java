/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;


/**
 *
 * @author Manuel
 */
public class PaisServiceImpl implements PaisService {
    private List<Pais> paisList;

    public PaisServiceImpl() {
        this.paisList = new ArrayList<>();
    }

    @Override
    public void crear(Pais pais) {
        this.paisList.add(pais);
    }

    @Override
    public void modificar(int codigoPais, Pais paisModificado) {
        var indice = 0;
        for (var pais : this.paisList) {
            if (pais.getCodigo() == codigoPais) {
                this.paisList.set(indice, paisModificado);
                break;
            } else {
                indice++;
            }
        }

    }

    @Override
    public void eliminar(int codigoPais) {
        var indice = 0;
        for (var pais : this.paisList) {
            if (pais.getCodigo() == codigoPais) {
                this.paisList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

    @Override
    public List<Pais> listar() {
        return this.paisList;
    }
}