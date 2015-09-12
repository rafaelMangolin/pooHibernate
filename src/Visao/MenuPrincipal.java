package Visao;

import Controle.ControleLogin;
import Controle.ControleMedico;
import Controle.ControleMensagem;
import Modelo.Medico;
import Modelo.Secretaria;
import Modelo.Usuario;
import Util.DataHoraUtil;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends JFrame {

    private ControleMensagem controleMensagem = new ControleMensagem();

    private Usuario usuario;
    
    public MenuPrincipal(Usuario usuario) {
        initComponents();
//        controleMensagem.enviarMensagens(DataHoraUtil.pegarDataProximoDia());
        this.usuario = usuario;
        if(this.usuario.getClass() == Medico.class){
            menuAgenda.setVisible(false);
            itemAgendadas.setVisible(false);
            menuMensagem.setVisible(false);
        }else if(this.usuario.getClass() == Secretaria.class){
            itemAtendidos.setVisible(false);
            itemPaciente.setVisible(false);
            menuProntuario.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemPessoa = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemAgendadas = new javax.swing.JMenuItem();
        itemPaciente = new javax.swing.JMenuItem();
        itemAtendidos = new javax.swing.JMenuItem();
        menuProntuario = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        menuMensagem = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        itemPessoa.setText("Paciente");
        itemPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(itemPessoa);

        jMenuItem3.setText("Médico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Secretária");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        menuAgenda.setText("Agenda");

        jMenuItem5.setText("Agendar Consultas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuAgenda.add(jMenuItem5);

        jMenuBar1.add(menuAgenda);

        jMenu6.setText("Relatórios");

        itemAgendadas.setText("Consultas agendadas");
        itemAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgendadasActionPerformed(evt);
            }
        });
        jMenu6.add(itemAgendadas);

        itemPaciente.setText("Relatório Paciente");
        itemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacienteActionPerformed(evt);
            }
        });
        jMenu6.add(itemPaciente);

        itemAtendidos.setText("Pacientes Atendidos");
        itemAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAtendidosActionPerformed(evt);
            }
        });
        jMenu6.add(itemAtendidos);

        jMenuBar1.add(jMenu6);

        menuProntuario.setText("Prontuários");

        jMenuItem12.setText("Prontuário Paciente");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuProntuario.add(jMenuItem12);

        jMenuBar1.add(menuProntuario);

        menuMensagem.setText("Mensagem");
        menuMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMensagemMouseClicked(evt);
            }
        });

        jMenuItem8.setText("Enviar Mensagem");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseClicked(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuMensagem.add(jMenuItem8);

        jMenuBar1.add(menuMensagem);

        jMenu9.setText("Logoff");
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Logoff");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPessoaActionPerformed
        ListagemPaciente framePaciente = new ListagemPaciente(this,true,false,usuario);  
        framePaciente.setVisible(true);  
    }//GEN-LAST:event_itemPessoaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MedicoCadastro frameMedico = new MedicoCadastro(this,true);
        frameMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroSecretaria frameSecretaria = new CadastroSecretaria();
        frameSecretaria.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AgendamentoConsulta frameAgenda = new AgendamentoConsulta(usuario);
        frameAgenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        TelaProntuario frameprontuario = new TelaProntuario(usuario);
        frameprontuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void itemAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgendadasActionPerformed
        ConsultaAgendada frameConsulta = new ConsultaAgendada();
        frameConsulta.setVisible(true);
    }//GEN-LAST:event_itemAgendadasActionPerformed

    private void itemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacienteActionPerformed
        RelatorioPaciente frameReceita = new RelatorioPaciente(this.usuario);
        frameReceita.setVisible(true);
    }//GEN-LAST:event_itemPacienteActionPerformed

    private void itemAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtendidosActionPerformed
        PacienteAtendido framePacienteAtendido = new PacienteAtendido();
        framePacienteAtendido.setVisible(true);
    }//GEN-LAST:event_itemAtendidosActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        controleMensagem.enviarMensagens(DataHoraUtil.pegarDataProximoDia());
        JOptionPane.showMessageDialog(null, "Mensagens enviadas");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void menuMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMensagemMouseClicked

    }//GEN-LAST:event_menuMensagemMouseClicked

    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseClicked
    }//GEN-LAST:event_jMenuItem8MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAgendadas;
    private javax.swing.JMenuItem itemAtendidos;
    private javax.swing.JMenuItem itemPaciente;
    private javax.swing.JMenuItem itemPessoa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuMensagem;
    private javax.swing.JMenu menuProntuario;
    // End of variables declaration//GEN-END:variables
}
