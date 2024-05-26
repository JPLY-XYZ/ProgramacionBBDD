package interfaz;

import clases.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class Ventana extends javax.swing.JFrame {

        Conexion Mysql;
        Object idPaisSelected;
    
   
    public Ventana() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);  
        setTitle("Paises, capitales y leguas");
        conectaMysql();
        cargarTabla();
        jButtonAceptarIdioma.setEnabled(false);
        jButtonCancelarIdioma.setEnabled(false);
        //JtableTabla.setDefaultRenderer(columnClass, renderer); cambiar el color de la tabla
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
        jButtonAñadirPais = new javax.swing.JButton();
        jButtonModifi = new javax.swing.JButton();
        jButtonEliminarPais = new javax.swing.JButton();
        jButtonGuardarPais = new javax.swing.JButton();
        jButtonCancelarPais = new javax.swing.JButton();

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
        JtableTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JtableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JtableTabla);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Continente:");

        jComboContinente.setEnabled(false);

        jLabel4.setText("Región:");

        jLabel5.setText("Nombre local:");

        jLabel6.setText("Año independencia:");

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DATOS RELEVANTES");

        jLabel8.setText("Superficie:");

        jTextCodigo.setEnabled(false);

        jTextNombre.setEnabled(false);

        jTextRegion.setEnabled(false);

        jTextNombreLocal.setEnabled(false);

        jTextAnyoIndependencia.setEnabled(false);

        jTextSuperficie.setEnabled(false);

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

        jTextExpVida.setEnabled(false);

        jLabel17.setText("Habitantes:");

        jTextHab.setEnabled(false);

        jTextPnb.setEnabled(false);

        jTextFormaGobierno.setEnabled(false);

        jTextCabezaEstado.setEnabled(false);

        jTextCapital.setEnabled(false);

        jTextDistrito.setEnabled(false);

        jTextHabcity.setEnabled(false);

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
        jTableIdiomas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableIdiomas.setEnabled(false);
        jTableIdiomas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableIdiomas);

        jButtonAñadirIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/mas.png"))); // NOI18N
        jButtonAñadirIdioma.setEnabled(false);
        jButtonAñadirIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirIdiomaActionPerformed(evt);
            }
        });

        jButtonEliminarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/menos.png"))); // NOI18N
        jButtonEliminarIdioma.setEnabled(false);
        jButtonEliminarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarIdiomaActionPerformed(evt);
            }
        });

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

        jTextFieldTextoLenguaje.setEnabled(false);

        jCheckBoxIsOficial.setText("Oficial");
        jCheckBoxIsOficial.setEnabled(false);

        jTextFieldPercent.setEnabled(false);

        jLabel20.setText("%:");

        jButtonAñadirPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/anadir.png"))); // NOI18N
        jButtonAñadirPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirPaisActionPerformed(evt);
            }
        });

        jButtonModifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/contrato.png"))); // NOI18N
        jButtonModifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifiActionPerformed(evt);
            }
        });

        jButtonEliminarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/hoja-de-papel.png"))); // NOI18N
        jButtonEliminarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPaisActionPerformed(evt);
            }
        });

        jButtonGuardarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/dinero.png"))); // NOI18N
        jButtonGuardarPais.setEnabled(false);
        jButtonGuardarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPaisActionPerformed(evt);
            }
        });

        jButtonCancelarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/cruzar.png"))); // NOI18N
        jButtonCancelarPais.setEnabled(false);

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
                        .addComponent(jButtonAñadirPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModifi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarPais)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonGuardarPais)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonCancelarPais)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminarPais)
                    .addComponent(jButtonGuardarPais)
                    .addComponent(jButtonCancelarPais, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAñadirPais)
                        .addComponent(jButtonModifi)))
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

    private void jButtonCancelarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarIdiomaActionPerformed
        // Cancelando accion de seleccion de una en la tabla
        jTextFieldTextoLenguaje.setText("");
        jCheckBoxIsOficial.setSelected(false);
        jTextFieldPercent.setText("");
      
        //Poenemos el edit del idioma a false
        jButtonAceptarIdioma.setEnabled(false);
        jButtonCancelarIdioma.setEnabled(false);
        jTextFieldTextoLenguaje.setEnabled(false);
        jCheckBoxIsOficial.setEnabled(false);
        jTextFieldPercent.setEnabled(false);
        cargarTablaLenguas(idPaisSelected);
        
    }//GEN-LAST:event_jButtonCancelarIdiomaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        desconectaMysql();
    }//GEN-LAST:event_formWindowClosed

    private void JtableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableTablaMouseClicked
        // Al pulsar sobre uno de la tabla
 
        idPaisSelected = JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0);
        
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
            
            
           cargarTablaLenguas(idPaisSelected);
            
            
       
        
    }//GEN-LAST:event_JtableTablaMouseClicked

    private void jButtonAñadirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirIdiomaActionPerformed
        
         if (jTableIdiomas.getSelectedRow() != -1) {
            cargarEnPantallaDatosIdioma();
            jButtonAceptarIdioma.setEnabled(true);
            jButtonCancelarIdioma.setEnabled(true);
            jTextFieldTextoLenguaje.setEnabled(true);
            jCheckBoxIsOficial.setEnabled(true);
            jTextFieldPercent.setEnabled(true);
        } else {
         
            jButtonAceptarIdioma.setEnabled(true);
            jButtonCancelarIdioma.setEnabled(true);
            jTextFieldTextoLenguaje.setEnabled(true);
            jCheckBoxIsOficial.setEnabled(true);
            jTextFieldPercent.setEnabled(true);
         
         }
