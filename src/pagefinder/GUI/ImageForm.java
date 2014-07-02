/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagefinder.GUI;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Development
 */
public class ImageForm extends javax.swing.JFrame {

    private String imgloc;
    /**
     * Creates new form ImageForm
     */
    public ImageForm(String imgloc) {
        this.imgloc = imgloc;
        initComponents();
        try {
            scaleImage();
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void scaleImage() throws IOException {
        jLabel1.setIcon(getImageIcon(ImageIO.read(getClass().getResource(imgloc))));
    }    
    
    private ImageIcon getImageIcon(BufferedImage in) {
        float[] imgVars = getScaledDimensions(in);
        AffineTransform at = new AffineTransform();
        at.scale(imgVars[0], imgVars[0]);
        AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        BufferedImage out = new BufferedImage(Math.round(imgVars[1]), 
                Math.round(imgVars[2]), BufferedImage.TYPE_INT_ARGB);        
        return new ImageIcon(scaleOp.filter(in, out));
    }
    
    private boolean getDimensionThreshold(int width, int height) {
        if (width < 800 && height < 600) {
            return true;
        } else {
            return false;
        }
    }
    
    private float[] getScaledDimensions(BufferedImage in) {
        float scalingFactor = 1;
        int height = in.getHeight();
        int width = in.getWidth();
        while (!getDimensionThreshold(height, width)) {
            scalingFactor -= .1;
            height *= scalingFactor;
            width *= scalingFactor;
        }
        return new float[] {scalingFactor, width, height};
    }

    private ImageIcon getNewIcon(Icon icon, int scalingFactor) {
        BufferedImage bi = new BufferedImage(scalingFactor*icon.getIconWidth(), 
                scalingFactor*icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.scale(scalingFactor, scalingFactor);
        return new ImageIcon(bi);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(768, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
