package pagefinder.GUI;

import javax.swing.DefaultComboBoxModel;
import pagefinder.Objects.Arrangement;

/**
 *
 * @author Connor Rice
 */
public class MainForm extends javax.swing.JFrame {
    
    private int measureNumber = -1;
    private boolean firstType = false;
    private Arrangement[] arrangements;
    private int[] measureDB;

    public MainForm(Arrangement[] arrangements) {
        this.arrangements = arrangements;
        initComponents();
        setLocationRelativeTo(null); // Centers form
        parseArr();
        parseInd();
    }
    
    private void parseArr() {
        arrangeCombo.setModel(getComboBoxModel());
    }
    
    private void parseInd() {
        
    }
    
    private DefaultComboBoxModel getComboBoxModel() {
        String[] model = new String[arrangements.length];
        for (int i = 0; i < arrangements.length; i++) {
            model[i] = arrangements[i].getName();
        }
        return new DefaultComboBoxModel(model);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        indMenu = new javax.swing.JMenu();
        indmenu = new javax.swing.JMenuItem();
        arrMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PageFinder");

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

        jMenuBar1.add(indMenu);

        setJMenuBar(jMenuBar1);

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
                .addContainerGap(119, Short.MAX_VALUE)
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
        openImages();
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

    private void indmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indmenuActionPerformed
        // TODO add your handling code here:
        new INDForm().setVisible(true);
    }//GEN-LAST:event_indmenuActionPerformed

    private void arrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrMenuActionPerformed
        // TODO add your handling code here:
        new ARRForm().setVisible(true);
    }//GEN-LAST:event_arrMenuActionPerformed

    private void clearMeasureField() {
        measureField.setText("");        
    }
    
    private void resetMeasureFieldText() {
        measureField.setText("Enter measure number...");
    }
    
    private void openImages() {
        measureNumber = -1;
        String measureString = measureField.getText();
        try {
            measureNumber = Integer.parseInt(measureString);
            System.out.println(measureNumber);
            System.out.println(oldGetImg());
//            new ImageForm(oldGetImg()).setVisible(true);
            new ImageForm(oldGetImg()).setVisible(true);
        } catch (NumberFormatException e) {
            new ErrorForm("Please enter a valid measure number.").setVisible(true);
        }
        resetMeasureFieldText();
    }
    
    private String oldGetImg() {
        return System.getProperty("user.dir")+System.getProperty("file.separator")+arrangements[0].getDir()+System.getProperty("file.separator")+measureNumber+".jpg";
    }
    
    private String getImgLoc() {
        return "/pagefinder/"+arrangements[0].getDir()+"/"+parseMeasureNumber()+".jpg";
    }
    
    private String parseMeasureNumber() {
        String converted = "";
        
        return converted;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arrMenu;
    private javax.swing.JComboBox arrangeCombo;
    private javax.swing.JMenu indMenu;
    private javax.swing.JMenuItem indmenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField measureField;
    private javax.swing.JButton openButton;
    // End of variables declaration//GEN-END:variables
}