//Al pulsar a añadir
        
        
        // cargando datos abajo.
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonAñadirIdiomaActionPerformed

    private void cargarEnPantallaDatosIdioma (){
        
        System.out.println("cargando datos de idioma: "+ jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0));
        
        jTextFieldTextoLenguaje.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0));
        String valorString = (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),1);
        Boolean valorBoolean = valorString.equalsIgnoreCase("T");
        jCheckBoxIsOficial.setSelected(valorBoolean);
        jTextFieldPercent.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),2));
      
        //Poenemos el edit del idioma a false
        jButtonAceptarIdioma.setEnabled(false);
        jButtonCancelarIdioma.setEnabled(false);
        jTextFieldTextoLenguaje.setEnabled(false);
        jCheckBoxIsOficial.setEnabled(false);
        jTextFieldPercent.setEnabled(false);
    }
    
    private void jButtonAceptarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarIdiomaActionPerformed
        //Seteamos los valores de los textos que hay en pantala justo debajo de la tabla
        String nuevoIdioma =  jTextFieldTextoLenguaje.getText();
        String esOficial = jCheckBoxIsOficial.isSelected() ? "T" : "F";
        Double aPercent;
        if (jTextFieldPercent.getText().isEmpty()) {
        aPercent = 0.0;
        }else {
        aPercent = Double.parseDouble(jTextFieldPercent.getText());
        }
        
         if (jTableIdiomas.getSelectedRow() != -1) {
            try {
                    JOptionPane.showMessageDialog(null, "Idioma actualizado correctamente");
                    //al confirmar el update
                    String idiomaAntesDeUpdate= (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0);
                    String updateQuery = "UPDATE countrylanguage SET Language = '" + nuevoIdioma + "', isOfficial = '" + esOficial + "', Percentage = " + aPercent + " WHERE Language = '" + idiomaAntesDeUpdate + "' and countrycode = '"+idPaisSelected+"'";
                    System.out.println(updateQuery);
                    System.out.println(Mysql.actualizarValores(updateQuery) + updateQuery); 
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cargarTablaLenguas(idPaisSelected);
            jTextFieldTextoLenguaje.setText("");
            jCheckBoxIsOficial.setSelected(false);
            jTextFieldPercent.setText("");

            //Poenemos el edit del idioma a false
            jButtonAceptarIdioma.setEnabled(false);
            jButtonCancelarIdioma.setEnabled(false);
            jTextFieldTextoLenguaje.setEnabled(false);
            jCheckBoxIsOficial.setEnabled(false);
            jTextFieldPercent.setEnabled(false);
        }else{
            try {
                JOptionPane.showMessageDialog(null, "Nuevo idioma añadido");
                System.out.println(aPercent);
                String insertinSentence = "INSERT INTO countrylanguage (CountryCode, Language, IsOfficial, Percentage) VALUES ('" + idPaisSelected + "', '" + nuevoIdioma + "', '" + esOficial.toString() + "', " + aPercent + ")";
                System.out.println(insertinSentence);
                Mysql.insertarRegistro("INSERT INTO countrylanguage (CountryCode, Language, IsOfficial, Percentage) VALUES ('" + idPaisSelected + "', '" + nuevoIdioma + "', '" + esOficial.toString() + "', " + aPercent + ")");
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            cargarTablaLenguas(idPaisSelected);
        
            jTextFieldTextoLenguaje.setText("");
            jCheckBoxIsOficial.setSelected(false);
            jTextFieldPercent.setText("");

            //Poenemos el edit del idioma a false
            jButtonAceptarIdioma.setEnabled(false);
            jButtonCancelarIdioma.setEnabled(false);
            jTextFieldTextoLenguaje.setEnabled(false);
            jCheckBoxIsOficial.setEnabled(false);
            jTextFieldPercent.setEnabled(false);
         
        }
    }//GEN-LAST:event_jButtonAceptarIdiomaActionPerformed

    private void jButtonAñadirPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirPaisActionPerformed
        // Añadir nuevo Pais
        //activamos la edicion en la parte de los datos
        cargarTabla();
        jButtonCancelarPais.setEnabled(true);
        jButtonGuardarPais.setEnabled(true);
        limpiarFormulario(true);
        cargarContinentes();  
    }//GEN-LAST:event_jButtonAñadirPaisActionPerformed

    private void jButtonEliminarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarIdiomaActionPerformed
        // Eliminar un idioma de la base de datos
        if (jTableIdiomas.getSelectedRow() != -1) {
        String deleteQuery ="DELETE FROM countrylanguage WHERE Language = '" + (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0) + "' and countrycode = '"+idPaisSelected+"'";

        try {
                System.out.println(Mysql.eliminarRegistros(deleteQuery) + deleteQuery);
                cargarTablaLenguas(idPaisSelected);
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonEliminarIdiomaActionPerformed

    private void jButtonModifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifiActionPerformed
        // Modificar datos de un pais
        if (JtableTabla.getSelectedRow() != -1) {
            jButtonCancelarPais.setEnabled(true);
            jButtonGuardarPais.setEnabled(true);
            permitirEdicionFormulario(true);
        } 
    }//GEN-LAST:event_jButtonModifiActionPerformed

    private void jButtonGuardarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPaisActionPerformed
       // Añadimos un nuevo registro a la base de datos
       
       if (JtableTabla.getSelectedRow() != -1) { 
           
           // Obtener los valores de los campos de texto y convertirlos a números si es necesario
            String superficie = jTextSuperficie.getText().isEmpty() ? "0" : jTextSuperficie.getText();
            String expVida = jTextExpVida.getText().isEmpty() ? "0" : jTextExpVida.getText();
            String hab = jTextHab.getText().isEmpty() ? "0" : jTextHab.getText();
            String pnb = jTextPnb.getText().isEmpty() ? "0" : jTextPnb.getText();
            String habCity = jTextHabcity.getText().isEmpty() ? "0" : jTextHabcity.getText();
            String anyoIndependencia = jTextAnyoIndependencia.getText().isEmpty() ? "0" : jTextAnyoIndependencia.getText();

            // Crear la consulta de actualización para country usando los valores obtenidos
            String updateCountryQuery = "UPDATE country SET Name = '" + jTextNombre.getText() + "', Continent = '" + jComboContinente.getSelectedItem().toString() + "', Region = '" + jTextRegion.getText() + "', LocalName = '" + jTextNombreLocal.getText() + "', IndepYear = " + anyoIndependencia + ", SurfaceArea = " + superficie + ", LifeExpectancy = " + expVida + ", Population = " + hab + ", GNP = " + pnb + ", GovernmentForm = '" + jTextFormaGobierno.getText() + "', HeadOfState = '" + jTextCabezaEstado.getText() + "' WHERE Code = '" + jTextCodigo.getText() + "'";
            // Crear la consulta de actualización para city usando los valores obtenidos
            String updateCityQuery = "UPDATE city SET Name = '" + jTextCapital.getText() + "', District = '" + jTextDistrito.getText() + "', Population = " + habCity + " WHERE CountryCode = '" + jTextCodigo.getText() + "'";

           
           try { 
               System.out.println( Mysql.actualizarValores(updateCountryQuery)+updateCountryQuery);
                System.out.println( Mysql.actualizarValores(updateCityQuery)+updateCityQuery); 
           } catch (SQLException ex) {
               Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
           }
          
           
           JOptionPane.showMessageDialog(null, "Pais seleccionado actualizado");
           cargarTabla();
           jButtonCancelarPais.setEnabled(false);
            jButtonGuardarPais.setEnabled(false);
           permitirEdicionFormulario(false);
        } else {
            String consulta = "INSERT INTO country (Code, Name, Continent, Region, LocalName, IndepYear, SurfaceArea, LifeExpectancy, Population, GNP, GovernmentForm, HeadOfState) VALUES ('" + jTextCodigo.getText() + "', '" + jTextNombre.getText() + "', '" +
                            jComboContinente.getSelectedItem().toString() + "', '" + jTextRegion.getText() + "', '" + jTextNombreLocal.getText() + "', " + jTextAnyoIndependencia.getText() + ", " + jTextSuperficie.getText() + ", " + jTextExpVida.getText() + ", " +
                            jTextHab.getText() + ", " + jTextPnb.getText() + ", '" + jTextFormaGobierno.getText() + "', '" + jTextCabezaEstado.getText() + "')";
            String consulta2 = "INSERT INTO city (Name, District, Population, CountryCode) VALUES ('" + jTextCapital.getText() + "', '" + jTextDistrito.getText() + "', '" + jTextHabcity.getText() + "', '"+ jTextCodigo.getText()+ "')";
            System.out.println(consulta + consulta2);
         
           try {
               System.out.println(Mysql.insertarRegistro(consulta));
               System.out.println(Mysql.insertarRegistro(consulta2));
               cargarTabla();
           } catch (SQLException ex) {
               Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
           }
               
          
           
           //indicamos por pantalla que se a completado 
           JOptionPane.showMessageDialog(null, "Se ha añadido nuevo registro");
          //una vez añadidos seteamos todo a blanco  
           limpiarFormulario(true);

            
        }
       
    }//GEN-LAST:event_jButtonGuardarPaisActionPerformed

    private void jButtonEliminarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarPaisActionPerformed

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
    private void conectaMysql(){
        Mysql = new Conexion("com.mysql.cj.jdbc.Driver","mysql","localhost", "3306","world", "root", "inca.2024");
   }
    private void desconectaMysql(){
        Mysql.cierraConexion(); 
    }
    private List<Object[]> convertirResultSetALista(ResultSet rs) {
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
    private void cargarTabla() {
        
        
        
        
        
        
        jButtonAñadirIdioma.setEnabled(false);
        jButtonEliminarIdioma.setEnabled(false);
        jTableIdiomas.setEnabled(false);
        
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
        } 
        catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
    }
    private void cargarTablaLenguas(Object idPais) {
        System.out.println("Cargando tabla Lenguas del pais con id: " + idPais);
            
        if (idPais == null) {
            limpiarTablaIdiomas();            
        }   else{
            //seteamos el poder seleccionar de la tabla editar y añadir
            jButtonAñadirIdioma.setEnabled(true);
            jButtonEliminarIdioma.setEnabled(true);
            jTableIdiomas.setEnabled(true);
            try {
                Mysql.ejecutarConsulta("SELECT Language, isOfficial, Percentage FROM countrylanguage WHERE CountryCode like '"+idPais+"'");
                List<Object[]> resultadoConsultaIdiomas = convertirResultSetALista(Mysql.getResultSet());
                if (!resultadoConsultaIdiomas.isEmpty()) {
                    cargarListaIdiomas(resultadoConsultaIdiomas);
                } else{
                limpiarTablaIdiomas();
                jButtonAñadirIdioma.setEnabled(true);
                }
               
            } catch (java.lang.NullPointerException e) {
                System.out.println(e);
            }
        } 
}
    private void limpiarTablaIdiomas(){
        System.out.println("No se esta cargando nada en la tabla");
        jButtonAñadirIdioma.setEnabled(false);
        jButtonEliminarIdioma.setEnabled(false);
        jTableIdiomas.setEnabled(false);
        ModeloTabla tablaVacia = new ModeloTabla();
        String[][] paisData = new String[3][3];
        String[] columnNames = {"LENGUA", "OFICIAL", "%"};
        paisData[0][0] = "";  
        tablaVacia.setData(paisData, columnNames);
        jTableIdiomas.setModel(tablaVacia);
    }
    private void cargarListaIdiomas(List<Object[]> resultados){
        ModeloTabla tablaMia2 = new ModeloTabla();
        int numLenguas = resultados.size();
        System.out.println("Se van a cargar: " +numLenguas+ " Registros");
        String[][] paisData = new String[numLenguas][3];
        String[] columnNames = {"LENGUA", "OFICIAL", "%"};
        //Se hace un bucle por cada registro encontrado y se añade al modelo
        for (int i = 0; i < numLenguas; i++) {
            Object[] paisidiomas = resultados.get(i);
            paisData[i][0] = paisidiomas[0].toString();
            paisData[i][1] = paisidiomas[1].toString();
            paisData[i][2] = paisidiomas[2] .toString();
        }
        tablaMia2.setData(paisData, columnNames);
        jTableIdiomas.setModel(tablaMia2);
    }
    
    private void limpiarFormulario(Boolean isEnabled){
    
        jTextCodigo.setText("");
        jTextNombre.setText("");
        jComboContinente.setSelectedItem("");
        jTextRegion.setText("");
        jTextNombreLocal.setText("");
        jTextAnyoIndependencia.setText("");
        jTextSuperficie.setText(""); 
        jTextExpVida.setText("");
        jTextHab.setText("");
        jTextPnb.setText("");
        jTextFormaGobierno.setText("");
        jTextCabezaEstado.setText("");
        jTextCapital.setText("");
        jTextDistrito.setText("");
         jTextHabcity.setText("");
            
        // seteamos todo a que no se pueda editar
        permitirEdicionFormulario(isEnabled);
    }
    
    private void permitirEdicionFormulario(Boolean isEnabled){
        jButtonCancelarPais.setEnabled(isEnabled);
        jButtonGuardarPais.setEnabled(isEnabled);
        jTextCodigo.setEnabled(isEnabled);
        jTextNombre.setEnabled(isEnabled);
        jComboContinente.setEnabled(isEnabled);
        jTextRegion.setEnabled(isEnabled);
        jTextNombreLocal.setEnabled(isEnabled);
        jTextAnyoIndependencia.setEnabled(isEnabled);
        jTextSuperficie.setEnabled(isEnabled);
        jTextExpVida.setEnabled(isEnabled);
        jTextHab.setEnabled(isEnabled);
        jTextPnb.setEnabled(isEnabled);
        jTextFormaGobierno.setEnabled(isEnabled);
        jTextCabezaEstado.setEnabled(isEnabled);
        jTextCapital.setEnabled(isEnabled);
        jTextDistrito.setEnabled(isEnabled);
        jTextHabcity.setEnabled(isEnabled);
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
    private javax.swing.JButton jButtonAceptarIdioma;
    private javax.swing.JButton jButtonAñadirIdioma;
    private javax.swing.JButton jButtonAñadirPais;
    private javax.swing.JButton jButtonCancelarIdioma;
    private javax.swing.JButton jButtonCancelarPais;
    private javax.swing.JButton jButtonEliminarIdioma;
    private javax.swing.JButton jButtonEliminarPais;
    private javax.swing.JButton jButtonGuardarPais;
    private javax.swing.JButton jButtonModifi;
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
