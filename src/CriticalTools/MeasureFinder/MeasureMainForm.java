package CriticalTools.MeasureFinder;

import CriticalTools.Util.PageOps;
import CriticalTools.CommonForms.OpenForm;
import CriticalTools.CommonForms.QuitForm;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Connor Rice
 */
public class MeasureMainForm extends javax.swing.JFrame {

    private PageOps pOps;
    private boolean firstType;

    public MeasureMainForm(PageOps pOps, Component c) {
        this.pOps = pOps;
        initComponents();
        setLocationRelativeTo(c); // Centers form to parent
        setComboBoxModel(pOps.parseArr());
    }

    private void setComboBoxModel(DefaultComboBoxModel dcbm) {
        arrangeCombo.setModel(dcbm);
    }

    private void clearMeasureField() {
        measureField.setText("");
    }

    private void resetMeasureFieldText() {
        measureField.setText("Enter measure number...");
        firstType = false;
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
        partComboBox = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        indMenu = new javax.swing.JMenu();
        indmenu = new javax.swing.JMenuItem();
        arrMenu = new javax.swing.JMenuItem();
        exportIND = new javax.swing.JMenuItem();
        exportARR = new javax.swing.JMenuItem();
        quitButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CriticalTools - Measure Locator");

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

        partComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full Score" }));

        indMenu.setText("File");

        indmenu.setText("Open .ind...");
        indmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indmenuActionPerformed(evt);
            }
        });
        indMenu.add(indmenu);

        arrMenu.setText("Open .arr...");
        arrMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrMenuActionPerformed(evt);
            }
        });
        indMenu.add(arrMenu);

        exportIND.setText("Export .ind file...");
        indMenu.add(exportIND);

        exportARR.setText("Export .arr file...");
        exportARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportARRActionPerformed(evt);
            }
        });
        indMenu.add(exportARR);

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        indMenu.add(quitButton);

        jMenuBar1.add(indMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(openButton)
                    .addComponent(measureField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(arrangeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(partComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(measureField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        pOps.initialImageOpen(measureField.getText());
        resetMeasureFieldText();
    }//GEN-LAST:event_openButtonActionPerformed

    private void arrangeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrangeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrangeComboActionPerformed

    private void measureFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_measureFieldMouseClicked
        clearMeasureField();
    }//GEN-LAST:event_measureFieldMouseClicked

    private void measureFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_measureFieldKeyTyped
        if (!firstType) {
            clearMeasureField();
            firstType = true;
        }
    }//GEN-LAST:event_measureFieldKeyTyped

    private void indmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indmenuActionPerformed
        new OpenForm(this).setVisible(true);
    }//GEN-LAST:event_indmenuActionPerformed

    private void arrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrMenuActionPerformed
        new OpenForm(this).setVisible(true);
    }//GEN-LAST:event_arrMenuActionPerformed

    private void exportARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportARRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportARRActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        new QuitForm(this).setVisible(true);
    }//GEN-LAST:event_quitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arrMenu;
    private javax.swing.JComboBox arrangeCombo;
    private javax.swing.JMenuItem exportARR;
    private javax.swing.JMenuItem exportIND;
    private javax.swing.JMenu indMenu;
    private javax.swing.JMenuItem indmenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField measureField;
    private javax.swing.JButton openButton;
    private javax.swing.JComboBox partComboBox;
    private javax.swing.JMenuItem quitButton;
    // End of variables declaration//GEN-END:variables
}
