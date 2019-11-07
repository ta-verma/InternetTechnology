/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;
import java.awt.Graphics;
import java.awt.*; 
import javax.swing.*;

/**
 *
 * @author Tarun Verma
 */
public class Polygon extends javax.swing.JFrame {

    /**
     * Creates new form Polygon
     */
    public Polygon() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        c = new java.awt.Canvas();
        jSlider = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSlider.setMajorTickSpacing(1);
        jSlider.setMaximum(10);
        jSlider.setMinimum(3);
        jSlider.setMinorTickSpacing(1);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        jSlider.setToolTipText("");
        jSlider.setValue(3);
        jSlider.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        jSlider1.setMajorTickSpacing(40);
        jSlider1.setMaximum(280);
        jSlider1.setMinimum(40);
        jSlider1.setMinorTickSpacing(40);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(40);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("Sides");

        jLabel2.setText("Radius");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(false);
        jRadioButton1.setText("Polygon");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Polydot");
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Polywheel");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Polymesh");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButton1)))
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3))
                        .addGap(53, 53, 53)))
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        Graphics g=c.getGraphics();
      c.update(g);
      int value =(int)jSlider.getValue();
      int x[]=new int[value];
      int y[]=new int[value];
      int r=(int)jSlider1.getValue();
      for(int i=0;i<value;i++)
      {
          x[i]= (int) (r*(Math.cos(2*Math.PI*i/value))+250);
          y[i]= (int) (r*(Math.sin(2*Math.PI*i/value))+250);
      }
      g.drawPolygon(x, y, value);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged

      jRadioButton1.setActionCommand("1");
      jRadioButton2.setActionCommand("2");
      jRadioButton3.setActionCommand("3");
      jRadioButton4.setActionCommand("4");


      Graphics g=c.getGraphics();
      c.update(g);
      int value =(int)jSlider.getValue();
      int x[]=new int[value];
      int y[]=new int[value];
      int r=(int)jSlider1.getValue();
      for(int i=0;i<value;i++)
      {
          x[i]= (int) (r*(Math.cos(2*Math.PI*i/value))+250);
          y[i]= (int) (r*(Math.sin(2*Math.PI*i/value))+250);
      }
     int temp=Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        switch (temp) {
            case 1:
                g.drawPolygon(x, y, value);
                break;
            case 2:
                for(int l=0;l<value;++l)
                {
                    g.drawOval(x[l], y[l], 3, 3);
                }         break;
            case 3:
                g.drawPolygon(x, y, value);
                for(int l=0;l<value;++l)
                    g.drawLine(250,250,x[l],y[l]);
                break;
            case 4:
                for(int l=0;l<value;++l)
                {
                    for(int m=l;m<value;++m)
                    {
                        g.drawLine(x[l], y[l],x[m],y[m]);
                    }
                }         break;
            default:
                break;
        }
    }//GEN-LAST:event_jSliderStateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

     
      jRadioButton1.setActionCommand("1");
      jRadioButton2.setActionCommand("2");
      jRadioButton3.setActionCommand("3");
      jRadioButton4.setActionCommand("4");


      Graphics g=c.getGraphics();
      c.update(g);
      int value =(int)jSlider.getValue();
      int x[]=new int[value];
      int y[]=new int[value];
      int r=(int)jSlider1.getValue();
      for(int i=0;i<value;i++)
      {
          x[i]= (int) (r*(Math.cos(2*Math.PI*i/value))+250);
          y[i]= (int) (r*(Math.sin(2*Math.PI*i/value))+250);
      }
     int temp=Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        switch (temp) {
            case 1:
                g.drawPolygon(x, y, value);
                break;
            case 2:
                for(int l=0;l<value;++l)
                {
                    g.drawOval(x[l], y[l], 3, 3);
                }         break;
            case 3:
                g.drawPolygon(x, y, value);
                for(int l=0;l<value;++l)
                    g.drawLine(250,250,x[l],y[l]);
                break;
            case 4:
                for(int l=0;l<value;++l)
                {
                    for(int m=l;m<value;++m)
                    {
                        g.drawLine(x[l], y[l],x[m],y[m]);
                    }
                }         break;
            default:
                break;
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        
      jRadioButton1.setActionCommand("1");
      jRadioButton2.setActionCommand("2");
      jRadioButton3.setActionCommand("3");
      jRadioButton4.setActionCommand("4");


      Graphics g=c.getGraphics();
      c.update(g);
      int value =(int)jSlider.getValue();
      int x[]=new int[value];
      int y[]=new int[value];
      int r=(int)jSlider1.getValue();
      for(int i=0;i<value;i++)
      {
          x[i]= (int) (r*(Math.cos(2*Math.PI*i/value))+250);
          y[i]= (int) (r*(Math.sin(2*Math.PI*i/value))+250);
      }
     int temp=Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        switch (temp) {
            case 1:
                g.drawPolygon(x, y, value);
                break;
            case 2:
                for(int l=0;l<value;++l)
                {
                    g.drawOval(x[l], y[l], 3, 3);
                }         break;
            case 3:
                g.drawPolygon(x, y, value);
                for(int l=0;l<value;++l)
                    g.drawLine(250,250,x[l],y[l]);
                break;
            case 4:
                for(int l=0;l<value;++l)
                {
                    for(int m=l;m<value;++m)
                    {
                        g.drawLine(x[l], y[l],x[m],y[m]);
                    }
                }         break;
            default:
                break;
        }
    }//GEN-LAST:event_jRadioButton2StateChanged

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
            java.util.logging.Logger.getLogger(Polygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polygon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSlider jSlider;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}