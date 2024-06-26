/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemacadstro2.telas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import sistemacadstro2.entities.Aluno;
import sistemacadstro2.services.Servico;

/**
 *
 * @author lucas
 */
public class AlterarDados extends javax.swing.JFrame {

    ArrayList<Aluno> lista;
    Aluno aluno;
    Servico service;

    /**
     * Creates new form DetalhesAluno
     */
    public String verificarPermissao(boolean x) {
        if (x) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public AlterarDados(Aluno aluno, Servico service) {
        initComponents();
        this.aluno = aluno;
        this.service = service;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        nome.setText(aluno.getName());
        peso.setText(String.valueOf(aluno.getPeso()));
        telefone.setText(aluno.getNum_contato());
        idade.setText(String.valueOf(aluno.getIdade()));
        faltas.setText(String.valueOf(aluno.getFaltas()));
        niver.setText(aluno.getAniversario().format(fmt));
        responsavel.setText(aluno.getNome_responsavel());
        email.setText(aluno.getEmail());
        escola.setText(aluno.getEscola());
        medicamento.setText(aluno.getMedicamento_cotinuo());
        observacao.setText(aluno.getObservacao());
        endereco.setText(aluno.getEndereco());
        bairro.setText(aluno.getBairro());
        CEP.setText(aluno.getCep());
        roupa.setText(aluno.getTamanho_roupa());
        calcado.setText(aluno.getTamanho_calcado());
        categora.setText(aluno.getCategoria());
        grau.setText(String.valueOf(aluno.getGrau()));
        faixa.setText(aluno.getFaixa());

        treinar.setSelected(aluno.getAutorizacao_treino());
        competir.setSelected(aluno.getAutorizacao_competicao());
        imagear.setSelected(aluno.getAutorizacao_imagem());
        ativo.setSelected(aluno.getAtivo());

        ArrayList<DayOfWeek> doAluno = aluno.getDiasSemana();
        if (doAluno.contains(DayOfWeek.MONDAY)) {
            segunda.setSelected(true);
          
        }
        if (doAluno.contains(DayOfWeek.TUESDAY)) {
            terca.setSelected(true);
        }
        if (doAluno.contains(DayOfWeek.WEDNESDAY)) {
            quarta.setSelected(true);
        }
        if (doAluno.contains(DayOfWeek.THURSDAY)) {
            quinta.setSelected(true);
        }
        if (doAluno.contains(DayOfWeek.FRIDAY)) {
            sexta.setSelected(true);
        }

    }

    public AlterarDados() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        niver = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        roupa = new javax.swing.JTextField();
        calcado = new javax.swing.JTextField();
        categora = new javax.swing.JTextField();
        faixa = new javax.swing.JTextField();
        grau = new javax.swing.JTextField();
        responsavel = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        escola = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        CEP = new javax.swing.JTextField();
        medicamento = new javax.swing.JTextField();
        observacao = new javax.swing.JTextField();
        treinar = new javax.swing.JCheckBox();
        competir = new javax.swing.JCheckBox();
        imagear = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        ativo = new javax.swing.JCheckBox();
        peso = new javax.swing.JTextField();
        faltas = new javax.swing.JTextField();
        segunda = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        terca = new javax.swing.JCheckBox();
        quarta = new javax.swing.JCheckBox();
        quinta = new javax.swing.JCheckBox();
        sexta = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Endereço");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 81, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Peso:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 59, -1));

        idade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idade.setText("Idade: ");
        getContentPane().add(idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 64, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Idade: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 64, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Faltas: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 64, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Aniversário:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jButton2.setText("Confirmar Alterações");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nome Responsável:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Logradouro:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Bairro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CEP:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Tamanho da Roupa:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 168, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Tamanho do Calçado:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 180, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Categoria:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 168, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Grau:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 168, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Faixa:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 168, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Escola:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Medicamento Contínuo?");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Observação?");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Autorização de Imagem:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Permissão para Treinar:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Permissão para Competir:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, -1));
        getContentPane().add(niver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 180, -1));
        getContentPane().add(roupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 180, -1));

        calcado.setText("jTextField1");
        getContentPane().add(calcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 180, -1));

        categora.setText("jTextField1");
        getContentPane().add(categora, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 180, -1));

        faixa.setText("jTextField1");
        getContentPane().add(faixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 180, -1));

        grau.setText("grau");
        getContentPane().add(grau, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 180, -1));

        responsavel.setText("jTextField1");
        getContentPane().add(responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 270, -1));

        endereco.setText("jTextField1");
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 270, -1));

        email.setText("jTextField1");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 270, -1));

        escola.setText("jTextField1");
        escola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolaActionPerformed(evt);
            }
        });
        getContentPane().add(escola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 180, -1));

        bairro.setText("jTextField1");
        getContentPane().add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 270, -1));

        CEP.setText("jTextField1");
        getContentPane().add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 180, -1));

        medicamento.setText("jTextField1");
        getContentPane().add(medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 270, -1));

        observacao.setText("jTextField1");
        getContentPane().add(observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 270, -1));

        treinar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(treinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, 30));

        competir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(competir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, 30));

        imagear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(imagear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, -1, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Ativo?");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, -1));

        ativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(ativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, 30));
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, -1));

        faltas.setText("jTextField1");
        getContentPane().add(faltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 180, -1));

        segunda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        segunda.setText("Segunda");
        getContentPane().add(segunda, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Dias de Treino");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        terca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terca.setText("Terça");
        getContentPane().add(terca, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        quarta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quarta.setText("Quarta");
        getContentPane().add(quarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        quinta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quinta.setText("Quinta");
        getContentPane().add(quinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, -1, -1));

        sexta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexta.setText("Sexta");
        getContentPane().add(sexta, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 680));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 59, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Aluno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Treino");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 90, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 960, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Contato");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 90, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 20, 680));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 20, 680));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 20, 680));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 960, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 320, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Alteração de Dados");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 340, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lista = service.read();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Integer posicao = lista.indexOf(aluno);
        Aluno mudado = aluno;
        mudado.setAniversario(LocalDate.parse(niver.getText(), fmt));
        mudado.setAutorizacao_competicao(competir.isSelected());
        mudado.setAutorizacao_imagem(imagear.isSelected());
        mudado.setAutorizacao_treino(treinar.isSelected());
        mudado.setBairro(bairro.getText());
        mudado.setCategoria(categora.getText());
        mudado.setCep(CEP.getText());
        mudado.setEmail(email.getText());
        mudado.setEndereco(endereco.getText());
        mudado.setEscola(escola.getText());
        mudado.setFaixa(faixa.getText());
        mudado.setGrau(Integer.parseInt(grau.getText()));
        mudado.setMedicamento_cotinuo(medicamento.getText());
        mudado.setName(nome.getText());
        mudado.setNome_responsavel(responsavel.getText());
        mudado.setNum_contato(telefone.getText());
        mudado.setObservacao(observacao.getText());
        mudado.setPeso(Double.parseDouble(peso.getText()));
        mudado.setTamanho_calcado(calcado.getText());
        mudado.setTamanho_roupa(roupa.getText());
        mudado.setAtivo(ativo.isSelected());
        mudado.setPeso(Double.parseDouble(peso.getText()));
        mudado.setFaltas(Integer.parseInt(faltas.getText()));

        ArrayList<DayOfWeek> allDays;
        allDays = new ArrayList<>();
        if (segunda.isSelected()) {
            allDays.add(DayOfWeek.MONDAY);
        }
        if (terca.isSelected()) {
            allDays.add(DayOfWeek.TUESDAY);
        }
        if (quarta.isSelected()) {
            allDays.add(DayOfWeek.WEDNESDAY);
        }
        if (quinta.isSelected()) {
            allDays.add(DayOfWeek.THURSDAY);
        }
        if (sexta.isSelected()) {
            allDays.add(DayOfWeek.FRIDAY);
        }
        mudado.setDiasSemana(allDays);
        lista.set(posicao, mudado);

        service.atualizarLista(lista);

        this.dispose();
        DetalhesAluno da = new DetalhesAluno(mudado, service);
        da.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void escolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolaActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEP;
    private javax.swing.JCheckBox ativo;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField calcado;
    private javax.swing.JTextField categora;
    private javax.swing.JCheckBox competir;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField escola;
    private javax.swing.JTextField faixa;
    private javax.swing.JTextField faltas;
    private javax.swing.JTextField grau;
    private javax.swing.JLabel idade;
    private javax.swing.JCheckBox imagear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField medicamento;
    private javax.swing.JTextField niver;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField observacao;
    private javax.swing.JTextField peso;
    private javax.swing.JCheckBox quarta;
    private javax.swing.JCheckBox quinta;
    private javax.swing.JTextField responsavel;
    private javax.swing.JTextField roupa;
    private javax.swing.JCheckBox segunda;
    private javax.swing.JCheckBox sexta;
    private javax.swing.JTextField telefone;
    private javax.swing.JCheckBox terca;
    private javax.swing.JCheckBox treinar;
    // End of variables declaration//GEN-END:variables
}
