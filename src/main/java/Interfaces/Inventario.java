/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class Inventario extends javax.swing.JFrame {

    private boolean btnEditarClicked = false;
    private final DefaultTableModel modelo;
    private final Controlador controlador;

    public Inventario(Controlador controlador) {
        initComponents();
        modelo = new DefaultTableModel();
        this.controlador = controlador;
        llenarTablaProducto();
        cargarDatosComboBoxTipoProducto();
        configurarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comboBoxTipoproducto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnHome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTARIO FARMACIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 350, 50));

        comboBoxTipoproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Producto" }));
        comboBoxTipoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoproductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTipoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo  Producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, 30));

        txtCodProducto.setBackground(new java.awt.Color(1, 159, 232));
        txtCodProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtCodProducto.setBorder(null);
        getContentPane().add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 30));

        jLabel6.setText("Nombre Producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 180, 30));

        txtNombreProducto.setBackground(new java.awt.Color(1, 159, 232));
        txtNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setBorder(null);
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 180, 30));

        jLabel7.setText("Descripcion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 80, 40));

        txtDescripcion.setBackground(new java.awt.Color(1, 159, 232));
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(null);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 310, 30));

        jLabel8.setText("Stock");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, 30));

        txtStock.setBackground(new java.awt.Color(0, 159, 215));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBorder(null);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, 30));

        jLabel9.setText("Precio Unitario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 110, 30));

        txtPrecioUnitario.setBackground(new java.awt.Color(0, 159, 215));
        txtPrecioUnitario.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioUnitario.setBorder(null);
        txtPrecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUnitarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, 30));

        tblProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 730, 300));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home -5.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 70, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 180, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 310, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 90, 10));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_Producto_Medico.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 150, 70));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 150, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 10));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar_Producto_Medico.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 140, 70));

        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar_Producto_Medico2.png"))); // NOI18N
        btnActualizar.setText(" Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 60));

        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar_Producto_Medico.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 60));

        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_Producto_Medico.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, 60));

        txtFiltro.setBackground(new java.awt.Color(2, 122, 216));
        txtFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFiltro.setBorder(null);
        getContentPane().add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 40));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, -1));

        jLabel3.setText("Filtrar Categoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_Administrador_decision.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 990, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {

        btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isCamposCorrectos()) {
                    registrarProducto();
                    btnEditarClicked = false;
                } else {
                    JOptionPane.showMessageDialog(null, "FALTA LLENAR CAMPOS O CAMPOS INCORRECTOS", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isRowSelected()) {
                    deleteProduct();
                    btnEditarClicked = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Debes Seleccionar una fila a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        });

        btnEditar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnEditarClicked = true;
                returnRowstoFields();
            }

        });

        btnActualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btnEditarClicked) {
                    actualizarProducto(devolverCamposProducto());
                    ActualizarTablaProducto();
                    btnEditarClicked = false;
                    habilitarCampoCodigoProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "Debes Editar Para Despues Actualizar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleanFields();
                btnEditarClicked = false;
                habilitarCampoCodigoProducto();
            }
        });

        btnHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DecisionAdministrador decisionAdministrador = new DecisionAdministrador(controlador);
                decisionAdministrador.setVisible(true);
                decisionAdministrador.setLocationRelativeTo(null);
                dispose();
            }
        });

        txtFiltro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarTabla();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarTabla();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrarTabla();
            }

        });

    }

    private void filtrarTabla() {
        String filtro = txtFiltro.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelo);
        tblProducto.setRowSorter(rowSorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        // Filtrar por la segunda columna (nombre) insensible a mayúsculas/minúsculas
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 1));

        RowFilter<Object, Object> combinedFilter = RowFilter.orFilter(filters);
        rowSorter.setRowFilter(combinedFilter);
    }


    private void comboBoxTipoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoproductoActionPerformed
        if (comboBoxTipoproducto.getSelectedIndex() == 0 || comboBoxTipoproducto.getSelectedItem() == null)
            deshabilitarCampos();
        else
            habilitarCampos();
    }//GEN-LAST:event_comboBoxTipoproductoActionPerformed

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char key = evt.getKeyChar();
        String currentText = txtStock.getText().trim();

        boolean primerDigito = currentText.isEmpty() && key == '0';
        boolean numeros = (key >= '0' && key <= '9') && (!primerDigito || currentText.length() > 0);

        if ((!numeros) || (currentText.length() == 4) || (currentText.equals("-") && key != '\b')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtPrecioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioKeyTyped
        char key = evt.getKeyChar();
        String currentText = txtPrecioUnitario.getText();

        if (!Character.isDigit(key) && key != '.' && key != '\b') {
            evt.consume();
        }

        if (key == '.' && currentText.contains(".")) {
            evt.consume();
        }

        if ((currentText + key).length() > 7 && key != '\b') {
            evt.consume();
        }

        if (currentText.equals("0") && key != '.' && key != '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioUnitarioKeyTyped

    public void cargarDatosComboBoxTipoProducto() {
        try {
            ArrayList<String> tiposProducto = controlador.llenarDatosComboBoxtipoProducto();
            tiposProducto.forEach(comboBoxTipoproducto::addItem);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, "Error al obtener datos de Tipo_Producto", ex);
        }

    }

    public Producto devolverCamposProducto() {
        String codigoProducto = txtCodProducto.getText();
        String nombreProducto = txtNombreProducto.getText();
        int idTipoProducto = comboBoxTipoproducto.getSelectedIndex();
        double precio = Double.parseDouble(txtPrecioUnitario.getText());
        String descripcion = txtDescripcion.getText();
        int stock = Integer.parseInt(txtStock.getText());

        Producto producto = new Producto(codigoProducto, nombreProducto, idTipoProducto, precio, descripcion, stock);
        return producto;
    }

    private void returnRowstoFields() {

        int quantityRowsSelected = tblProducto.getSelectedRowCount();
        int filaSeleccionada = tblProducto.getSelectedRow();
        if (filaSeleccionada != -1 && quantityRowsSelected == 1) {
            int filaVisible = tblProducto.convertRowIndexToModel(filaSeleccionada);
            Object codigoProducto = modelo.getValueAt(filaVisible, 0);
            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (modelo.getValueAt(i, 0).equals(codigoProducto)) {
                    txtCodProducto.setText(String.valueOf(modelo.getValueAt(i, 0)));
                    txtCodProducto.setEditable(false);
                    comboBoxTipoproducto.setSelectedItem(modelo.getValueAt(i, 1));
                    txtNombreProducto.setText(String.valueOf(modelo.getValueAt(i, 2)));
                    txtDescripcion.setText(String.valueOf(modelo.getValueAt(i, 3)));
                    txtPrecioUnitario.setText(String.valueOf(modelo.getValueAt(i, 4)));
                    txtStock.setText(String.valueOf(modelo.getValueAt(i, 5)));
                    break;
                }
            }
        } else {
            btnEditarClicked = false;
            JOptionPane.showMessageDialog(null, "Necesitas escoger una fila a editar ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deshabilitarCampos() {
        txtCodProducto.enable(false);
        txtNombreProducto.enable(false);
        txtDescripcion.enable(false);
        txtStock.enable(false);
        txtPrecioUnitario.enable(false);
    }

    private void habilitarCampos() {
        txtCodProducto.enable(true);
        txtNombreProducto.enable(true);
        txtDescripcion.enable(true);
        txtStock.enable(true);
        txtPrecioUnitario.enable(true);
    }

    private void actualizarProducto(Producto producto) {
        if (isCamposCorrectos()) {
            controlador.editarProducto(producto);
            cleanFields();
        } else {
            JOptionPane.showMessageDialog(null, "Falta llenar Campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarTablaProducto() {
        controlador.traerDatosTablaProductos(modelo, tblProducto);
    }

    private void ActualizarTablaProducto() {
        llenarTablaProducto();
    }

    private void registrarProducto() {
        controlador.registrerProduct(devolverCamposProducto());
        cleanFields();
        ActualizarTablaProducto();
    }

    private boolean isRowSelected() {
        int selectedRow = tblProducto.getSelectedRow();
        int quantityRowsSelected = tblProducto.getSelectedRowCount();
        return selectedRow != -1 && quantityRowsSelected == 1;
    }

    private void cleanFields() {
        comboBoxTipoproducto.setSelectedIndex(0);
        txtCodProducto.setText("");
        txtNombreProducto.setText("");
        txtDescripcion.setText("");
        txtPrecioUnitario.setText("");
        txtStock.setText("");
    }

    private void deleteProduct() {
        int filaSeleccionada = tblProducto.getSelectedRow();
        int filaVisible = tblProducto.convertRowIndexToModel(filaSeleccionada);
        Object codigoProducto = modelo.getValueAt(filaVisible, 0);
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, 0).equals(codigoProducto)) {
                controlador.eliminarProducto(new Producto(String.valueOf(modelo.getValueAt(i, 0))));
                ActualizarTablaProducto();
                break;
            }
        }

    }

    private boolean isCamposCorrectos() {
        return !(txtCodProducto.getText().isEmpty() | txtNombreProducto.getText().isEmpty() || comboBoxTipoproducto.getSelectedIndex() == 0 || txtPrecioUnitario.getText().isEmpty() || txtStock.getText().isEmpty() || Integer.parseInt(txtStock.getText()) < 0);
    }

    private void habilitarCampoCodigoProducto() {
        txtCodProducto.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JComboBox<String> comboBoxTipoproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
