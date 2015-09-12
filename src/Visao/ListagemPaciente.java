/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlePaciente;
import Modelo.Paciente;
import Modelo.Usuario;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author igorsantana
 */
public class ListagemPaciente extends JDialog {

    ControlePaciente controle = new ControlePaciente();
    private static Paciente paciente;
    private Usuario usuario;

    public ListagemPaciente(Frame parent, boolean modal, Boolean isSearch, Usuario usuario) {
        super(parent, modal);
        initComponents();
        botaoSelecionar.setVisible(false);
        if (isSearch == true) {
            botaoSelecionar.setVisible(true);
        }
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        botaoSelecionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaPesquisa = new javax.swing.JTextArea();
        botaoBuscar = new javax.swing.JButton();
        comboBusca = new javax.swing.JComboBox();
        inputBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCancelarMouseClicked(evt);
            }
        });

        botaoSelecionar.setText("Selecionar");
        botaoSelecionar.setEnabled(false);
        botaoSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSelecionarMouseClicked(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.setEnabled(false);
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseClicked(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.setEnabled(false);
        botaoAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarMouseClicked(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setToolTipText("");
        botaoAdicionar.setAutoscrolls(true);
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });

        areaPesquisa.setColumns(20);
        areaPesquisa.setRows(5);
        areaPesquisa.setEnabled(false);
        jScrollPane1.setViewportView(areaPesquisa);

        botaoBuscar.setText("Buscar");
        botaoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarMouseClicked(evt);
            }
        });

        comboBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Nome" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSelecionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBusca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoBuscar)
                            .addGap(142, 142, 142)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoBuscar)
                        .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoAdicionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoSelecionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoCancelar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoCancelarMouseClicked

    private void setarBotoes() {
        botaoAlterar.setEnabled(this.paciente != null);
        botaoRemover.setEnabled(this.paciente != null);
        botaoSelecionar.setEnabled(this.paciente != null);
    }

    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked
        if (!this.controle.remover(this.paciente.getId())) {
            JOptionPane.showMessageDialog(null, "Não é possivel remover esse paciente.");
        } else {
            this.paciente = null;
            setarBotoes();
            areaPesquisa.setText("Paciente removido com sucesso");
        };
    }//GEN-LAST:event_botaoRemoverMouseClicked

    public Paciente pegarPacienteSelecionado() {
        return this.paciente;
    }

    public static Paciente pegarPaciente(Usuario usuario) {
        ListagemPaciente p = new ListagemPaciente(null, true, true, usuario);
        p.setVisible(true);
        return paciente;
    }


    private void botaoAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarMouseClicked
        PacienteCadastro framePaciente = new PacienteCadastro(null, true, this.paciente, this.usuario);
        framePaciente.setVisible(true);
    }//GEN-LAST:event_botaoAlterarMouseClicked

    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked
        PacienteCadastro framePaciente = new PacienteCadastro(null, true, this.usuario);
        framePaciente.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarMouseClicked

    private void botaoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarMouseClicked
        String valor = inputBuscar.getText();
        String tipo = (String) comboBusca.getSelectedItem();
        Paciente paciente = null;
        try {
            paciente = controle.buscar(tipo, valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O id precisa ser um numero.");
        }
        if (paciente == null) {
            areaPesquisa.setText("Não foi encontrado nenhum usuario com esse " + tipo);
        } else {
            this.paciente = paciente;
            areaPesquisa.setText(paciente.toString());
            botaoSelecionar.setEnabled(true);
        }
        setarBotoes();
    }//GEN-LAST:event_botaoBuscarMouseClicked

    private void botaoSelecionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSelecionarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_botaoSelecionarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaPesquisa;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSelecionar;
    private javax.swing.JComboBox comboBusca;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
