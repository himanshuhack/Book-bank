/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_package;

//import com.sun.istack.internal.logging.Logger;////////this and next is imported for logging in threads but it didnt work so i use message window
//import java.util.logging.Level;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Splash.jpg")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        jLabel1.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpb = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jpb);
        jpb.setBounds(310, 260, 190, 14);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 460);

        setSize(new java.awt.Dimension(840, 459));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
//////////////////splash is created with the help of threads and try catch by making thread sleep for mili seconds to show increase in progressbar  
        
        Splash sp=new Splash();
        sp.setVisible(true);
        
        Thread th=new Thread(){
            public void run(){
                for(int a=1;a<=10;a++){
                    try{
                        Thread.sleep(100);//for every 10 progress there is 200 milisec time gap
                    }catch(InterruptedException e){
                    //    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE,null,e);
                        JOptionPane.showMessageDialog(null, e);
                    }
                    if(a==1){sp.jpb.setValue(10);}
                    if(a==2){sp.jpb.setValue(20);}
                    if(a==3){sp.jpb.setValue(30);}
                    if(a==4){sp.jpb.setValue(40);}
                    if(a==5){sp.jpb.setValue(50);}
                    if(a==6){sp.jpb.setValue(60);}
                    if(a==7){sp.jpb.setValue(70);}
                    if(a==8){sp.jpb.setValue(80);}
                    if(a==9){sp.jpb.setValue(90);}
                    if(a==10){sp.jpb.setValue(100);}
                }
                Login login=new Login();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sp.dispose();
            }
        };th.start();
        
        
        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
              //  new Splash().setVisible(true);
            //}
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar jpb;
    // End of variables declaration//GEN-END:variables

}
