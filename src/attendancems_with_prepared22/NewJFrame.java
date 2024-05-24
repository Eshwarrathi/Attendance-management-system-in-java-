/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public class NewJFrame extends javax.swing.JFrame {

    ConnectClass c;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();

        c = new ConnectClass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 220, 73, 23);

        jLabel1.setText("IPRO-201601B");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 20, 220, 50);

        jLabel2.setText("Basma");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 260, 40);

        jLabel3.setText("ADSE-II");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 140, 30);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        /**
         * Method for calculating attendance
         */
        try {

            ResultSet rs = c.st.executeQuery("select COUNT(std_status) from std_attend where std_status = 'Present' and std_batch_code = '" + jLabel1.getText() + "' and std_name ='" + jLabel2.getText() + "'");
            while (rs.next()) {
                int result = rs.getInt(1);
                int required;
                int semesterHours;
                float percent;
                int absents;
                        
                switch (jLabel3.getText()) {
                    case "ADSE-II":
                        required = 77;
                        semesterHours = 144;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jLabel2.getText() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent =  jLabel2.getText() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "ADSE-I":
                        required = 66;
                        semesterHours = 132;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-II":
                        required = 86;
                        semesterHours = 172;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-I":
                        required = 60;
                        semesterHours = 120;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "DISM":
                        required = 74;
                        semesterHours = 148;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";
                            
                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "CPISM":
                        required = 90;
                        semesterHours = 180;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = "Your attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                }

            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            
            UIManager UI=new UIManager();
            UI.put("OptionPane.background",new Color(11));
            UI.put("Panel.background",new ColorUIResource(255,0,0));
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}



        
        /**
         * Method for calculating attendance
         
        try {

            ResultSet rs = c.st.executeQuery("select COUNT(std_status) from std_attend where std_status = 'Present' and std_batch_code = '" + jLabel9Std_batch.getText() + "' and std_name ='" + jComboBox1Name.getSelectedItem()+ "'");
            while (rs.next()) {
                int result = rs.getInt(1);
                int required;
                int semesterHours;
                float percent;
                int absents;
                        
                switch (jLabel9Std_batch.getText()) {
                    case "ADSE-II":
                        required = 77;
                        semesterHours = 144;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "ADSE-I":
                        required = 66;
                        semesterHours = 132;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-II":
                        required = 86;
                        semesterHours = 172;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-I":
                        required = 60;
                        semesterHours = 120;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "DISM":
                        required = 74;
                        semesterHours = 148;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";
                            
                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "CPISM":
                        required = 90;
                        semesterHours = 180;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                }

            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        * 
        * 
        * 
        * 
        * 
        * 
        * 
        * 
        * try {
            
            ResultSet rs = c.xc.createStatement().executeQuery("select COUNT(std_status) from std_attend where std_status = 'Present' and std_batch_code = '"+jLabel9Std_batch.getText()+"' and std_name = '"+jComboBox1Name.getSelectedItem()+"'");
            while(rs.next())
            {
                int requried = 20;
                int result = rs.getInt(1);
                int semesterHours = 30;
                
                float percent = (result*100/semesterHours);
                int absents = semesterHours - result;
                
                if(result <= requried) {
                    String excellent = "Your attendance is "+percent+ "%. \n Present: "+result+ ". \n Need " +absents+ " in order to get eligible for exams.";
                    
                    JOptionPane.showMessageDialog(null, excellent);
                    
                    System.out.println(excellent);
                }
                if(result >= requried) {
                    String excellent = "Your attendance is "+percent+ "%. \n Present: "+result+ ". \n You have a better record of punctuality and good attendance.";
                    
                    JOptionPane.showMessageDialog(null, excellent);
                    
                    System.out.println(excellent);
                }
            }
        }
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        * 
        * 
        * 
        * 
        * 
        * 
        * 
        * 
        * 

*/