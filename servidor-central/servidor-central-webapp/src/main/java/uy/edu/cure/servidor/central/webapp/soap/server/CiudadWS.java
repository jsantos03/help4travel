/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.webapp.soap.server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import uy.edu.cure.servidor.central.dto.Ciudad;

/**
 *
 * @author SCN
 */
@WebService
public interface CiudadWS {

    @WebMethod
    public boolean crearCiudadWS(String nombreCiudad, String nombrePais);

    @WebMethod
    public Ciudad obtenerCiudadWS(String nombre);

    @WebMethod
    public List<Ciudad> obtenerTodasCiudadesWS();

}
