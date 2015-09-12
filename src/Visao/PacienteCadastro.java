package Visao;

import Controle.ControlePaciente;
import Modelo.Paciente;
import Modelo.Secretaria;
import Modelo.Usuario;
import Util.DataHoraUtil;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class PacienteCadastro extends JDialog {

    private Paciente paciente;
    private Usuario usuario;
    private ControlePaciente controlePaciente = new ControlePaciente();

    public PacienteCadastro(JFrame frame, Boolean modal,Usuario usuario) {
        super(frame,modal);
        initComponents();
        this.usuario = usuario;
        setUserLayout(usuario);
    }

    public PacienteCadastro(JFrame frame, Boolean modal,Paciente paciente,Usuario usuario) {
        super(frame, modal);
        this.usuario = usuario;
        this.paciente = paciente;
        initComponents();
        setUserLayout(usuario);
        if (paciente != null) {
            inputNome.setText(paciente.getNome());
            inputSobrenome.setText(paciente.getSobrenome());
            inputCpf.setText(paciente.getCpf());
            inputRg.setText(paciente.getRg());
            inputData.setText(DataHoraUtil.dateToString(paciente.getDataNascimento()));
            inputEndereco.setText(paciente.getEndereco());
            inputFixo.setText(paciente.getTelefoneFixo());
            inputCelular.setText(paciente.getTelefoneCelular());
            inputEmail.setText(paciente.getEmail());
            inputConvenio.setText(paciente.getConvenio());
            checkFuma.setSelected(paciente.getFuma());
            checkBebe.setSelected(paciente.getBebe());
            checkDiabetes.setSelected(paciente.getDiabetes());
            checkColesterol.setSelected(paciente.getColesterol());
            checkCardiacas.setSelected(paciente.getDoencasCardiacas());
            areaCirurgias.setText(paciente.getCirurgias());
            areaAlergias.setText(paciente.getAlergias());
            panelAdicionais.setVisible(usuario.getClass() != Secretaria.class);
        }
    }
    
    private void setUserLayout(Usuario usuario){
        System.out.println(usuario.getClass() != Secretaria.class);
        Boolean bool = (usuario.getClass() != Secretaria.class);
        panelAdicionais.setVisible(bool);
        botaoProntuarios.setVisible(bool);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoProntuarios = new javax.swing.JButton();
        panelAdicionais = new javax.swing.JPanel();
        checkFuma = new javax.swing.JCheckBox();
        checkBebe = new javax.swing.JCheckBox();
        checkCardiacas = new javax.swing.JCheckBox();
        checkDiabetes = new javax.swing.JCheckBox();
        checkColesterol = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaAlergias = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaCirurgias = new javax.swing.JTextArea();
        labelCirurgia = new javax.swing.JLabel();
        labelAlergias = new javax.swing.JLabel();
        panelPessoais = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelSobrenome = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelFixo = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputSobrenome = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        labelConvenio = new javax.swing.JLabel();
        inputConvenio = new javax.swing.JTextField();
        inputCpf = new javax.swing.JFormattedTextField();
        inputRg = new javax.swing.JFormattedTextField();
        inputData = new javax.swing.JFormattedTextField();
        inputFixo = new javax.swing.JFormattedTextField();
        inputCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCancelarMouseClicked(evt);
            }
        });

        botaoProntuarios.setText("Prontuarios");
        botaoProntuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProntuariosActionPerformed(evt);
            }
        });

        panelAdicionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Adicionais"));

        checkFuma.setText("Fuma");

        checkBebe.setText("Bebe");

        checkCardiacas.setText("Doenças Cardiacas");

        checkDiabetes.setText("Diabetes");

        checkColesterol.setText("Colesterol");

        areaAlergias.setColumns(20);
        areaAlergias.setRows(5);
        jScrollPane1.setViewportView(areaAlergias);

        areaCirurgias.setColumns(20);
        areaCirurgias.setRows(5);
        jScrollPane2.setViewportView(areaCirurgias);

        labelCirurgia.setText("Cirurgia");

        labelAlergias.setText("Alergias");

        javax.swing.GroupLayout panelAdicionaisLayout = new javax.swing.GroupLayout(panelAdicionais);
        panelAdicionais.setLayout(panelAdicionaisLayout);
        panelAdicionaisLayout.setHorizontalGroup(
            panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionaisLayout.createSequentialGroup()
                        .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAdicionaisLayout.createSequentialGroup()
                                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkFuma)
                                    .addComponent(checkBebe))
                                .addGap(41, 41, 41)
                                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkColesterol)
                                    .addComponent(checkCardiacas)))
                            .addComponent(checkDiabetes))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionaisLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(panelAdicionaisLayout.createSequentialGroup()
                        .addComponent(labelCirurgia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAlergias)
                        .addGap(263, 263, 263))))
        );
        panelAdicionaisLayout.setVerticalGroup(
            panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionaisLayout.createSequentialGroup()
                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFuma)
                    .addComponent(checkColesterol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBebe)
                    .addComponent(checkCardiacas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkDiabetes)
                .addGap(13, 13, 13)
                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCirurgia)
                    .addComponent(labelAlergias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        panelPessoais.setName(""); // NOI18N

        labelNome.setText("Nome: ");

        labelSobrenome.setText("Sobrenome: ");

        labelData.setText("Data de Nascimento: ");

        labelEndereco.setText("Endereço: ");

        labelFixo.setText("Telefone Fixo: ");

        labelCelular.setText("Telefone Celular: ");

        labelEmail.setText("Email: ");

        labelCpf.setText("CPF: ");

        labelRg.setText("RG: ");

        labelConvenio.setText("Convenio: ");

        try {
            inputCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelPessoaisLayout = new javax.swing.GroupLayout(panelPessoais);
        panelPessoais.setLayout(panelPessoaisLayout);
        panelPessoaisLayout.setHorizontalGroup(
            panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaisLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPessoaisLayout.createSequentialGroup()
                        .addComponent(labelEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(inputEndereco))
                    .addGroup(panelPessoaisLayout.createSequentialGroup()
                        .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNome)
                            .addComponent(inputCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPessoaisLayout.createSequentialGroup()
                                .addComponent(labelSobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSobrenome))
                            .addGroup(panelPessoaisLayout.createSequentialGroup()
                                .addComponent(labelRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputRg))))
                    .addGroup(panelPessoaisLayout.createSequentialGroup()
                        .addComponent(labelFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addGroup(panelPessoaisLayout.createSequentialGroup()
                        .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPessoaisLayout.createSequentialGroup()
                                .addComponent(labelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPessoaisLayout.createSequentialGroup()
                                    .addComponent(labelEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelPessoaisLayout.createSequentialGroup()
                                    .addComponent(labelConvenio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        panelPessoaisLayout.setVerticalGroup(
            panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNome)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSobrenome)
                        .addComponent(inputSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(labelRg)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFixo)
                    .addComponent(labelCelular)
                    .addComponent(inputFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConvenio)
                    .addComponent(inputConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(259, 259, 259))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoProntuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6))
                        .addComponent(panelAdicionais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoProntuarios)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = inputNome.getText();
        String sobrenome = inputSobrenome.getText();
        String data = inputData.getText();
        String endereco = inputEndereco.getText();
        String fixo = inputFixo.getText();
        String celular = inputCelular.getText();
        String email = inputEmail.getText();
        String cpf = inputCpf.getText();
        String rg = inputRg.getText();
        String convenio = inputConvenio.getText();
        Boolean fuma = checkFuma.isSelected();
        Boolean bebe = checkBebe.isSelected();
        Boolean diabetes = checkDiabetes.isSelected();
        Boolean colesterol = checkColesterol.isSelected();
        Boolean cardiacas = checkCardiacas.isSelected();
        String cirurgias = areaCirurgias.getText();
        String alergias = areaAlergias.getText();
        Date dataAux = null;
        dataAux = DataHoraUtil.stringToDate(data);
        if (this.paciente == null) {
            Paciente paciente = new Paciente(convenio, fuma, bebe, diabetes, colesterol, cardiacas, cirurgias, alergias, nome, sobrenome, dataAux, fixo, celular, email, endereco, cpf, rg);
            if (controlePaciente.salvar(paciente) != null) {
                this.dispose();
            };
        } else {
            this.paciente.setNome(nome);
            this.paciente.setSobrenome(sobrenome);
            this.paciente.setCpf(cpf);
            this.paciente.setRg(rg);
            this.paciente.setDataNascimento(dataAux);
            this.paciente.setEndereco(endereco);
            this.paciente.setTelefoneFixo(fixo);
            this.paciente.setTelefoneCelular(celular);
            this.paciente.setEmail(email);
            this.paciente.setConvenio(convenio);
            this.paciente.setFuma(fuma);
            this.paciente.setBebe(bebe);
            this.paciente.setDiabetes(diabetes);
            this.paciente.setColesterol(colesterol);
            this.paciente.setDoencasCardiacas(cardiacas);
            this.paciente.setCirurgias(cirurgias);
            this.paciente.setAlergias(alergias);
            if (controlePaciente.salvar(this.paciente) != null) {
                this.dispose();
            };
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoProntuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProntuariosActionPerformed
        TelaProntuario prontuario = new TelaProntuario(this.usuario);
        prontuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProntuariosActionPerformed

    private void botaoCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botaoCancelarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAlergias;
    private javax.swing.JTextArea areaCirurgias;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoProntuarios;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JCheckBox checkBebe;
    private javax.swing.JCheckBox checkCardiacas;
    private javax.swing.JCheckBox checkColesterol;
    private javax.swing.JCheckBox checkDiabetes;
    private javax.swing.JCheckBox checkFuma;
    private javax.swing.JFormattedTextField inputCelular;
    private javax.swing.JTextField inputConvenio;
    private javax.swing.JFormattedTextField inputCpf;
    private javax.swing.JFormattedTextField inputData;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JFormattedTextField inputFixo;
    private javax.swing.JTextField inputNome;
    private javax.swing.JFormattedTextField inputRg;
    private javax.swing.JTextField inputSobrenome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAlergias;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCirurgia;
    private javax.swing.JLabel labelConvenio;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFixo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelSobrenome;
    private javax.swing.JPanel panelAdicionais;
    private javax.swing.JPanel panelPessoais;
    // End of variables declaration//GEN-END:variables
}
