package govt_import_export;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
import static govt_import_export.admin_home.zzz;



public class aircrafts extends javax.swing.JFrame 
{
    
    String make_model_selected;
    String type_selected;
    
    public aircrafts()
    {
        initComponents();
        groupButton();
        //System.out.println(zzz);      
        make_model.setEnabled(false);
        proceed.setEnabled(false);

    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        make_model = new javax.swing.JComboBox();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("aircrafts");
        setBounds(new java.awt.Rectangle(0, 0, 951, 501));

        jLabel1.setText("Aircraft import");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Specifications"));

        jLabel2.setText("Type:");

        jLabel3.setText("Make-model:");

        make_model.setMaximumRowCount(16);
        make_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                make_modelMouseClicked(evt);
            }
        });
        make_model.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                make_modelItemStateChanged(evt);
            }
        });
        make_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                make_modelActionPerformed(evt);
            }
        });

        rb1.setText("Fighter/defense");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.setText("Passenger");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb3.setText("Freight");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        rb4.setText("Chopper/Helicopter");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        jButton2.setText("View all placed orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Show top exports");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3)
                    .addComponent(make_model, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb4))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proceed)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(make_model, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(proceed)
                    .addComponent(jButton2))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void groupButton()
    {
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        bg1.add(rb4);
    }
    
    private void sort_aircrafts()
    {
        MongoClient mongo=null;
        
        try
        {
            mongo=new MongoClient("localhost",27017);
        }
        
        catch(UnknownHostException | MongoException e)
        {
            
        }
        
        String[] st=new String[4];
        st[0]="Fighter/defense";
        st[1]="Passenger";
        st[2]="Freight";
        st[3]="Chopper/Helicopter";
        
            DB db=mongo.getDB("AIRCRAFTS");
            DBCollection table;
             
            ArrayList<Order> arr=new ArrayList<Order>();
            
            for(int j=0;j<4;j++)
            {
                table=db.getCollection(st[j]);
              
                if(table.findOne()!=null)
                {
                    String map ="function () {"+
                    "emit(this.model,this.units);"+
                    "}";
                    
                    String reduce;
                    reduce = "function (key,value) { "+
                    "return Array.sum(value)}";
 
                    MapReduceCommand cmd = new MapReduceCommand(table, map, reduce,
                    null, MapReduceCommand.OutputType.INLINE, null);
 
                    MapReduceOutput out = table.mapReduce(cmd);
                    String str;
    
                    for(DBObject o : out.results())
                    {
                        str=o.get("value").toString().trim();
                        System.out.println(str);
                        int i = 0;
       
                        if(!str.equals(null))
                        {
                            Float f=Float.parseFloat(str);
                            i=(int)Math.ceil(f);
                            arr.add(new Order(o.get("_id").toString(),i)
                            {
        
                                public int compare(Order o1, Order o2)
                                {
                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                }

                                public int compareTo(Order o)
                                {
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
            topaircrafts ta=new topaircrafts(arr);
            ta.setVisible(true);
            
            
            
    }
    
    private void make_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_modelActionPerformed
        if (rb1.isSelected())
            type_selected="Fighter/defense";
        
        if (rb2.isSelected())
            type_selected="Passenger";
        
        if (rb3.isSelected())
            type_selected="Freight";
        
        if (rb4.isSelected())
            type_selected="Chopper/Helicopter";
        
        make_model_selected=(String)make_model.getSelectedItem();        
        //System.out.println("item is " +make_model_selected);
        
        proceed.setEnabled(true);
    }//GEN-LAST:event_make_modelActionPerformed

    private void make_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_make_modelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_make_modelMouseClicked

    private void make_modelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_make_modelItemStateChanged
        
    }//GEN-LAST:event_make_modelItemStateChanged

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        make_model.setEnabled(true);
        make_model.removeAllItems();
        make_model.addItem("Sukhoi Su-30MKI");
        make_model.addItem("Mikoyan MiG-29");
        make_model.addItem("Dassault Mirage 2000");
        make_model.addItem("SEPECAT Jaguar");
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        make_model.setEnabled(true);
        make_model.removeAllItems();
        make_model.addItem("Boeing 737");
        make_model.addItem("Boeing 767");
        make_model.addItem("Boeing 777");
        make_model.addItem("Airbus a320");
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        make_model.setEnabled(true);
        make_model.removeAllItems();
        make_model.addItem("Boeing C-17 Globemaster");
        make_model.addItem("Ilyushin Il-76 Candid");
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        make_model.setEnabled(true);
        make_model.removeAllItems();
        make_model.addItem("Mil Mi-35 Hind-E");
        make_model.addItem("AgustaWestland AW101");
    }//GEN-LAST:event_rb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        admin_home ah=new admin_home();
        ah.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        this.dispose();
        aircrafts2 a2=new aircrafts2(make_model_selected,type_selected);
        a2.setVisible(true);
    }//GEN-LAST:event_proceedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        aircraftsallorders ao=new aircraftsallorders();
        ao.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sort_aircrafts();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox make_model;
    private javax.swing.JButton proceed;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables
}


