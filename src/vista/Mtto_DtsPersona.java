package vista;


import Pojos.MDatPerso;
import controlador.Controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas;

/**
 *
 * @author User-PC
 */
public class Mtto_DtsPersona extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();//creamos el modelo que mostrara los datos por tipo de persona 
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    Controlador date = new Controlador();
    int row=-1;
    //Consultas call = new Consultas();/////eliminar
    public Mtto_DtsPersona() {
        initComponents();
        mostrarTablaProveedor();
        mostrarTablaCliente();
        mostrarTablaEmpleado();
        Controlador controller = new Controlador();
        controller.llenarCmbPuesto(cmbPuesto);//se manda a llamar los metodos de llenar los comboBox de la clase Controlador
        controller.llenarCmbApellidos(cmbApeMat);
        controller.llenarCmbApellidos(cmbApePat);
        controller.llenarCmbEdoCivil(cmbEdoCivil);
        controller.llenarCmbNombre(cmbNombre);
        controller.llenarCmbGenero(cmbGenero);
        controller.llenarCmbEstudio(cmbGradoAcad);
        controller.llenarCalle(cmbCalle);
        controller.llenarCmbColonia(cmbColonia);
        controller.llenarEstado(cmbEstado);
        controller.llenarMunicipio(cmbMunicipio);
        controller.llenarTipoPersona(cmbNom_Catalogo);   
        btnModify.setEnabled(false);
        btnDrop.setEnabled(false);
        ///////////eliminar
//            modelo.setRowCount(0);
//            modelo = call.consultar(modelo);
//            DatosTabla.setModel(modelo);
        //////////////////eliminar
    }
    
    public void mostrarTablaProveedor(){        
                modelo.addColumn("Id Persona");
                modelo.addColumn("Tipo de persona");
                modelo.addColumn("CURP");
                modelo.addColumn("RFC");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido Paterno");
                //modelo.addColumn("Apellido Materno");//eliminar solo es prueba
                modelo.addColumn("Telefono");
                modelo.addColumn("Email");
                modelo.addColumn("Puesto");
                modelo.addColumn("Razon Social");
                modelo.addColumn("Genero");
                modelo.addColumn("Grado de Estudio");                                
                modelo.addColumn("Direccion");
                //modelo.addColumn("Colonia");
                //modelo.addColumn("Municipio"); 
                //modelo.addColumn("Estado");
    }
       public void mostrarTablaCliente(){        
                modelo1.addColumn("Id Persona");
                modelo1.addColumn("Tipo de persona");
                modelo1.addColumn("CURP");
                modelo1.addColumn("RFC");  
                modelo1.addColumn("Nombre");
                modelo1.addColumn("Apellido Paterno");
                //modelo.addColumn("Apellido Materno");//eliminar solo es prueba
                modelo1.addColumn("Telefono");
                modelo1.addColumn("Email");
                modelo1.addColumn("Genero");
                modelo1.addColumn("Grado de Estudio");
                modelo1.addColumn("Direccion");                
    }
        public void mostrarTablaEmpleado(){        
                modelo2.addColumn("Id Persona");
                modelo2.addColumn("Tipo de persona");
                modelo2.addColumn("CURP");
                modelo2.addColumn("RFC");
                modelo2.addColumn("Nombre");
                modelo2.addColumn("Apellido Paterno");
                //modelo.addColumn("Apellido Materno");//eliminar solo es prueba
                modelo2.addColumn("Telefono");
                modelo2.addColumn("Email");
                modelo2.addColumn("Puesto");                
                modelo2.addColumn("Genero");
                modelo2.addColumn("Grado de Estudio");
                modelo2.addColumn("Direccion");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbNom_Catalogo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPagina = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNumCasa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbCalle = new javax.swing.JComboBox<>();
        cmbColonia = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        cmbNombre = new javax.swing.JComboBox<>();
        cmbApePat = new javax.swing.JComboBox<>();
        cmbEdoCivil = new javax.swing.JComboBox<>();
        cmbApeMat = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbPuesto = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbGradoAcad = new javax.swing.JComboBox<>();
        txtRasonSo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFecNac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRedsoc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosTabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDrop.setText("Eliminar");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDrop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Niagara Solid", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("MANTENIMIENTO DE DATOS PERSONALES");

        cmbNom_Catalogo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una Opción" }));
        cmbNom_Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNom_CatalogoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Usuario");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido Paterno");

        jLabel5.setText("Apelldio Materno");

        jLabel6.setText("Curp");

        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });

        jLabel7.setText("RFC");

        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        jLabel8.setText("Genero");

        jLabel10.setText("Telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una Opción" }));

        jLabel14.setText("Edo Civil");

        jLabel15.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel16.setText("Email");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel17.setText("WWW");

        txtPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        jLabel18.setText("Calle");

        jLabel20.setText("Colonia");

        jLabel21.setText("Num Casa");

        txtNumCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCasaActionPerformed(evt);
            }
        });
        txtNumCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCasaKeyTyped(evt);
            }
        });

        jLabel22.setText("Municipio");

        jLabel23.setText("Estado");

        cmbCalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbColonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        cmbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipioActionPerformed(evt);
            }
        });

        jLabel26.setText("Codigo Postal");

        txtCodPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPostalActionPerformed(evt);
            }
        });
        txtCodPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodPostalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(38, 38, 38)
                        .addComponent(cmbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(cmbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(txtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        cmbNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbApePat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbEdoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        cmbApeMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        jLabel19.setText("Red Social");

        jLabel24.setText("Puesto");

        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        cmbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPuestoActionPerformed(evt);
            }
        });

        jLabel25.setText("Grado Académico");

        cmbGradoAcad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));

        txtRasonSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRasonSoActionPerformed(evt);
            }
        });

        jLabel13.setText("Fec de Nacimiento");

        txtFecNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecNacActionPerformed(evt);
            }
        });

        jLabel9.setText("Razon Social");

        txtRedsoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedsocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCurp, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                            .addComponent(txtRfc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel5))
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEdoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(5, 5, 5)
                                .addComponent(cmbGradoAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(cmbApePat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(207, 207, 207)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRasonSo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(28, 28, 28)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtRedsoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtRedsoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtRasonSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbEdoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbGradoAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))))))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        DatosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DatosTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DatosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DatosTabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNom_Catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNom_Catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        //DtsPersona dts = new DtsPersona();
        MDatPerso datos = new MDatPerso();//insertar
        Consultas llamar = new Consultas();        
        if (btnNew.getText().equals("GRABAR")) {//poner en tipo de persona y hacer si ya existe con la curp...
            int tipo = cmbNom_Catalogo.getSelectedIndex();
            datos.setCvTipPers(cmbNom_Catalogo.getSelectedIndex());
            datos.setCvNombre(cmbNombre.getSelectedIndex());
            datos.setCvApePat(cmbApePat.getSelectedIndex());
            datos.setCvApeMat(cmbApeMat.getSelectedIndex());
            datos.setCurp(txtCurp.getText());
            datos.setRfc(txtRfc.getText());
            datos.setFecNac(txtFecNac.getText());
            datos.setCvEdoCivil(cmbEdoCivil.getSelectedIndex());
            datos.setEdad(Integer.parseInt(txtEdad.getText()));
            datos.setCvGenero(cmbGenero.getSelectedIndex());
            datos.setCvPuesto(cmbPuesto.getSelectedIndex());
            datos.setCvEstudio(cmbGradoAcad.getSelectedIndex());
            datos.setTelefono(txtTelefono.getText());
            datos.setEmail( txtCorreo.getText());
            datos.setPagina(txtPagina.getText());
            datos.setRedSocial(txtRedsoc.getText());
            datos.setRazonSocial(txtRasonSo.getText());
            datos.setCvCalle(cmbCalle.getSelectedIndex());
            datos.setCvColonia(cmbColonia.getSelectedIndex());
            datos.setCvMunicipio(cmbMunicipio.getSelectedIndex());
            datos.setCvestado(cmbEstado.getSelectedIndex());
            datos.setNumCasa(txtNumCasa.getText());
            datos.setCodPostal(txtCodPostal.getText());
            date.PrepararInser(datos);            
            btnNew.setText("Nuevo");
            if(tipo==1){
        	modelo1.setRowCount(0);
    		modelo1 = llamar.consultar1(modelo1);
    		DatosTabla.setModel(modelo1);
                }
                if(tipo==2){
        	modelo2.setRowCount(0);
    		modelo2 = llamar.consultar2(modelo2);// se le puso los modelos dependiendo el tipo de persona y entonces actualizara completo
    		DatosTabla.setModel(modelo2);// pero aparecera en la tabala el tipo de persona
                }
            if(tipo==3){
                 modelo.setRowCount(0);
                 modelo = llamar.consultar(modelo);
                 DatosTabla.setModel(modelo);
            }            
           limpiarCampos();
        }
        else {
           btnNew.setText("GRABAR");
        }
