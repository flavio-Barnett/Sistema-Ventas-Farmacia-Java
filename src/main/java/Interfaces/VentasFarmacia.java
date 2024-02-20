/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Personal;

public final class VentasFarmacia extends javax.swing.JFrame {

    private final Controlador controlador;
    private final DefaultTableModel modelo;

    public VentasFarmacia(Controlador controlador) {
        initComponents();
        modelo = new DefaultTableModel();
        this.controlador = controlador;
        llenarTablaVentitas();
        sumarColumnasporFechas();
        configurarEventos();
    }

    private void configurarEventos() {
        txtFiltro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarTabla();
                sumarColumnasporFechas();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarTabla();
                sumarColumnasporFechas();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrarTabla();
                sumarColumnasporFechas();
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotalGenerado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Filtar Por Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 40));

        txtFiltro.setBackground(new java.awt.Color(1, 114, 215));
        txtFiltro.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltro.setBorder(null);
        getContentPane().add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        tblVentas = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 780, 320));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Analisis de Ventas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 340, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero -2.png"))); // NOI18N
        jLabel4.setText("  TOTAL GENERADO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 230, 60));

        lblTotalGenerado.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        getContentPane().add(lblTotalGenerado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 150, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 20));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home -5.png"))); // NOI18N
        btnHome.setText("jLabel5");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_Administrador_decision.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaVentitas() {
        controlador.traerDatosTablaVentas(modelo, tblVentas);
    }

    private void filtrarTabla() {
        String filtro = txtFiltro.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelo);
        tblVentas.setRowSorter(rowSorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        // Filtrar por la segunda columna (nombre) insensible a mayúsculas/minúsculas
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 5));

        RowFilter<Object, Object> combinedFilter = RowFilter.orFilter(filters);
        rowSorter.setRowFilter(combinedFilter);
    }

    private void sumarColumnasporFechas() {
        double totalDinero = 0;
        for (int i = 0; i < tblVentas.getRowCount(); i++) {
            totalDinero += Double.parseDouble(String.valueOf(tblVentas.getValueAt(i, 4)));
        }
        lblTotalGenerado.setText(String.format("%.2f", totalDinero));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotalGenerado;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
