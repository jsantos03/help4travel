/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.webapp.soap.server;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import uy.edu.cure.servidor.central.dto.Promocion;
import uy.edu.cure.servidor.central.lib.PromocionControllerImpl;

/**
 *
 * @author SCN
 */
@WebService(endpointInterface = "uy.edu.cure.servidor.central.webapp.soap.server.PromocionWS")

public class PromocionWSImpl implements PromocionWS {

    @Override
    public Promocion obtenerPromocionWS(String nombrePromocion, String nickProveedor) {
        PromocionControllerImpl promocioncontroller = new PromocionControllerImpl();
        Promocion promocionAux;
        promocionAux = promocioncontroller.obtenerPromocion(nombrePromocion, nickProveedor);
        return promocionAux;
    }

    @Override
    public String crearPromocionWS(String nombre, int descuento, String nickProveedor, List<String> servicios) {
        PromocionControllerImpl promocioncontroller = new PromocionControllerImpl();
        String retorno;
        retorno = promocioncontroller.crearPromocion(nombre, descuento, nickProveedor, servicios);
        return retorno;
    }


}