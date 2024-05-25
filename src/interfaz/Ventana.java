package interfaz;

import clases.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Ventana extends javax.swing.JFrame {

        Conexion Mysql;
    
    
   
    public Ventana() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);  
        setTitle("Paises, capitales y leguas");
        conectaMysql();
        cargarTabla();
        jButtonAceptarIdioma.setEnabled(false);
        jButtonCancelarIdioma.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JtableTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboContinente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextRegion = new javax.swing.JTextField();
        jTextNombreLocal = new javax.swing.JTextField();
        jTextAnyoIndependencia = new javax.swing.JTextField();
        jTextSuperficie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextExpVida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextHab = new javax.swing.JTextField();
        jTextPnb = new javax.swing.JTextField();
        jTextFormaGobierno = new javax.swing.JTextField();
        jTextCabezaEstado = new javax.swing.JTextField();
        jTextCapital = new javax.swing.JTextField();
        jTextDistrito = new javax.swing.JTextField();
        jTextHabcity = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIdiomas = new javax.swing.JTable();
        jButtonAñadirIdioma = new javax.swing.JButton();
        jButtonEliminarIdioma = new javax.swing.JButton();
        jButtonAceptarIdioma = new javax.swing.JButton();
        jButtonCancelarIdioma = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldTextoLenguaje = new javax.swing.JTextField();
        jCheckBoxIsOficial = new javax.swing.JCheckBox();
        jTextFieldPercent = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Países, capitales y lenguas");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        JtableTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JtableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "CONTINENTE", "REGIÓN"
            }
        ));
        JtableTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JtableTabla.setSelectionBackground(new java.awt.Color(51, 255, 255));
        JtableTabla.setSelectionForeground(new java.awt.Color(0, 255, 204));
        JtableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JtableTabla);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Continente:");

        jComboContinente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Región:");

        jLabel5.setText("Nombre local:");

        jLabel6.setText("Año independencia:");

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DATOS RELEVANTES");

        jLabel8.setText("Superficie:");

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("ECONOMÍA Y POBLACIÓN");

        jLabel10.setText("Expectativa de vida:");

        jLabel11.setText("Habitantes:");

        jLabel12.setText("PNB (M$):");

        jLabel13.setText("Forma de Gobierno:");

        jLabel14.setText("Cabeza del Estado:");

        jLabel15.setText("Capital:");

        jLabel16.setText("Distrito:");

        jLabel17.setText("Habitantes:");

        jTextPnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPnbActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("LENGUAS HABLADAS");

        jTableIdiomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "LENGUA", "OFICIAL", "%"
            }
        ));
        jTableIdiomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIdiomasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableIdiomas);

        jButtonAñadirIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/mas.png"))); // NOI18N
        jButtonAñadirIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirIdiomaActionPerformed(evt);
            }
        });

        jButtonEliminarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/menos.png"))); // NOI18N

        jButtonAceptarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/comprobado.png"))); // NOI18N
        jButtonAceptarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarIdiomaActionPerformed(evt);
            }
        });

        jButtonCancelarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/cruzar.png"))); // NOI18N
        jButtonCancelarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarIdiomaActionPerformed(evt);
            }
        });

        jLabel19.setText("Lengua:");

        jTextFieldTextoLenguaje.setText("jTextField15");

        jCheckBoxIsOficial.setText("Oficial");

        jTextFieldPercent.setText("jTextField16");

        jLabel20.setText("%:");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/anadir.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/contrato.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/hoja-de-papel.png"))); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/dinero.png"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/cruzar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombreLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jTextAnyoIndependencia)
                                    .addComponent(jTextSuperficie)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboContinente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextNombre)
                                                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(69, 69, 69)
                                .addComponent(jTextDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(50, 50, 50)
                                .addComponent(jTextHab, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextExpVida))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(56, 56, 56)
                                .addComponent(jTextPnb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(50, 50, 50)
                                .addComponent(jTextHabcity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextCabezaEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFormaGobierno, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(70, 70, 70)
                                .addComponent(jTextCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 104, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldTextoLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxIsOficial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAceptarIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(jButtonAñadirIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEliminarIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCancelarIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addGap(12, 12, 12)
                        .addComponent(jButton8)
                        .addGap(15, 15, 15)
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextExpVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextPnb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextFormaGobierno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextCabezaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jTextDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextHabcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(jTextFieldTextoLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxIsOficial)
                                            .addComponent(jTextFieldPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jButtonAñadirIdioma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEliminarIdioma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAceptarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCancelarIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)))))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextNombreLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextAnyoIndependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jButtonCancelarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarIdiomaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        desconectaMysql();
    }//GEN-LAST:event_formWindowClosed

    private void JtableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableTablaMouseClicked
        // Al pulsar sobre uno de la tabla
 
        Object idPais = JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0);
        
        Mysql.ejecutarConsulta("SELECT country.Code, country.Name, country.Continent, country.Region, country.LocalName, country.IndepYear, country.SurfaceArea FROM country WHERE Code = '" + JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0)+"'");
        
        ResultSet datos = Mysql.getResultSet();
            try { 
                cargarContinentes();
                datos.next();
                jTextCodigo.setText(datos.getString(1));
                jTextNombre.setText(datos.getString(2));
                jComboContinente.setSelectedItem(datos.getString(3));
                jTextRegion.setText(datos.getString(4));
                jTextNombreLocal.setText(datos.getString(5));
                jTextAnyoIndependencia.setText(datos.getString(6));
                jTextSuperficie.setText(datos.getString(7));
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }   
       
            
        Mysql.ejecutarConsulta("SELECT country.LifeExpectancy, country.Population, country.GNP, country.GovernmentForm, country.HeadOfState, city.Name, city.District, city.Population FROM country JOIN city ON country.Capital = city.ID WHERE country.Code = '" + JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0)+"'");
        
        ResultSet datos2 = Mysql.getResultSet();
            try { 
                
                datos2.next();
                jTextExpVida.setText(datos2.getString(1));
                jTextHab.setText(datos2.getString(2));
                jTextPnb.setText(datos2.getString(3));
                jTextFormaGobierno.setText(datos2.getString(4));
                jTextCabezaEstado.setText(datos2.getString(5));
                jTextCapital.setText(datos2.getString(6));
                jTextDistrito.setText(datos2.getString(7));
                jTextHabcity.setText(datos2.getString(8));
               
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }   
            
            
           cargarTablaLenguas(idPais);
            
            
       
        
    }//GEN-LAST:event_JtableTablaMouseClicked

    private void jTextPnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPnbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPnbActionPerformed

    private void jButtonAñadirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirIdiomaActionPerformed
        //Al pulsar a añadir
        jButtonAceptarIdioma.setEnabled(true);
        jButtonCancelarIdioma.setEnabled(true);
        
        // cargando datos abajo.
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonAñadirIdiomaActionPerformed

    private void jTableIdiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIdiomasMouseClicked
       jTextFieldTextoLenguaje.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0));
       String valorString = (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),1);
       Boolean valorBoolean = valorString.equalsIgnoreCase("T");
       jCheckBoxIsOficial.setSelected(valorBoolean);
       jTextFieldPercent.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),2));
    }//GEN-LAST:event_jTableIdiomasMouseClicked

    private void jButtonAceptarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarIdiomaActionPerformed
            try {
                //al confirmar el update
                
                System.out.println(Mysql.actualizarValores("UPDATE countrylanguage SET Language = '" + jTextFieldTextoLenguaje.getText() +
                        "', isOfficial = '" + jCheckBoxIsOficial +
                        "', Percentage = " + jTextFieldPercent.getText() +
                        " WHERE CountryCode = '" + (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0) + "'")); 
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonAceptarIdiomaActionPerformed

    public void cargarContinentes(){
    
         jComboContinente.removeAllItems();
        Mysql.ejecutarConsulta("SELECT distinct continent FROM country");
         ResultSet resultSet = Mysql.getResultSet();
         
            try {
                while (resultSet.next()) {
                   jComboContinente.addItem(resultSet.getString(1));
                }   } catch (SQLException ex) {
                System.out.println(ex);
            }
    
    }
    
   public void conectaMysql(){
        Mysql = new Conexion("com.mysql.cj.jdbc.Driver","mysql","localhost", "3306","world", "root", "inca.2024");
   }
   
    private void desconectaMysql(){
        Mysql.cierraConexion(); 
    }
    
    public List<Object[]> convertirResultSetALista(ResultSet rs) {
    List<Object[]> resultados = new ArrayList<>();
    try {
        while (rs.next()) {
            Object[] row = new Object[rs.getMetaData().getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getObject(i + 1);
            }
            resultados.add(row);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return resultados;
}
   
    
 
    public void cargarTabla() {

        
        try {
            Mysql.ejecutarConsulta("SELECT COUNTRY.CODE, COUNTRY.NAME, COUNTRY.CONTINENT, COUNTRY.REGION FROM COUNTRY");
             List<Object[]> resultados = convertirResultSetALista(Mysql.getResultSet());

    if (!resultados.isEmpty()) {
        ModeloTabla tablaMia = new ModeloTabla();
        int numPaises = resultados.size();

        System.out.println(numPaises);

        String[][] paisData = new String[numPaises][4];
        String[] columnNames = {"Código", "Nombre", "Continente", "Región"}; 

        for (int i = 0; i < numPaises; i++) {
            Object[] pais = resultados.get(i);
            paisData[i][0] = (String) pais[0];
            paisData[i][1] = (String) pais[1];
            paisData[i][2] = (String) pais[2];
            paisData[i][3] = (String) pais[3];
        }
        tablaMia.setData(paisData, columnNames); 
        JtableTabla.setModel(tablaMia);
        }
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
 
}
    
    public void cargarTablaLenguas(Object idPais) {

        
        try {
            
            Mysql.ejecutarConsulta("SELECT Language, isOfficial, Percentage FROM countrylanguage WHERE CountryCode like '"+idPais+"'");
             List<Object[]> resultados2 = convertirResultSetALista(Mysql.getResultSet());

    if (!resultados2.isEmpty()) {
        ModeloTabla tablaMia2 = new ModeloTabla();
        int numLenguas = resultados2.size();

        System.out.println(numLenguas);

        String[][] paisData = new String[numLenguas][4];
        String[] columnNames = {"LENGUA", "OFICIAL", "%"}; 

        for (int i = 0; i < numLenguas; i++) {
            Object[] paisidiomas = resultados2.get(i);
            paisData[i][0] = paisidiomas[0].toString();
            paisData[i][1] = paisidiomas[1].toString();
            paisData[i][2] = paisidiomas[2] .toString();
        }
        tablaMia2.setData(paisData, columnNames); 
        jTableIdiomas.setModel(tablaMia2);
        }
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
        
        
        
        
       
   
}
    
    
    
 
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableTabla;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAceptarIdioma;
    private javax.swing.JButton jButtonAñadirIdioma;
    private javax.swing.JButton jButtonCancelarIdioma;
    private javax.swing.JButton jButtonEliminarIdioma;
    private javax.swing.JCheckBox jCheckBoxIsOficial;
    private javax.swing.JComboBox<String> jComboContinente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableIdiomas;
    private javax.swing.JTextField jTextAnyoIndependencia;
    private javax.swing.JTextField jTextCabezaEstado;
    private javax.swing.JTextField jTextCapital;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDistrito;
    private javax.swing.JTextField jTextExpVida;
    private javax.swing.JTextField jTextFieldPercent;
    private javax.swing.JTextField jTextFieldTextoLenguaje;
    private javax.swing.JTextField jTextFormaGobierno;
    private javax.swing.JTextField jTextHab;
    private javax.swing.JTextField jTextHabcity;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombreLocal;
    private javax.swing.JTextField jTextPnb;
    private javax.swing.JTextField jTextRegion;
    private javax.swing.JTextField jTextSuperficie;
    // End of variables declaration//GEN-END:variables
}
