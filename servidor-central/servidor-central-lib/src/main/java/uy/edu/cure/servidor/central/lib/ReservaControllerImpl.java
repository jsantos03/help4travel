/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.lib;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import uy.edu.cure.servidor.central.dto.Cliente;
import uy.edu.cure.servidor.central.dto.Promocion;
import uy.edu.cure.servidor.central.dto.Proveedor;
import uy.edu.cure.servidor.central.dto.Reserva;
import uy.edu.cure.servidor.central.dto.Servicio;
import uy.edu.cure.servidor.central.lib.jeringa.Jeringa;
import uy.edu.cure.servidor.central.lib.jeringa.JeringaInjector;

/**
 *
 * @author juan
 */
public class ReservaControllerImpl implements ReservaController {

    @Jeringa(value = "reservaservice")
    ReservaService reservaService;

    public ReservaControllerImpl() {
        try {
            JeringaInjector.getInstance().inyectar(this);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean crearReserva(List<Promocion> promociones, List<Servicio> servicios, Cliente cliente) {

        double precio = 0;
        if ((promociones.isEmpty()) && (servicios.isEmpty())) {
            return false; // no hay promo ni servicios     
        } else {
            if (!servicios.isEmpty()) {
                int size = servicios.size();
                for (int x = 0; x < servicios.size(); x++) {
                    precio = precio + (servicios.get(x).getPrecio());
                }
            }

            if (!promociones.isEmpty()) {
                int size = promociones.size();
                for (int x = 0; x < promociones.size(); x++) {
                    precio = precio + (promociones.get(x).getPrecioTotal());
                }
                if (!servicios.isEmpty()) {
                    Date fechaCreacion = new Date();
                    Reserva reserva = new Reserva(fechaCreacion, precio, "registrada", promociones, servicios);
                    cliente.setReservas(reserva);
                    reserva.setCliente(cliente);
                    reservaService.guardarReserva(reserva);
                    return true; //creada                            
                }
            }
            Date fechaCreacion = new Date();
            Reserva reserva = new Reserva(fechaCreacion, precio, "registrada", promociones, servicios);
            cliente.setReservas(reserva);
            reserva.setCliente(cliente);
            reservaService.guardarReserva(reserva);
            return true; //creada 
        }

    }

    @Override
    public boolean eliminarReserva(int numero) {
        if (reservaService.existeReserva(numero)) {
            reservaService.eliminarReserva(numero);
            return true;
        }
        return false;
    }

    @Override
    public boolean existeReserva(int numero) {
        return reservaService.existeReserva(numero);
    }

    @Override
    public Reserva obtenerReserva(int numero) {
        return reservaService.obtenerReserva(numero);
    }

    @Override
    public List<Reserva> obtenerTodasReservas() {
        return reservaService.obtenerTodasReservas();
    }

    @Override
    public void vaciarPersistencia() {
        reservaService.vaciarPersistencia();
    }

    @Override
    public boolean cambiarEstado(Reserva reserva, String estado) {
        if (estado.equals("Cancelar")) {
            reserva.getCliente().getReservas().remove(reserva);
            this.eliminarReserva(reserva.getNumero());
            return true;
        }

        if (reserva.getEstado().equals(estado)) {
            return true;
        } else if (reserva.getEstado().equals("registrada")) {
            reserva.getCliente().getReservas().remove(reserva);
            reserva.setEstado(estado);
            reserva.getCliente().getReservas().add(reserva);
            return true;
        } else {
            return false;
        }
    }

}