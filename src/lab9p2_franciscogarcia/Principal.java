package lab9p2_franciscogarcia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Dba db = new Dba(".//Database.accdb");
    
    public Principal() {
        initComponents();
        Personas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registro = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre_rg = new javax.swing.JTextField();
        correo_rg = new javax.swing.JTextField();
        contraseña_rg = new javax.swing.JPasswordField();
        edad_rg = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        Interfaz = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        amigos_in = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        amigos_in1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        enviar_in = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        correo_lg = new javax.swing.JTextField();
        contraseña_lg = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresar_lg = new javax.swing.JButton();
        registro_lg = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Registro");

        jLabel5.setText("Nombre");

        jLabel6.setText("Correo");

        jLabel7.setText("Contraseña");

        jLabel8.setText("Edad");

        edad_rg.setModel(new javax.swing.SpinnerNumberModel(18, 18, 100, 1));

        jButton1.setText("Registrarme");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro.getContentPane());
        registro.getContentPane().setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(registroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel8)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addGap(111, 111, 111))
                    .addGroup(registroLayout.createSequentialGroup()
                        .addComponent(nombre_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correo_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(registroLayout.createSequentialGroup()
                        .addComponent(contraseña_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(edad_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(registroLayout.createSequentialGroup()
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1))
                    .addGroup(registroLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jButton4.setText("Chat");

        jButton5.setText("Cargar amigos ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        amigos_in.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amigos"
            }
        ));
        jScrollPane4.setViewportView(amigos_in);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton5)
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Amigos", jPanel1);

        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        amigos_in1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solicitudes"
            }
        ));
        jScrollPane5.setViewportView(amigos_in1);

        enviar_in.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enviar"
            }
        ));
        jScrollPane6.setViewportView(enviar_in);

        jButton6.setText("rechazar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Solicitudes", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Chat", jPanel3);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Interfaz Usuario");

        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InterfazLayout = new javax.swing.GroupLayout(Interfaz.getContentPane());
        Interfaz.getContentPane().setLayout(InterfazLayout);
        InterfazLayout.setHorizontalGroup(
            InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InterfazLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        InterfazLayout.setVerticalGroup(
            InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfazLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(InterfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LogIn");

        jLabel2.setText("Correo");

        jLabel3.setText("Contraseña");

        ingresar_lg.setText("Ingresar");
        ingresar_lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_lgActionPerformed(evt);
            }
        });

        registro_lg.setText("Registro");
        registro_lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_lgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correo_lg)
                            .addComponent(contraseña_lg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ingresar_lg)
                        .addGap(27, 27, 27)
                        .addComponent(registro_lg)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(correo_lg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña_lg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar_lg)
                    .addComponent(registro_lg))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_lgActionPerformed
        
        if(LogIn()){
            JOptionPane.showMessageDialog(this,"Login correcto");
            correo = correo_lg.getText();
            amigos_in.removeAll();
            OpenInterfaz();
            
        }else{
            JOptionPane.showMessageDialog(this,"Hay algo mal");
        }
    }//GEN-LAST:event_ingresar_lgActionPerformed

    private void registro_lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_lgActionPerformed
        
        registro.pack();
        registro.setLocationRelativeTo(this);
        registro.setModal(true);
        registro.setVisible(true);
        //this.setVisible(false);

    }//GEN-LAST:event_registro_lgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        String c, n, p;
        int e;
        correo = correo_rg.getText();
        n = nombre_rg.getText();
        p = contraseña_rg.getText();
        e = (Integer) edad_rg.getValue();
        
        if (Registro()) {
            JOptionPane.showMessageDialog(this, "Ya hay un correo identico");
        } else {
            db.conectar();
            try {

                db.query.execute("INSERT INTO Usuario"
                        + " (nombre,correo, edad,contraseña)"
                        + " VALUES ('" + n + "', '" + correo + "', '" + e + "', '" + p + "')");
                db.commit();
                
                correo_rg.setText("");
                nombre_rg.setText("");
                contraseña_rg.setText("");
                edad_rg.setValue(18);
                registro.setVisible(false);
                OpenInterfaz();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        this.pack();
        this.setVisible(true);
        Interfaz.setVisible(false);
        correo = "";
        amigos = "";
        
        correo_lg.setText("");
        contraseña_lg.setText("");
        personas.clear();
        
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                
        DefaultTableModel modelo = (DefaultTableModel) amigos_in.getModel();
        
        modelo.setNumRows(0);
        amigos_in.setModel(modelo);
        
        for (String l : personas) {
            
            Object[] row = {l};
            modelo.addRow(row);
            
        }
        
        amigos_in.setModel(modelo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        
        DefaultTableModel modelo = (DefaultTableModel) enviar_in.getModel();
        
        modelo.setNumRows(0);
        enviar_in.setModel(modelo);
        
        for (Persona p : Lista) {
            Object[] row = {p};
            modelo.addRow(row);
        }
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int column = 0;
        int row = enviar_in.getSelectedRow();  
        Persona value = (Persona) enviar_in.getModel().getValueAt(row, column);
        
        db.conectar();
        try {

            db.query.execute("INSERT INTO Solictud"
                    + " (emisor,receptor,estado)"
                    + " VALUES ('" + correo + ", '" + value.getCorreo() + "', 'espera')");
            db.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void OpenInterfaz(){
        
        DefaultTableModel modelo = (DefaultTableModel) amigos_in.getModel();
        
        modelo.setNumRows(0);
        amigos_in.setModel(modelo);
        
        StringTokenizer tokens = new StringTokenizer (amigos, ";");
        
        while (tokens.hasMoreTokens()) {
            String str = tokens.nextToken();
            personas.add(str);
            System.out.println(str);
        }
        
        Interfaz.pack();
        Interfaz.setLocationRelativeTo(this);
        Interfaz.setModal(true);
        Interfaz.setVisible(true);
        
    }
    
    public void Personas(){
        db.conectar();
        String n, c, p, a;
        int edad;
        try {
            db.query.execute("select nombre,correo,edad,contraseña,amigos from Usuario");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                n = rs.getString(1);
                c = rs.getString(2);
                edad = rs.getInt(3);
                p = rs.getString(4);
                a = rs.getString(5);
                
                Persona persona = new Persona(edad,n,p,c);
                Lista.add(persona);
                listaAmigos.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }        
        db.desconectar();
    }
    
    public boolean Registro(){
        
        db.conectar();
        try {
            db.query.execute("select correo,amigos from Usuario");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(correo)) {
                    amigos = rs.getString(2);
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }        
        db.desconectar();
        return false;
    }
    
    public boolean LogIn(){
        db.conectar();

        try {
            db.query.execute("select correo,contraseña,amigos from Usuario");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(correo_lg.getText())
                        && rs.getString(2).equals(contraseña_lg.getText())) {
                    amigos = rs.getString(3);
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        db.desconectar();
        return false;
    }
    
    /*public boolean Solicitud(){
        
        
        
    }*/
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Interfaz;
    private javax.swing.JTable amigos_in;
    private javax.swing.JTable amigos_in1;
    private javax.swing.JPasswordField contraseña_lg;
    private javax.swing.JPasswordField contraseña_rg;
    private javax.swing.JTextField correo_lg;
    private javax.swing.JTextField correo_rg;
    private javax.swing.JSpinner edad_rg;
    private javax.swing.JTable enviar_in;
    private javax.swing.JButton ingresar_lg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nombre_rg;
    private javax.swing.JDialog registro;
    private javax.swing.JButton registro_lg;
    // End of variables declaration//GEN-END:variables

String correo, amigos;
ArrayList <String> listaAmigos = new ArrayList();
ArrayList <String> personas = new ArrayList();
ArrayList <Persona> Lista = new ArrayList();
}
