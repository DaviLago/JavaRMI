/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import RMI.IEstacao;
import java.awt.Dimension;
import java.rmi.RemoteException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cce-teste11
 */
public class PrecoHorarioViewInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form PrecoHorarioViewInternal
     */
    
    private NumberFormat nf;
    
    public PrecoHorarioViewInternal() {
        initComponents();
        this.setLocation(770, 25);
        nf = NumberFormat.getCurrencyInstance();
        try {
            LabelPrecoTrem.setText("Passagens de Trem: " + nf.format(MenuView.estacao.getEstacao().getPrecoTrem()));
            LabelPrecoMetro.setText("Passagens de Metro: " + nf.format(MenuView.estacao.getEstacao().getPrecoMetro()));
        } catch (RemoteException e) {
            Logger.getLogger(PrecoHorarioViewInternal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //singleton
    private static PrecoHorarioViewInternal instancia;

    //singleton
    public static PrecoHorarioViewInternal getInstance() {
        //nenhuma instancia foi criada ainda
        if (instancia == null) {
            //cria uma nova instancia do form
            instancia = new PrecoHorarioViewInternal();
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

        LabelPrecoTrem = new javax.swing.JLabel();
        LabelPrecoMetro = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Preço das Passagens");

        LabelPrecoTrem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPrecoTrem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPrecoTrem.setText("Passagem de Trem: 2,50");

        LabelPrecoMetro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPrecoMetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPrecoMetro.setText("Passagm de Metro 3,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelPrecoTrem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addComponent(LabelPrecoMetro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelPrecoTrem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPrecoMetro)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPrecoMetro;
    private javax.swing.JLabel LabelPrecoTrem;
    // End of variables declaration//GEN-END:variables
}