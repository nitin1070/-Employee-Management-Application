/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.gui;

/**
 *
 * @author dell
 */
public class OptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionFrame
     */
    public OptionFrame() {
        initComponents();
        jp1.setBounds(50,50,500,500);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jp1 = new javax.swing.JPanel();
        jlbl1 = new javax.swing.JLabel();
        jrAdd = new javax.swing.JRadioButton();
        jrSearch = new javax.swing.JRadioButton();
        jrShow = new javax.swing.JRadioButton();
        jrExit = new javax.swing.JRadioButton();
        jrUpdate = new javax.swing.JRadioButton();
        jrDelete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBackground(new java.awt.Color(0, 0, 0));

        jlbl1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl1.setForeground(new java.awt.Color(0, 204, 51));
        jlbl1.setText("        Select Your Choice");
        jlbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 0)));

        jrAdd.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrAdd);
        jrAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrAdd.setForeground(new java.awt.Color(204, 0, 0));
        jrAdd.setText("Add Employee");
        jrAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddActionPerformed(evt);
            }
        });

        jrSearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrSearch);
        jrSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrSearch.setForeground(new java.awt.Color(204, 0, 0));
        jrSearch.setText("Search Employee");
        jrSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSearchActionPerformed(evt);
            }
        });

        jrShow.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrShow);
        jrShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrShow.setForeground(new java.awt.Color(204, 0, 0));
        jrShow.setText("Show All Employee");
        jrShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrShowActionPerformed(evt);
            }
        });

        jrExit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrExit);
        jrExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrExit.setForeground(new java.awt.Color(204, 0, 0));
        jrExit.setText("QUIT");
        jrExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrExitActionPerformed(evt);
            }
        });

        jrUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jrUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrUpdate.setForeground(new java.awt.Color(204, 0, 0));
        jrUpdate.setText("Update Employee");
        jrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrUpdateActionPerformed(evt);
            }
        });

        jrDelete.setBackground(new java.awt.Color(0, 0, 0));
        jrDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrDelete.setForeground(new java.awt.Color(204, 0, 0));
        jrDelete.setText("Delete Employee");
        jrDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrSearch)
                            .addComponent(jrAdd)
                            .addComponent(jrShow)
                            .addComponent(jrUpdate)
                            .addComponent(jrDelete)
                            .addComponent(jrExit)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jrAdd)
                .addGap(18, 18, 18)
                .addComponent(jrSearch)
                .addGap(18, 18, 18)
                .addComponent(jrShow)
                .addGap(18, 18, 18)
                .addComponent(jrUpdate)
                .addGap(18, 18, 18)
                .addComponent(jrDelete)
                .addGap(18, 18, 18)
                .addComponent(jrExit)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddActionPerformed
    AddEmpFrame addEmp=new AddEmpFrame();
    addEmp.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_jrAddActionPerformed

    private void jrSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSearchActionPerformed
      SearchEmpFrame sef=new SearchEmpFrame();
      sef.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jrSearchActionPerformed

    private void jrExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrExitActionPerformed
     System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jrExitActionPerformed

    private void jrShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrShowActionPerformed
     ShowEmpFrame showemp=new ShowEmpFrame();
     showemp.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jrShowActionPerformed

    private void jrDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDeleteActionPerformed
    DeleteEmpFrame dltEmp=new DeleteEmpFrame();
    dltEmp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jrDeleteActionPerformed

    private void jrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrUpdateActionPerformed
    UpdateEmpFrame update=new UpdateEmpFrame();
    update.setVisible(true);
     this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jrUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JPanel jp1;
    private javax.swing.JRadioButton jrAdd;
    private javax.swing.JRadioButton jrDelete;
    private javax.swing.JRadioButton jrExit;
    private javax.swing.JRadioButton jrSearch;
    private javax.swing.JRadioButton jrShow;
    private javax.swing.JRadioButton jrUpdate;
    // End of variables declaration//GEN-END:variables
}
