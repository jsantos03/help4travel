/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.estacion.de.trabajo;

import java.awt.Image;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import uy.edu.cure.servidor.central.dto.*;
import uy.edu.cure.servidor.central.lib.*;
import uy.edu.cure.servidor.central.lib.jeringa.Jeringa;
import uy.edu.cure.servidor.central.lib.jeringa.JeringaInjector;

/**
 *
 * @author Rodrigo "Lobo Plateado" Pérez
 */
public class VerInfoServicio extends javax.swing.JFrame {

    private List<JLabel> labels;
    @Jeringa (value = "categoriacontroller")
    private CategoriaController categoriaController;
    @Jeringa (value = "serviciocontroller")
    private ServicioController servicioController;

    /**
     * Creates new form VerInfoServicio
     */
    public VerInfoServicio() {
        initComponents();
        
          try {
            JeringaInjector.getInstance().inyectar(this);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        
        setLocationRelativeTo(null);
        labels = new ArrayList<JLabel>();
        labels.add(labelImage1);
        labels.add(labelImage2);
        labels.add(labelImage3);
        scrollPaneProveedores.setVisible(false);
        listProveedores.setVisible(false);
        DefaultTreeModel model = (DefaultTreeModel) treeCategorias.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        Iterator<Categoria> iteratorCategorias = categoriaController.obtenerTodosCategorias().iterator();
        while (iteratorCategorias.hasNext()) {
            Categoria categoriaAuxiliar = iteratorCategorias.next();
            if (categoriaAuxiliar.getPadre() == null) {
                root.add(new DefaultMutableTreeNode(categoriaAuxiliar.getNombre()));
            } else {
                Enumeration<DefaultMutableTreeNode> enumerationNodo = root.depthFirstEnumeration();
                while (enumerationNodo.hasMoreElements()) {
                    DefaultMutableTreeNode nodoAuxiliar = enumerationNodo.nextElement();
                    if (nodoAuxiliar.toString().equals(categoriaAuxiliar.getPadre().getNombre())) {
                        model.insertNodeInto(new DefaultMutableTreeNode(categoriaAuxiliar.getNombre()), nodoAuxiliar, nodoAuxiliar.getChildCount());
                    }
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCategorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCategorias = new javax.swing.JTree();
        labelServicios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        labelProveedor = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelCiudadOrigen = new javax.swing.JLabel();
        labelCiudadDestino = new javax.swing.JLabel();
        buttonAtras = new javax.swing.JButton();
        scrollPaneProveedores = new javax.swing.JScrollPane();
        listProveedores = new javax.swing.JList<>();
        labelImage1 = new javax.swing.JLabel();
        labelImage2 = new javax.swing.JLabel();
        labelImage3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCategorias.setText("Categorias: ");

        treeCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorias");
        treeCategorias.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeCategorias.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeCategoriasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(treeCategorias);

        labelServicios.setText("Servicios: ");

        listServicios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listServicios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listServiciosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listServicios);

        labelProveedor.setText("Proveedor: ");

        labelDescripcion.setText("Descripcion: ");

        labelPrecio.setText("Precio: ");

        labelCiudadOrigen.setText("Ciudad de origen: ");

        labelCiudadDestino.setText("Ciudad de destino: ");

        buttonAtras.setText("Atras");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });

        scrollPaneProveedores.setViewportView(listProveedores);

        labelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage1.setText("NoImage");
        labelImage1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage2.setText("NoImage");
        labelImage2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage3.setText("NoImage");
        labelImage3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCategorias)
                        .addGap(58, 58, 58)
                        .addComponent(labelServicios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelProveedor)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(scrollPaneProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelDescripcion)
                                    .addComponent(labelPrecio)
                                    .addComponent(labelCiudadOrigen)
                                    .addComponent(labelCiudadDestino))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategorias)
                    .addComponent(labelServicios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCiudadOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCiudadDestino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(buttonAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeCategoriasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeCategoriasValueChanged
        labelProveedor.setText("Proveedor: ");
        labelDescripcion.setText("Descripcion: ");
        labelPrecio.setText("Precio: ");
        labelCiudadOrigen.setText("Ciudad de origen: ");
        labelCiudadDestino.setText("Ciudad de destino: ");
        labelImage1.setIcon(null);
        labelImage2.setIcon(null);
        labelImage3.setIcon(null);
        DefaultListModel listaServicios = new DefaultListModel();
        DefaultListModel listaProveedores = new DefaultListModel();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) treeCategorias.getLastSelectedPathComponent();
        Iterator<Servicio> iteratorServicios = servicioController.obtenerTodosServicios().iterator();
        while (iteratorServicios.hasNext()) {
            Servicio servicioAuxiliar = iteratorServicios.next();
            Iterator<Categoria> iteratorCategorias = servicioAuxiliar.getCategorias().iterator();
            while (iteratorCategorias.hasNext()) {
                Categoria categoriaAuxiliar = iteratorCategorias.next();
                if (categoriaAuxiliar.getNombre().equals(nodoSeleccionado.toString())) {
                    listaServicios.addElement(servicioAuxiliar.getNombre());
                    listaProveedores.addElement(servicioAuxiliar.getProveedor().getNickName());
                }
            }
        }
        listServicios.setModel(listaServicios);
        listProveedores.setModel(listaProveedores);
    }//GEN-LAST:event_treeCategoriasValueChanged

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonAtrasActionPerformed

    private void listServiciosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listServiciosValueChanged
        labelImage1.setIcon(null);
        labelImage2.setIcon(null);
        labelImage3.setIcon(null);
        int indice = listServicios.getSelectedIndex();
        if (indice >= 0) {
            DefaultListModel listaProveedores = (DefaultListModel) listProveedores.getModel();
            labelProveedor.setText("Proveedor: " + listaProveedores.get(indice).toString());
            labelDescripcion.setText("Descripcion: " + servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getDescripcion());
            labelPrecio.setText("Precio: " + servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getPrecio());
            labelCiudadOrigen.setText("Ciudad de origen: " + servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getOrigen().getNombre());
            if (servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getDestino() == null) {
                labelCiudadDestino.setText("No hay ciudad de destino");
            } else {
                labelCiudadDestino.setText("Ciudad de Destino: " + servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getDestino().getNombre());
            }
            for (int i = 0; i < servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getImagenes().size(); i++) {
                ImageIcon imageIcon = new ImageIcon(servicioController.obtenerServicio(listServicios.getSelectedValue(), listaProveedores.get(indice).toString()).getImagenes().get(i));
                Image image = imageIcon.getImage();
                Image imageFinal = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon imageIconFinal = new ImageIcon(imageFinal);
                labels.get(i).setIcon(imageIconFinal);
            }
        }
    }//GEN-LAST:event_listServiciosValueChanged

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
            java.util.logging.Logger.getLogger(VerInfoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInfoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInfoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInfoServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerInfoServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCategorias;
    private javax.swing.JLabel labelCiudadDestino;
    private javax.swing.JLabel labelCiudadOrigen;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImage1;
    private javax.swing.JLabel labelImage2;
    private javax.swing.JLabel labelImage3;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelProveedor;
    private javax.swing.JLabel labelServicios;
    private javax.swing.JList<String> listProveedores;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JScrollPane scrollPaneProveedores;
    private javax.swing.JTree treeCategorias;
    // End of variables declaration//GEN-END:variables
}