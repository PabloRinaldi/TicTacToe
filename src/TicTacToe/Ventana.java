package TicTacToe;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends javax.swing.JFrame {

    private String nombre1, nombre2;
    private boolean jugador1 = true;
    private boolean jugador2 = false;
    static int puntajeJugador1=0;
    static int puntajeJugador2=0;
    
    
    public Ventana() {
        initComponents();
        cambiarNombre();
        turno();
        txtPuntajeJugador1.setText(Integer.toString(puntajeJugador1));
        txtPuntajeJugador2.setText(Integer.toString(puntajeJugador2));
        txtJugadorNombre.setEditable(false);
        txtNombre.setEditable(false);
        txtPuntajeJugador1.setEditable(false);
        txtPuntajeJugador2.setEditable(false);
    }
    public void setNombre(String nombre1, String nombre2){
        this.nombre1 = nombre1; this.nombre2 = nombre2;
        txtNombre.setText(nombre1);
    }

    private void cambiarNombre(){
        if (jugador1==true){
            txtNombre.setText(nombre1);
        }else{
            txtNombre.setText(nombre2);
        }
    }
    private void Validar(){
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnDos.getBackground() &&
                btnUno.getBackground() == btnTres.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; //Rojo fila uno
                bloquear();
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnDos.getBackground() &&
                btnUno.getBackground() == btnTres.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul fila uno
                bloquear();
            }
            if (btnCuatro.getBackground() == Color.red && (btnCuatro.getBackground() == btnCinco.getBackground() &&
                btnCuatro.getBackground() == btnSeis.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; //Rojo fila dos
                bloquear();
            }
            if (btnCuatro.getBackground() == Color.blue && (btnCuatro.getBackground() == btnCinco.getBackground() &&
                    btnCuatro.getBackground() == btnSeis.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++;  //Azul fila dos
                bloquear();
            }
            if (btnSiete.getBackground() == Color.red && (btnSiete.getBackground() == btnOcho.getBackground() &&
                btnSiete.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; //Rojo fila tres
                bloquear();
            }
            if (btnSiete.getBackground() == Color.blue && (btnSiete.getBackground() == btnOcho.getBackground() &&
                btnSiete.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; //Azul fila tres
                bloquear();
            }
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnCuatro.getBackground() &&
                btnUno.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; // Rojo Columna uno
                bloquear();
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnCuatro.getBackground() &&
                btnUno.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul Columna uno
                bloquear();
            }
            if (btnDos.getBackground() == Color.red && (btnDos.getBackground() == btnCinco.getBackground() &&
                btnDos.getBackground() == btnOcho.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; // Rojo Columna dos
                bloquear();
            }
            if (btnDos.getBackground() == Color.blue && (btnDos.getBackground() == btnCinco.getBackground() &&
                btnDos.getBackground() == btnOcho.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul Columna dos
                bloquear();
            }
            if (btnTres.getBackground() == Color.red && (btnTres.getBackground() == btnSeis.getBackground() &&
                btnTres.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; // Rojo Columna tres
                bloquear();
            } 
            if (btnTres.getBackground() == Color.blue && (btnTres.getBackground() == btnSeis.getBackground() &&
                btnTres.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul Columna tres
                bloquear();
            } 
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnCinco.getBackground() &&
                btnUno.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"!!!!!!");
                puntajeJugador1++; // Rojo Diagonal baja 
                bloquear();
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnCinco.getBackground() &&
                btnUno.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul Diagonal baja 
                bloquear();
            }
            if (btnTres.getBackground() == Color.red && (btnTres.getBackground() == btnCinco.getBackground() &&
                btnTres.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre1.toUpperCase()+"  !!!!!!");
                puntajeJugador1++; // Rojo Diagonal sube 
                bloquear();
            }
            if (btnTres.getBackground() == Color.blue && (btnTres.getBackground() == btnCinco.getBackground() &&
                btnTres.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "GANO: "+nombre2.toUpperCase()+"  !!!!!!");
                puntajeJugador2++; // Azul Diagonal sube 
                bloquear();
            }
            txtPuntajeJugador1.setText(Integer.toString(puntajeJugador1));
            txtPuntajeJugador2.setText(Integer.toString(puntajeJugador2));
        //}
    }
    
    private void Reiniciar(){
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
        btnOcho.setEnabled(true);
        btnNueve.setEnabled(true);
        
        btnUno.setBackground(Color.gray);
        btnDos.setBackground(Color.gray);
        btnTres.setBackground(Color.gray);
        btnCuatro.setBackground(Color.gray);
        btnCinco.setBackground(Color.gray);
        btnSeis.setBackground(Color.gray);
        btnSiete.setBackground(Color.gray);
        btnOcho.setBackground(Color.gray);
        btnNueve.setBackground(Color.gray);
        jugador1 = true; jugador2=false;
        cambiarNombre();
        turno();
    }
    
    private void bloquear(){
        btnUno.setEnabled(false);
        btnDos.setEnabled(false);
        btnTres.setEnabled(false);
        btnCuatro.setEnabled(false);
        btnCinco.setEnabled(false);
        btnSeis.setEnabled(false);
        btnSiete.setEnabled(false);
        btnOcho.setEnabled(false);
        btnNueve.setEnabled(false);
    }
    
    private void turno (){
        if (jugador1==true){
            txtJugadorNombre.setText("1");
        }else {
            txtJugadorNombre.setText("2");
        }
    }
    
    private void cambiarTurno(){
        if (jugador1==true){
            
            jugador1 = false; jugador2 = true;
        }else{
            jugador1 = true; jugador2 = false;
        }
        cambiarNombre();
        turno();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPuntajeJugador1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPuntajeJugador2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJugadorNombre = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUno.setBackground(java.awt.Color.gray);
        btnUno.setForeground(java.awt.Color.gray);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setBackground(java.awt.Color.gray);
        btnDos.setForeground(java.awt.Color.gray);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(java.awt.Color.gray);
        btnTres.setForeground(java.awt.Color.gray);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(java.awt.Color.gray);
        btnCuatro.setForeground(java.awt.Color.gray);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(java.awt.Color.gray);
        btnCinco.setForeground(java.awt.Color.gray);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(java.awt.Color.gray);
        btnSeis.setForeground(java.awt.Color.gray);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSiete.setBackground(java.awt.Color.gray);
        btnSiete.setForeground(java.awt.Color.gray);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(java.awt.Color.gray);
        btnOcho.setForeground(java.awt.Color.gray);
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(java.awt.Color.gray);
        btnNueve.setForeground(java.awt.Color.gray);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntaje Jugador 1:");

        txtPuntajeJugador1.setEditable(false);
        txtPuntajeJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeJugador1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Puntaje Jugador 2:");

        txtPuntajeJugador2.setEditable(false);
        txtPuntajeJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeJugador2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Turno del Jugador:");

        txtJugadorNombre.setEditable(false);
        txtJugadorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugadorNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPuntajeJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPuntajeJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPuntajeJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPuntajeJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        if (jugador1==true){
            btnUno.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnUno.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnUno.setEnabled(false);
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        if (jugador1==true){
            btnDos.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnDos.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnDos.setEnabled(false);
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (jugador1==true){
            btnTres.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnTres.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnTres.setEnabled(false);
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        if (jugador1==true){
            btnCuatro.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnCuatro.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnCuatro.setEnabled(false);
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (jugador1==true){
            btnCinco.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnCinco.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnCinco.setEnabled(false);
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (jugador1==true){
            btnSeis.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnSeis.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnSeis.setEnabled(false);
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        if (jugador1==true){
            btnSiete.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnSiete.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnSiete.setEnabled(false);
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        if (jugador1==true){
            btnOcho.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnOcho.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnOcho.setEnabled(false);
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        if (jugador1==true){
            btnNueve.setBackground(Color.red);
            cambiarTurno();
        }else{
            btnNueve.setBackground(Color.blue);
            cambiarTurno();
        }
        Validar();
        btnNueve.setEnabled(false);
    }//GEN-LAST:event_btnNueveActionPerformed
  
    
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        Reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtJugadorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugadorNombreActionPerformed
      
      
    }//GEN-LAST:event_txtJugadorNombreActionPerformed

    private void txtPuntajeJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeJugador1ActionPerformed
        
    }//GEN-LAST:event_txtPuntajeJugador1ActionPerformed

    private void txtPuntajeJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeJugador2ActionPerformed
     
    }//GEN-LAST:event_txtPuntajeJugador2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtJugadorNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuntajeJugador1;
    private javax.swing.JTextField txtPuntajeJugador2;
    // End of variables declaration//GEN-END:variables
}