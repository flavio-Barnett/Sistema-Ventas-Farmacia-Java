package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Personal;

public class Login extends javax.swing.JFrame {
    private static boolean cerrarVentaLogin=false;
    private final Controlador controlador;

    public Login(Controlador controlador) {
        this.controlador = controlador;
        this.setTitle("Inicio de Sesión");
        this.setLocationRelativeTo(null);
        initComponents();
        configurarEventos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagen_01 = new javax.swing.JLabel();
        Panel_LogIn = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        Fondo_Usuario = new javax.swing.JLabel();
        Fondo_Contrasena = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        Imagen_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Main.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(845, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_LogIn.setBackground(new java.awt.Color(255, 255, 255));
        Panel_LogIn.setPreferredSize(new java.awt.Dimension(130, 100));
        Panel_LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(0,0,0,0));
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Nro Documento");
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        Panel_LogIn.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 30));

        txtContrasena.setBackground(new java.awt.Color(0,0,0,0));
        txtContrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setText("Contrasena");
        txtContrasena.setBorder(null);
        txtContrasena.setOpaque(false);
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        Panel_LogIn.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 340, 250, 35));

        Fondo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Gradient1.png"))); // NOI18N
        Panel_LogIn.add(Fondo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 260, 40));

        Fondo_Contrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Gradient1.png"))); // NOI18N
        Panel_LogIn.add(Fondo_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user2.png"))); // NOI18N
        Panel_LogIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password.png"))); // NOI18N
        Panel_LogIn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user1.png"))); // NOI18N
        Panel_LogIn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 130));

        btnLogin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 153, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("ACCEDER");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_LogIn.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 240, 40));

        getContentPane().add(Panel_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 420, 570));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_farmacia.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 138, 322, 329));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {

        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = String.valueOf(txtContrasena.getPassword());
                Personal personal = new Personal(usuario, contrasena);
                controlador.iniciarSesion(personal);
                if(cerrarVentaLogin)dispose();
            }
        });
    }
    
    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if (txtContrasena.getText().equals("")) {
            txtContrasena.setText("Contrasena");
        }
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (txtContrasena.getText().equals("Contrasena")) {
            txtContrasena.setText(null);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().equals("")) {
            txtUsuario.setText("Nro Documento");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Nro Documento")) {
            txtUsuario.setText(null);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || txtUsuario.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    public static void cerrarVentanalogin(){
        Login.cerrarVentaLogin=true;}
    public static void mantenerAbiertaVentanalogin(){
        Login.cerrarVentaLogin=false;  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Contrasena;
    private javax.swing.JLabel Fondo_Usuario;
    private javax.swing.JLabel Imagen_01;
    private javax.swing.JPanel Panel_LogIn;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
