/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import RMI.IEstacao;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author cce-teste11
 */
public class EstacaoViewInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form EstacaoViewInternal
     */
    private DefaultListModel listModelTrem;
    private DefaultListModel listModelMetro;
    private DefaultListModel listModelParadas;
    
    public EstacaoViewInternal() {
        initComponents();
        this.setLocation(30, 25);
        listModelTrem = new DefaultListModel();
        listModelMetro = new DefaultListModel();
        listModelParadas = new DefaultListModel();
        try {
            MenuView.estacao.getEstacao().getTrem().forEach(k -> listModelTrem.addElement(k.getNome()));
            ListaTrem.setModel(listModelTrem);
            MenuView.estacao.getEstacao().getMetro().forEach(k -> listModelMetro.addElement(k.getNome()));
            ListaMetro.setModel(listModelMetro);
            ListaParadas.setModel(listModelParadas);
        } catch (RemoteException ex) {
            Logger.getLogger(EstacaoViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //singleton
    private static EstacaoViewInternal instancia;

    //singleton
    public static EstacaoViewInternal getInstance() {
        //nenhuma instancia foi criada ainda
        if (instancia == null) {
            //cria uma nova instancia do form
            instancia = new EstacaoViewInternal();
        }

        //retorna a instancia do form
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaParadas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaMetro = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTrem = new javax.swing.JList<>();

        setClosable(true);
        setTitle("Linhas Disponíveis");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Linhas de Trem Disponíveis");

        ListaParadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListaParadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaParadas);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pontos de Parada");

        ListaMetro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListaMetro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaMetro.setMaximumSize(new java.awt.Dimension(39, 136));
        ListaMetro.setMinimumSize(new java.awt.Dimension(39, 136));
        ListaMetro.setPreferredSize(new java.awt.Dimension(39, 136));
        ListaMetro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaMetroFocusGained(evt);
            }
        });
        ListaMetro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaMetroValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaMetro);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Linhas de Metrô Disponíveis");

        ListaTrem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListaTrem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaTrem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaTremFocusGained(evt);
            }
        });
        ListaTrem.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaTremValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaTrem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMetroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaMetroFocusGained
        ListaTrem.removeSelectionInterval(0, 1000);
    }//GEN-LAST:event_ListaMetroFocusGained

    private void ListaMetroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaMetroValueChanged
        try {
            listModelParadas.clear();
            MenuView.estacao.getEstacao().getMetro().forEach(k -> {
                if(k.getNome().equals(ListaMetro.getSelectedValue()))
                k.getParadas().getParadas().forEach(x -> listModelParadas.addElement(x));
            });
        } catch (RemoteException ex) {
            Logger.getLogger(EstacaoViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListaMetroValueChanged

    private void ListaTremFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaTremFocusGained
        ListaMetro.removeSelectionInterval(0, 1000);
    }//GEN-LAST:event_ListaTremFocusGained

    private void ListaTremValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaTremValueChanged
        try {
            listModelParadas.clear();
            MenuView.estacao.getEstacao().getTrem().forEach(k -> {
                if(k.getNome().equals(ListaTrem.getSelectedValue()))
                k.getParadas().getParadas().forEach(x -> listModelParadas.addElement(x));
            });
        } catch (RemoteException ex) {
            Logger.getLogger(EstacaoViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListaTremValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaMetro;
    private javax.swing.JList<String> ListaParadas;
    private javax.swing.JList<String> ListaTrem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
