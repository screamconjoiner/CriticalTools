/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagefinder;

/**
 *
 * @author Development
 */
public class GUI extends javax.swing.JFrame {
    
    private String currentAction = "";
    private int measureNumber = -1;
    private boolean firstType = false;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null); // Centers form
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrangeCombo = new javax.swing.JComboBox();
        measureField = new javax.swing.JTextField();
        openButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PageFinder");

        arrangeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Whiteman Arrangement" }));
        arrangeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrangeComboActionPerformed(evt);
            }
        });

        measureField.setText("Enter measure number here...");
        measureField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                measureFieldMouseClicked(evt);
            }
        });
        measureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                measureFieldActionPerformed(evt);
            }
        });
        measureField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                measureFieldKeyTyped(evt);
            }
        });

        openButton.setText("Open Images");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(measureField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(arrangeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(measureField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrangeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void measureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_measureFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_measureFieldActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        measureNumber = -1;
        String measureString = measureField.getText();
        try {
            measureNumber = Integer.parseInt(measureString);
        } catch (NumberFormatException e) {
            new ErrorForm("Please enter a valid measure number.").setVisible(true);
        }
        System.out.println(measureNumber);
        clearMeasureField();
        
    }//GEN-LAST:event_openButtonActionPerformed

    private void arrangeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrangeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrangeComboActionPerformed

    private void measureFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_measureFieldMouseClicked
        clearMeasureField();

    }//GEN-LAST:event_measureFieldMouseClicked

    private void measureFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_measureFieldKeyTyped
        // TODO add your handling code here:
        if (!firstType) {
            clearMeasureField();
            firstType = true;
        }
    }//GEN-LAST:event_measureFieldKeyTyped

    private void clearMeasureField() {
        measureField.setText("");        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox arrangeCombo;
    private javax.swing.JTextField measureField;
    private javax.swing.JButton openButton;
    // End of variables declaration//GEN-END:variables
}
