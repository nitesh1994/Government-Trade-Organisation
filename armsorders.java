package govt_import_export;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import javax.swing.table.DefaultTableModel;

public class armsorders extends javax.swing.JFrame
{
    DefaultTableModel model;
    
    public armsorders()
    {
        initComponents();
        
        model=new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Model");
        model.addColumn("Unit Cost");
        model.addColumn("Month");
        model.addColumn("Year");
        model.addColumn("Units");
        model.addColumn("Country");
        model.addColumn("Total Cost");
        
        
        MongoClient mongo=null;
        
        try
        {   
            mongo=new MongoClient("localhost",27017);
        }
        
        catch(UnknownHostException | MongoException e)
        {

        }
        
        DB db=mongo.getDB("ARMS");
        DBCollection coll=db.getCollection("ARMS1");
        
        if(coll.findOne()!=null)
        {
            DBCursor c=coll.find();//same as find() in shell
            DBObject document;
            
            while(c.hasNext())
            {
                document=c.next();
                /*
                TA.setText
                (
                        TA.getText() +
                        " Model: "+(document.get("model").toString()) +
                        " Cost: "+(document.get("cost").toString()) +
                        " Month: "+(document.get("month").toString()) +
                        " Year: "+(document.get("year").toString()) +
                        " Units: "+(document.get("units").toString()) +
                        " Country: "+(document.get("country").toString()) +
                        " Total cost: "+(document.get("totalcost").toString()) + "\n"
                );
                */        
                model.addRow
                (
                    new Object[]
                    {
                        document.get("model").toString(),
                        document.get("cost").toString(),
                        document.get("month").toString(),
                        document.get("year").toString(),
                        document.get("units").toString(),
                        document.get("country").toString(),
                        document.get("totalcost").toString(),
                    }
                );
                
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        arms a=new arms();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
