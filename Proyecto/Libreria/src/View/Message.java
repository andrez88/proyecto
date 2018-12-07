
package View;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Miguel Bogota
 * @since 30/11/2018
 * @version 1.1
 */
public class Message extends JDialog {
    
    //Variables del objeto
    private JPanel container;
    private JLabel label1;
    private JLabel label2;
    private JButton ok;
    
    //Constructor del objeto
    public Message(Frame parent, boolean modal, String tittle, Color back, Color text, String message1, String message2) {
        //Crear argumentos de color de fondo, titulo y mensaje
        super(parent, modal);
        initComponents(tittle, back, text, message1, message2);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
    
    //Creacion del la ventana
    private void initComponents(String tittle, Color back, Color text, String message1, String message2) {

        container = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        ok = new JButton();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(tittle);
        setResizable(false);

        container.setBackground(back);

        label1.setBackground(back);
        label1.setFont(new Font("Segoe UI", 0, 16));
        label1.setForeground(text);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setText(message1);
        
        label2.setBackground(back);
        label2.setFont(new Font("Segoe UI", 0, 16));
        label2.setForeground(text);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setText(message2);

        ok.setFont(new Font("Segoe UI", 0, 16));
        ok.setForeground(text);
        ok.setText("Aceptar");
        ok.setBorder(new LineBorder(new Color(204, 204, 204), 1, true));
        ok.setContentAreaFilled(false);
        ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ok.setFocusPainted(false);
        ok.setFocusable(true);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                okActionPerformed(e);
            }
        });
        ok.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    dispose();
                }
            }
        });

        GroupLayout containerLayout = new GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(ok, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label1)
                .addGap(0, 0, 0)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
    }
    
    //Accion cuando se precione el boton ok
    private void okActionPerformed(ActionEvent e) {
        dispose();
    }

}
