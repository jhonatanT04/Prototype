/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.lucerojm.tacurijf.prototype.Visual;

import ec.edu.ups.lucerojm.tacurijf.prototype.Modelo.Guerrero;
import ec.edu.ups.lucerojm.tacurijf.prototype.Modelo.Mago;
import ec.edu.ups.lucerojm.tacurijf.prototype.Modelo.Personaje;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Personajes extends javax.swing.JInternalFrame {
    
    private List<Personaje> listaPersonajes = new ArrayList<>();
    List<Personaje> listaPersonajesClonados = new ArrayList<>();

    public List<Personaje> getListaPersonajesClonados() {
        return listaPersonajesClonados;
    }

    public void setListaPersonajesClonados(List<Personaje> listaPersonajesClonados) {
        this.listaPersonajesClonados = listaPersonajesClonados;
    }

    
    /**
     * Creates new form Personajes
     */
    public Personajes() {
        //Guerrero prototipoGuerrero = new Guerrero(314, "JUAN", "volar", "xd");
        //Mago prototipoMago = new Mago("fd", "CARLOS", "invisivilidad", "hd");
        //listaPersonajes.add(prototipoGuerrero);
        //listaPersonajes.add(prototipoMago);
        //this.visibilidad(false); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ComboBoxPersonajes = new javax.swing.JComboBox<>();
        btnSeleccionar = new javax.swing.JButton();
        bntClonar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(130, 231, 231));

        ComboBoxPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personajes", "Guerrero", "Mago", " ", " " }));
        ComboBoxPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPersonajesActionPerformed(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        bntClonar.setText("Clonar");
        bntClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClonarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntClonar)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar)
                    .addComponent(bntClonar))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPersonajesActionPerformed
        // TODO add your handling code here:
        this.visibilidad(true);
    }//GEN-LAST:event_ComboBoxPersonajesActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        String opcionSeleccionada = ComboBoxPersonajes.getSelectedItem().toString();
        if (opcionSeleccionada.equals("Guerrero")) {
            Guerrero prototipoGuerrero = new Guerrero(314, "Guerrero", "volar", "xd");
            int fuerza = prototipoGuerrero.getFuerza();
            jLabel1.setText("Fuerza: " + String.valueOf(fuerza)); 
            String nombreG = prototipoGuerrero.getNombre();
            jLabel2.setText("Nombre: " + nombreG);
            String habilidadG = prototipoGuerrero.getHabilidad();
            jLabel3.setText("Habilidad: " + habilidadG);
            String equipoG = prototipoGuerrero.getEquipo();
            jLabel4.setText("Equipo: " + equipoG);
            ImageIcon guerrero = new ImageIcon(getClass().getResource("/imagenes/guerrero.jpg"));
            ImageIcon icon = new ImageIcon(guerrero.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
            jLabel5.setIcon(icon);
            listaPersonajes.add(prototipoGuerrero);
            
            //eso revisa si esta bien
            //creo q esta mal la ruta de la imagen 
            
        } else if (opcionSeleccionada.equals("Mago")) {
            Mago prototipoMago = new Mago("fd", "Mago", "invisivilidad", "hd");
            String encantoM = prototipoMago.getEncanto();
            jLabel1.setText("Encanto: " + encantoM); 
            String nombreM = prototipoMago.getNombre();
            jLabel2.setText("Nombre: " + nombreM);
            String habilidadM = prototipoMago.getHabilidad();
            jLabel3.setText("Habilidad: " + habilidadM);
            String equipoM = prototipoMago.getEquipo();
            jLabel4.setText("Equipo: " + equipoM);
            ImageIcon mago = new ImageIcon(getClass().getResource("/imagenes/mago1.png"));
            ImageIcon icon2 = new ImageIcon(mago.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
            jLabel5.setIcon(icon2);
            listaPersonajes.add(prototipoMago);///xddddd
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void bntClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClonarActionPerformed
        String nombreSeleccionado = ComboBoxPersonajes.getSelectedItem().toString();
        Personaje personajeSeleccionado = null;
        for (Personaje personaje : listaPersonajes) {
            if (personaje.getNombre().equals(nombreSeleccionado)) { //pendiente revisar
                personajeSeleccionado = personaje;
                break;
            }
        }

        if (personajeSeleccionado != null) {
            Personaje clon = (Personaje) personajeSeleccionado.clonar();
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese un nuevo nombre:");
            clon.setNombre(nuevoNombre);
            listaPersonajesClonados.add(clon);
            JOptionPane.showMessageDialog(this, "Se clonó");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo encontrar el personaje seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntClonarActionPerformed

    private void visibilidad(Boolean bo){
        jLabel1.setVisible(bo);
        jLabel2.setVisible(bo);
        jLabel3.setVisible(bo);
        jLabel4.setVisible(bo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxPersonajes;
    private javax.swing.JButton bntClonar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
