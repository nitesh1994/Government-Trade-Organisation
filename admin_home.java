package govt_import_export;

import com.mongodb.BasicDBObject;
import java.net.UnknownHostException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.MongoClient;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class admin_home extends javax.swing.JFrame 
{
    public static String zzz;
    String last_activity;
    String current_activity;
    public static String rate,balance; 
    
    public admin_home()
    {
        //System.out.println(home.loginn);
        initComponents();
        admin_home.zzz = new String();
        jButton7.setEnabled(false);
        
        try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
            
            DB aircrafts_info=mongo.getDB("AIRCRAFTSINFO");
            DBCollection info=aircrafts_info.getCollection("INFO");
            
            /*
            BasicDBObject insobj=new BasicDBObject();
            insobj.put("Model","Sukhoi Su-30MKI");
            insobj.put("Country","Russia");
            insobj.put("Weight","18400kg");
            insobj.put("Range","3000km");
            insobj.put("Top_speed","2120kph");
            insobj.put("Cost","25000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.append("Model","Mikoyan MiG-29");
            insobj.append("Country","Russia");
            insobj.append("Weight","20000kg");
            insobj.append("Range","1500km");
            insobj.append("Top_speed","2430kph");
            insobj.append("Cost","29000000USD");
            insobj.append("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Dassault Mirage 2000");
            insobj.put("Country","France");
            insobj.put("Weight","13800kg");
            insobj.put("Range","1550km");
            insobj.put("Top_speed","2530kph");
            insobj.put("Cost","23000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","SEPECAT Jaguar");
            insobj.put("Country","England");
            insobj.put("Weight","7000kg");
            insobj.put("Range","3524km");
            insobj.put("Top_speed","1700kph");
            insobj.put("Cost","8000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Boeing C-17 Globemaster");
            insobj.put("Country","USA");
            insobj.put("Weight","28100kg");
            insobj.put("Range","10390km");
            insobj.put("Top_speed","875kph");
            insobj.put("Cost","222000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Ilyushin Il-76 Candid");
            insobj.put("Country","Russia");
            insobj.put("Weight","92500kg");
            insobj.put("Range","4300km");
            insobj.put("Top_speed","900kph");
            insobj.put("Cost","52000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Boeing 737");
            insobj.put("Country","USA");
            insobj.put("Weight","79010kg");
            insobj.put("Range","5765km");
            insobj.put("Top_speed","980kph");
            insobj.put("Cost","52000000USD");
            insobj.put("Passenger_seats","85-215");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Boeing 767");
            insobj.put("Country","USA");
            insobj.put("Weight","103870kg");
            insobj.put("Range","5765km");
            insobj.put("Top_speed","980kph");
            insobj.put("Cost","188000000USD");
            insobj.put("Passenger_seats","181-409");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Boeing 777");
            insobj.put("Country","USA");
            insobj.put("Weight","351500kg");
            insobj.put("Range","15186km");
            insobj.put("Top_speed","950kph");
            insobj.put("Cost","296000000USD");
            insobj.put("Passenger_seats","383-550");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Airbus a320");
            insobj.put("Country","France");
            insobj.put("Weight","42600kg");
            insobj.put("Range","5700km");
            insobj.put("Top_speed","871kph");
            insobj.put("Cost","94000000USD");
            insobj.put("Passenger_seats","180");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","Mil Mi-35 Hind-E");
            insobj.put("Country","Russia");
            insobj.put("Weight","8500kg");
            insobj.put("Range","450km");
            insobj.put("Top_speed","335kph");
            insobj.put("Cost","12000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            insobj=new BasicDBObject();
            insobj.put("Model","AgustaWestland AW101");
            insobj.put("Country","England/Italy");
            insobj.put("Weight","10500kg");
            insobj.put("Range","833km");
            insobj.put("Top_speed","309kph");
            insobj.put("Cost","21000000USD");
            insobj.put("Passenger_seats","nil");
            info.insert(insobj);
            
            System.out.println("info added!@!");
            */
            
            DB db=mongo.getDB("admindata");
            DBCollection coll=db.getCollection("admin"); 
            BasicDBObject bo=new BasicDBObject();
            bo.put("date",1);
            DBCursor c=coll.find(); //yes
            
            DBObject o=c.next();//yes
            last_activity=o.get("date").toString();
            jLabel5.setText("<html><font color=\"red\">"+last_activity+"</font></html>"); //get last activity
            
            while(c.hasNext())
            {
                o=c.next();
                if(o.get("rate")!=null)
                {
                    rate=o.get("rate").toString();
                    jLabel6.setText(rate+" INR per USD");
                    //System.out.println(rate);
                }
                
            }
                        
            c=coll.find();
           
            while(c.hasNext())
            {
                o=c.next();
                if(o.get("balance")!=null)
                {
                    NumberFormat nf=new DecimalFormat("############");
                    balance=nf.format(o.get("balance"));
                    jLabel7.setText(balance + " USD");
                    //System.out.println(balance);
                }
                
            }
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("welcome,admin!");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("select a category to proceed"));

        jButton1.setText("Aircrafts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Arms and ammunition");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Automobiles(export)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Commodities");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Crude oil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("View complete inventory");

        jButton8.setText("View all orders");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Current treasury balance:");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel4.setText("Current exchange rate:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(47, 47, 47)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton9.setText("Log out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setText("last account activity on:");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //jTextField1.setText("");
        aircrafts a=new aircrafts();
        this.setVisible(false);//DOnt use this.dispose!!
        a.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        crude c=new crude();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        autoexpo ae=new autoexpo();
        this.setVisible(false);
        ae.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        arms arm=new arms();
        this.setVisible(false);
        arm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d=new Date();
        current_activity=df.format(d);
        
        try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
            
            DB db=mongo.getDB("admindata");
            DBCollection coll=db.getCollection("admin");
            
            BasicDBObject searchupdate=new BasicDBObject();
            searchupdate.append("date",last_activity); //finds the document(s) where "date":last_activity
            
            BasicDBObject update=new BasicDBObject();
            update.append("$set",new BasicDBObject("date",current_activity));
            
            coll.update(searchupdate, update);
            
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
        
        home h=new home();
        this.dispose();
        h.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
