/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.modular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SnK
 */
public class Notepad extends javax.swing.JFrame {
    private String file;
    private JFileChooser chooser = new JFileChooser();
    private File f;
    private FileWriter fileWriter;
    /**
     * Creates new form Notepad
     */
    public Notepad() {
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

        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jNewTabButton = new javax.swing.JMenuItem();
        jOpenButton = new javax.swing.JMenuItem();
        jCloseButton = new javax.swing.JMenuItem();
        jSaveButton = new javax.swing.JMenuItem();
        jSaveAsButton = new javax.swing.JMenuItem();
        jExitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SnK\\Documents\\TP\\Notepad\\Notepad Modular\\actions_tab_new_background.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jToolBar1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SnK\\Documents\\TP\\Notepad\\Notepad Modular\\open-file.png")); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SnK\\Documents\\TP\\Notepad\\Notepad Modular\\Save-icon.png")); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\SnK\\Documents\\TP\\Notepad\\Notepad Modular\\Save-as-icon.png")); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\SnK\\Documents\\TP\\Notepad\\Notepad Modular\\Actions-tab-close-other-icon.png")); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jNewTabButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jNewTabButton.setText("New Tab");
        jNewTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewTabButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jNewTabButton);

        jOpenButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jOpenButton.setText("Open");
        jOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jOpenButton);

        jCloseButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jCloseButton.setText("Close");
        jMenu1.add(jCloseButton);

        jSaveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jSaveButton.setText("Save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jSaveButton);

        jSaveAsButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jSaveAsButton.setText("Save As");
        jSaveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveAsButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jSaveAsButton);

        jExitButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jExitButton.setText("Exit");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jExitButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void New()
    {
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        file = f.getName();
        jTabbedPane1.addTab(file,new Panel());
        
        try
        {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String s = null;          
            while((s=br.readLine())!=null)
            {
               ((Panel) jTabbedPane1.getComponentAt(jTabbedPane1.getComponentCount()-1)).append(s+"\n");
            }
            br.close();
            //jTextArea1.requestFocus();
        }
        catch(Exception e){}
    }
    private void jNewTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewTabButtonActionPerformed
        jTabbedPane1.addTab("New Tab", new Panel());  // TODO add your handling code here:
    }//GEN-LAST:event_jNewTabButtonActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenButtonActionPerformed
      try{
          New();
      }
      catch(NullPointerException e1){};
    }//GEN-LAST:event_jOpenButtonActionPerformed

    private void jSaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveAsButtonActionPerformed
         chooser.showSaveDialog(this); 
         f = chooser.getSelectedFile();
         try
         {
             if(f.isFile())
             {
                 int s = JOptionPane.showConfirmDialog(this,"Fisier existent. Suprascrieti?"
                          ,"",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                 if(s != JOptionPane.YES_OPTION)
                 {
                     return;
                 }
                 
                 else
                 {
                     fileWriter = new FileWriter(f);
                     ((Panel)jTabbedPane1.getSelectedComponent()).write(fileWriter);
                     
                 }
             }
             else
             {
                 fileWriter = new FileWriter(f);
                 ((Panel)jTabbedPane1.getSelectedComponent()).write(fileWriter);
             }
         }
         catch(FileNotFoundException exc){}
         catch(IOException exc) {}
         catch(NullPointerException e1) {}

    }//GEN-LAST:event_jSaveAsButtonActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        try
         {
             if(f.isFile())
             {
                     fileWriter = new FileWriter(f);
                     ((Panel)jTabbedPane1.getSelectedComponent()).write(fileWriter);
             }
         }
         catch(IOException exc) {}
    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
          New();
      }
      catch(NullPointerException e1){};        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.addTab("New Tab", new Panel());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenuItem jCloseButton;
    private javax.swing.JMenuItem jExitButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jNewTabButton;
    private javax.swing.JMenuItem jOpenButton;
    private javax.swing.JMenuItem jSaveAsButton;
    private javax.swing.JMenuItem jSaveButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
