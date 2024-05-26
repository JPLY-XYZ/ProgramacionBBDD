/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author josel
 */
public class ModeloTabla extends AbstractTableModel{

    public ModeloTabla() {
    }
    

    private String[] columnNames;
    private Object[][] data;

   

    // Método para escribir el contenido.
    public void setData(Object[][] data, String[] columNames) {
        this.data = data;
        this.columnNames = columNames;
    }
    


    //únicamente retornamos el numero de elementos del
    //array de los nombres de las columnas
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    //retormanos el numero de elementos
    //del array de datos

    @Override
    public int getRowCount() {
        return data.length;
    }
    //retornamos el elemento indicado

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    //y lo mismo para las celdas

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
@Override
public void setValueAt(Object value, int row, int col) {
    data[row][col] = value;
    fireTableCellUpdated(row, col);}
}
    
    
