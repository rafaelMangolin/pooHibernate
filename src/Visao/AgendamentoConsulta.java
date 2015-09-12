package Visao;

import Controle.ControleConsulta;
import Modelo.Consulta;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Usuario;
import Util.DataHoraUtil;
import java.util.Date;
import javax.swing.JOptionPane;

public class AgendamentoConsulta extends javax.swing.JFrame {

    private ControleConsulta controle = new ControleConsulta();
    private Medico medico;
    private Paciente pacient;
    private Usuario usuario;

    public AgendamentoConsulta(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchPacienteButton = new javax.swing.JButton();
        paciente = new javax.swing.JTextField();
        medc = new javax.swing.JTextField();
        SearchMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipoConsulta = new javax.swing.JComboBox();
        salvarConsulta = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        dataConsulta = new javax.swing.JFormattedTextField();
        horaConsulta = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paciente: ");

        searchPacienteButton.setText("Busca");
        searchPacienteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchPacienteButtonMouseClicked(evt);
            }
        });

        paciente.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        paciente.setEnabled(false);

        medc.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        medc.setEnabled(false);

        SearchMedico.setText("Busca");
        SearchMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMedicoMouseClicked(evt);
            }
        });

        jLabel2.setText("Médico: ");

        jLabel3.setText("Hora: ");

        jLabel4.setText("Data: ");

        jLabel5.setText("Tipo: ");

        tipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Retorno", "Primeira Consulta" }));
        tipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoConsultaActionPerformed(evt);
            }
        });

        salvarConsulta.setText("Salvar");
        salvarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarConsultaMouseClicked(evt);
            }
        });
        salvarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarConsultaActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        try {
            dataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        horaConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchPacienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medc)
                            .addComponent(paciente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(294, 294, 294)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchPacienteButton)
                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SearchMedico)
                    .addComponent(medc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchPacienteButton.getAccessibleContext().setAccessibleName("procuraPaciente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchPacienteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPacienteButtonMouseClicked
        pacient = ListagemPaciente.pegarPaciente(usuario);
        if (pacient != null) {
            paciente.setText(pacient.getNome());
        }
    }//GEN-LAST:event_searchPacienteButtonMouseClicked

    private void SearchMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMedicoMouseClicked
        medico = ListagemMedico.pegarMedico();
        medc.setText(medico.getNome());
    }//GEN-LAST:event_SearchMedicoMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void salvarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarConsultaMouseClicked
        String hora = (String)horaConsulta.getSelectedItem();
        Date data = DataHoraUtil.stringToDate((String) dataConsulta.getValue());
        if ((controle.podeGravarAConsulta(data, hora, medico, (String) tipoConsulta.getSelectedItem()))) {
            Consulta c = new Consulta(data, hora, medico, pacient, (String) tipoConsulta.getSelectedItem());
            if (controle.salvar(c)) {
                JOptionPane.showMessageDialog(null, "Consulta salva com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar a consulta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma consulta salva neste horário para este médico!");
        }

    }//GEN-LAST:event_salvarConsultaMouseClicked

    private void salvarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarConsultaActionPerformed

    private void tipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchMedico;
    private javax.swing.JButton cancel;
    private javax.swing.JFormattedTextField dataConsulta;
    private javax.swing.JComboBox horaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField medc;
    private javax.swing.JTextField paciente;
    private javax.swing.JButton salvarConsulta;
    private javax.swing.JButton searchPacienteButton;
    private javax.swing.JComboBox tipoConsulta;
    // End of variables declaration//GEN-END:variables
}
