/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoNsg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nayar
 */
public class ProdutoControleNsg extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public ProdutoNsg getBean(int linha) {
        return (ProdutoNsg) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoNsg produtoNsg = (ProdutoNsg) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produtoNsg.getIdProdutoNsg();
        }
        if (columnIndex == 1) {
            return produtoNsg.getSaborNsg();
        }
        if (columnIndex == 2) {
            return produtoNsg.getTamanhoNsg();
        }
        if (columnIndex == 3) {
            return produtoNsg.getRetirarNsg();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Id";
        }
        if (columnIndex == 1) {
            return "Sabor";
        }
        if (columnIndex == 2) {
            return "Tamanho";
        }
        if (columnIndex == 3) {
            return "Retirar";
        }
        return "";
    }
}
