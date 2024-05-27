package interfaz;

import clases.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;





public class Ventana extends javax.swing.JFrame {

        Conexion Mysql;
        Object idPaisSelected;
    
   
    public Ventana() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);  
        setTitle("Paises, capitales y leguas");
        conectaMysql();
        cargarTabla("code", "asc");
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
        jButtonModificarPais = new javax.swing.JButton();
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
        jButtonAñadirPais.setEnabled(false);
        jButtonAñadirPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirPaisActionPerformed(evt);
            }
        });

        jButtonModificarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/contrato.png"))); // NOI18N
        jButtonModificarPais.setEnabled(false);
        jButtonModificarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPaisActionPerformed(evt);
            }
        });

        jButtonEliminarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/hoja-de-papel.png"))); // NOI18N
        jButtonEliminarPais.setEnabled(false);
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
        jButtonCancelarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButtonModificarPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarPais)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonGuardarPais)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonCancelarPais)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1))))
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
                        .addComponent(jButtonModificarPais)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
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
                        .addGap(26, 26, 26)
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
        //ponemos en blanco los datos del formulario de idioma
        jTextFieldTextoLenguaje.setText("");
        jCheckBoxIsOficial.setSelected(false);
        jTextFieldPercent.setText("");
        //Poenemos el edit del formulario de idioma a que no pueda editarse
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
        
        
        
        //Se activa la modificacion del pais
        jButtonModificarPais.setEnabled(true);
        jButtonEliminarPais.setEnabled(true);
        jButtonAñadirPais.setEnabled(false);
        jButtonCancelarPais.setEnabled(true);
        
        //Se inserta el valor de codigo del pais en la variable global isSelected para posteriormente
        idPaisSelected = JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0);
        
        //Se ejecuta una consulta la cual devuelve todos los datos necesarios para cargar la consulta actual en el formulario.
        Mysql.ejecutarConsulta("SELECT country.Code, country.Name, country.Continent, country.Region, country.LocalName, country.IndepYear, country.SurfaceArea FROM country WHERE Code = '" + JtableTabla.getModel().getValueAt(JtableTabla.getSelectedRow(),0)+"'");
        //Se guarda el resultado de la consulta en un resultset
        ResultSet datos = Mysql.getResultSet();
            try { 
                //Se cargan los continentes disponibles en la base de datos en el combobox 
                cargarContinentes();
                //Empezamos a cargar los valores que se encuentran en orden en el formulario
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
       
         //Se ejecuta una consulta la cual devuelve todos los datos necesarios para cargar la consulta actual en el formulario de la izquierda  
         
         System.out.println("cargando 2a parte de la tabla");
        Mysql.ejecutarConsulta("SELECT country.LifeExpectancy, country.Population, country.GNP, country.GovernmentForm, country.HeadOfState, city.Name, city.District, city.Population from country, city where country.Code = '"+idPaisSelected+"' and city.countrycode = '" + idPaisSelected+"'");
        //Se guarda el resultado de la consulta en un resultset
        ResultSet datos2 = Mysql.getResultSet();
            try { 
                //Empezamos a cargar los valores que se encuentran en orden en el formulario
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
            
           //Se carga la tabla del los idiomas del pais pasando el codigo del pais seleccionado en la tabla
           cargarTablaLenguas(idPaisSelected);
            
            
       
        
    }//GEN-LAST:event_JtableTablaMouseClicked

    private void jButtonAñadirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirIdiomaActionPerformed
        //comprobamos que hay algun idioma seleccionado en la tabla
         if (jTableIdiomas.getSelectedRow() != -1) {
             //en caso de haberlo se cargan en el formulario y se habilita su edicion
            cargarEnPantallaDatosIdioma();
            jButtonAceptarIdioma.setEnabled(true);
            jButtonCancelarIdioma.setEnabled(true);
            jTextFieldTextoLenguaje.setEnabled(true);
            jCheckBoxIsOficial.setEnabled(true);
            jTextFieldPercent.setEnabled(true);
        } else {
            //en caso de que no, se permite su edicion.
            jButtonAceptarIdioma.setEnabled(true);
            jButtonCancelarIdioma.setEnabled(true);
            jTextFieldTextoLenguaje.setEnabled(true);
            jCheckBoxIsOficial.setEnabled(true);
            jTextFieldPercent.setEnabled(true);
         
         }        
    }//GEN-LAST:event_jButtonAñadirIdiomaActionPerformed

    private void cargarEnPantallaDatosIdioma (){
        //cargamos los idiomas del elemento seleccionado
        System.out.println("Cargando datos de idioma: "+ jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0));
        //Cargamos los datos del idioma seleccionado en el formulario
        jTextFieldTextoLenguaje.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),0));
        String valorString = (String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),1);
        Boolean valorBoolean = valorString.equalsIgnoreCase("T");
        jCheckBoxIsOficial.setSelected(valorBoolean);
        jTextFieldPercent.setText((String) jTableIdiomas.getModel().getValueAt(jTableIdiomas.getSelectedRow(),2));
      
         //Poenemos el edit del formulario de idioma a que no pueda editarse
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
        //Comprobamos que halla algo seleccionado en la tabla
         if (jTableIdiomas.getSelectedRow() != -1) {
             //Si hay algo seleccionado actualizamos los valores, y damos un mensaje por pantalla
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
            //Recargamos la tabla idiomas, y limpiamos el formulario de idiomas
            cargarTablaLenguas(idPaisSelected);
            jTextFieldTextoLenguaje.setText("");
            jCheckBoxIsOficial.setSelected(false);
            jTextFieldPercent.setText("");

            //Poenemos el edit del formulario de idioma a que no pueda editarse
            jButtonAceptarIdioma.setEnabled(false);
            jButtonCancelarIdioma.setEnabled(false);
            jTextFieldTextoLenguaje.setEnabled(false);
            jCheckBoxIsOficial.setEnabled(false);
            jTextFieldPercent.setEnabled(false);
        }else{
             //si no hay nada seleccionado añadimos un idioma nuevo y mostramos un mensaje por pantalla
            try {
                JOptionPane.showMessageDialog(null, "Nuevo idioma añadido");
                String insertinSentence = "INSERT INTO countrylanguage (CountryCode, Language, IsOfficial, Percentage) VALUES ('" + idPaisSelected + "', '" + nuevoIdioma + "', '" + esOficial.toString() + "', " + aPercent + ")";
                System.out.println(insertinSentence);
                Mysql.insertarRegistro("INSERT INTO countrylanguage (CountryCode, Language, IsOfficial, Percentage) VALUES ('" + idPaisSelected + "', '" + nuevoIdioma + "', '" + esOficial.toString() + "', " + aPercent + ")");
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
             //Recargamos la tabla idiomas, y limpiamos el formulario de idiomas
            cargarTablaLenguas(idPaisSelected);
            jTextFieldTextoLenguaje.setText("");
            jCheckBoxIsOficial.setSelected(false);
            jTextFieldPercent.setText("");

            //Poenemos el edit del formulario de idioma a que no pueda editarse
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
        cargarTabla("code", "asc");
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

    private void jButtonModificarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPaisActionPerformed
        // Modificar datos de un pais
        if (JtableTabla.getSelectedRow() != -1) {
            //si hay un pais seleccionado permite la edicion de los datos del formulario ademas de activar el boton cancelar y guardar
            jButtonCancelarPais.setEnabled(true);
            jButtonGuardarPais.setEnabled(true);
            permitirEdicionFormulario(true);
        } 
    }//GEN-LAST:event_jButtonModificarPaisActionPerformed

    private void jButtonGuardarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPaisActionPerformed
       // Añadimos un nuevo registro a la base de datos
       
       if (JtableTabla.getSelectedRow() != -1) { 
           //si se ha seleccionado un pais 
           // Obtener los valores de los campos de texto y convertirlos a números
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
                //Ejecutamos las 2 querrys de actualizacion imprimiendo por pantalla un true y lo que se ha ejecutado en caso de hacerlo o sino un false
                System.out.println( Mysql.actualizarValores(updateCountryQuery)+updateCountryQuery);
                System.out.println( Mysql.actualizarValores(updateCityQuery)+updateCityQuery); 
           } catch (SQLException ex) {
               Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
           }
          
           //Una vez que se actualiza muestra un mensaje por pantalla y carga la tabla de paises ademas de activar botones guardar y cancelar y permitir edicion del formulario 
           JOptionPane.showMessageDialog(null, "Pais seleccionado actualizado");
           cargarTabla("code", "asc");
           jButtonCancelarPais.setEnabled(false);
           jButtonGuardarPais.setEnabled(false);
           permitirEdicionFormulario(false);
        } else {
           
               //Se hace una consulta en la base de datos buscando por codigo de pais
               Mysql.ejecutarConsulta("select * from country where Code = '"+jTextCodigo.getText()+"'" );
               List<Object[]> listaEncontrada =  convertirResultSetALista(Mysql.getResultSet());
           if (listaEncontrada.size() == 0) {
               //Si no encuentra nada inserta el nuevo pais
                String consulta = "INSERT INTO country (Code, Name, Continent, Region, LocalName, IndepYear, SurfaceArea, LifeExpectancy, Population, GNP, GovernmentForm, HeadOfState) VALUES ('" + jTextCodigo.getText() + "', '" + jTextNombre.getText() + "', '" + jComboContinente.getSelectedItem().toString() + "', '" + jTextRegion.getText() + "', '" + jTextNombreLocal.getText() + "', " + jTextAnyoIndependencia.getText() + ", " + jTextSuperficie.getText() + ", " + jTextExpVida.getText() + ", " + jTextHab.getText() + ", " + jTextPnb.getText() + ", '" + jTextFormaGobierno.getText() + "', '" + jTextCabezaEstado.getText() + "')";
                String consulta2 = "INSERT INTO city (Name, District, Population, CountryCode) VALUES ('" + jTextCapital.getText() + "', '" + jTextDistrito.getText() + "', '" + jTextHabcity.getText() + "', '"+ jTextCodigo.getText()+ "')";
                System.out.println(consulta + consulta2);
               try {
                    boolean tick0 = Mysql.insertarRegistro(consulta);
                    boolean tick1 = Mysql.insertarRegistro(consulta2);
                    if (tick1 || tick0) {
                        JOptionPane.showMessageDialog(null, "Se ha añadido nuevo registro");
                        //una vez añadidos seteamos todo a blanco  
                        limpiarFormulario(false);
                        jButtonCancelarPais.setEnabled(false);
                        jButtonGuardarPais.setEnabled(false);

                   }else{
                        //si no se inserta muestra un mensaje por pantalla de ha ocurrido un fallo en la insercion
                        JOptionPane.showMessageDialog(null, "No se a añadido ningun registro");
                   }
               } catch (SQLException ex) {
                   //si no se inserta muestra un mensaje por pantalla de que falta algo
                   JOptionPane.showMessageDialog(null, "No se a añadido ningun registro ya que algun campo esta vacio");
               }
           } else {
               //si no se inserta muestra un mensaje por pantalla de que el codigo de pais ya exixte
           JOptionPane.showMessageDialog(null, "No se a añadido ningun registro ya que el id ya esta en la base de datos");
           }   
        }
        //una vez ejecutado todo lo anterior recargamos la tabla
        cargarTabla("code", "asc");
    }//GEN-LAST:event_jButtonGuardarPaisActionPerformed

    private void jButtonEliminarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPaisActionPerformed
       
        if (JtableTabla.getSelectedRow() != -1) {
            // Eliminar un idioma de la base de datos si esta seleccionado en la tabla
            String deleteQuery1 ="delete from city where CountryCode = '" +idPaisSelected+"'";
            String deleteQuery2 = "delete from countrylanguage where CountryCode  = '"+idPaisSelected+"'";
            String deleteQuery ="DELETE FROM country WHERE code = '"+idPaisSelected+"'";
            try {
                //Se ejecutan las querys y se muestran por pantalla un aviso en caso de fallo de insercion.
                boolean tick = Mysql.eliminarRegistros(deleteQuery1);
                boolean tick1 = Mysql.eliminarRegistros(deleteQuery2);
                boolean tick2 = Mysql.eliminarRegistros(deleteQuery);
                if (tick || tick1 || tick2) {
                    JOptionPane.showMessageDialog(null, "Pais eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha podido eliminar el pais", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //Se recarga la tabla para representar los cambios y se desabilitan modificar y eliminar 
                cargarTabla("code", "asc");
                limpiarFormulario(false);
                jButtonModificarPais.setEnabled(false);
                jButtonEliminarPais.setEnabled(false);
            } catch (SQLException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonEliminarPaisActionPerformed

    private void jButtonCancelarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPaisActionPerformed
       cargarTabla("code", "asc");
       
    }//GEN-LAST:event_jButtonCancelarPaisActionPerformed

    public void cargarContinentes(){
        //Metodo que carga la lista de continentes en el combo hacidno una consulta en la base de datos
        //Limpiamos la lista para que no se sobepongan los paises
        jComboContinente.removeAllItems();
        //Se buscan en la base de datos los continentes para que no se repitan
        Mysql.ejecutarConsulta("SELECT distinct continent FROM country");
         ResultSet resultSet = Mysql.getResultSet();
         
            try {
                //Por cada uno encontrado se añade al combo
                
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
        //metodo que encontre en internet que combierte de resulset a una lista de objetos
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
    
    private void cargarTabla(String orderByString, String tipo) {
        //se deshabilitan los botones y la tabla de idioma mientras se carga la tabla principal
        
        System.out.println("Cargando tabla idiomas total");
        jButtonAñadirIdioma.setEnabled(false);
        jButtonEliminarIdioma.setEnabled(false);
        jButtonModificarPais.setEnabled(false);
        jButtonEliminarPais.setEnabled(false);
        jButtonCancelarPais.setEnabled(false);
        jButtonGuardarPais.setEnabled(false);
        jButtonAñadirPais.setEnabled(true);
        limpiarFormulario(false);
        limpiarTablaIdiomas();
        
        // se ejecuta una consulta SQL para obtener los datos de los pais
        try {
            Mysql.ejecutarConsulta("SELECT COUNTRY.CODE, COUNTRY.NAME, COUNTRY.CONTINENT, COUNTRY.REGION FROM COUNTRY order by "+orderByString+" "+tipo);
             // se convierte el ResultSet a una lista de arrays de objetos
            List<Object[]> resultados = convertirResultSetALista(Mysql.getResultSet());
            if (!resultados.isEmpty()) {
            // creamos un modeo personalizado para la tabla
                ModeloTabla tablaMia = new ModeloTabla();
                int numPaises = resultados.size();
                System.out.println(numPaises);
                //se inicializan para almacenar los datos de los paises y se le añade los campos de la tabla donde se indican los
                String[][] paisData = new String[numPaises][4];
                String[] columnNames = {"Código", "Nombre", "Continente", "Región"}; 
                //se recorre una lista de resultados y se almacenan los paises y se asigna a cada uno
                for (int i = 0; i < numPaises; i++) {
                    Object[] pais = resultados.get(i);
                    paisData[i][0] = (String) pais[0];
                    paisData[i][1] = (String) pais[1];
                    paisData[i][2] = (String) pais[2];
                    paisData[i][3] = (String) pais[3];
                }
                //se establecen los datos y los nombres de la columna al modelo
                tablaMia.setData(paisData, columnNames);    
                //se setea el modelo en la jtable
                JtableTabla.setModel(tablaMia);
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
    }
    
    private void cargarTablaLenguas(Object idPais) {
        //muestra un mensaje indicando que se cargando la tabla un pais especifico
        System.out.println("Cargando tabla Lenguas del pais con id: " + idPais);
        //verifica si el ID de pais es nulo
        if (idPais == null) {
        //si el ID del pais es nulo , se limpia la tabla de idiomas
            limpiarTablaIdiomas();            
        }   else{
        //si el ID de pais no es nulo, se habilita estos botones
            //seteamos el poder seleccionar de la tabla editar y añadir
            jButtonAñadirIdioma.setEnabled(true);
            jButtonEliminarIdioma.setEnabled(true);
            jTableIdiomas.setEnabled(true);
            try {
                //se ejecuta la consulta SQL para obtener los datos
                Mysql.ejecutarConsulta("SELECT Language, isOfficial, Percentage FROM countrylanguage WHERE CountryCode like '"+idPais+"'");
               //se convierte el resultado de la consulta a una lista de objetos
                List<Object[]> resultadoConsultaIdiomas = convertirResultSetALista(Mysql.getResultSet());
               //si no hay idiomas disponibles, se cargan en la tabla
                if (!resultadoConsultaIdiomas.isEmpty()) {
                    //Si hay algun idioma en la lista se cargara
                    cargarListaIdiomas(resultadoConsultaIdiomas);
                } else{
                    //sino hay datos de idiomas disponibles , se limpia la tabla y se activa solo el boton añadir
                    limpiarTablaIdiomas();
                    jButtonAñadirIdioma.setEnabled(true);
                }
            } catch (java.lang.NullPointerException e) {
                System.out.println(e);
            }
        } 
    }
    
    private void limpiarTablaIdiomas(){
        //se muestra un mensaje
        System.out.println("No se esta cargando nada en la tabla");
        //deshabilitar los botones añadir, eliminacion y la tabla de idiomas
        jButtonAñadirIdioma.setEnabled(false);
        jButtonEliminarIdioma.setEnabled(false);
        jTableIdiomas.setEnabled(false);
        //se crea un modelo de tabla vacio
        ModeloTabla tablaVacia = new ModeloTabla();
        //se inicializa una matriz vacia para almacenar datos
        String[][] paisData = new String[3][3];
        //se define los nombres de las columnas
        String[] columnNames = {"LENGUA", "OFICIAL", "%"};
        //se establecen datos vacios en la primera fila de la tabla
        paisData[0][0] = "";  
        //se establecen datos vacios en la primera fila de la tabla 
        tablaVacia.setData(paisData, columnNames);
        //se establece el modelo vacio en la tabla de idiomas
        jTableIdiomas.setModel(tablaVacia);
    }

    private void cargarListaIdiomas(List<Object[]> resultados){
        //se crea un nuevo modelo de tabla para almacenar los datos de la tabla idiomas
        ModeloTabla tablaMia2 = new ModeloTabla();
        //se crea un numero para el registro de idiomas
        int numLenguas = resultados.size();
        //se muestra los numeros que se van a registrar       
        System.out.println("Se van a cargar: " +numLenguas+ " Registros");
        //se inicializa una matriz para almacenar los datos de idiomas y se define los nombres de la columnas
        String[][] paisData = new String[numLenguas][3];
        String[] columnNames = {"LENGUA", "OFICIAL", "%"};
        //Se hace un bucle por cada registro encontrado y se añade al modelo
   for (int i = 0; i < numLenguas; i++) {
            Object[] paisidiomas = resultados.get(i);
            paisData[i][0] = paisidiomas[0].toString();
            paisData[i][1] = paisidiomas[1].toString();
            paisData[i][2] = paisidiomas[2] .toString();
        }
        //se establecen los datos y los nombres de la columnas en el modelo de la tabla de idiomas
        tablaMia2.setData(paisData, columnNames);
        //se establece el modelo de tabla de idiomas en la Jtable
        jTableIdiomas.setModel(tablaMia2);
    }
    
    private void limpiarFormulario(Boolean isEnabled){
        //metodo que setea el texto de todos los datos del formulario vacio
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
            
        // seteamos todo a que no se pueda editar dependiendo del valor introduccido por parametro
        permitirEdicionFormulario(isEnabled);
    }
    
    private void permitirEdicionFormulario(Boolean isEnabled){
        //Se habilita el formulario dependiendo de lo introduccido por parametro
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
    private javax.swing.JButton jButtonModificarPais;
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
