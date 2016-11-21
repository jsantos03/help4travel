/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.estacion.de.trabajo;

import com.sun.org.apache.xerces.internal.util.URI;
import java.awt.Image;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import uy.edu.cure.servidor.central.soap.client.UsuarioWS;
import uy.edu.cure.servidor.central.soap.client.UsuarioWSImplService;

/**
 *
 * @author SCN
 */
public class VerInfoProveedor extends javax.swing.JFrame {

    /**
     * Creates new form VerInfoProveedor
     */
    private UsuarioWSImplService usuarioWsImplService;
    private UsuarioWS portUsuario;
    private int indiceProv;
    
    public VerInfoProveedor() throws MalformedURLException {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
          try {
            usuarioWsImplService = new UsuarioWSImplService(new URL("http://localhost:8080/servidor-central-webapp/soap/UsuarioWSImplService?wsdl"));
        } catch (MalformedURLException e) {
            Logger.getLogger(VerInfoProveedor.class.getName()).log(Level.SEVERE,null,e);
        }
        portUsuario = usuarioWsImplService.getUsuarioWSImplPort();
        
        setLocationRelativeTo(null);
        DefaultListModel listaproveedores = new DefaultListModel();
        for (int i = 0; i < portUsuario.obtenerTodosProveedoresWS().size(); i++) {
            listaproveedores.add(i, portUsuario.obtenerTodosProveedoresWS().get(i).getNickName());
        }
        ListaProveedores.setModel(listaproveedores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaProveedores = new javax.swing.JList<>();
        NombreIndicador = new javax.swing.JLabel();
        ApellidoIndicador = new javax.swing.JLabel();
        CorreoIndicador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaServicios = new javax.swing.JList<>();
        NombreAllenar = new javax.swing.JLabel();
        ApellidoAllenar = new javax.swing.JLabel();
        CorreoAllenar = new javax.swing.JLabel();
        FechaAllenar = new javax.swing.JLabel();
        EmpresaAllenar = new javax.swing.JLabel();
        NombreIndicadorServicio = new javax.swing.JLabel();
        DescripcionIndicadorServicio = new javax.swing.JLabel();
        PrecioIndicadorServicio = new javax.swing.JLabel();
        OrigenIndicadorServicio = new javax.swing.JLabel();
        DestinoIndicadorServicio = new javax.swing.JLabel();
        NombServicioAllenar = new javax.swing.JLabel();
        DescServicioAllenar = new javax.swing.JLabel();
        PrecioServicioAllenar = new javax.swing.JLabel();
        OrigenServicioAllenar = new javax.swing.JLabel();
        DestinoServicioAllenar = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        ImagenPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaProveedores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaProveedoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaProveedores);

        NombreIndicador.setText("Nombre :");

        ApellidoIndicador.setText("Apellido :");

        CorreoIndicador.setText("Correo :");

        jLabel4.setText("Fecha nacimiento :");

        jLabel5.setText("Empresa:");

        jLabel6.setText("Servicios ofrecidos :");

        ListaServicios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaServiciosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaServicios);

        NombreIndicadorServicio.setText("Nombre :");

        DescripcionIndicadorServicio.setText("Desc :");

        PrecioIndicadorServicio.setText("Precio :");

        OrigenIndicadorServicio.setText("Origen :");

