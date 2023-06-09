/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Splash_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Splash_Screen
     */
    public Splash_Screen() {
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

        jLabel1 = new javax.swing.JLabel();
        LoadBar = new javax.swing.JProgressBar();
        Loading = new javax.swing.JLabel();
        LoadValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Ahsanullah University of Science and Technology");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        LoadBar.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(LoadBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 370, -1));

        Loading.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        Loading.setForeground(new java.awt.Color(255, 255, 255));
        Loading.setText("Loading...");
        getContentPane().add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        LoadValue.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        LoadValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadValue.setText("0%");
        getContentPane().add(LoadValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\MIFTAHUL SHEIKH\\MIFTAHUL SHEIKH\\UniversityManagementSystem\\src\\universitymanagementsystem\\Pic\\Splash_Screen.jpeg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        Splash_Screen sc = new Splash_Screen();
       sc.setVisible(true);

       try{
           for(int i =0 ; i<=100; i++)
           {
               Thread.sleep(50);
               sc.LoadValue.setText(i+"%");
               if(i==10)
               {
                   sc.Loading.setText("Turning On Modules...");
               }
               if(i==20)
               {
                   sc.Loading.setText("Loading Modules...");
               }
               if(i==50)
               {
                   sc.Loading.setText("Connecting To Database...");
               }
               if(i==70)
               {
                   sc.Loading.setText("Connection Successful...");
               }
               if(i==80)
               {
                   sc.Loading.setText("Launching Application...");
               }
               sc.LoadBar.setValue(i);

           }

            Login login = new Login();
            login.show();
            sc.dispose();


       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadBar;
    private javax.swing.JLabel LoadValue;
    private javax.swing.JLabel Loading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
