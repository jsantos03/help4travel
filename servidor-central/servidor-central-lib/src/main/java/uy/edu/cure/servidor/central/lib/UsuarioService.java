/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.lib;

import java.util.List;
import uy.edu.cure.servidor.central.dto.Cliente;
import uy.edu.cure.servidor.central.dto.Proveedor;

/**
 *
 * @author guido
 */
public interface UsuarioService {

    public boolean guardarCliente(Cliente cliente);

    public boolean guardarProveedor(Proveedor proveedor);

    public boolean existeCliente(String nickName);

    public boolean existeProveedor(String nickName);

    public Cliente obtenerCliente(String nickName);

    public Proveedor obtenerProveedor(String nickName);

    public boolean existeCorreo(String correo);

    public List<Proveedor> obtenerProveedores();

    public List<Cliente> obtenerCientes();

    public void vaciarPersistenciaP();

    public void vaciarPersistenciaC();
}
