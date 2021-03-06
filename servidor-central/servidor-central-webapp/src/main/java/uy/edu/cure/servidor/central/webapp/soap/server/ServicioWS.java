/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.webapp.soap.server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import uy.edu.cure.servidor.central.dto.Categoria;
import uy.edu.cure.servidor.central.dto.Servicio;

/**
 *
 * @author SCN
 */
@WebService
public interface ServicioWS {
    
    @WebMethod
    public Servicio obtenerServicioWS(String nombreServicio, String nickProveedor);

    @WebMethod
    public String crearServicioWS(String nombreServicio, String descripcion, double precio, String ciudadOrigen, String ciudadDestino, List<String> categorias, List<String> imagenes, String nickNameProveedor);
    
    @WebMethod
    public List<Servicio> obtenerTodosServiciosWS ();
    
    @WebMethod
    public List<String> obtenerImagenesServicioWS (String nombreServicio, String nickProveedor);
    
    @WebMethod
    public List<Categoria> obtenerCategoriasServicioWS (String nombreServicio, String nickProveedor);
    
    @WebMethod
    public String verificarPrecio(String precio);
    
    @WebMethod
    public void editarDescripcion(String servicio, String proveedor, String descripcion);
    
    @WebMethod
    public void editarPrecio(String servicio, String proveedor, double precio);
    
    @WebMethod
    public void editarCiudadOrigen(String servicio, String proveedor, String ciudad);
    
    @WebMethod
    public void editarCiudadDestino(String servicio, String proveedor, String ciudad);
    
    @WebMethod
    public void editarCategorias(String servicio, String proveedor, List<String> categorias);
    
    @WebMethod
    public void editarImagenes(String servicio, String proveedor, List<String> imagenes);
}
