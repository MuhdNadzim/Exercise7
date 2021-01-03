
package exercise7;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Register extends javax.swing.JFrame {
    
    private Component frame;

    public Register() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Colour = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Basic = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Car = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setText("Id Registrartion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setText("Phone Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel5.setText("Basic Salary:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel6.setText("Car: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Colour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your colour", "White", "Silver", "Red", "Black" }));
        Colour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourActionPerformed(evt);
            }
        });
        getContentPane().add(Colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel7.setText("Colour:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, -1));

        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, -1));

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, -1));

        Basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicActionPerformed(evt);
            }
        });
        getContentPane().add(Basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 99, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMER REGISTER SYSTEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 387, 19));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Phone Number", "Basic Salary", "Car", "Colour"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 81, 600, 372));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 99, 40));

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 99, 40));

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 100, 40));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 40));

        Car.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose you car", "Persona", "Saga", "X70" }));
        getContentPane().add(Car, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColourActionPerformed

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberActionPerformed

    private void BasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BasicActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Name.setText("");
        Age.setText("");
        PhoneNumber.setText("");
        Basic.setText("");
        Car.setSelectedItem("Choose your car");
        Colour.setSelectedItem("Choose your colour");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            frame = new JFrame();
            if(JOptionPane.showConfirmDialog(frame, "Confirm if you to exit", "Customer Resgistration System",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{
        Name.getText(),
        Age.getText(),
        PhoneNumber.getText(),
        Basic.getText(),
        Car.getSelectedItem(),
        Colour.getSelectedItem(),
    });
        
     if(table.getSelectedRow()==-1){
            if(table.getRowCount()== 0){
               JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
             JOptionPane.OK_OPTION);
            }
      }
    }//GEN-LAST:event_AddActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
           try
           {
               table.print();
           }
           catch(java.awt.print.PrinterException e){
               System.err.format("No Printer found", e.getMessage());
           }
    }//GEN-LAST:event_PrintActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(table.getSelectedRow()== -1){
            if(table.getRowCount()== 0){
                
                JOptionPane.showMessageDialog(null, "No data to delete",
                        "Membership Management System",JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "Select a row to delete",
                        "MemberShip Management System", JOptionPane.OK_OPTION);
            }
        }else{
            model.removeRow(table.getSelectedRow());
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Basic;
    private javax.swing.JComboBox<String> Car;
    private javax.swing.JComboBox<String> Colour;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton Print;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private static class JFrame extends Component {

        public JFrame() {
        }
    }

    private static class table {
        
        private static int getSelectedRow() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static int getRowCount() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public table() {
        }
    }
}
