/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author studente
 */
public class DONNA extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer DONNA
     */
    public DONNA() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        vestitiscarpeaccessori = new javax.swing.JTabbedPane();
        megliettepantaloni = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        body = new javax.swing.JToggleButton();
        camicia = new javax.swing.JToggleButton();
        MAGLIETTA_CK = new javax.swing.JToggleButton();
        MAGLIONCINO = new javax.swing.JToggleButton();
        TOP = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        GONNA = new javax.swing.JToggleButton();
        JEANS_BLU = new javax.swing.JToggleButton();
        JEANS_GRIGI = new javax.swing.JToggleButton();
        PANTALONCINI = new javax.swing.JToggleButton();
        PANTA_ELEGANTI = new javax.swing.JToggleButton();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        nikenere = new javax.swing.JToggleButton();
        adidas = new javax.swing.JToggleButton();
        tacchi = new javax.swing.JToggleButton();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        cappelloparigino = new javax.swing.JToggleButton();
        fiore = new javax.swing.JToggleButton();
        occhialivista = new javax.swing.JToggleButton();
        occhialisole = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        vestitiscarpeaccessori.setBackground(new java.awt.Color(255, 204, 0));
        vestitiscarpeaccessori.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N

        megliettepantaloni.setBackground(new java.awt.Color(153, 0, 153));
        megliettepantaloni.setForeground(new java.awt.Color(255, 255, 255));
        megliettepantaloni.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N

        body.setIcon(new javax.swing.ImageIcon(getClass().getResource("/body.PNG"))); // NOI18N
        body.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyActionPerformed(evt);
            }
        });

        camicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/camicia.PNG"))); // NOI18N
        camicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camiciaActionPerformed(evt);
            }
        });

        MAGLIETTA_CK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magliabianca.PNG"))); // NOI18N

        MAGLIONCINO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magliaverdina.PNG"))); // NOI18N

        TOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magliblunavy.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MAGLIETTA_CK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MAGLIONCINO, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camicia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camicia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MAGLIETTA_CK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MAGLIONCINO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOP, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        megliettepantaloni.addTab("magliette", jPanel2);

        GONNA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gonnagrigia.png"))); // NOI18N

        JEANS_BLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeansblunavy.PNG"))); // NOI18N

        JEANS_GRIGI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeansnero.png"))); // NOI18N

        PANTALONCINI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oantalonciniii.png"))); // NOI18N

        PANTA_ELEGANTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantaelegantiverdiiiiiiiiiiiiiiiiiiiiiii.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PANTA_ELEGANTI, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(JEANS_BLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JEANS_GRIGI, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PANTALONCINI, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addComponent(GONNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JEANS_BLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JEANS_GRIGI, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PANTALONCINI, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GONNA, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PANTA_ELEGANTI, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        megliettepantaloni.addTab("pantaloni", jPanel3);

        vestitiscarpeaccessori.addTab("VESTITI", megliettepantaloni);

        nikenere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SACARPE2.png"))); // NOI18N

        adidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scarpa1.png"))); // NOI18N

        tacchi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scarpe3 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(nikenere, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adidas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tacchi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nikenere, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(adidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tacchi, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane6.addTab("                                                                                                                                         ", jPanel4);

        vestitiscarpeaccessori.addTab("SCARPE", jTabbedPane6);

        cappelloparigino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cappllino.png"))); // NOI18N

        fiore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fioreee.png"))); // NOI18N

        occhialivista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/occhiale1.png"))); // NOI18N

        occhialisole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/occhiele2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cappelloparigino, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(occhialivista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(occhialisole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiore, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cappelloparigino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiore, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(occhialivista, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(occhialisole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane8.addTab("                                                                                                                                         ", jPanel5);

        vestitiscarpeaccessori.addTab("ACCESSORI", jTabbedPane8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vestitiscarpeaccessori, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(vestitiscarpeaccessori)
                .addContainerGap())
        );

        vestitiscarpeaccessori.getAccessibleContext().setAccessibleName("VESTITI");
    }// </editor-fold>//GEN-END:initComponents

    private void bodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bodyActionPerformed

    private void camiciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camiciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camiciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GONNA;
    private javax.swing.JToggleButton JEANS_BLU;
    private javax.swing.JToggleButton JEANS_GRIGI;
    private javax.swing.JToggleButton MAGLIETTA_CK;
    private javax.swing.JToggleButton MAGLIONCINO;
    private javax.swing.JToggleButton PANTALONCINI;
    private javax.swing.JToggleButton PANTA_ELEGANTI;
    private javax.swing.JToggleButton TOP;
    private javax.swing.JToggleButton adidas;
    private javax.swing.JToggleButton body;
    private javax.swing.JToggleButton camicia;
    private javax.swing.JToggleButton cappelloparigino;
    private javax.swing.JToggleButton fiore;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane megliettepantaloni;
    private javax.swing.JToggleButton nikenere;
    private javax.swing.JToggleButton occhialisole;
    private javax.swing.JToggleButton occhialivista;
    private javax.swing.JToggleButton tacchi;
    private javax.swing.JTabbedPane vestitiscarpeaccessori;
    // End of variables declaration//GEN-END:variables
}
