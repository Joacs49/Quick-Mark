/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.TextPrompt;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.FontMetrics;

public class G_Proveedores extends javax.swing.JInternalFrame {

    private TextPrompt placeholder;

    public G_Proveedores() {
        initComponents();

        placeholder = new TextPrompt("Ingrese el elemento a buscar", jTextField1);

        placeholder = new TextPrompt("Ingrese su codigo", Cod);
        placeholder = new TextPrompt("Ingrese su nombre", Des);
        placeholder = new TextPrompt("Ingrese su empresa", Val);
        
        placeholder = new TextPrompt("Selecciona un dato", jTextField2);
        placeholder = new TextPrompt("Ingrese el nuevo dato", jTextField3);
        placeholder = new TextPrompt("Selecciona un dato", jTextField6);

        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel5.setVisible(false);

        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Color color1 = Color.decode("#487BFF");
                Color color2 = Color.decode("#2B4A99");
                Graphics2D G2D = (Graphics2D) g.create();

                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                G2D.setPaint(gp);
                G2D.fillRect(0, 0, getWidth(), getHeight());

                G2D.dispose();
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Color color1 = Color.decode("#3F82FF");
                Color color2 = Color.decode("#6CAFFF");
                Graphics2D g2d = (Graphics2D) g.create();

                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                g2d.setPaint(gp);

                int borderRadius = 40;

                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                g2d.dispose();
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        Mostrar = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        addIMG = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Color color1 = Color.decode("#439BFF");
                Color color2 = Color.decode("#0070F0");
                Graphics2D G2D = (Graphics2D) g.create();

                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                G2D.setPaint(gp);
                G2D.fillRect(0, 0, getWidth(), getHeight());

                G2D.dispose();
            }
        };
        Val = new javax.swing.JTextField();
        Des = new javax.swing.JTextField();
        Cod = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Text3 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                Color color1 = Color.decode("#D9D9D9");
                int borderRadius = 40;
                g2d.setColor(color1);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                Color textColor = new Color(19, 23, 53);
                Font font = new Font("SansSerif", Font.BOLD, 14);
                g2d.setFont(font);
                g2d.setColor(textColor);
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                String text = "Ingrese los Datos";
                FontMetrics fm = g2d.getFontMetrics();
                int widthOfText = fm.stringWidth(text);
                int ascent = fm.getAscent();
                int descent = fm.getDescent();

                int xPosition = (getWidth() - widthOfText) / 2;
                int yPosition = (getHeight() - descent + ascent) / 2;

                g2d.drawString(text, xPosition, yPosition);

                g2d.dispose();
            }
        };
        modifyIMG = new javax.swing.JLabel();
        deleteIMG = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Color color1 = Color.decode("#439BFF");
                Color color2 = Color.decode("#0070F0");
                Graphics2D G2D = (Graphics2D) g.create();

                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                G2D.setPaint(gp);
                G2D.fillRect(0, 0, getWidth(), getHeight());

                G2D.dispose();
            }
        };
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Text1 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                Color color1 = Color.decode("#D9D9D9");
                int borderRadius = 40;
                g2d.setColor(color1);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                Color textColor = new Color(19, 23, 53);
                Font font = new Font("SansSerif", Font.BOLD, 14);
                g2d.setFont(font);
                g2d.setColor(textColor);
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                String text = "Selecciona el campo a modificar de la tabla";
                FontMetrics fm = g2d.getFontMetrics();
                int widthOfText = fm.stringWidth(text);
                int ascent = fm.getAscent();
                int descent = fm.getDescent();

                int xPosition = (getWidth() - widthOfText) / 2;
                int yPosition = (getHeight() - descent + ascent) / 2;

                g2d.drawString(text, xPosition, yPosition);

                g2d.dispose();
            }
        };
        jPanel5 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Color color1 = Color.decode("#439BFF");
                Color color2 = Color.decode("#0070F0");
                Graphics2D G2D = (Graphics2D) g.create();

                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                G2D.setPaint(gp);
                G2D.fillRect(0, 0, getWidth(), getHeight());

                G2D.dispose();
            }
        };
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Text2 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                Color color1 = Color.decode("#D9D9D9");
                int borderRadius = 40;
                g2d.setColor(color1);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                Color textColor = new Color(19, 23, 53);
                Font font = new Font("SansSerif", Font.BOLD, 14);
                g2d.setFont(font);
                g2d.setColor(textColor);
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                String text = "Selecciona el campo a eliminar de la tabla";
                FontMetrics fm = g2d.getFontMetrics();
                int widthOfText = fm.stringWidth(text);
                int ascent = fm.getAscent();
                int descent = fm.getDescent();

                int xPosition = (getWidth() - widthOfText) / 2;
                int yPosition = (getHeight() - descent + ascent) / 2;

                g2d.drawString(text, xPosition, yPosition);

                g2d.dispose();
            }
        };

        setBorder(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE PROVEEDORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 41, 290, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 41, 290, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod_Prov", "Nombre_Prov", "Empresa_Prov"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 222, 610, 360));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 101, 610, 40));

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, 90, 30));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        jPanel1.add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 165, 90, 30));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 165, 90, 30));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 165, 90, 30));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 165, 90, 30));

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 41, 80, 40));

        addIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        addIMG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(addIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 380, 210));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });

        Enviar.setText("Enviar");

        Borrar.setText("Borrar");

        Text3.setBackground(new java.awt.Color(216, 216, 216));
        Text3.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        Text3.setForeground(new java.awt.Color(19, 23, 53));
        Text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text3.setText("text");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Val, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(Cod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enviar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(Des))))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrar)
                    .addComponent(Enviar))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 380, 210));

        modifyIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modify.png"))); // NOI18N
        modifyIMG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(modifyIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 380, 210));

        deleteIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        deleteIMG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(deleteIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 380, 210));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nuevo dato:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dato a modificar:");

        jButton2.setText("Borrar");

        jButton1.setText("Enviar");

        Text1.setBackground(new java.awt.Color(216, 216, 216));
        Text1.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        Text1.setForeground(new java.awt.Color(19, 23, 53));
        Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text1.setText("text");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Text1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, 210));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dato a eliminar:");

        jButton5.setText("Borrar");

        jButton6.setText("Enviar");

        Text2.setBackground(new java.awt.Color(216, 216, 216));
        Text2.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        Text2.setForeground(new java.awt.Color(19, 23, 53));
        Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text2.setText("text");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        desactivar();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        jPanel3.setVisible(true);
        modifyIMG.setVisible(false);
    }//GEN-LAST:event_ModificarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        jPanel2.setVisible(true);
        addIMG.setVisible(false);
    }//GEN-LAST:event_InsertarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        jPanel5.setVisible(true);
        deleteIMG.setVisible(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarActionPerformed

    private void desactivar() {
        jPanel2.setVisible(false);
        addIMG.setVisible(true);
        jPanel3.setVisible(false);
        modifyIMG.setVisible(true);
        jPanel5.setVisible(false);
        deleteIMG.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Cod;
    private javax.swing.JTextField Des;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JTextField Val;
    private javax.swing.JLabel addIMG;
    private javax.swing.JLabel deleteIMG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel modifyIMG;
    // End of variables declaration//GEN-END:variables
}
