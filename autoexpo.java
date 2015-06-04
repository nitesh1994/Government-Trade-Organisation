package govt_import_export;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
//import static export.db1;
//import static export.r;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ButtonGroup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitesh
 */
abstract class Order implements Comparator<Order>,Comparable<Order>{
    String id;
    int value;
    
    Order(){
    }
    Order(String id1,int v1)
    {
        id=id1;
        value=v1;
    }
    public int compareTo(Order o1)
    {
        return (this.id).compareTo(o1.id);
    }
    public String getid(){
        return id;
    }
    @Override
        public int compare(Order o1,Order o2)
        {
           return (o2.value-o1.value);
        }
    

    public int getval(){
        return value;
    }
    
}
public class autoexpo extends javax.swing.JFrame {

    /**
     * Creates new form autoexpo
     */
    String col;
    String z;
     String db_rate,db_balance;
      double newbalance;
    double newrate,oldrate;
    double ratio;
    NumberFormat nf=new DecimalFormat("############");
    public autoexpo() {
        initComponents();
        groupButton();
        System.out.println("kkk");
        try{
            MongoClient mongo=new MongoClient("localhost",27017);
            DB db=mongo.getDB("automobile_expo");
            DBCollection col=db.getCollection("KTM");
            BasicDBObject obj=new BasicDBObject();
            obj.put("model_name","RC390");
            obj.put("date","03-05-2013");
            obj.put("EngineType","Petrol");
            obj.put("EngineDisplacement","373cc");
            obj.put("Maximum_torque","35Nm@2000rpm");
            obj.put("Noof_cylinders",1);
            obj.put("Maximum_power","43.5kw@8500rpm");
            obj.put("Seating_Capacity",2);
            obj.put("Length","1375mm");
            obj.put("Width","600mm");
            obj.put("Height","1065mm");
            obj.put("Cost","205000INR");
            //col.insert(obj);
            //BasicDBObject n=new BasicDBObject();
            //n.append("model_name","i20");
            //col.remove(n);
            
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        
        catch(MongoException e)
        {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("AUTOMOBILE MANUFACTURER"));

        jRadioButton1.setText("HYUNDAI");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("MARUTISUZUKI");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("NISSAN");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("VOLKSVAGEN");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("BAJAJ");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("KTM");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Santro", "i10", "i20", "Eon" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CHOOSE YOUR MANUFACTURER AND MODEL");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("View  placed orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Top exported models");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BACk");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(244, 244, 244))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(203, 203, 203))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(70, 70, 70))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(32, 32, 32)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Santro");
        jComboBox1.addItem("i10");
        jComboBox1.addItem("i20");
        jComboBox1.addItem("Eon");
       
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        col = (String)jComboBox1.getSelectedItem();
        jTextField1.setText(col);        
    }//GEN-LAST:event_jComboBox1ActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String db;
        col = (String)jComboBox1.getSelectedItem();
        db=(String)jRadioButton1.getText();
         if(jRadioButton1.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton1.getText();
        }
         if(jRadioButton2.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton2.getText();
        }
         if(jRadioButton3.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton3.getText();
        }
         if(jRadioButton4.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton4.getText();
        }
         if(jRadioButton5.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton5.getText();
        }
         if(jRadioButton6.isSelected())
        {
         col = (String)jComboBox1.getSelectedItem();
         db=(String)jRadioButton6.getText();
        }
         
        export e=new export(col,db);
        e.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void groupButton( ) {

ButtonGroup bg1 = new ButtonGroup( );

bg1.add(jRadioButton1);
bg1.add(jRadioButton2);
bg1.add(jRadioButton3);
bg1.add(jRadioButton4);
bg1.add(jRadioButton5);
bg1.add(jRadioButton6);

}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Micra");
        jComboBox1.addItem("Sunny");


        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
 jComboBox1.removeAllItems();
 jComboBox1.addItem("Stingray"); 
 jComboBox1.addItem("Alto"); 
 jComboBox1.addItem("Swift"); 
 jComboBox1.addItem("A-star");
       
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Passat");
 jComboBox1.addItem("Jetta"); 
 jComboBox1.addItem("Polo"); 
 jComboBox1.addItem("Vento");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Discover");
 jComboBox1.addItem("Pulsar");
 jComboBox1.addItem("Avenger");
 
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Duke200"); 
jComboBox1.addItem("Duke390"); 
jComboBox1.addItem("RC390");
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        display_2 d=new display_2();
        d.setVisible(true);
        /*try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
            DB db=mongo.getDB("automobile_expo");
            DBCollection table=db.getCollection("HYUNDAI");
            
             BasicDBObject document=new BasicDBObject();
              document.put("model_name","i10");
              BasicDBObject sp=new BasicDBObject();
              sp.put("Cost",1);
              sp.put("_id",0);
            DBCursor cursor=table.find(document,sp);
            while(cursor.hasNext())
            z=cursor.next().toString();
            z=z.substring(z.indexOf("st\" : \"") + 7);
            z=z.substring(0, z.indexOf("INR"));
            System.out.println(z);
            
            
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        
        catch(MongoException e)
        {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed
 private void sort_cars()
    {
     MongoClient mongo=null;
           try
        {
            mongo=new MongoClient("localhost",27017);
            //get database
        }
           catch(UnknownHostException | MongoException e)
        {
        }
           String[] st=new String[10];
        st[0]="HYUNDAI";
        st[1]="MARUTISUZUKI";
        st[2]="NISSAN";
        st[3]="BAJAJ";
        st[4]="KTM";
        st[5]="VOLKSVAGEN";
            DB db=mongo.getDB("AUTOMOBILEXPO");
            DBCollection table;
             
            ArrayList<Order> arr=new ArrayList<Order>();
            for(int j=0;j<6;j++)
            {
             table=db.getCollection(st[j]);
              
             if(table.findOne()!=null)
             {
                 String map ="function () {"+
            "emit(this.model,this.Units);"+
    "}";
    String reduce;
                 reduce = "function (key,value) { "+
                         "return Array.sum(value)}";
 
    MapReduceCommand cmd = new MapReduceCommand(table, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
 
    MapReduceOutput out = table.mapReduce(cmd);
    String str;
    for(DBObject o : out.results()) {
        str=o.get("value").toString().trim();
        System.out.println(str);
        int i = 0;
       // var i=(int)(Convert.ToDouble("1.2"));
        //int a = int.Parse("1.2".Split('.')[0]);
        if(!str.equals(null))
        {
             Float f=Float.parseFloat(str);
              i=(int)Math.ceil(f);
        arr.add(new Order(o.get("_id").toString(),i) {
        
            @Override
            public int compare(Order o1, Order o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int compareTo(Order o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        }
    }   
    }
             
            }
             Collections.sort(arr,new Order() {});
        for(Order a: arr)
        System.out.println(" "+a.getid()+" "+a.getval());  
        this.dispose();
        Sorted s=new Sorted(arr);
        s.setVisible(true);
            
            
            
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //TODO add your handling code here:
        sort_cars();
    /*    MongoClient mongo=null;
           try
        {
            mongo=new MongoClient("localhost",27017);
            //get database
        }
           catch(UnknownHostException | MongoException e)
        {
        }
           String[] st=new String[10];
        st[0]="HYUNDAI";
        st[1]="MARUTISUZUKI";
        st[2]="NISSAN";
        st[3]="BAJAJ";
        st[4]="KTM";
        st[5]="VOLKSVAGEN";
            DB db=mongo.getDB("AUTOMOBILEXPO");
            DBCollection table;
             
            ArrayList<Order> arr=new ArrayList<Order>();
            for(int j=0;j<6;j++)
            {
             table=db.getCollection(st[j]);
              
             if(table.findOne()!=null)
             {
                 String map ="function () {"+
            "emit(this.model,this.Units);"+
    "}";
    String reduce;
                 reduce = "function (key,value) { "+
                         "return Array.sum(value)}";
 
    MapReduceCommand cmd = new MapReduceCommand(table, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
 
    MapReduceOutput out = table.mapReduce(cmd);
    String str;
    for(DBObject o : out.results()) {
        str=o.get("value").toString().trim();
        System.out.println(str);
        int i = 0;
       // var i=(int)(Convert.ToDouble("1.2"));
        //int a = int.Parse("1.2".Split('.')[0]);
        if(!str.equals(null))
        {
             Float f=Float.parseFloat(str);
              i=(int)Math.ceil(f);
        arr.add(new Order(o.get("_id").toString(),i) {
        
            @Override
            public int compare(Order o1, Order o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int compareTo(Order o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        }
    }
    //for(Order a: arr)
       // System.out.println(" "+a.getid()+" "+a.getval());
            }
            
    Collections.sort(arr,new Order() {});
        for(Order a: arr)
        System.out.println(" "+a.getid()+" "+a.getval());
            Sorted s=new Sorted(arr);
            s.setVisible(true);
      */  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  this.dispose();
  admin_home a=new admin_home();
  a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(autoexpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(autoexpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(autoexpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(autoexpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autoexpo().setVisible(true);
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}