//        modelo.setRowCount(0);
//        modelo = llamar.consultar(modelo);
//        DatosTabla.setModel(modelo);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        //int row = DatosTabla.getSelectedRow();
        String value = DatosTabla.getModel().getValueAt(row, 0).toString();
        
        int opc = JOptionPane.showConfirmDialog(null, "¿Estas seguro de elimar este registro?");
        if(opc == 0){
            int tipo = cmbNom_Catalogo.getSelectedIndex();
        	Consultas util = new Consultas();
        	util.delete(value);
                if(tipo==1){
        	modelo1.setRowCount(0);
    		modelo1 = util.consultar1(modelo1);
    		DatosTabla.setModel(modelo1);
                }
                if(tipo==2){
        	modelo2.setRowCount(0);
    		modelo2 = util.consultar2(modelo2);// se le puso los modelos dependiendo el tipo de persona y entonces actualizara completo
    		DatosTabla.setModel(modelo2);// pero aparecera en la tabala el tipo de persona
                }
                if(tipo==3){
        	modelo.setRowCount(0);
    		modelo = util.consultar(modelo);
    		DatosTabla.setModel(modelo);
                }
                limpiarCampos();
        }
    }//GEN-LAST:event_btnDropActionPerformed
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
            Consultas llamar = new Consultas();            
            txtCurp.setEditable(false);            
            int tipPer= cmbNom_Catalogo.getSelectedIndex();
            String curp= txtCurp.getText();
            int nombre= cmbNombre.getSelectedIndex();
            int apePat=cmbApePat.getSelectedIndex();
            int apeMat =cmbApeMat.getSelectedIndex();          
            String fecha=txtFecNac.getText();
            int EdoCivil=cmbEdoCivil.getSelectedIndex();
            int edad =Integer.parseInt(txtEdad.getText());
            int genero=cmbGenero.getSelectedIndex();
            int puesto= cmbPuesto.getSelectedIndex();
            int estudio=cmbGradoAcad.getSelectedIndex();
            String cel= txtTelefono.getText();
            String correo= txtCorreo.getText();
            String pagina=txtPagina.getText();
            String redS=txtRedsoc.getText();
            String rason=txtRasonSo.getText();
            int calle=cmbCalle.getSelectedIndex();
            int col=cmbColonia.getSelectedIndex();
            int mun=cmbMunicipio.getSelectedIndex();
            int estad=cmbEstado.getSelectedIndex();
            String casa=txtNumCasa.getText();
            String cod=txtCodPostal.getText();
            //int row = DatosTabla.getSelectedRow();//error al saber el id por que lo muestra separado
            //System.out.println(row);
    	if(btnModify.getText().equals("GRABAR")){ 
            int tipo= cmbNom_Catalogo.getSelectedIndex();
            
            String id = DatosTabla.getModel().getValueAt(row, 0).toString();//obtiene cual es la clave            
            llamar.modificar(tipPer,curp, nombre,apePat,apeMat,fecha,EdoCivil,edad,genero,puesto,estudio,cel,correo,
                             pagina,redS,rason,calle,col,mun,estad,casa,cod,id);
            
            btnModify.setText("Modificar");
            if(tipo==1){
        	modelo1.setRowCount(0);
    		modelo1 = llamar.consultar1(modelo1);
                DatosTabla.setModel(modelo1);
    		//DatosTabla.setModel(modelo1);
                txtCurp.setEditable(true);
                }
            if(tipo==2){
        	modelo2.setRowCount(0);
    		modelo2 = llamar.consultar2(modelo2);// se le puso los modelos dependiendo el tipo de persona y entonces actualizara completo
    		DatosTabla.setModel(modelo2);// pero aparecera en la tabala el tipo de persona
                txtCurp.setEditable(true);
                }
            if(tipo==3){
                modelo.setRowCount(0);
                modelo = llamar.consultar(modelo);
                DatosTabla.setModel(modelo);
                txtCurp.setEditable(true);
            }
            limpiarCampos();
            
            }
            else {
            btnModify.setText("GRABAR");//cambiamos el boton nuevo por el de modidicar
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "¿Estas seguro de salir?");
        if(opc == 0){
        System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
        limpiarCampos();
        if(btnNew.getText().equals("GRABAR") || btnModify.getText().equals("GRABAR")){
            btnNew.setText("Nuevo");
            btnModify.setText("Modificar");
        } else{
            btnNew.setText("Nuevo");
            btnModify.setText("Modificar");
        }        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbNom_CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNom_CatalogoActionPerformed

    }//GEN-LAST:event_cmbNom_CatalogoActionPerformed

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        
    }//GEN-LAST:event_txtRfcActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        
    }//GEN-LAST:event_txtCurpActionPerformed

    private void txtFecNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecNacActionPerformed
        
    }//GEN-LAST:event_txtFecNacActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
       
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginaActionPerformed
        
    }//GEN-LAST:event_txtPaginaActionPerformed

    private void txtNumCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCasaActionPerformed
       
    }//GEN-LAST:event_txtNumCasaActionPerformed

    private void txtCodPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPostalActionPerformed
        
    }//GEN-LAST:event_txtCodPostalActionPerformed

    private void txtRasonSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRasonSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRasonSoActionPerformed

    private void DatosTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosTablaMouseClicked
        btnModify.setEnabled(true);
        btnDrop.setEnabled(true);
        Consultas cons= new Consultas();
                  
        int filaSeleccionada=DatosTabla.rowAtPoint(evt.getPoint());
        row=filaSeleccionada;
        String value = DatosTabla.getValueAt(filaSeleccionada, 0).toString();
        String []data=cons.llenarConsulta(value);
        cmbApeMat.setSelectedItem(data[0]);
        txtFecNac.setText(data[1]);//rrecorre el metodo que retorna un String de la clase consultas para darle el valor
        txtEdad.setText(data[2]);//Y LE ASIGANAMOS EL VALOR en los campos
        txtTelefono.setText(data[3]);
        txtCorreo.setText(data[4]);
        txtPagina.setText(data[5]);
        txtRedsoc.setText(data[6]);
        txtNumCasa.setText(data[7]);
        txtCodPostal.setText(data[8]);
        cmbCalle.setSelectedItem(data[9]);        
        cmbColonia.setSelectedItem(data[10]);
        cmbMunicipio.setSelectedItem(data[11]);
        cmbEstado.setSelectedItem(data[12]);
        cmbPuesto.setSelectedItem(data[13]);
        txtRasonSo.setText(data[14]);
        cmbGenero.setSelectedItem(data[15]);
        cmbGradoAcad.setSelectedItem(data[16]);
        cmbEdoCivil.setSelectedItem(data[17]);
        
        cmbNom_Catalogo.setSelectedItem(DatosTabla.getValueAt(filaSeleccionada, 1).toString());
        txtCurp.setText(DatosTabla.getValueAt(filaSeleccionada, 2).toString());
        txtRfc.setText(DatosTabla.getValueAt(filaSeleccionada, 3).toString());
        cmbNombre.setSelectedItem(DatosTabla.getValueAt(filaSeleccionada, 4).toString());
        cmbApePat.setSelectedItem(DatosTabla.getValueAt(filaSeleccionada, 5).toString());                
    }//GEN-LAST:event_DatosTablaMouseClicked
    public void limpiarCampos(){
                txtCurp.setText("");////////////////////////////
                txtRfc.setText("");                
                txtFecNac.setText("");
                txtEdad.setText("");
                txtTelefono.setText("");
                txtCorreo.setText("");
                txtPagina.setText("");
                txtRedsoc.setText("");
                txtRasonSo.setText("");
                txtNumCasa.setText("");
                txtCodPostal.setText("");
                //cmbNom_Catalogo.setSelectedIndex(0);
                cmbNombre.setSelectedIndex(0);
                cmbApePat.setSelectedIndex(0);
                cmbApeMat.setSelectedIndex(0);
                cmbCalle.setSelectedIndex(0);
                cmbMunicipio.setSelectedIndex(0);
                cmbEdoCivil.setSelectedIndex(0);
                cmbGenero.setSelectedIndex(0);
                cmbPuesto.setSelectedIndex(0);
                cmbGradoAcad.setSelectedIndex(0);
                cmbColonia.setSelectedIndex(0);
                cmbEstado.setSelectedIndex(0);                
    } 
    
    private void cmbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioActionPerformed
        
    }//GEN-LAST:event_cmbMunicipioActionPerformed

    private void txtRedsocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedsocActionPerformed
        
    }//GEN-LAST:event_txtRedsocActionPerformed

    
    private void cmbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPuestoActionPerformed

    }//GEN-LAST:event_cmbPuestoActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();/// para que solo agarre numeros para el telefono
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNumCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCasaKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtNumCasaKeyTyped

    private void txtCodPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodPostalKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtCodPostalKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Consultas TipPers = new Consultas();
        
        int catalogo = cmbNom_Catalogo.getSelectedIndex();
        if (catalogo==1){//CLIENTE
            modelo1.setRowCount(0);///checar los tablas por tipo de persona
            modelo1 =TipPers.consultar1(modelo1);//MUESTRA POR TIPO DE PERSONA, SE CREO UN NUEVO OBJETO DE MODELO1
            DatosTabla.setModel(modelo1);// Y SE CREO TABBLAS PARA CADA TIPO DE PERSONA
        }
        if (catalogo==2){//EMPLEADO
            modelo2.setRowCount(0);///checar los tablas por tipo de persona
            modelo2 =TipPers.consultar2(modelo2);//MUESTRA POR TIPO DE PERSONA, SE CREO UN NUEVO OBJETO DE MODELO2
            DatosTabla.setModel(modelo2);// Y SE CREO TABBLAS PARA CADA TIPO DE PERSONA
        }
        if (catalogo==3){//PROVEEDOR
            modelo.setRowCount(0);///checar los tablas por tipo de persona
            modelo =TipPers.consultar(modelo);//MUESTRA POR TIPO DE PERSONA, SE CREO UN NUEVO OBJETO DE MODELO
            DatosTabla.setModel(modelo);// Y SE CREO TABLAS PARA CADA TIPO DE PERSONA
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Mtto_DtsPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mtto_DtsPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mtto_DtsPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mtto_DtsPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mtto_DtsPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DatosTabla;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnDrop;
    public javax.swing.JButton btnModify;
    public javax.swing.JButton btnNew;
    public javax.swing.JButton btnSalir;
    public javax.swing.JComboBox<String> cmbApeMat;
    public javax.swing.JComboBox<String> cmbApePat;
    public javax.swing.JComboBox<String> cmbCalle;
    public javax.swing.JComboBox<String> cmbColonia;
    public javax.swing.JComboBox<String> cmbEdoCivil;
    public javax.swing.JComboBox<String> cmbEstado;
    public javax.swing.JComboBox<String> cmbGenero;
    public javax.swing.JComboBox<String> cmbGradoAcad;
    public javax.swing.JComboBox<String> cmbMunicipio;
    public javax.swing.JComboBox<String> cmbNom_Catalogo;
    public javax.swing.JComboBox<String> cmbNombre;
    public javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtCodPostal;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCurp;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtFecNac;
    public javax.swing.JTextField txtNumCasa;
    public javax.swing.JTextField txtPagina;
    public javax.swing.JTextField txtRasonSo;
    public javax.swing.JTextField txtRedsoc;
    public javax.swing.JTextField txtRfc;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
