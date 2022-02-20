package colorChoice;

import java.awt.Color;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author tadaki
 */
public class ColorFrame extends javax.swing.JFrame {

    /**
     * Creates new form ColorFrame
     */
    public ColorFrame() {
        initComponents();
        showColor.setBackground(colorPanel.getColor());
        colorPanel.addChangeListener((ChangeEvent e) -> {
            Color c = colorPanel.getColor();
            colorPanel.setBackground(c);
            showColor.setBackground(c);
//            System.out.println(c.toString());
        });
    }

    /**
     * @Override public void stateChanged(ChangeEvent e) {
     * colorPanel.setBackground(colors.getRgb()); pack(); }
     *
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorPanel = new colorChoice.ColorPanel();
        showColor = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Color Chooser");
        setMinimumSize(new java.awt.Dimension(300, 210));
        getContentPane().add(colorPanel, java.awt.BorderLayout.CENTER);

        showColor.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout showColorLayout = new javax.swing.GroupLayout(showColor);
        showColor.setLayout(showColorLayout);
        showColorLayout.setHorizontalGroup(
            showColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        showColorLayout.setVerticalGroup(
            showColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(showColor, java.awt.BorderLayout.SOUTH);

        menu.setText("File");
        menu.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N

        quit.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        quit.setText("QUIT");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        menu.add(quit);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        dispose();
    }//GEN-LAST:event_quitActionPerformed

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
            java.util.logging.Logger.getLogger(ColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colorChoice.ColorPanel colorPanel;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem quit;
    private javax.swing.JPanel showColor;
    // End of variables declaration//GEN-END:variables
}