        DestinoIndicadorServicio.setText("Destino :");

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        ImagenPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CorreoIndicador, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ApellidoIndicador, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombreIndicador, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ApellidoAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FechaAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CorreoAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmpresaAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DestinoIndicadorServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DestinoServicioAllenar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NombreIndicadorServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OrigenIndicadorServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrigenServicioAllenar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrecioIndicadorServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrecioServicioAllenar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DescripcionIndicadorServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DescServicioAllenar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(ImagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(BotonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DescServicioAllenar, DestinoServicioAllenar, NombServicioAllenar, OrigenServicioAllenar, PrecioServicioAllenar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreIndicadorServicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescripcionIndicadorServicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(PrecioServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PrecioIndicadorServicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrigenServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrigenIndicadorServicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DestinoServicioAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DestinoIndicadorServicio))))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreIndicador)
                            .addComponent(NombreAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ApellidoAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidoIndicador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CorreoIndicador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CorreoAllenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(EmpresaAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(FechaAllenar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCancelar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ImagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaProveedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaProveedoresValueChanged
        int indice = ListaProveedores.getSelectedIndex();
        NombreAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indice).getNombre());
        ApellidoAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indice).getApellido());
        CorreoAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indice).getCorreo());
        String dia = Integer.toString(portUsuario.obtenerTodosProveedoresWS().get(indice).getFechanacimiento().getDay());
        String mes = Integer.toString(portUsuario.obtenerTodosProveedoresWS().get(indice).getFechanacimiento().getMonth());
        String anio = Integer.toString(portUsuario.obtenerTodosProveedoresWS().get(indice).getFechanacimiento().getYear());
        FechaAllenar.setText(dia + "/" + mes + "/" + anio);
        EmpresaAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indice).getNombreEmpresa());
        NombServicioAllenar.setText("");
        DescServicioAllenar.setText("");
        PrecioServicioAllenar.setText("");
        OrigenServicioAllenar.setText("");
        DestinoServicioAllenar.setText("");
        ImageIcon iconoPerfil = new ImageIcon(portUsuario.obtenerTodosProveedoresWS().get(indice).getImagenPerfil());
        Image imagenPerfil = iconoPerfil.getImage();
        Image nuevaPerfil = imagenPerfil.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(nuevaPerfil);
        ImagenPerfil.setIcon(nuevoIcono);
        ImagenPerfil.setSize(155, 175);
        //Aqui carga la lista de servicios dependiendo de que proveedor este seleccionado.
        DefaultListModel listaservicios = new DefaultListModel();
        for (int i = 0; i < portUsuario.obtenerTodosProveedoresWS().get(indice).getServicios().size(); i++) {
            listaservicios.add(i, portUsuario.obtenerTodosProveedoresWS().get(indice).getServicios().get(i).getNombre());
        }
        ListaServicios.setModel(listaservicios);
    }//GEN-LAST:event_ListaProveedoresValueChanged

    private void ListaServiciosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaServiciosValueChanged
        int index = ListaServicios.getSelectedIndex();
        indiceProv = ListaProveedores.getSelectedIndex();
        if(ListaServicios.getSelectedIndex() >= 0) {
            NombServicioAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indiceProv).getServicios().get(index).getNombre());
            DescServicioAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indiceProv).getServicios().get(index).getDescripcion());
            PrecioServicioAllenar.setText(Double.toString(portUsuario.obtenerTodosProveedoresWS().get(indiceProv).getServicios().get(index).getPrecio()));
            OrigenServicioAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indiceProv).getServicios().get(index).getOrigen().getNombre());
            DestinoServicioAllenar.setText(portUsuario.obtenerTodosProveedoresWS().get(indiceProv).getServicios().get(index).getDestino().getNombre());
        }
    }//GEN-LAST:event_ListaServiciosValueChanged

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerInfoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInfoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInfoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInfoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VerInfoProveedor().setVisible(true);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(VerInfoProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoAllenar;
    private javax.swing.JLabel ApellidoIndicador;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JLabel CorreoAllenar;
    private javax.swing.JLabel CorreoIndicador;
    private javax.swing.JLabel DescServicioAllenar;
    private javax.swing.JLabel DescripcionIndicadorServicio;
    private javax.swing.JLabel DestinoIndicadorServicio;
    private javax.swing.JLabel DestinoServicioAllenar;
    private javax.swing.JLabel EmpresaAllenar;
    private javax.swing.JLabel FechaAllenar;
    private javax.swing.JLabel ImagenPerfil;
    private javax.swing.JList<String> ListaProveedores;
    private javax.swing.JList<String> ListaServicios;
    private javax.swing.JLabel NombServicioAllenar;
    private javax.swing.JLabel NombreAllenar;
    private javax.swing.JLabel NombreIndicador;
    private javax.swing.JLabel NombreIndicadorServicio;
    private javax.swing.JLabel OrigenIndicadorServicio;
    private javax.swing.JLabel OrigenServicioAllenar;
    private javax.swing.JLabel PrecioIndicadorServicio;
    private javax.swing.JLabel PrecioServicioAllenar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
