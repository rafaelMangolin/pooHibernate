package Visao;

import Controle.ControlePaciente;
import Controle.ControleRelatorio;
import Modelo.Paciente;
import Modelo.Usuario;
//TODO FAZER SOBRECARGA DE METDO FORMATAR RELATORIO NO CONTROLADOR DE RELATORIO PARA GERAR APENAS UMA FOLHA
//PARA OS TRES RELATORIOS

public class RelatorioPaciente extends javax.swing.JFrame {

    private Paciente pacienteBusca;
    private Usuario usuario;

    public RelatorioPaciente(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelRelatorio = new javax.swing.JTabbedPane();
        panelAtestado = new javax.swing.JPanel();
        labelQuantidade = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JTextField();
        labelMotivo = new javax.swing.JLabel();
        labelInicio = new javax.swing.JLabel();
        inputInicio = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMotivo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaReceita = new javax.swing.JTextArea();
        panelDeclaracao = new javax.swing.JPanel();
        labelAcompanhante = new javax.swing.JLabel();
        inputAcompanhante = new javax.swing.JTextField();
        labelMotivo2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaMotivo2 = new javax.swing.JTextArea();
        botaoCancelar = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();
        labelPaciente4 = new javax.swing.JLabel();
        botaoBuscar = new javax.swing.JButton();
        inputPaciente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelRelatorioMouseClicked(evt);
            }
        });

        panelAtestado.setName("atestado"); // NOI18N

        labelQuantidade.setText("Qtde de dias:");

        inputQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputQuantidadeKeyReleased(evt);
            }
        });

        labelMotivo.setText("Motivo:");

        labelInicio.setText("Data Início:");

        try {
            inputInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputInicioKeyReleased(evt);
            }
        });

        areaMotivo.setColumns(20);
        areaMotivo.setRows(5);
        areaMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaMotivoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(areaMotivo);

        javax.swing.GroupLayout panelAtestadoLayout = new javax.swing.GroupLayout(panelAtestado);
        panelAtestado.setLayout(panelAtestadoLayout);
        panelAtestadoLayout.setHorizontalGroup(
            panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtestadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelInicio)
                    .addComponent(labelQuantidade)
                    .addComponent(labelMotivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtestadoLayout.createSequentialGroup()
                        .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAtestadoLayout.setVerticalGroup(
            panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInicio)
                    .addComponent(inputInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtestadoLayout.createSequentialGroup()
                        .addComponent(labelMotivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelRelatorio.addTab("Atestado", panelAtestado);

        jPanel3.setName("receita"); // NOI18N

        jLabel9.setText("Descrição:");

        areaReceita.setColumns(20);
        areaReceita.setRows(5);
        areaReceita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaReceitaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(areaReceita);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
        );

        painelRelatorio.addTab("Receita", jPanel3);

        panelDeclaracao.setName("declaracao"); // NOI18N

        labelAcompanhante.setText("Acompanhante:");

        inputAcompanhante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputAcompanhanteKeyReleased(evt);
            }
        });

        labelMotivo2.setText("Motivo:");

        areaMotivo2.setColumns(20);
        areaMotivo2.setRows(5);
        areaMotivo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaMotivo2KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(areaMotivo2);

        javax.swing.GroupLayout panelDeclaracaoLayout = new javax.swing.GroupLayout(panelDeclaracao);
        panelDeclaracao.setLayout(panelDeclaracaoLayout);
        panelDeclaracaoLayout.setHorizontalGroup(
            panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeclaracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAcompanhante)
                    .addComponent(labelMotivo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(inputAcompanhante))
                .addContainerGap())
        );
        panelDeclaracaoLayout.setVerticalGroup(
            panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeclaracaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAcompanhante)
                    .addComponent(inputAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeclaracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeclaracaoLayout.createSequentialGroup()
                        .addComponent(labelMotivo2)
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        painelRelatorio.addTab("Declaração", panelDeclaracao);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoVisualizar.setText("Visualizar");
        botaoVisualizar.setEnabled(false);
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        labelPaciente4.setText("Paciente:");

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPaciente4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPaciente)))
                .addContainerGap())
            .addComponent(painelRelatorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaciente4)
                    .addComponent(inputPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Boolean atualizaBotao() {
        Boolean isValid = !inputPaciente.getText().equals("");
        switch (painelRelatorio.getSelectedComponent().getName()) {
            case "atestado":
                isValid = isValid
                        && !inputInicio.getText().equals("  /  /    ")
                        && !inputQuantidade.getText().equals("")
                        && !areaMotivo.getText().equals("");
                break;
            case "receita":
                isValid = isValid
                        && !areaReceita.getText().equals("");
                break;
            case "declaracao":
                isValid = isValid
                        && !inputAcompanhante.getText().equals("")
                        && !areaMotivo2.getText().equals("");
                break;
        }
        return isValid;
    }

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed
    ControlePaciente controlePaciente = new ControlePaciente();
    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        ControleRelatorio relatorio = new ControleRelatorio(painelRelatorio.getSelectedComponent().getName());

        switch (relatorio.pegaNomeRelatorio()) {
            case "atestado":
                relatorio.formataRelatorio(inputPaciente.getText(), inputInicio.getText(), inputQuantidade.getText(), areaMotivo.getText());
                relatorio.geraRelatorio();
                break;
            case "receita":
                relatorio.formataRelatorio(inputPaciente.getText(), areaReceita.getText());
                relatorio.geraRelatorio();
                break;
            case "declaracao":
                relatorio.formataRelatorio(inputPaciente.getText(), inputAcompanhante.getText(), areaMotivo2.getText());
                relatorio.geraRelatorio();
                break;
        }

    }//GEN-LAST:event_botaoVisualizarActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        pacienteBusca = ListagemPaciente.pegarPaciente(usuario);

        inputPaciente.setText(pacienteBusca.getNome());
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void areaReceitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaReceitaKeyReleased
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_areaReceitaKeyReleased

    private void areaMotivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaMotivoKeyReleased
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_areaMotivoKeyReleased

    private void inputQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputQuantidadeKeyReleased
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_inputQuantidadeKeyReleased

    private void inputInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputInicioKeyReleased
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_inputInicioKeyReleased

    private void painelRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelRelatorioMouseClicked
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_painelRelatorioMouseClicked

    private void inputAcompanhanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAcompanhanteKeyReleased
        botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_inputAcompanhanteKeyReleased

    private void areaMotivo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaMotivo2KeyReleased
         botaoVisualizar.setEnabled(atualizaBotao());
    }//GEN-LAST:event_areaMotivo2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMotivo;
    private javax.swing.JTextArea areaMotivo2;
    private javax.swing.JTextArea areaReceita;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JTextField inputAcompanhante;
    private javax.swing.JFormattedTextField inputInicio;
    private javax.swing.JTextField inputPaciente;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAcompanhante;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelMotivo;
    private javax.swing.JLabel labelMotivo2;
    private javax.swing.JLabel labelPaciente4;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JTabbedPane painelRelatorio;
    private javax.swing.JPanel panelAtestado;
    private javax.swing.JPanel panelDeclaracao;
    // End of variables declaration//GEN-END:variables
}
