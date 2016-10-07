/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.estacion.de.trabajo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import uy.edu.cure.servidor.central.lib.UsuarioControllerImpl;
import uy.edu.cure.servidor.central.lib.jeringa.Jeringa;
import uy.edu.cure.servidor.central.lib.jeringa.JeringaInjector;

/**
 *
 * @author SCN
 */
public class AltaCliente extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro;
    private String rutaImagen;
    private String rutaArchivo;
    private String validez;
    private int dia, mes, anio;
    private boolean user, password, passwordConfirm, nombre, apellido, correo, fechad, fecham, fechaA;
    @Jeringa(value = "usuariocontroller")
    private UsuarioControllerImpl usuariocontrollerForm;
    private Properties progappProperties;
    private InputStream input = null;

    /**
     * Creates new form AltaCliente
     */
    public AltaCliente() throws IOException {
        this.progappProperties = new Properties();
        input = this.getClass().getClassLoader().getResourceAsStream("progapp.properties");
        progappProperties.load(input);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        try {
            JeringaInjector.getInstance().inyectar(this);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //Filtro para FileChooser
        filtro = new FileNameExtensionFilter("Formato Imagen", "png", "jpg");
        rutaImagen = "";
        rutaArchivo = "";
        validez = "";
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserNameForm = new javax.swing.JTextField();
        NombreForm = new javax.swing.JTextField();
        ApellidoForm = new javax.swing.JTextField();
        CorreoForm = new javax.swing.JTextField();
        AñioForm = new javax.swing.JTextField();
        MesForm = new javax.swing.JTextField();
        DiaForm = new javax.swing.JTextField();
        BotonCrear = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonAgregarImagen = new javax.swing.JButton();
        BotonReset = new javax.swing.JButton();
        WarningUsername = new javax.swing.JLabel();
        WarningNombre = new javax.swing.JLabel();
        WarningApellido = new javax.swing.JLabel();
        WarningCorreo = new javax.swing.JLabel();
        WarningFecha = new javax.swing.JLabel();
        PreviewImagen = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelPassWordError = new javax.swing.JLabel();
        textFieldPasswordConfirm = new javax.swing.JTextField();
        labelPasswordConfirm = new javax.swing.JLabel();
        labelPasswordConfirmError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Correo");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Año");

        jLabel7.setText("Mes");

        jLabel8.setText("Dia");

        AñioForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñioFormKeyTyped(evt);
            }
        });

        MesForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesFormKeyTyped(evt);
            }
        });

        DiaForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaFormKeyTyped(evt);
            }
        });

        BotonCrear.setText("Aceptar");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonAgregarImagen.setText("Agregar imagen...");
        BotonAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarImagenActionPerformed(evt);
            }
        });

        BotonReset.setText("Reset");
        BotonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResetActionPerformed(evt);
            }
        });

        WarningUsername.setForeground(new java.awt.Color(255, 51, 51));

        WarningNombre.setForeground(new java.awt.Color(255, 51, 51));

        WarningApellido.setForeground(new java.awt.Color(255, 51, 51));

        WarningCorreo.setForeground(new java.awt.Color(255, 0, 0));

        WarningFecha.setForeground(new java.awt.Color(255, 0, 0));

        PreviewImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelPassword.setText("Password");

        labelPassWordError.setForeground(new java.awt.Color(255, 0, 0));

        labelPasswordConfirm.setText("Confirmar");

        labelPasswordConfirmError.setForeground(new java.awt.Color(255, 0, 0));
        labelPasswordConfirmError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonReset)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCrear)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(WarningCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WarningApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ApellidoForm, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(CorreoForm, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombreForm, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(WarningNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labelPassword)
                                    .addComponent(labelPasswordConfirm))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelPasswordConfirmError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPassWordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserNameForm, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(WarningUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldPassword)
                                    .addComponent(textFieldPasswordConfirm))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(PreviewImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AñioForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MesForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DiaForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BotonAgregarImagen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WarningFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ApellidoForm, CorreoForm, NombreForm, UserNameForm});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(UserNameForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(WarningUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPassWordError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPasswordConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPasswordConfirmError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(WarningNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ApellidoForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(WarningApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PreviewImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(AñioForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(MesForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(DiaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregarImagen))
                .addGap(12, 12, 12)
                .addComponent(WarningFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonCrear)
                    .addComponent(BotonReset)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        WarningUsername.setText("");
        labelPassWordError.setText("");
        labelPasswordConfirmError.setText("");
        WarningNombre.setText("");
        WarningApellido.setText("");
        WarningCorreo.setText("");
        WarningFecha.setText("");
        user = false;
        password = false;
        passwordConfirm = false;
        nombre = false;
        apellido = false;
        correo = false;
        fechad = false;
        fecham = false;
        fechaA = false;
        if (UserNameForm.getText().equals(validez)) {
            WarningUsername.setText("*Campo vacio");
        } else {
            user = true;
        }
        if (textFieldPassword.getText().equals(validez)) {
            labelPassWordError.setText("*Campo vacio");
        } else {
            password = true;
        }
        if (textFieldPasswordConfirm.getText().equals(validez)) {
            labelPasswordConfirmError.setText("*Campo vacio");
        } else if (!textFieldPasswordConfirm.getText().equals(textFieldPassword.getText())) {
            labelPasswordConfirmError.setText("*Passwords no coinciden");
        } else {
            passwordConfirm = true;
        }
        if (NombreForm.getText().equals(validez)) {
            WarningNombre.setText("*Campo vacio");
        } else {
            nombre = true;
        }
        if (ApellidoForm.getText().equals(validez)) {
            WarningApellido.setText("*Campo vacio");
        } else {
            apellido = true;
        }
        if (CorreoForm.getText().equals(validez)) {
            WarningCorreo.setText("*Campo vacio");
        } else {
            correo = true;
        }
        if (DiaForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fechad = true;
        }
        if (MesForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fecham = true;
        }
        if (AñioForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fechaA = true;
        }
        if (user && password && passwordConfirm && nombre && apellido && correo && fechad && fecham && fechaA) {
            dia = Integer.parseInt(DiaForm.getText());
            mes = Integer.parseInt(MesForm.getText());
            anio = Integer.parseInt(AñioForm.getText());
            int resultado = usuariocontrollerForm.crearCliente(UserNameForm.getText(), NombreForm.getText(), ApellidoForm.getText(), CorreoForm.getText(), dia, mes, anio, rutaImagen, textFieldPassword.getText());
            if (resultado == -1) {
                javax.swing.JOptionPane.showMessageDialog(null, "Cliente dado de alta", "Alta cliente", 1);
            } else if (resultado == 1) {
                WarningUsername.setText("*Nombre de usuario ya registrado");
            } else if (resultado == 2) {
                WarningCorreo.setText("*Correo electronico ya registrado");
            } else if (resultado == 3) {
                WarningCorreo.setText("*Correo electronico invalido");
            } else if (resultado == 4) {
                WarningFecha.setText("*Fecha invalida");
            }
        }
    }//GEN-LAST:event_BotonCrearActionPerformed


    private void BotonAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarImagenActionPerformed
        JFileChooser selectorImagen = new JFileChooser();
        selectorImagen.setFileFilter(filtro);
        int opcion = selectorImagen.showOpenDialog(this);
        //Al clikear ABRIR :
        if (opcion == JFileChooser.APPROVE_OPTION) {
            rutaArchivo = selectorImagen.getSelectedFile().toString();
            Date d = new Date();
            String nombreImagen = Long.toString(d.getTime());
            String ruta = progappProperties.getProperty("ruta.imagenes");
            ruta = ruta + nombreImagen + ".png";
            rutaImagen = ruta;
            File destino = new File(ruta);
            File JFile = new File(rutaArchivo);

            try {
                Files.copy(JFile.toPath(), destino.toPath());
            } catch (IOException ex) {
                Logger.getLogger(AltaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

            ImageIcon iconoPerfil = new ImageIcon(JFile.getAbsolutePath());
            Image imagenPerfil = iconoPerfil.getImage();
            Image nuevaPerfil = imagenPerfil.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
            ImageIcon nuevoIcono = new ImageIcon(nuevaPerfil);
            PreviewImagen.setIcon(nuevoIcono);
            PreviewImagen.setSize(155, 175);
            PreviewImagen.setVisible(true);
        }

    }//GEN-LAST:event_BotonAgregarImagenActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResetActionPerformed
        UserNameForm.setText("");
        textFieldPassword.setText("");
        textFieldPasswordConfirm.setText("");
        NombreForm.setText("");
        ApellidoForm.setText("");
        CorreoForm.setText("");
        DiaForm.setText("");
        MesForm.setText("");
        AñioForm.setText("");
        WarningUsername.setText("");
        labelPassWordError.setText("");
        labelPasswordConfirmError.setText("");
        WarningNombre.setText("");
        WarningApellido.setText("");
        WarningCorreo.setText("");
        WarningFecha.setText("");
        PreviewImagen.setIcon(null);
    }//GEN-LAST:event_BotonResetActionPerformed

    private void AñioFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñioFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_AñioFormKeyTyped

    private void MesFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_MesFormKeyTyped

    private void DiaFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_DiaFormKeyTyped

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
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AltaCliente().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AltaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoForm;
    private javax.swing.JTextField AñioForm;
    private javax.swing.JButton BotonAgregarImagen;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonReset;
    private javax.swing.JTextField CorreoForm;
    private javax.swing.JTextField DiaForm;
    private javax.swing.JTextField MesForm;
    private javax.swing.JTextField NombreForm;
    private javax.swing.JLabel PreviewImagen;
    private javax.swing.JTextField UserNameForm;
    private javax.swing.JLabel WarningApellido;
    private javax.swing.JLabel WarningCorreo;
    private javax.swing.JLabel WarningFecha;
    private javax.swing.JLabel WarningNombre;
    private javax.swing.JLabel WarningUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelPassWordError;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordConfirm;
    private javax.swing.JLabel labelPasswordConfirmError;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
