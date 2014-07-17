package CriticalTools.MeasureFinder;

import CriticalTools.Objects.SearchResult;

/**
 * Form for the utility window that is created next to the desired image.
 * TODO: Zoom in/out
 * TODO: More information about image
 * TODO: Display page number
 * @author Connor Rice
 */
public class ImageUtilsForm extends javax.swing.JFrame {

    private SearchResult searchResult;
    private PageOps pOps;
    
    /**
     * Creates new form ImageUtilsForm
     */
    public ImageUtilsForm(PageOps pOps, SearchResult searchResult) {
        this.pOps = pOps;
        this.searchResult = searchResult;
        initComponents();
        renameLabels();
    }
    
    private void renameLabels() {
        startingLabel.setText("Starting Measure: " + Integer.toString(searchResult.getMeasureRange()[0]));
        endingLabel.setText("Ending Measure: " + Integer.toString(searchResult.getMeasureRange()[1]));
        //searchedMeasureLabel.setText("Searched Measure: ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        startingLabel = new javax.swing.JLabel();
        endingLabel = new javax.swing.JLabel();
        toolComboBox = new javax.swing.JComboBox();
        useToolButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Utilities");

        nextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        startingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startingLabel.setText("Starting Measure:");

        endingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        endingLabel.setText("Ending Measure:");

        toolComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zoom In", "Zoom Out" }));

        useToolButton.setText("Use Tool");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(nextButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endingLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(useToolButton))
                            .addComponent(startingLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(startingLabel)
                .addGap(18, 18, 18)
                .addComponent(endingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useToolButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        searchResult =  pOps.nextImage();
        renameLabels();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchResult = pOps.previousImage();
        renameLabels();
    }//GEN-LAST:event_jButton1ActionPerformed


    @Override
    public void dispose() {
        super.dispose();
        pOps.destroyImageForm();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel startingLabel;
    private javax.swing.JComboBox toolComboBox;
    private javax.swing.JButton useToolButton;
    // End of variables declaration//GEN-END:variables
}