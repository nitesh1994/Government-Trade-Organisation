package govt_import_export;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import static java.lang.Math.pow;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class arms extends javax.swing.JFrame 
{
    int totalcost;
    int radio;
    int combo;
    ButtonGroup bg1;
    
    String db_rate,db_balance;
    NumberFormat nf=new DecimalFormat("############");
    double newbalance;
    double newrate;
    double ratio;
    long unitsXcost;
    
    public arms()
    {
        initComponents();
        groupButton();
        details_tanks.setVisible(false);
        details_tanks.setEnabled(false);
        units_combobox.setEnabled(false);
        units_combobox_tanks.setEnabled(false);
        //bg1.setSelected(jRadioButton1, rootPaneCheckingEnabled);
        
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Canada");
        b.setText(cost[0]+" USD");
        radio=1;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
        
    }
    
    String[] cost={"280","550","480","1070","950","1750","4100","750000","3000000","1500000","100","25000","40"};
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        details_tanks = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        units_combobox = new javax.swing.JComboBox();
        units_combobox_tanks = new javax.swing.JComboBox();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        place_order_arm = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        allorders_arms = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arms"));

        jRadioButton1.setText("9mm auto");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Glock 17");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Micro Uzi");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("AR AK-47");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("M4 Carbine");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("SVD Dragunov");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Firearms:");

        jRadioButton7.setText("FN Minimi");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Battle tanks:");

        jRadioButton8.setText("T55");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("T90M");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("T72");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Misc:");

        jRadioButton11.setText("GP-25 grenade launcher");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton12.setText("L16 Mortar");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton13.setText("40mm HE grenade");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton13))))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(153, 153, 153))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));

        jLabel4.setText("Country of origin:");

        jLabel6.setText("Unit Cost:");

        details_tanks.setText("Click here for additional details");
        details_tanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details_tanksActionPerformed(evt);
            }
        });

        jLabel5.setText("Units:");

        units_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "50", "100", "250", "1000", "2000" }));
        units_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                units_comboboxActionPerformed(evt);
            }
        });

        units_combobox_tanks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "25", "50", "100", "200" }));
        units_combobox_tanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                units_combobox_tanksActionPerformed(evt);
            }
        });

        a.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(units_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(units_combobox_tanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(details_tanks)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(a)
                    .addComponent(b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(details_tanks)
                    .addComponent(jLabel5)
                    .addComponent(units_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(units_combobox_tanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        place_order_arm.setText("Place order");
        place_order_arm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                place_order_armActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setText("Set date of order as:");

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014" }));

        allorders_arms.setText("View all orders");
        allorders_arms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allorders_armsActionPerformed(evt);
            }
        });

        jLabel8.setText("Total cost:");

        jLabel9.setText("jLabel9");

        jLabel10.setText("USD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(149, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(allorders_arms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place_order_arm)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(place_order_arm)
                    .addComponent(allorders_arms))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void groupButton()
    {
        bg1=new ButtonGroup();
        
        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);
        bg1.add(jRadioButton3);
        bg1.add(jRadioButton4);
        bg1.add(jRadioButton5);
        bg1.add(jRadioButton6);
        bg1.add(jRadioButton7);
        bg1.add(jRadioButton8);
        bg1.add(jRadioButton9);
        bg1.add(jRadioButton10);
        bg1.add(jRadioButton11);
        bg1.add(jRadioButton12);
        bg1.add(jRadioButton13);
    }
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Austria");
        b.setText(cost[1]+" USD");
        radio=2;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Israel");
        b.setText(cost[2]+" USD");
        radio=3;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("USA");
        b.setText(cost[4]+" USD");
        radio=5;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        units_combobox.setEnabled(false);
        units_combobox_tanks.setEnabled(true);
        details_tanks.setEnabled(true);
        a.setText("Russia");
        b.setText(cost[7]+" USD");
        radio=8;
        
        totalcost=Integer.parseInt( units_combobox_tanks.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        units_combobox.setEnabled(false);
        units_combobox_tanks.setEnabled(true);
        details_tanks.setEnabled(true);
        a.setText("Russia");
        b.setText(cost[8]+" USD");
        radio=9;
        
        totalcost=Integer.parseInt( units_combobox_tanks.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);     
        details_tanks.setEnabled(false);
        a.setText("Russia");
        b.setText(cost[10]+" USD");
        radio=11;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        admin_home ah=new admin_home();
        ah.setVisible(true);
        //ArrayList[] al=new ArrayList[6];
    }//GEN-LAST:event_backActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Canada");
        b.setText(cost[0]+" USD");
        radio=1;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Bulgaria");
        b.setText(cost[3]+" USD");
        radio=4;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Russia");
        b.setText(cost[5]+" USD");
        radio=6;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("Belgium");
        b.setText(cost[6]+" USD");
        radio=7;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        units_combobox.setEnabled(false);
        units_combobox_tanks.setEnabled(true);
        details_tanks.setEnabled(true);
        a.setText("Russia");
        b.setText(cost[9]+" USD");
        radio=10;
        
        totalcost=Integer.parseInt( units_combobox_tanks.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        units_combobox.setEnabled(false);
        units_combobox_tanks.setEnabled(true);
        details_tanks.setEnabled(false);
        a.setText("UK");
        b.setText(cost[11]+" USD");
        radio=12;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        units_combobox.setEnabled(true);
        units_combobox_tanks.setEnabled(false);
        details_tanks.setEnabled(false);
        a.setText("USA");
        b.setText(cost[12]+" USD");
        radio=13;
        
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void allorders_armsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allorders_armsActionPerformed
        this.dispose();
        armsorders ao=new armsorders();
        ao.setVisible(true);
    }//GEN-LAST:event_allorders_armsActionPerformed

    private void place_order_armActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_place_order_armActionPerformed
        try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
                        
            DB db0=mongo.getDB("admindata");
            DBCollection collection0=db0.getCollection("admin");
            DBCursor c=collection0.find();             
            DBObject o;
            
            while(c.hasNext())
            {
                o=c.next();
                if(o.get("rate")!=null)
                {
                    db_rate=o.get("rate").toString();
                }                
            }
            
            c=collection0.find();
            
            while(c.hasNext())
            {
                o=c.next();
                if(o.get("balance")!=null)
                {
                    db_balance=nf.format(o.get("balance"));
                    
                }                
            }
                    
            unitsXcost=Long.parseLong(jLabel9.getText());
            
            ratio=((double)unitsXcost)/Double.parseDouble(db_balance);
            ratio=ratio*.1;
            newbalance=Long.parseLong(db_balance)-unitsXcost;
            newrate = Double.parseDouble(db_rate) * pow(Math.E,ratio);
            System.out.println("'newrate'"+newrate);
            //System.out.println(newbalance);
            String q=nf.format(newbalance);
            //System.out.println(q);
            
            //--------------------setting the updated values in the db----------------------
            
            BasicDBObject searchupdate=new BasicDBObject();
            searchupdate.append("rate",Double.parseDouble(db_rate)); //finds the document(s) where "date":last_activity
            
            BasicDBObject update=new BasicDBObject();
            update.append("$set",new BasicDBObject("rate",/*Double.toString(newrate)*/newrate));
            
            collection0.update(searchupdate, update);
            
            //-----
            BasicDBObject searchupdate1=new BasicDBObject();
            searchupdate1.append("balance",Long.parseLong(db_balance));
            
            BasicDBObject update1=new BasicDBObject();
            update1.append("$set",new BasicDBObject("balance",Long.parseLong(q)));
            
            collection0.update(searchupdate1, update1);
            
            
            DB db=mongo.getDB("ARMS");
            DBCollection coll=db.getCollection("ARMS1");
            
            BasicDBObject document=new BasicDBObject();
            document.append("model",getSelectedButtonText(bg1));
            document.append("cost",cost[radio-1]);
            document.append("month",month.getSelectedItem());
            document.append("year",year.getSelectedItem());
            if( Integer.parseInt(cost[radio-1])<24000 )
                document.append("units",units_combobox.getSelectedItem().toString());
            else
                document.append("units",units_combobox_tanks.getSelectedItem().toString());
            document.append("country",a.getText());
            document.append("totalcost",jLabel9.getText());
            coll.insert(document);
            //System.out.println( getSelectedButtonText(bg1) );
            
        }
        
        catch(UnknownHostException | MongoException e)
        {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_place_order_armActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup)
    {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();)
        {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected())
            {
                return button.getText();
            }
        }

        return null;
    }

    
    private void units_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_units_comboboxActionPerformed
        totalcost=Integer.parseInt( units_combobox.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_units_comboboxActionPerformed

    private void units_combobox_tanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_units_combobox_tanksActionPerformed
        totalcost=Integer.parseInt( units_combobox_tanks.getSelectedItem().toString() ) * Integer.parseInt(cost[radio-1]) ;
        jLabel9.setText(Integer.toString(totalcost));
    }//GEN-LAST:event_units_combobox_tanksActionPerformed

    private void details_tanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details_tanksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_details_tanksActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton allorders_arms;
    private javax.swing.JLabel b;
    private javax.swing.JButton back;
    private javax.swing.JButton details_tanks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox month;
    private javax.swing.JButton place_order_arm;
    private javax.swing.JComboBox units_combobox;
    private javax.swing.JComboBox units_combobox_tanks;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
