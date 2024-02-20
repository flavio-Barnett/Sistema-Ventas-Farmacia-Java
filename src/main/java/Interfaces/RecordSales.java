package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Personal;

public class RecordSales extends javax.swing.JFrame {

    private final Personal personal;
    private final Controlador controlador;
    private final DefaultTableModel modeloTabla;
    private final int usuario;

    public RecordSales(Controlador controlador, int usuario, Personal personal) {
        initComponents();
        this.controlador = controlador;
        this.usuario = usuario;
        this.personal = personal;
        llenarDatosEmpleado();
        modeloTabla = new DefaultTableModel();
        configurarEventos();
        setTitle("Registro de Ventas");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnCerrarSesion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblApellidoEmpleado = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnBuscarProducto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        lblDniEmpleado = new javax.swing.JLabel();
        btnVenta = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home -5.png"))); // NOI18N
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ventas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        lblDni.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDni.setText("DNI CLIENTE :");
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 200, 30));
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 200, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Cod. Producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        txtNombreProducto.setEditable(false);
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Nombre Producto :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Stock :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 200, 70, 30));

        txtStock.setEditable(false);
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 200, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Cantidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 200, 30));

        tblVenta = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 800, 300));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 660, 200, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel11.setText("Total:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 130, 50));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Sub-Total:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 130, 30));

        txtSubTotal.setEditable(false);
        getContentPane().add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 80, 30));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("I.G.V:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 660, 60, 30));

        txtIgv.setEditable(false);
        getContentPane().add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 80, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_Empleado_Farmacia-removebg-preview104.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 170));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 20, 610));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("BIENVENIDO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 40));

        lblNombreEmpleado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblNombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 170, 40));

        lblCargo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("TRABAJADOR");
        getContentPane().add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 150, 40));

        lblApellidoEmpleado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblApellidoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 170, 50));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1140, 30));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_ProductoFarmacia -3.png"))); // NOI18N
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 60, 60));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar_Producto_Medico-removebg-preview -2.png"))); // NOI18N
        btnAgregar.setText(" AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, 140, 50));

        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_Producto_Medico.png"))); // NOI18N
        btnCancelar.setText(" CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 440, 150, 60));

        lblDniEmpleado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblDniEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblDniEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 170, 50));

        btnVenta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar_venta_Medica-removebg-preview -70.png"))); // NOI18N
        btnVenta.setText("   VENTA");
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 140, 50));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_Administrador_decision.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(845, 540));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if ((txtDni.getText().trim().length() == 8) || (!numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void configurarEventos() {
        btnBuscarProducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controlador.getBuscarDatosProducto(txtProducto, txtNombreProducto, txtCantidad, txtStock);
            }
        });

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AddToTable();
            }
        });

        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteAll();
            }
        });

        btnVenta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                generarVenta();
            }
        });

        btnCerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Login login = new Login(controlador);
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                dispose();
            }
        });

    }

    private void AddToTable() {
        if (!(txtDni.getText().equals(""))) {
            if (Integer.parseInt(txtCantidad.getText()) > 0 && Integer.parseInt(txtCantidad.getText()) < Integer.parseInt(txtStock.getText())) {
                controlador.agregarTablaVenta(modeloTabla, tblVenta, txtProducto, txtCantidad);
                txtDni.setEditable(false);
                txtProducto.setText("");
                txtNombreProducto.setText("");
                txtCantidad.setText("");
                txtStock.setText("");
                sumarColumna();
            } else {
                JOptionPane.showMessageDialog(null, "Stock Insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos Cliente Imcompleto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void sumarColumna() {
        int filas = modeloTabla.getRowCount();
        double suma = 0;
        try {
            for (int i = 0; i < filas; i++) {
                Object valor = modeloTabla.getValueAt(i, 5);
                if (valor instanceof Number number) {
                    suma += number.doubleValue();
                }
            }
        } catch (Exception ex) {
            System.out.println("error = " + ex);
        }
        txtSubTotal.setText(String.format("%.2f", suma * 0.82));
        txtIgv.setText(String.format("%.2f", suma * 0.18));
        txtTotal.setText(String.format("%.2f", suma));
    }

    private void actualizarStockBaseDatos() {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombreProducto = (String) modeloTabla.getValueAt(i, 0);
            int stock = (int) modeloTabla.getValueAt(i, 4);
            controlador.actualizarStock(stock, nombreProducto);
            System.out.println("Producto" + nombreProducto + "; cantidad " + stock);
        }
    }

    private void generarVenta() {
        if (!(txtDni.getText().equals(""))) {
            if (modeloTabla.getRowCount() > 0) {
                controlador.registrarVenta(tblVenta, txtDni, usuario);
                actualizarStockBaseDatos();
                JOptionPane.showMessageDialog(null, "Venta Exitosamente Completada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                modeloTabla.setRowCount(0);
                txtDni.setText("");
                txtSubTotal.setText("");
                txtIgv.setText("");
                txtTotal.setText("");
                txtDni.setEditable(true);

            } else {
                JOptionPane.showMessageDialog(null, "Agrege los elementos a comprar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene el campo del comprador.");
        }
    }

    private void deleteAll() {
        txtDni.setText("");
        txtSubTotal.setText("");
        txtIgv.setText("");
        txtTotal.setText("");
        txtDni.setEditable(true);

    }

    private void llenarDatosEmpleado() {
        lblNombreEmpleado.setText(personal.getFirsName());
        lblApellidoEmpleado.setText(personal.getLastName());
        lblDniEmpleado.setText(personal.getDocumentNumber());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnBuscarProducto;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblApellidoEmpleado;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDniEmpleado;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
