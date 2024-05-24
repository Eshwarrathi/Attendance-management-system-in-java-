/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import static attendancems_with_prepared22.TeacherInternalFrame.teacherNameLabel;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal-Asi
 */
public class SettingInternalFrame extends javax.swing.JInternalFrame {

    ConnectClass c;
    Validation v;

    /**
     * Creates new form SettingInternalFrame
     */
    public SettingInternalFrame() {
        initComponents();
        c = new ConnectClass();
        v = new Validation();

        jTableTeacherDetails.setSelectionForeground(Color.WHITE);
        setTitle("Setting");
        teacherID();

        // teacherbid
        settingTeacherID();

        //
        teacherDetailData();

        //JOption Pane Font
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Candara", Font.PLAIN, 17)));

        jTableTeacherDetails.setSelectionForeground(Color.WHITE);

        pass();

    }

    /**
     * Password
     */
    public void pass() {
        try {
            ResultSet rs = c.st.executeQuery("select teacher_pass from tbl_teacher where user_name = '" + LoginFrame.jTextField1.getText() + "' ");
            while (rs.next()) {
                jLabelOldPassword.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Getting Teacher Name through user_name from login frame
     */
    public void settingTeacherID() {
        try {
            String b = LoginFrame.jTextField1.getText();
            ResultSet rs = c.xc.createStatement().executeQuery("select teacher_id from tbl_teacher where user_name = '" + b + "'");
            while (rs.next()) {
                jLabelTeacherID.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Teacher's detail
     */
    public void teacherDetailData() {
        try {
            DefaultTableModel dt = (DefaultTableModel) jTableTeacherDetails.getModel();
            ResultSet rs = c.st.executeQuery("select * from teacher_details where teacher_id = '" + jLabelTeacherID.getText() + "'");
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            jTableTeacherDetails.setModel(dt);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Fetching Teacher's id
     */
    public void teacherID() {
        try {
            String b = LoginFrame.jTextField1.getText();
            ResultSet rs = c.xc.createStatement().executeQuery("select teacher_id from tbl_teacher where user_name = '" + b + "'");
            while (rs.next()) {
                jLabelTeacherID.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Clearing textFields
     */
    public void clearing() {
        try {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jLabelOldPassword.setText("");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Clearing Table
     */
    public void ClearingTable() {
        try {
            DefaultTableModel dm = (DefaultTableModel) jTableTeacherDetails.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTeacherID = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeacherDetails = new javax.swing.JTable();
        jLabelOldPassword = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtoninsert = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 110, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 300, 110, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 350, 110, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Surname");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 110, 30);

        jTextField1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 200, 170, 30);

        jTextField2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 250, 170, 30);

        jTextField3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField3CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 300, 170, 30);

        jTextField4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField4CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 350, 170, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("New Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 280, 110, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Teacher ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 400, 110, 30);

        jTextField5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField5CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(510, 280, 170, 30);

        jButtonSave.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setOpaque(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave);
        jButtonSave.setBounds(140, 470, 130, 30);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 200, 50, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 250, 50, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 300, 50, 30);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 350, 50, 30);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(690, 280, 50, 30);

        jLabelTeacherID.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelTeacherID.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jLabelTeacherID);
        jLabelTeacherID.setBounds(130, 400, 170, 30);

        jButton2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton2.setText("Change Password");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 330, 160, 40);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Old Password");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 230, 90, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/VerticalPanelBG.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 790, 100);

        jScrollPane1.setForeground(new java.awt.Color(240, 240, 240));

        jTableTeacherDetails.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTableTeacherDetails.setForeground(Color.WHITE);
        jTableTeacherDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "Age", "Email", "Teacher Id", "Password"
            }
        ));
        jTableTeacherDetails.setOpaque(false);
        ((DefaultTableCellRenderer)jTableTeacherDetails.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jTableTeacherDetails.setShowGrid(false);
        jTableTeacherDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTeacherDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTeacherDetails);
        if (jTableTeacherDetails.getColumnModel().getColumnCount() > 0) {
            jTableTeacherDetails.getColumnModel().getColumn(3).setMinWidth(200);
            jTableTeacherDetails.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTableTeacherDetails.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(32, 120, 710, 50);

        jLabelOldPassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelOldPassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelOldPassword);
        jLabelOldPassword.setBounds(510, 230, 170, 30);

        jLabel13.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("If you are editing your information for the first time");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 440, 290, 20);

        jButtoninsert.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jButtoninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/settingclickbutton.png"))); // NOI18N
        jButtoninsert.setBorder(null);
        jButtoninsert.setBorderPainted(false);
        jButtoninsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtoninsert.setOpaque(false);
        jButtoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoninsert);
        jButtoninsert.setBounds(295, 438, 80, 20);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        getContentPane().add(BGLabel);
        BGLabel.setBounds(0, 0, 790, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        try {
            if (jTextField1.getText().equals("") && jTextField2.getText().equals("") && jTextField3.getText().equals("") && jTextField4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Sorry, but an error has been made", "Required Data", JOptionPane.ERROR_MESSAGE);
            } else {
                c.st.executeUpdate("update teacher_details set name = '" + jTextField1.getText().trim() + "' , surname = '" + jTextField2.getText().trim() + "' , age = " + jTextField3.getText().trim() + ", email= '" + jTextField4.getText().trim() + "', teacher_pass = '" + jLabelOldPassword.getText() + "' where teacher_id = " + jLabelTeacherID.getText());
                JOptionPane.showMessageDialog(this, "Details Saved", "Data Saved", JOptionPane.INFORMATION_MESSAGE);

                clearing();
                ClearingTable();
                teacherDetailData();
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {

            if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No Password entered");
            } else {
                c.st.executeUpdate("update tbl_teacher set teacher_pass = '" + jTextField5.getText().trim() + "' where teacher_id = " + jLabelTeacherID.getText());
                c.st.executeUpdate("update teacher_details set teacher_pass = '" + jTextField5.getText().trim() + "' where teacher_id = " + jLabelTeacherID.getText());

                String pass;
                ResultSet rs = c.st.executeQuery("select teacher_pass from tbl_teacher where teacher_id = '" + jLabelTeacherID.getText() + "'");
                if (rs.next()) {
                    pass = rs.getString(1);
                    JOptionPane.showMessageDialog(null, "Password Changed \n Your new Password is: " + pass);

                    clearing();
                    ClearingTable();
                    teacherDetailData();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        jLabel1.setText(v.validateData("[A-Za-z]{3,30}", jTextField1.getText()));
        if (jLabel1.getText().equals("Valid")) {
            jLabel1.setForeground(Color.green);
        } else {
            jLabel1.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        // TODO add your handling code here:
        jLabel8.setText(v.validateData("[A-Za-z]{3,30}", jTextField2.getText()));
        if (jLabel8.getText().equals("Valid")) {
            jLabel8.setForeground(Color.green);
        } else {
            jLabel8.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jTextField3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField3CaretUpdate
        // TODO add your handling code here:
        jLabel9.setText(v.validateData("[0-9]{2,3}", jTextField3.getText()));
        if (jLabel9.getText().equals("Valid")) {
            jLabel9.setForeground(Color.green);
        } else {
            jLabel9.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField3CaretUpdate

    private void jTextField4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField4CaretUpdate
        // TODO add your handling code here:
        jLabel10.setText(v.validateData("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$", jTextField4.getText()));
        if (jLabel10.getText().equals("Valid")) {
            jLabel10.setForeground(Color.green);
        } else {
            jLabel10.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField4CaretUpdate

    private void jTextField5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField5CaretUpdate
        // TODO add your handling code here:
        jLabel11.setText(v.validateData("[A-Za-z0-9]{3,30}", jTextField5.getText()));
        if (jLabel11.getText().equals("Valid")) {
            jLabel11.setForeground(Color.green);
        } else {
            jLabel11.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField5CaretUpdate

    private void jTableTeacherDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeacherDetailsMouseClicked
        // TODO add your handling code here:

        jTableTeacherDetails.setForeground(Color.WHITE);
        int i = jTableTeacherDetails.getSelectedRow();
        jTextField1.setText(jTableTeacherDetails.getModel().getValueAt(i, 0).toString().trim());
        jTextField2.setText(jTableTeacherDetails.getModel().getValueAt(i, 1).toString().trim());
        jTextField3.setText(jTableTeacherDetails.getModel().getValueAt(i, 2).toString().trim());
        jTextField4.setText(jTableTeacherDetails.getModel().getValueAt(i, 3).toString().trim());
        jLabelOldPassword.setText(jTableTeacherDetails.getModel().getValueAt(i, 5).toString().trim());


    }//GEN-LAST:event_jTableTeacherDetailsMouseClicked

    private void jButtoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertActionPerformed
        // TODO add your handling code here:

        try {
            if (jTextField1.getText().equals("") && jTextField2.getText().equals("") && jTextField3.getText().equals("") && jTextField4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Sorry, but an error has been made", "Required Data", JOptionPane.ERROR_MESSAGE);
            } else {
                c.st.executeUpdate("insert into teacher_details values ('" + jTextField1.getText().trim() + "' , '" + jTextField2.getText().trim() + "' , " + jTextField3.getText().trim() + ",'" + jTextField4.getText().trim() + "'," + jLabelTeacherID.getText().trim() + ",'" + jLabelOldPassword.getText()+"')");
                JOptionPane.showMessageDialog(this, "Details Inserted. \n If you want to make any changes again, then change the required information and then click Save button.", "Data Saved", JOptionPane.INFORMATION_MESSAGE);

                clearing();
                ClearingTable();
                teacherDetailData();
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtoninsertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtoninsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelOldPassword;
    private javax.swing.JLabel jLabelTeacherID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeacherDetails;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
