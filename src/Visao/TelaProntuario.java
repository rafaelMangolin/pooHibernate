package Visao;

import Controle.ControlePaciente;
import Modelo.Paciente;
import Modelo.Prontuario;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaProntuario extends javax.swing.JFrame {

    private Paciente pacienteBusca;
    private Paciente pacienteEncontrado;
    private Prontuario prontuario;
    private ControlePaciente controlePaciente = new ControlePaciente();
    private DefaultListModel model = new DefaultListModel();
    private Usuario usuario;

    public TelaProntuario(Prontuario prontuario, Paciente pacienteEncontrado,Usuario usuario) {
        this.usuario = usuario;
        this.pacienteBusca = pacienteEncontrado;
        this.pacienteEncontrado = pacienteEncontrado;
        initComponents();
        this.prontuario = prontuario;
        inputPaciente.setText(pacienteEncontrado.getNome());
        areaDiagnostico.setText(prontuario.getDiagnostico());
        areaTratamento.setText(prontuario.getTratamento());
        for (int i = 0; i < prontuario.getSintoma().size(); i++) {
            this.model.addElement(prontuario.getSintoma().get(i));
        }
        listaSintomas.setModel(this.model);
    }

    public TelaProntuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
         listaSintomas.setModel(this.model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSintomas = new javax.swing.JLabel();
        inputSintoma = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSintomas = new javax.swing.JList();
        labelDiagnostico = new javax.swing.JLabel();
        labelPaciente = new javax.swing.JLabel();
        inputPaciente = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        labelTreinamento = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        botaoPesquisaProntuario = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTratamento = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaDiagnostico = new javax.swing.JTextArea();
        botaoRemover = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSintomas.setText("Sintomas");

        inputSintoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputSintomaKeyReleased(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setEnabled(false);
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        listaSintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaSintomasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaSintomas);

        labelDiagnostico.setText("Diagnóstico");

        labelPaciente.setText("Paciente");

        inputPaciente.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        inputPaciente.setDragEnabled(true);
        inputPaciente.setEnabled(false);

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        labelTreinamento.setText("Tratamento");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoPesquisaProntuario.setText("Pesquisar prontuarios");
        botaoPesquisaProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaProntuarioActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        areaTratamento.setColumns(20);
        areaTratamento.setRows(5);
        jScrollPane2.setViewportView(areaTratamento);

        areaDiagnostico.setColumns(20);
        areaDiagnostico.setRows(5);
        jScrollPane3.setViewportView(areaDiagnostico);

        botaoRemover.setText("Remover");
        botaoRemover.setEnabled(false);
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labelPaciente)
                                            .addGap(5, 5, 5)
                                            .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(inputPaciente))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(inputSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                                    .addComponent(labelTreinamento)
                                    .addComponent(labelDiagnostico)
                                    .addComponent(labelSintomas))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoPesquisaProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaciente)
                    .addComponent(inputPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSintomas)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemover))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(labelDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTreinamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisaProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        pacienteBusca = ListagemPaciente.pegarPaciente(usuario);
        inputPaciente.setText(pacienteBusca.getNome());
    }//GEN-LAST:event_botaoBuscarActionPerformed
    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        botaoAdicionar.setEnabled(false);
        this.model.addElement(inputSintoma.getText());
        inputSintoma.setText("");
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        List<String> listAux = new ArrayList<>();

        if (pacienteBusca == null) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os dados corretamente");
            return;
        }

        int i;
        for (i = 0; i < model.getSize(); i++) {
            listAux.add((String) model.get(i));
        }

        if (areaDiagnostico.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digite o campo diagnóstico");
            return;
        }
        if(this.prontuario==null){
        Prontuario prontuario = new Prontuario(listAux, areaDiagnostico.getText(), areaTratamento.getText());
        
        controlePaciente.adicionarProntuario(prontuario, pacienteBusca);
            
        }
        else{
            this.prontuario.setSintoma(listAux);
            this.prontuario.setDiagnostico(areaDiagnostico.getText());
            this.prontuario.setTratamento(areaTratamento.getText());
            JOptionPane.showMessageDialog(null, "Prontuario atualizado com sucesso!");
            
        }

        inputPaciente.setText("");
        areaDiagnostico.setText("");
        areaTratamento.setText("");
        model.clear();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoPesquisaProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaProntuarioActionPerformed
        PesquisaProntuario pesquisaProntuario = new PesquisaProntuario(usuario);
        pesquisaProntuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoPesquisaProntuarioActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        if (model.size() > 0) {
            model.remove(listaSintomas.getSelectedIndex());
            botaoRemover.setEnabled(false);
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        controlePaciente.ExcluiProntuario(prontuario, pacienteEncontrado);
        inputPaciente.setText("");
        areaDiagnostico.setText("");
        areaTratamento.setText("");
        model.clear();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void listaSintomasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSintomasMouseReleased
        botaoRemover.setEnabled(listaSintomas.getSelectedIndex() != -1);
    }//GEN-LAST:event_listaSintomasMouseReleased

    private void inputSintomaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSintomaKeyReleased
        botaoAdicionar.setEnabled(!inputSintoma.getText().equals(""));
    }//GEN-LAST:event_inputSintomaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDiagnostico;
    private javax.swing.JTextArea areaTratamento;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisaProntuario;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField inputPaciente;
    private javax.swing.JTextField inputSintoma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDiagnostico;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel labelSintomas;
    private javax.swing.JLabel labelTreinamento;
    private javax.swing.JList listaSintomas;
    // End of variables declaration//GEN-END:variables
}
