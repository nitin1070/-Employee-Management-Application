/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.gui;

import empmgmt.dao.EmployeeDAO;
import empmgmt.pojo.Employee;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author dell
 */
public class AddEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmpFrame
     */
    public AddEmpFrame() {
        initComponents();
        jp1.setBounds(50,50,500,500);
        this.setLocationRelativeTo(null);
         validateInput();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        jlbl1 = new javax.swing.JLabel();
        jlblNo = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jlblSal = new javax.swing.JLabel();
        jtxtNo = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jtxtSal = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBackground(new java.awt.Color(0, 0, 0));

        jlbl1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl1.setForeground(new java.awt.Color(255, 0, 0));
        jlbl1.setText("   Add New Employee");
        jlbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));

        jlblNo.setBackground(new java.awt.Color(0, 0, 0));
        jlblNo.setForeground(new java.awt.Color(255, 255, 255));
        jlblNo.setText("Emp No");
        jlblNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblName.setBackground(new java.awt.Color(0, 0, 0));
        jlblName.setForeground(new java.awt.Color(255, 255, 255));
        jlblName.setText("Emp Name");
        jlblName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblSal.setBackground(new java.awt.Color(0, 0, 0));
        jlblSal.setForeground(new java.awt.Color(255, 255, 255));
        jlblSal.setText("Salary");
        jlblSal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtxtNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtNo.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jtxtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtName.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jtxtSal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtSal.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jbtn1.setBackground(new java.awt.Color(0, 0, 0));
        jbtn1.setForeground(new java.awt.Color(0, 204, 51));
        jbtn1.setText("Back");
        jbtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtnAdd.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setForeground(new java.awt.Color(0, 204, 51));
        jbtnAdd.setText("Add Employee");
        jbtnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblName)
                    .addComponent(jlblSal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtSal)
                    .addComponent(jtxtName)
                    .addComponent(jtxtNo))
                .addGap(68, 68, 68))
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jp1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlblName, jlblNo, jlblSal, jtxtName, jtxtNo, jtxtSal});

        jp1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtn1, jbtnAdd});

        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNo)
                    .addComponent(jtxtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSal)
                    .addComponent(jtxtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jp1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlblName, jlblNo, jlblSal, jtxtName, jtxtNo, jtxtSal});

        jp1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtn1, jbtnAdd});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
     new OptionFrame().setVisible(true);
     this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
            
        if(validateInput()==false)
            
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields","Empty values!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
      try
      {
        int empno=Integer.parseInt(jtxtNo.getText());
        String empname=jtxtName.getText();
        double empsal=Double.parseDouble(jtxtSal.getText());
      
        Employee e=new Employee();
        e.setEmpNo(empno);
        e.setEmpName(empname);
        e.setEmpSal(empsal);
        
        boolean result =EmployeeDAO.addEmployee(e);
        if(result==true)
                JOptionPane.showMessageDialog(null,"Record Successfully Added To The Database!!","Success",JOptionPane.INFORMATION_MESSAGE);
             else
                  JOptionPane.showMessageDialog(null,"Could Not Add Employee To The Database!","Error!",JOptionPane.ERROR_MESSAGE);
      }
            catch(NumberFormatException ex)
                    {
                       JOptionPane.showMessageDialog(null,"Please Provide Numeric value For emp no and emp sal!!","Error",JOptionPane.ERROR_MESSAGE);
                    }
            catch(SQLException ex)
                    {
                    JOptionPane.showMessageDialog(null,"problem in the database","errror",JOptionPane.ERROR_MESSAGE);
                    System.out.println("SQL Exception is"+ex);
                    }
                    
    }//GEN-LAST:event_jbtnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblNo;
    private javax.swing.JLabel jlblSal;
    private javax.swing.JPanel jp1;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtNo;
    private javax.swing.JTextField jtxtSal;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
        if(jtxtNo.getText().isEmpty()||jtxtSal.getText().isEmpty()||jtxtName.getText().isEmpty())
        return false;
        return true;
      
    }
}
