/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SimpleSwingGUI.java
 *
 * Created on 23-Mar-2011, 19:26:32
 */

package mindbadger.swing;

/**
 *
 * @author Mark
 */
public class SimpleSwingGUI extends javax.swing.JFrame {

    /** Creates new form SimpleSwingGUI */
    public SimpleSwingGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        outputField = new javax.swing.JTextField();
        helloButton = new javax.swing.JButton();
        byeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Output Field:");

        outputField.setName("outputField"); // NOI18N

        helloButton.setText("Hello Button");
        helloButton.setName("helloButton"); // NOI18N
        helloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helloButtonActionPerformed(evt);
            }
        });

        byeButton.setText("Bye Button");
        byeButton.setName("byeButton"); // NOI18N
        byeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputField, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(byeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helloButton)
                    .addComponent(byeButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helloButtonActionPerformed
      outputField.setText("HELLO");
    }//GEN-LAST:event_helloButtonActionPerformed

    private void byeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byeButtonActionPerformed
      outputField.setText("BYE");
    }//GEN-LAST:event_byeButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleSwingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton byeButton;
    private javax.swing.JButton helloButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField outputField;
    // End of variables declaration//GEN-END:variables

}