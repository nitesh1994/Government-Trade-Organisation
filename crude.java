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

public class crude extends javax.swing.JFrame 
{
    String db_rate,db_balance;
    NumberFormat nf=new DecimalFormat("############");
    double newbalance;
    double newrate;
    double ratio;
    long unitsXcost;
    
    public crude()
    {
        initComponents();
        jLabel8.setText( Long.toString((Long.parseLong(JCB3.getSelectedItem().toString()) * 95000000)) );
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCB3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Current exchange rate:");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Set date of order as:");

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

        jLabel4.setText("Cost per barrel:");

        jLabel5.setText("95USD");

        jLabel6.setText("No of barrels (in millions):");

        JCB3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", " " }));
        JCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Total cost:");

        jLabel8.setText("jLabel8");

        jButton1.setText("Place order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View all orders");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed

    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        
    }//GEN-LAST:event_yearActionPerformed

    private void JCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB3ActionPerformed
        jLabel8.setText( Long.toString((Long.parseLong(JCB3.getSelectedItem().toString()) * 95000000)) );
    }//GEN-LAST:event_JCB3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        admin_home ah=new admin_home();
        this.setVisible(false);
        ah.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                    
            unitsXcost=Long.parseLong(jLabel8.getText());
            
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
            
            //------------------------------------------------------------------------------
            
            
            DB db=mongo.getDB("CRUDE");
            DBCollection coll=db.getCollection("CRUDE1");
            
            BasicDBObject document=new BasicDBObject();
            document.append("month",month.getSelectedItem());
            document.append("year",year.getSelectedItem());
            document.append("mil-barrels",JCB3.getSelectedItem());
            document.append("totalcost",jLabel8.getText());
            
            coll.insert(document);
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        crudeorders co=new crudeorders();
        this.setVisible(false);
        co.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCB3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox month;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
