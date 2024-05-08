/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.controladorPrincipal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
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
        }
        ;
        jLabel12 = new javax.swing.JLabel(){
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

                Date currentDate = new Date();

                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                String timeString = timeFormat.format(currentDate);

                String fullText = "Hora: " + timeString;

                FontMetrics fm = g2d.getFontMetrics();
                int widthOfText = fm.stringWidth(fullText);
                int ascent = fm.getAscent();
                int descent = fm.getDescent();

                int xPosition = (getWidth() - widthOfText) / 2;
                int yPosition = (getHeight() - descent + ascent) / 2;

                g2d.drawString(fullText, xPosition, yPosition);

                g2d.dispose();
            }
        };
        jLabel11 = new javax.swing.JLabel(){
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

                Date currentDate = new Date();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String dateString = dateFormat.format(currentDate);

                String fullText = "Fecha: " + dateString ;

                FontMetrics fm = g2d.getFontMetrics();
                int widthOfText = fm.stringWidth(fullText);
                int ascent = fm.getAscent();
                int descent = fm.getDescent();

                int xPosition = (getWidth() - widthOfText) / 2;
                int yPosition = (getHeight() - descent + ascent) / 2;

                g2d.drawString(fullText, xPosition, yPosition);

                g2d.dispose();
            }
        };
        jLabel4 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                Color color1 = Color.decode("#D9D9D9");
                int borderRadius = 40;
                g2d.setColor(color1);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                Color textColor = new Color(19, 23, 53);
                Font font = new Font("SansSerif", Font.BOLD, 62);
                g2d.setFont(font);
                g2d.setColor(textColor);
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                String text = "Quick Mark";
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                Color color1 = Color.decode("#D9D9D9");
                int borderRadius = 40;
                g2d.setColor(color1);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

                Color textColor = new Color(19, 23, 53);
                Font font = new Font("SansSerif", Font.BOLD, 18);
                g2d.setFont(font);
                g2d.setColor(textColor);
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                String text = "<html><div align = 'justify'>"
                + "Quick Mark es una empresa especializada en ofrecer "
                + "soluciones eficientes y precisas para la gestión de productos. "
                + "Su enfoque se centra en proporcionar servicios ágiles y de alta calidad, "
                + "asegurando la confianza y satisfacción de sus clientes."
                + "</div></html>";

                JLabel label = new JLabel(text);
                label.setFont(new Font("SansSerif", Font.BOLD, 18));
                label.setForeground(new Color(19, 23, 53));
                label.setBounds(20, 20, getWidth() - 40, getHeight() - 40);
                label.setVerticalAlignment(JLabel.TOP);
                label.setHorizontalAlignment(JLabel.CENTER);

                add(label);

                g2d.dispose();
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Proveedores = new javax.swing.JButton(){

            ImageIcon icon = new ImageIcon("src/Imagenes/proveedores.png");

            {
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        activo[0] = false;
                        activo[1] = false;
                        activo[2] = false;
                        activo[3] = true;
                        Inicio.repaint();
                        Inventario.repaint();
                        Pedidos.repaint();
                        Proveedores.repaint();
                    }
                });
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D G2D = (Graphics2D) g.create();

                if(activo[3] == false){
                    Color color1 = Color.decode("#FFFFFF");
                    Color color2 = Color.decode("#FFFFFF");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Proveedores";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 175;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);
                }

                if(activo[3] == true){

                    Color color1 = Color.decode("#487BFF");
                    Color color2 = Color.decode("#2B4A99");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Proveedores";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 175;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);

                }

                G2D.dispose();
            }
        };
        Pedidos = new javax.swing.JButton(){

            ImageIcon icon = new ImageIcon("src/Imagenes/pedidos.png");

            {
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        activo[0] = false;
                        activo[1] = false;
                        activo[2] = true;
                        activo[3] = false;
                        Inicio.repaint();
                        Inventario.repaint();
                        Pedidos.repaint();
                        Proveedores.repaint();
                    }
                });
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D G2D = (Graphics2D) g.create();

                if(activo[2] == false){
                    Color color1 = Color.decode("#FFFFFF");
                    Color color2 = Color.decode("#FFFFFF");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Pedidos";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 140;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);
                }

                if(activo[2] == true){

                    Color color1 = Color.decode("#487BFF");
                    Color color2 = Color.decode("#2B4A99");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Pedidos";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 140;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);

                }

                G2D.dispose();
            }
        };
        Inventario = new javax.swing.JButton(){

            ImageIcon icon = new ImageIcon("src/Imagenes/Shop.png");

            {
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        activo[0] = false;
                        activo[1] = true;
                        activo[2] = false;
                        activo[3] = false;
                        Inicio.repaint();
                        Inventario.repaint();
                        Pedidos.repaint();
                        Proveedores.repaint();
                    }
                });
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D G2D = (Graphics2D) g.create();

                if(activo[1] == false){
                    Color color1 = Color.decode("#FFFFFF");
                    Color color2 = Color.decode("#FFFFFF");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Inventario";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 155;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);
                }

                if(activo[1] == true){

                    Color color1 = Color.decode("#487BFF");
                    Color color2 = Color.decode("#2B4A99");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Gestion de Inventario";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 155;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);

                }

                G2D.dispose();
            }
        };
        Inicio = new javax.swing.JButton(){

            ImageIcon icon = new ImageIcon("src/Imagenes/cuadrados.png");

            {
                activo[0] = true;
            }

            {
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        activo[0] = true;
                        activo[1] = false;
                        activo[2] = false;
                        activo[3] = false;
                        Inicio.repaint();
                        Inventario.repaint();
                        Pedidos.repaint();
                        Proveedores.repaint();
                    }
                });
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D G2D = (Graphics2D) g.create();

                if(activo[0] == false){
                    Color color1 = Color.decode("#FFFFFF");
                    Color color2 = Color.decode("#FFFFFF");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Inicio";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 33;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);
                }

                if(activo[0] == true){

                    Color color1 = Color.decode("#487BFF");
                    Color color2 = Color.decode("#2B4A99");

                    GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                    G2D.setPaint(gp);
                    G2D.fillRect(0, 0, getWidth(), getHeight());

                    String texto = "Inicio";

                    g.setColor(Color.BLACK);
                    Font font = new Font("SansSerif",Font.BOLD , 16);
                    g.setFont(font);

                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int textoWidth = metrics.stringWidth(texto);

                    int x = ((getWidth() - metrics.stringWidth(texto)) / 2) + 20;
                    int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(texto, x, y);

                    Image image = icon.getImage();
                    int imageX = textoWidth - 33;
                    int imageY = (getHeight() - icon.getIconHeight()) / 2;
                    g.drawImage(image, imageX, imageY, null);
                }

                G2D.dispose();

            }
        };
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(216, 216, 216));
        jLabel12.setFont(new java.awt.Font("SansSerif", 3, 62)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(19, 23, 53));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Text");

        jLabel11.setBackground(new java.awt.Color(216, 216, 216));
        jLabel11.setFont(new java.awt.Font("SansSerif", 3, 62)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 23, 53));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Text");

        jLabel4.setBackground(new java.awt.Color(216, 216, 216));
        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 62)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 23, 53));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quick Mark");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circular_Logo.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(216, 216, 216));
        jLabel10.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 23, 53));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Text");

        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 630));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 23, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quick Mark");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 50));

        jLabel5.setBackground(new java.awt.Color(225, 233, 243));
        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 233, 243));
        jLabel5.setText("________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 23, 55));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 23, 55));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("...");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, 20));

        Proveedores.setBackground(new java.awt.Color(255, 255, 255));
        Proveedores.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        Proveedores.setText("Gestion de Proveedores");
        Proveedores.setToolTipText("");
        Proveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 230, 40));

        Pedidos.setBackground(new java.awt.Color(255, 255, 255));
        Pedidos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedidos.png"))); // NOI18N
        Pedidos.setText("Gestion de Pedidos");
        Pedidos.setToolTipText("");
        Pedidos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        jPanel1.add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 40));

        Inventario.setBackground(new java.awt.Color(255, 255, 255));
        Inventario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shop.png"))); // NOI18N
        Inventario.setText("Gestion de Inventario");
        Inventario.setToolTipText("");
        Inventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });
        jPanel1.add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 40));

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadrados.png"))); // NOI18N
        Inicio.setText("   Inicio");
        Inicio.setToolTipText("");
        Inicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jLabel8.setText("   Cerrar Sesion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        
    }//GEN-LAST:event_InventarioActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
      
    }//GEN-LAST:event_PedidosActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
        
    }//GEN-LAST:event_ProveedoresActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        
    }//GEN-LAST:event_InicioActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Inicio;
    public boolean activo[] = new boolean[4];
    public javax.swing.JButton Inventario;
    public javax.swing.JButton Pedidos;
    public javax.swing.JButton Proveedores;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
