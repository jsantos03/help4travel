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
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import uy.edu.cure.servidor.central.soap.client.UsuarioWS;
import uy.edu.cure.servidor.central.soap.client.UsuarioWSImplService;

/**
 *
 * @author SCN
 */
public class AltaProveedor extends javax.swing.JFrame {

    private UsuarioWS portUsuario;
    private UsuarioWSImplService usuarioWSImplService;
    private FileNameExtensionFilter filtro;
    private String rutaImagen;
    private String rutaArchivo;
    private String validez;
    private boolean user, password, passwordConfirm, nombre, apellido, correo, fechad, fecham, fechaA, empresa, linkEmpresa;
    private int dia, mes, anio;
    private Properties progappProperties;
    private InputStream input = null;

    /**
     * Creates new form AltaProveedor
     */
    public AltaProveedor() throws IOException {
        this.progappProperties = new Properties();
        input = this.getClass().getClassLoader().getResourceAsStream("progapp.properties");
        try {
            progappProperties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        filtro = new FileNameExtensionFilter("Formato Imagen", "png", "jpg");
        try {
            usuarioWSImplService = new UsuarioWSImplService(new URL("http://localhost:8080/servidor-central-webapp/soap/UsuarioWSImplService?wsdl"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(AltaProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        portUsuario = usuarioWSImplService.getUsuarioWSImplPort();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UserNameProveedorForm = new javax.swing.JTextField();
        NombreProveedorForm = new javax.swing.JTextField();
        ApellidoProveedorForm = new javax.swing.JTextField();
        CorreoProveedorForm = new javax.swing.JTextField();
        NombreEmpresaProveedorForm = new javax.swing.JTextField();
        LinkEmpresaProveedorForm = new javax.swing.JTextField();
        AñioProveedorForm = new javax.swing.JTextField();
        MesProveedorForm = new javax.swing.JTextField();
        DiaProveedorForm = new javax.swing.JTextField();
        BotonCrearProveedor = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonAgregarImagen = new javax.swing.JButton();
        BotonReset = new javax.swing.JButton();
        WarningUsername = new javax.swing.JLabel();
        WarningNombre = new javax.swing.JLabel();
        WarningApellido = new javax.swing.JLabel();
        WarningCorreo = new javax.swing.JLabel();
        WarningEmpresa = new javax.swing.JLabel();
        WarningLink = new javax.swing.JLabel();
        WarningFecha = new javax.swing.JLabel();
        PreviewImagen = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        labelPasswordError = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textFieldPasswordConfirm = new javax.swing.JTextField();
        labelPassowrdConfirm = new javax.swing.JLabel();
        labelPasswordConfirmError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Correo");

        jLabel5.setText("Nombre Empresa");

        jLabel6.setText("Link Empresa");

        jLabel7.setText("Fecha nacimiento");

        jLabel8.setText("Año");

        jLabel9.setText("Mes");

        jLabel10.setText("Dia");

        AñioProveedorForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñioProveedorFormKeyTyped(evt);
            }
        });

        MesProveedorForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesProveedorFormKeyTyped(evt);
            }
        });

        DiaProveedorForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaProveedorFormKeyTyped(evt);
            }
        });

        BotonCrearProveedor.setText("Aceptar");
        BotonCrearProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProveedorActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonAgregarImagen.setText("Agregar Imagen...");
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
        WarningApellido.setText(" ");

        WarningCorreo.setForeground(new java.awt.Color(255, 51, 51));
        WarningCorreo.setText(" ");

        WarningEmpresa.setForeground(new java.awt.Color(255, 51, 51));
        WarningEmpresa.setText(" ");

        WarningLink.setForeground(new java.awt.Color(255, 51, 51));
        WarningLink.setText(" ");

        WarningFecha.setForeground(new java.awt.Color(255, 51, 51));
        WarningFecha.setText(" ");

        PreviewImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        labelPasswordError.setText(" ");

        labelPassword.setText("Password");

        labelPassowrdConfirm.setText("Confirmar");

        labelPasswordConfirmError.setForeground(new java.awt.Color(255, 0, 0));
        labelPasswordConfirmError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ApellidoProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WarningApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CorreoProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WarningCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NombreEmpresaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WarningEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LinkEmpresaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WarningLink, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NombreProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WarningNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labelPassword)
                                    .addComponent(labelPassowrdConfirm))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldPasswordConfirm)
                                    .addComponent(textFieldPassword)
                                    .addComponent(UserNameProveedorForm, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(WarningUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPasswordConfirmError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(WarningFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AñioProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MesProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DiaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgregarImagen)
                            .addComponent(PreviewImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonReset)
                        .addGap(40, 40, 40)
                        .addComponent(BotonCrearProveedor)
                        .addGap(27, 27, 27)
                        .addComponent(BotonCancelar)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PreviewImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotonAgregarImagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(UserNameProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPasswordError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassowrdConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPasswordConfirmError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreEmpresaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarningEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LinkEmpresaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WarningLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(AñioProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(MesProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(DiaProveedorForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WarningFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCrearProveedor)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonReset))
                .addGap(3, 3, 3))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {WarningApellido, WarningCorreo, WarningEmpresa, WarningNombre, WarningUsername});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProveedorActionPerformed
        WarningUsername.setText("");
        labelPasswordError.setText("");
        labelPasswordConfirmError.setText("");
        WarningNombre.setText("");
        WarningApellido.setText("");
        WarningCorreo.setText("");
        WarningFecha.setText("");
        WarningEmpresa.setText("");
        WarningLink.setText("");
        user = false;
        password = false;
        passwordConfirm = false;
        nombre = false;
        apellido = false;
        correo = false;
        fechad = false;
        fecham = false;
        fechaA = false;
        empresa = false;
        linkEmpresa = false;
        if (UserNameProveedorForm.getText().equals(validez)) {
            WarningUsername.setText("*Campo vacio");
        } else {
            user = true;
        }
        if (textFieldPassword.getText().equals(validez)) {
            labelPasswordError.setText("*Campo vacio");
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
        if (NombreProveedorForm.getText().equals(validez)) {
            WarningNombre.setText("*Campo vacio");
        } else {
            nombre = true;
        }
        if (ApellidoProveedorForm.getText().equals(validez)) {
            WarningApellido.setText("*Campo vacio");
        } else {
            apellido = true;
        }
        if (CorreoProveedorForm.getText().equals(validez)) {
            WarningCorreo.setText("*Campo vacio");
        } else {
            correo = true;
        }
        if (DiaProveedorForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fechad = true;
        }
        if (MesProveedorForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fecham = true;
        }
        if (AñioProveedorForm.getText().equals(validez)) {
            WarningFecha.setText("*Campo vacio");
        } else {
            fechaA = true;
        }
        if (NombreEmpresaProveedorForm.getText().equals(validez)) {
            WarningEmpresa.setText("*Campo vacio");
        } else {
            empresa = true;
        }
        if (LinkEmpresaProveedorForm.getText().equals(validez)) {
            WarningLink.setText("*Campo vacio");
        } else {
            linkEmpresa = true;
        }
        if (user && password && passwordConfirm && nombre && apellido && correo && fechad && fecham && fechaA && empresa && linkEmpresa) {
            dia = Integer.parseInt(DiaProveedorForm.getText());
            mes = Integer.parseInt(MesProveedorForm.getText());
            anio = Integer.parseInt(AñioProveedorForm.getText());
            int resultado = portUsuario.crearProveedorWS(UserNameProveedorForm.getText(), NombreProveedorForm.getText(), ApellidoProveedorForm.getText(), CorreoProveedorForm.getText(), dia, mes, anio, NombreEmpresaProveedorForm.getText(), LinkEmpresaProveedorForm.getText(), rutaImagen, textFieldPassword.getText(), textFieldPasswordConfirm.getText());
            switch (resultado) {
                case -1:
                    javax.swing.JOptionPane.showMessageDialog(null, "Cliente dado de alta", "Alta cliente", 1);
                    break;
                case 1:
                    WarningUsername.setText("*Nombre de usuario ya registrado");
                    break;
                case 2:
                    labelPasswordConfirmError.setText("*Passwords no coinciden");
                    break;
                case 3:
                    WarningCorreo.setText("*Correo electronico invalido");
                    break;
                case 4:
                    WarningCorreo.setText("*Correo en uso");
                    break;
                case 5:
                    WarningFecha.setText("*Fecha invalida");
                    break;
            }
        }
    }//GEN-LAST:event_BotonCrearProveedorActionPerformed

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
        UserNameProveedorForm.setText("");
        textFieldPassword.setText("");
        textFieldPasswordConfirm.setText("");
        NombreProveedorForm.setText("");
        ApellidoProveedorForm.setText("");
        CorreoProveedorForm.setText("");
        DiaProveedorForm.setText("");
        MesProveedorForm.setText("");
        AñioProveedorForm.setText("");
        NombreEmpresaProveedorForm.setText("");
        LinkEmpresaProveedorForm.setText("");
        WarningUsername.setText("");
        labelPasswordError.setText("");
        labelPasswordConfirmError.setText("");
        WarningNombre.setText("");
        WarningApellido.setText("");
        WarningCorreo.setText("");
        WarningFecha.setText("");
        WarningEmpresa.setText("");
        WarningLink.setText("");
        PreviewImagen.setIcon(null);
    }//GEN-LAST:event_BotonResetActionPerformed

    private void AñioProveedorFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñioProveedorFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_AñioProveedorFormKeyTyped

    private void MesProveedorFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesProveedorFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_MesProveedorFormKeyTyped

    private void DiaProveedorFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaProveedorFormKeyTyped
        char tecla = evt.getKeyChar();
        if (!(Character.isDigit(tecla) || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_DiaProveedorFormKeyTyped

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
            java.util.logging.Logger.getLogger(AltaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AltaProveedor().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AltaProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoProveedorForm;
    private javax.swing.JTextField AñioProveedorForm;
    private javax.swing.JButton BotonAgregarImagen;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrearProveedor;
    private javax.swing.JButton BotonReset;
    private javax.swing.JTextField CorreoProveedorForm;
    private javax.swing.JTextField DiaProveedorForm;
    private javax.swing.JTextField LinkEmpresaProveedorForm;
    private javax.swing.JTextField MesProveedorForm;
    private javax.swing.JTextField NombreEmpresaProveedorForm;
    private javax.swing.JTextField NombreProveedorForm;
    private javax.swing.JLabel PreviewImagen;
    private javax.swing.JTextField UserNameProveedorForm;
    private javax.swing.JLabel WarningApellido;
    private javax.swing.JLabel WarningCorreo;
    private javax.swing.JLabel WarningEmpresa;
    private javax.swing.JLabel WarningFecha;
    private javax.swing.JLabel WarningLink;
    private javax.swing.JLabel WarningNombre;
    private javax.swing.JLabel WarningUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelPassowrdConfirm;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordConfirmError;
    private javax.swing.JLabel labelPasswordError;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
