package govt_import_export;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class display extends javax.swing.JFrame 
{
    int total;
    public display()
    {
        initComponents();
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
        simple_display();
        String a=Integer.toString(total);
        jLabel5.setText(a);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Year");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Region");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Manufacture");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asia Pacific", "Australia", "Europe", "North-Central America", "South America", "Russia" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HYUNDAI", "MARUTISUZUKI", "VOLKSVAGEN", "NISSAN", "BAJAJ", "KTM" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel3.setText("ORDER    SUMMARY");

        jLabel4.setText("Total Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        autoexpo a=new autoexpo();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void disp(String s)
    {
        MongoClient mongo=null;
        int x=0;
        
        try
        {
            mongo=new MongoClient("localhost",27017);
        }
        
        catch(UnknownHostException | MongoException e)
        {
        }
        
        DB db=mongo.getDB("AUTOMOBILEXPO");
        String[] st=new String[10];
        st[0]="HYUNDAI";
        st[1]="MARUTISUZUKI";
        st[2]="NISSAN";
        st[3]="BAJAJ";
        st[4]="KTM";
        st[5]="VOLKSVAGEN";
         
        String s1,s2,s3;
        s1=jComboBox1.getSelectedItem().toString();
        s2=jComboBox2.getSelectedItem().toString();
        s3=jComboBox3.getSelectedItem().toString();
        BasicDBObject search=new BasicDBObject();
        BasicDBObject result=new BasicDBObject();
        BasicDBObject sp=new BasicDBObject();
         
        if(s.equals(s1))
        {
            int i=Integer.parseInt(s);
            sp.put("Year",i);
            
            if(jCheckBox2.isSelected() &&jCheckBox3.isSelected())
            {

                sp.append("country",s2);
                sp.append("manufacturer",s3);
            }
            
            else if(jCheckBox2.isSelected())
            {
                sp.append("country",s2);
            }

            else if(jCheckBox3.isSelected())
            {
                sp.append("manufacturer",s3);
            }                              
        }
        
        else if(s.equals(s2))
        {
            sp.put("country",s2);
            int i=Integer.parseInt(s1);
            
            if(jCheckBox1.isSelected() &&jCheckBox3.isSelected())
            {
                sp.append("Year",i);             
                sp.append("manufacturer",s3);
            }
            
            else if(jCheckBox1.isSelected())
            {
                sp.append("Year",i);
            }
            
            else if(jCheckBox3.isSelected())
            {
                sp.append("manufacturer",s3);
            }

        }
            
        else if(s.equals(s3))
        {
            sp.put("manufacturer",s3);
            int i=Integer.parseInt(s1);
            
            if(jCheckBox1.isSelected() &&jCheckBox2.isSelected())
            {
                sp.append("Year",i);
                sp.append("country",s2);            
            }
            
            else if(jCheckBox1.isSelected())
            {
                sp.append("Year",i);
            }
            
            else if(jCheckBox2.isSelected())
            {
                sp.append("country",s2);
            }
        }
        
        ArrayList<String> arr=new ArrayList();
        jTextArea1.setText("");
            
        for(int j=0;j<=5;j++)
        {
            DBCollection table;
        
            table=db.getCollection(st[j]);
            if(table.findOne()!=null)
            {  
                DBCursor cr=table.find(sp);
                DBObject obj;
         
                while(cr.hasNext())
                {
                    obj=cr.next();
                    x++;
                    jTextArea1.setText(jTextArea1.getText()+"Manufacture:   "+(obj.get("manufacturer").toString())+"    Model: "+(obj.get("model").toString())+"   Units : "+(obj.get("Units").toString())+"Cost : "+(obj.get("Cost").toString())+" Continent  : "+(obj.get("country").toString())+"  Year :"+(obj.get("Year").toString())+"\n");        
                }        
            }
        }
    
        total=x;
        String a=Integer.toString(total);
        jLabel5.setText(a);
    
    
}
private void simple_display()
{           MongoClient mongo=null;
            try
        {
         mongo=new MongoClient("localhost",27017);
            
        }
        catch(UnknownHostException | MongoException e)
        {
        }
       // String batches=(String)jComboBox1.getSelectedItem( );
            //get collections
            int x=0;
         DB db=mongo.getDB("AUTOMOBILEXPO");
        String[] st=new String[10];
        st[0]="HYUNDAI";
        st[1]="MARUTISUZUKI";
        st[2]="NISSAN";
        st[3]="BAJAJ";
        st[4]="KTM";
        st[5]="VOLKSVAGEN";
        ArrayList<String> arr=new ArrayList();
            for(int j=0;j<=5;j++)
            {
        DBCollection table;
        
        table=db.getCollection(st[j]);
        if(table.findOne()!=null)
        {BasicDBObject search=new BasicDBObject();
        BasicDBObject result=new BasicDBObject();
        BasicDBObject sp=new BasicDBObject();
        DBCursor cr=table.find();
        //System.out.println(table.findOne());
       String str;
         DBObject obj;
        while(cr.hasNext())
        {   x++;
            obj=cr.next();
            jTextArea1.setText(jTextArea1.getText()+"  Manufacture : "+(obj.get("manufacturer").toString())+"       Model : "+(obj.get("model").toString())+"       Units : "+(obj.get("Units").toString())+"     Cost : "+(obj.get("Cost").toString())+"    Continent  : "+(obj.get("country").toString())+"      Year : "+(obj.get("Year").toString())+"\n");    
        }
         
       
 }
            }
    
    total=x;
   String a=Integer.toString(total);
   jLabel5.setText(a); 
    
    
    
    
}




    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        //jComboBox1.setEnabled(true);
        if(jCheckBox1.isSelected())
        { 
            jComboBox1.setEnabled(true);
        }
         else
        {  String s;
            jComboBox1.setEnabled(false);
            if((!jCheckBox2.isSelected() && !jCheckBox3.isSelected()))
            {
                simple_display();
            }
            if(jCheckBox2.isSelected())
            {
                s=jComboBox2.getSelectedItem().toString();
                disp(s);
            }
             if(jCheckBox3.isSelected())
            {
                s=jComboBox3.getSelectedItem().toString();
                disp(s);
            }
            
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected())
        {
            jComboBox2.setEnabled(true);
        }
        else
        {  String s;
            jComboBox2.setEnabled(false);
            if((!jCheckBox1.isSelected() && !jCheckBox3.isSelected()))
            {
                simple_display();
            }
             if(jCheckBox1.isSelected())
            {
                s=jComboBox1.getSelectedItem().toString();
                disp(s);
            }
             if(jCheckBox3.isSelected())
            {
                s=jComboBox3.getSelectedItem().toString();
                disp(s);
            }
        }
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
            jComboBox3.setEnabled(true);
        else
        {   String s;
            jComboBox3.setEnabled(false);
            if((!jCheckBox2.isSelected() && !jCheckBox1.isSelected()))
            {
                simple_display();
            }
             if(jCheckBox2.isSelected())
            {
                s=jComboBox2.getSelectedItem().toString();
                disp(s);
            }
             if(jCheckBox1.isSelected())
            {
                s=jComboBox1.getSelectedItem().toString();
                disp(s);
            }
            
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String s;
        int x = 0;
        s=jComboBox1.getSelectedItem().toString();
        if(jCheckBox2.isSelected() && jCheckBox3.isSelected())
        {
            x=2;
        }
        disp(s);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String s;
        s=jComboBox2.getSelectedItem().toString();
        disp(s);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String s;
        s=jComboBox3.getSelectedItem().toString();
        disp(s);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
