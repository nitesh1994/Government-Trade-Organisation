/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

public class aircrafts2 extends javax.swing.JFrame
{

    /**
     * Creates new form aircrafts2
     * @param 
     * @param type_selected
     */
    
    String make_model,type,zzz,java_month,java_year,units_string,unitsXcost_string;
    String db_rate,db_balance;
    long unitsXcost;
    long db_rate_long;
    double newbalance;
    double newrate;
    double ratio;
    NumberFormat nf=new DecimalFormat("############");
    
    public aircrafts2(String make_model_selected,String type_selected)
    {
        initComponents();
        //System.out.println(make_model_selected+type_selected);

        type=type_selected;
        make_model=make_model_selected;
        
        try
        {   
            MongoClient mongo=new MongoClient("localhost",27017);
            
            DB aircrafts_info=mongo.getDB("AIRCRAFTSINFO");
            DBCollection info=aircrafts_info.getCollection("INFO");
            
            BasicDBObject search=new BasicDBObject();
            search.put("Model",make_model);
            DBCursor cursor=info.find(search);
            while(cursor.hasNext())
               zzz=cursor.next().toString();
                       
                    zzz = zzz.substring(zzz.indexOf("st\" : \"") + 7);
                    zzz = zzz.substring(0, zzz.indexOf("USD"));  

                    totalcost.setText(zzz);
                    TF.setText(type);
            
                    units_string=(String) JCB3.getSelectedItem();
                    java_month=(String) month.getSelectedItem();
                    java_year=(String) year.getSelectedItem();
                        
                    unitsXcost=Long.parseLong(zzz)*Long.parseLong(units_string);
                    unitsXcost_string=Long.toString(unitsXcost);
                        
            DBCursor c=info.find();
            DBObject display2;
            
            while(c.hasNext())
            {
                display2=c.next();
                jLabel9.setText
                (
   
                    "<html> Model: "+(display2.get("Model").toString()) +
                    "<br> Country: "+(display2.get("Country").toString()) +
                    "<br> Weight: "+(display2.get("Weight").toString()) +
                    "<br> Range: "+(display2.get("Range").toString()) +
                    "<br> Top speed: "+(display2.get("Top_speed").toString()) +
                    "<br> Cost: "+(display2.get("Cost").toString()) +
                    "<br> Passenger seats: "+(display2.get("Passenger_seats").toString()) + "</html>"                                                 
                );
            }            
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        placeorder = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalcost = new javax.swing.JTextField();
        totalcost1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCB3 = new javax.swing.JComboBox();
        TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        placeorder.setText("Place Order!");
        placeorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeorderActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jLabel8.setText("INR");

        jLabel6.setText("USD");

        totalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostActionPerformed(evt);
            }
        });

        jLabel7.setText("Total cost:");

        jLabel5.setText("Total cost:");

        jLabel4.setText("number of units:");

        JCB3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "10" }));
        JCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB3ActionPerformed(evt);
            }
        });

        TF.setEditable(false);
        TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFActionPerformed(evt);
            }
        });

        jLabel2.setText("Type:");

        jLabel1.setText("Set date of order as:");

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(totalcost1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalcost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeorder)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(placeorder))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFActionPerformed
     
    }//GEN-LAST:event_TFActionPerformed

    private void JCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB3ActionPerformed
        units_string=(String) JCB3.getSelectedItem();
        
        unitsXcost=Long.parseLong(zzz)*Long.parseLong(units_string);
        unitsXcost_string=Long.toString(unitsXcost);
        
        //System.out.println("units: "+units_string);
        //System.out.println("totalcost: "+unitsXcost_string);
        
        totalcost.setText(unitsXcost_string);
    }//GEN-LAST:event_JCB3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        aircrafts a=new aircrafts();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void placeorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeorderActionPerformed
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
                        
            ratio=((double)unitsXcost)/Double.parseDouble(db_balance);
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
            
            //------------------------------------------------------------------------------
            
            DB db=mongo.getDB("AIRCRAFTS");
            DBCollection collection=db.getCollection(type);
            
            //insert
            BasicDBObject document=new BasicDBObject();
            document.append("model",make_model);
            document.append("type",type);
            document.append("cost",zzz);
            document.append("month",java_month);
            document.append("year",java_year);
            document.append("units",Integer.parseInt(units_string));
            document.append("totalcost",totalcost.getText());
            
            javax.swing.JOptionPane.showMessageDialog(aircrafts2.this, "Waiting for acceptance" );
            
            collection.insert(document);                      
            
        }
        
        catch(UnknownHostException | MongoException e)
        {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_placeorderActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        java_month=(String) month.getSelectedItem();
        System.out.println(java_month+java_year);
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        java_year=(String) year.getSelectedItem();
        System.out.println(java_month+java_year);
    }//GEN-LAST:event_yearActionPerformed

    private void totalcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcostActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCB3;
    private javax.swing.JTextField TF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JComboBox month;
    private javax.swing.JButton placeorder;
    private javax.swing.JTextField totalcost;
    private javax.swing.JTextField totalcost1;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
