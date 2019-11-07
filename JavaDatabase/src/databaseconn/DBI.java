/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconn;

import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author c3
 */
public class DBI extends javax.swing.JFrame {
javax.swing.JFrame previous;
Statement stmt;
 ArrayList <BankAccount> tem;
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
 long mills;
    Date date ;
    int serno=0;

    /**
     * Creates new form DBI
     * @param temp
     * @param stmt
     * @throws java.lang.InstantiationException
     */
    public DBI(javax.swing.JFrame temp,Statement stmt) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalAccessException, IllegalAccessException, IllegalAccessException {
        
        initComponents();
        previous=temp;
        this.stmt=stmt;
    try {
        Bank.fetchDetails();
    } catch (IllegalAccessException ex) {
        Logger.getLogger(DBI.class.getName()).log(Level.SEVERE, null, ex);
    }
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
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        details = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        depositFund = new javax.swing.JButton();
        accNumber = new javax.swing.JTextField();
        withdraw = new javax.swing.JButton();
        balance = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LABE1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        LABE2 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Development Bank Of India ");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -40, 650, 130));

        reset.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 210, 30));

        jLabel2.setFont(jLabel2.getFont().deriveFont((jLabel2.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        jLabel2.setText("Available Balance ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 40));

        details.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        details.setText("Get Account Details ");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });
        getContentPane().add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 210, 30));

        jLabel3.setFont(jLabel3.getFont().deriveFont((jLabel3.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        jLabel3.setText("Enter Amount ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 40));

        depositFund.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        depositFund.setText("Deposite Funds");
        depositFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositFundActionPerformed(evt);
            }
        });
        getContentPane().add(depositFund, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 210, 30));
        getContentPane().add(accNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 290, 40));

        withdraw.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        withdraw.setText("Withdraw ");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 210, 30));

        balance.setFont(balance.getFont().deriveFont((balance.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 210, 40));

        jLabel6.setFont(jLabel6.getFont().deriveFont((jLabel6.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        jLabel6.setText("Account Number :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 40));

        LABE1.setFont(LABE1.getFont().deriveFont((LABE1.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        getContentPane().add(LABE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 210, 30));
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 290, 40));

        LABE2.setFont(LABE2.getFont().deriveFont((LABE2.getFont().getStyle() | java.awt.Font.ITALIC), 18));
        LABE2.setText("Name  :  ");
        getContentPane().add(LABE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 30));

        logOut.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        logOut.setText("Logout");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 210, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo.", "Particulars", "Amount", "Balance", "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        reset1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        reset1.setText("Close");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 210, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden

    }//GEN-LAST:event_jLabel1ComponentHidden

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      accNumber.setText("");
      accNumber.setEditable(true);
      amount.setText("");
      LABE1.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
    try {
        Bank.fetchDetails();
        boolean attempt=true;
        String tempAc=accNumber.getText();
        while(attempt)
        {
            if(tempAc.equals(""))
            {
                JOptionPane.showMessageDialog(this,"account number cannot be empty");
                
            }
            else
            {
                break;
            }
            
        }
        int iterator=0;    
        tem=Bank.acc;
        int compare=Integer.parseInt(accNumber.getText());
        while(true)
        {
            if(tem.get(iterator).getAccountNumber()==compare)
                
            {
                System.out.println("matched "+tem.get(iterator).getAccountNumber()+" with "+ compare);
                
                break;
            }
            else{
                
                if(iterator==(tem.size()-1))
                    break;
            }iterator++;
            
        }
        if(iterator==tem.size()-1)
        {
            JOptionPane.showMessageDialog(this,"account not found");
            accNumber.setText("");
            return;
        }
        balance.setText((tem.get(iterator).getBalance()+""));
        LABE1.setText(tem.get(iterator).getName()+"");
        accNumber.setText(tem.get(iterator).getAccountNumber()+"");
        accNumber.setEditable(false);
    } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(DBI.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_detailsActionPerformed

    private void depositFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositFundActionPerformed
        try {
            Bank.fetchDetails();
            if (amount.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "amount cannot be empty  ");
                return;
            } else {
            }
            if (Double.parseDouble(amount.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "invalid amount ");
                amount.setText("");
                return;
            }
            
            
            double bal = 0;
            tem=Bank.acc;
            boolean found=false;
            int iterator=0;
            while(true)
            {
                if(tem.get(iterator).getAccountNumber()==Integer.parseInt(accNumber.getText() ))
                {
                    found=true;
                    break;
                }
                else{
                    
                    if(iterator==tem.size()-1)
                        break;
                }
                iterator++;
            }
            if(found)
            {
                bal=tem.get(iterator).getBalance();
            bal += Double.parseDouble(amount.getText());
            balance.setText("" + bal);
            stmt.executeUpdate("Update bankaccount set balance='"+bal+"' where accountnumber="+Integer.parseInt(accNumber.getText())+"");
            JOptionPane.showMessageDialog(this, "funds deposited successfully  ");
            balance.setText(bal+"");
            mills=System.currentTimeMillis();
            date=new Date(mills);
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.addRow(new Object []{serno++,"deposit ",Double.parseDouble(amount.getText()),Double.parseDouble(balance.getText()),formatter.format(date)});
           amount.setText("");
           Bank.fetchDetails();
           
                
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "bank account not found  ");
                 accNumber.setText("");
                
            }
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(""+ e);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(DBI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_depositFundActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        try {
            Bank.fetchDetails();
                if (amount.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "amount cannot be empty  ");
                    return;
                }
           

                double bal;
                tem=Bank.acc;
                int iterator=0;
                boolean found =false;
                while(true)
                {
                    if(tem.get(iterator).getAccountNumber()==Integer.parseInt(accNumber.getText() ))
                    {
                        found=true;
                        break;
                    }
                    if(iterator==(tem.size()-1))
                    {
                        break;
                    }
                    iterator++;
                }
                if(found)
                {
                    bal=tem.get(iterator).getBalance();
                    if (Double.parseDouble(amount.getText()) > bal)
                    {
                        {
                            
                            JOptionPane.showMessageDialog(this, "Not enough balance try again ");
                            amount.setText("");
                            return;
                        }
                    }       
                    bal-=Integer.parseInt(amount.getText());
                    stmt.executeUpdate("Update bankaccount set balance="+bal+" where accountnumber="+Integer.parseInt(accNumber.getText())+"");
                    JOptionPane.showMessageDialog(this, "Withdrawl was successfull  ");
                mills=System.currentTimeMillis();
                date=new Date(mills);
                
                    
                    balance.setText(bal+"");
                   DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.addRow(new Object []{serno++,"withdraw ",Double.parseDouble(amount.getText()),Double.parseDouble(balance.getText()),formatter.format(date)});
                    Bank.fetchDetails();
                    amount.setText("");

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "bank account not found  ");
                    accNumber.setText("");

                }
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(DBI.class.getName()).log(Level.SEVERE, null, ex);
    }
            
      
    }//GEN-LAST:event_withdrawActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        previous.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
      previous.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_reset1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABE1;
    private javax.swing.JLabel LABE2;
    private javax.swing.JTextField accNumber;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel balance;
    private javax.swing.JButton depositFund;
    private javax.swing.JButton details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}