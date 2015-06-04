package govt_import_export;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import javax.swing.table.DefaultTableModel;

public final class aircraftsallorders extends javax.swing.JFrame
{
    int r;
    DefaultTableModel model;
    
    public aircraftsallorders() 
    {
        initComponents();
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        
        model=new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Model");
        model.addColumn("Type");
        model.addColumn("Month");
        model.addColumn("Year");
        model.addColumn("Unit cost");
        model.addColumn("Units");
        model.addColumn("Total cost");
        
        simple_display();
        
    }

    public void simple_display()
    {
        MongoClient mongo=null;
        
        try
        {   
            mongo=new MongoClient("localhost",27017);
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
        
        DB db=mongo.getDB("AIRCRAFTS");
        
        String[] st=new String[4];
        st[0]="Fighter/defense";
        st[1]="Freight";
        st[2]="Passenger";
        st[3]="Chopper/Helicopter";
        
        if(jTable1.getRowCount()>0)
        {
            for(int i=jTable1.getRowCount()-1 ; i>=0 ; i--)
            {
                model.removeRow(i);
            }
        }
        
        for(int i=0;i<4;i++)//difference between DBObject and Basic DBObject
        {
            DBCollection table;
            table=db.getCollection(st[i]);
            
            if (table.findOne()!=null)
            {                
                DBCursor cr=table.find();//same as the find() used in the shell
                DBObject document;
            
                while(cr.hasNext())
                {
                    document=cr.next();
                        /*
                    jTable1.setValueAt(document.get("model").toString(),r ,0);
                    jTable1.setValueAt(document.get("type").toString(),r ,1);
                    jTable1.setValueAt(document.get("month").toString(),r ,2);
                    jTable1.setValueAt(document.get("year").toString(),r ,3);
                    jTable1.setValueAt(document.get("cost").toString(),r ,4);
                    jTable1.setValueAt(document.get("units").toString(),r ,5);
                    jTable1.setValueAt(document.get("totalcost").toString(),r ,6);
                    r++;
                    */
                    model.addRow
                    (
                        new Object[]
                        {
                            document.get("model").toString(),
                            document.get("type").toString(),
                            document.get("month").toString(),
                            document.get("year").toString(),
                            document.get("cost").toString(),
                            document.get("units").toString(),
                            document.get("totalcost").toString(),
                        }
                    );
                }
            }
        }
        
    }
    
    public void display(int a,int b)
    {
        MongoClient mongo=null;
        
        try
        {   
            mongo=new MongoClient("localhost",27017);
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
        
        DB db=mongo.getDB("AIRCRAFTS");
        
        String[] st=new String[4];
        st[0]="Fighter/defense";
        st[1]="Freight";
        st[2]="Passenger";
        st[3]="Chopper/Helicopter";
        
        if(jTable1.getRowCount()>0)
        {
            for(int i=jTable1.getRowCount()-1 ; i>=0 ; i--)
            {
                model.removeRow(i);
            }
        }
        System.out.println("shelke");
        
        String t,y;
        t=jComboBox1.getSelectedItem().toString();
        y=jComboBox2.getSelectedItem().toString();
        
        BasicDBObject search=new BasicDBObject();
        if (a==0 && b==1)
        {                        
            search.put("year", y);                                   
        }
        
        else if (a==1 && b==0)
        {
            search.put("type", t);                        
        }
        
        else if(a==1 && b==1)
        {
            search.put("year", y);
            search.append("type", t);
        }
        
        for(int i=0;i<4;i++)//difference between DBObject and Basic DBObject
        {
            DBCollection table;
            table=db.getCollection(st[i]);
            
            if (table.findOne()!=null)
            {                
                DBCursor cr=table.find(search);//same as the find() used in the shell
                DBObject document;
            
                while(cr.hasNext())
                {
                    document=cr.next();
                    
                    model.addRow
                    (
                        new Object[]
                        {
                            document.get("model").toString(),
                            document.get("type").toString(),
                            document.get("month").toString(),
                            document.get("year").toString(),
                            document.get("cost").toString(),
                            document.get("units").toString(),
                            document.get("totalcost").toString(),
                        }
                    );
                }
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fighter/defense", "Passenger", "Freight", "Choppper/Helicopter" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Type");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Year");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1)
                                .addComponent(jCheckBox2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        aircrafts a=new aircrafts();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected() && jCheckBox1.isSelected())
        {
            jComboBox2.setEnabled(true);
            display(1,1);
        }
        
        else if(jCheckBox2.isSelected() && !jCheckBox1.isSelected())
        {            
            jComboBox2.setEnabled(true);
            display(0,1);
        }
        
        else if(!jCheckBox2.isSelected())
        {
            jComboBox2.setEnabled(false);
            simple_display();
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected() && jCheckBox2.isSelected())
        {
            jComboBox1.setEnabled(true);
            display(1,1);
        }
        
        else if(jCheckBox1.isSelected() && !jCheckBox2.isSelected())
        {   
            jComboBox1.setEnabled(true);
            display(1,0);
        }
        
        else if(!jCheckBox1.isSelected())
        {
            jComboBox1.setEnabled(false);
            simple_display();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jCheckBox1.isSelected() && jCheckBox2.isSelected())
        {
            jComboBox1.setEnabled(true);
            display(1,1);
        }
        
        else if(jCheckBox1.isSelected() && !jCheckBox2.isSelected())
        {   
            jComboBox1.setEnabled(true);
            display(1,0);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jCheckBox2.isSelected() && jCheckBox1.isSelected())
        {
            jComboBox2.setEnabled(true);
            display(1,1);
        }
        
        else if(jCheckBox2.isSelected() && !jCheckBox1.isSelected())
        {            
            jComboBox2.setEnabled(true);
            display(0,1);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
