/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author Creepy
 */
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
public class lista extends javax.swing.JFrame {
    
    //Variables del color
    private Color backDark = new Color(43, 43, 43);
    private Color backLight = new Color(171, 171, 171);
    private Color backInactive = new Color(48, 48, 48);
    
    private Color textLight = new Color(191, 191, 191);
    private Color textActive = new Color(81, 81, 125);
    private Color textError = new Color(142, 59, 59);
   
    

    public lista() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);}
    
           
    private void initComponents() {

        containerMenu = new javax.swing.JPanel();
        saleWrapper = new javax.swing.JPanel();
        saleOption = new javax.swing.JButton();
        saleBorder = new javax.swing.JSeparator();
        invWrapper = new javax.swing.JPanel();
        invOption = new javax.swing.JButton();
        invBorder = new javax.swing.JSeparator();
        invData = new javax.swing.JPanel();
        precioLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        invScroll = new javax.swing.JScrollPane();
        invContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(43, 43, 43));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        containerMenu.setBackground(new java.awt.Color(43, 43, 43));

        saleWrapper.setBackground(new java.awt.Color(43, 43, 43));

        saleOption.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        saleOption.setForeground(new java.awt.Color(81, 81, 125));
        saleOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/cartActive.png"))); // NOI18N
        saleOption.setText("Venta");
        saleOption.setBorder(null);
        saleOption.setBorderPainted(false);
        saleOption.setContentAreaFilled(false);
        saleOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saleOption.setFocusPainted(false);
        saleOption.setFocusable(false);
        saleOption.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        saleOption.setIconTextGap(20);
        saleOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saleWrapperLayout = new javax.swing.GroupLayout(saleWrapper);
        saleWrapper.setLayout(saleWrapperLayout);
        saleWrapperLayout.setHorizontalGroup(
            saleWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleOption, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        saleWrapperLayout.setVerticalGroup(
            saleWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleOption, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        saleBorder.setBackground(new java.awt.Color(43, 43, 43));
        saleBorder.setForeground(new java.awt.Color(43, 43, 43));

        invWrapper.setBackground(new java.awt.Color(48, 48, 48));

        invOption.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        invOption.setForeground(new java.awt.Color(89, 142, 168));
        invOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bookInactive.png"))); // NOI18N
        invOption.setText("Inventario");
        invOption.setBorder(null);
        invOption.setBorderPainted(false);
        invOption.setContentAreaFilled(false);
        invOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invOption.setFocusPainted(false);
        invOption.setFocusable(false);
        invOption.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        invOption.setIconTextGap(20);
        invOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invWrapperLayout = new javax.swing.GroupLayout(invWrapper);
        invWrapper.setLayout(invWrapperLayout);
        invWrapperLayout.setHorizontalGroup(
            invWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invOption, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        invWrapperLayout.setVerticalGroup(
            invWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invWrapperLayout.createSequentialGroup()
                .addComponent(invOption, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        invBorder.setBackground(new java.awt.Color(171, 171, 171));
        invBorder.setForeground(new java.awt.Color(171, 171, 171));

        invData.setBackground(new java.awt.Color(43, 43, 43));
        invData.setForeground(new java.awt.Color(191, 191, 191));

        precioLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        precioLabel.setForeground(new java.awt.Color(191, 191, 191));
        precioLabel.setText("Precio");

        cantidadLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(191, 191, 191));
        cantidadLabel.setText("Cantidad");

        marcaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        marcaLabel.setForeground(new java.awt.Color(191, 191, 191));
        marcaLabel.setText("Marca");

        invScroll.setBorder(null);
        invScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        invScroll.setFocusable(false);
        invScroll.setRequestFocusEnabled(false);

        invContainer.setBackground(new java.awt.Color(43, 43, 43));
        String[] marca = {"ADIDAS", "NIKE", "REEBOK", "PUMA", "LACOSTE", "DC","VANS","OP","ASICS","NEW BALANCE","MIZUNO","SAUONY",
            "BROOKS","UNDER ARMOUR","SKECHERS"};
        String[] precio = {"$160.000","$140.000","$150.000","$140.000","$180.000","$170.000","$180.000","$150.000",
                "$220.000","$180.000","$190.000", "$200.000", "$170.000","$210.000","$190.000"};
        int[] cantidad ={23,15,14,17,8,16,22,10,15,17,11,8,21,13,20};

        lista.setTableHeader(null);
        lista.setBackground(new java.awt.Color(43, 43, 43));
        lista.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lista.setForeground(new java.awt.Color(191, 191, 191));
        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {marca[0],precio[0],cantidad[0]},
                {marca[1],precio[1],cantidad[1]},
                {marca[2], precio[2],cantidad[2]},
                {marca[3],precio[3], cantidad[3]},
                {marca[4],precio[4],cantidad[4]},
                {marca[5], precio[5],cantidad[5]},
                {marca[6], precio[6],cantidad[6]},
                {marca[7], precio[7], cantidad[7]},
                {marca[8], precio[8],cantidad[8]},
                {marca[9],precio[9],cantidad[9]},
                {marca[10], precio[10], cantidad[10]},
                {marca[11], precio[11], cantidad[11]},
                {marca[12], precio[12], cantidad[12]},
                {marca[13], precio[13],cantidad[13]},
                {marca[14],precio[14],cantidad[14]}
            },
           new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista.setMinimumSize(new java.awt.Dimension(55, 160));
        jScrollPane1.setViewportView(lista);
        lista.getAccessibleContext().setAccessibleName("");
        lista.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout invContainerLayout = new javax.swing.GroupLayout(invContainer);
        invContainer.setLayout(invContainerLayout);
        invContainerLayout.setHorizontalGroup(
            invContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invContainerLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        invContainerLayout.setVerticalGroup(
            invContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invContainerLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 267, Short.MAX_VALUE))
        );

        invScroll.setViewportView(invContainer);

        javax.swing.GroupLayout invDataLayout = new javax.swing.GroupLayout(invData);
        invData.setLayout(invDataLayout);
        invDataLayout.setHorizontalGroup(
            invDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invDataLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(marcaLabel)
                .addGap(84, 84, 84)
                .addComponent(precioLabel)
                .addGap(69, 69, 69)
                .addComponent(cantidadLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(invScroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        invDataLayout.setVerticalGroup(
            invDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invDataLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(invDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel)
                    .addComponent(cantidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        invScroll.getVerticalScrollBar().setUnitIncrement(10);

        javax.swing.GroupLayout containerMenuLayout = new javax.swing.GroupLayout(containerMenu);
        containerMenu.setLayout(containerMenuLayout);
        containerMenuLayout.setHorizontalGroup(
            containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerMenuLayout.createSequentialGroup()
                .addGroup(containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saleWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saleBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invWrapper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invBorder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(invData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerMenuLayout.setVerticalGroup(
            containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerMenuLayout.createSequentialGroup()
                .addGroup(containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saleWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saleBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(invData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invData.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void invOptionActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        saleOption.setForeground(new java.awt.Color(109, 189, 115));
        saleOption.setCursor(new Cursor(Cursor.HAND_CURSOR));
        saleOption.setIcon(new ImageIcon(getClass().getResource("/View/cartInactive.png")));
        saleWrapper.setBackground(backInactive);
        saleBorder.setBackground(backLight);
        saleBorder.setForeground(backLight);
        
        invOption.setForeground(textActive);
        invOption.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        invOption.setIcon(new ImageIcon(getClass().getResource("/View/bookActive.png")));
        invWrapper.setBackground(backDark);
        invBorder.setBackground(backDark);
        invBorder.setForeground(backDark);
        
        invData.setVisible(true);
        
    }                                         

    private void saleOptionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        invOption.setForeground(new java.awt.Color(89, 142, 168));
        invOption.setCursor(new Cursor(Cursor.HAND_CURSOR));
        invOption.setIcon(new ImageIcon(getClass().getResource("/View/bookInactive.png")));
        invWrapper.setBackground(backInactive);
        invBorder.setBackground(backLight);
        invBorder.setForeground(backLight);
        
        saleOption.setForeground(textActive);
        saleOption.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        saleOption.setIcon(new ImageIcon(getClass().getResource("/View/cartActive.png")));
        saleWrapper.setBackground(backDark);
        saleBorder.setBackground(backDark);
        saleBorder.setForeground(backDark);
        
        invData.setVisible(false);
        
    }                                          

    // Variables declaration - do not modify                     
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JPanel containerMenu;
    private javax.swing.JSeparator invBorder;
    private javax.swing.JPanel invContainer;
    private javax.swing.JPanel invData;
    private javax.swing.JButton invOption;
    private javax.swing.JScrollPane invScroll;
    private javax.swing.JPanel invWrapper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JSeparator saleBorder;
    private javax.swing.JButton saleOption;
    private javax.swing.JPanel saleWrapper;
    // End of variables declaration                   
}
    

    
