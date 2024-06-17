/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemacadstro2.telas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sistemacadstro2.TelaPrincipal;
import sistemacadstro2.entities.Aluno;
import sistemacadstro2.services.Servico;

/**
 *
 * @author lucas
 */
public class AdcionarPorExcel extends javax.swing.JFrame {

    File file = null;
    Servico service;
    ArrayList<Aluno> lista;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Creates new form AdcionarPorExcel
     */
    public AdcionarPorExcel(Servico service, ArrayList<Aluno> lista) {
        initComponents();
        this.service = service;
        this.lista = lista;
    }

    public AdcionarPorExcel() {
        initComponents();
    }

    public boolean verificaAutorizacao(String stg) {
        if (stg.equalsIgnoreCase("sim") || stg.equalsIgnoreCase("ok") || stg.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }

    public String verificarTextoVazio(String string) {
        if (string == null || string.isEmpty()) {
            return ""; // Retorna uma string vazia se o campo estiver vazio ou nulo
        } else {
            return string.trim(); // Retorna o valor do campo, removendo espaços em branco extras no início e no final
        }
    }

    public double verificarTextoVazioNum(String string) {
        if (string == null || string.isEmpty()) {
            return 0.0; // Retorna 0 se a string estiver vazia ou nula
        } else {
            try {
                return Double.parseDouble(string); // Tenta converter a string em um número
            } catch (NumberFormatException e) {
                System.err.println("Erro ao converter para número: " + e.getMessage());
                return 0.0; // Retorna 0 em caso de erro de conversão
            }
        }
    }

    public LocalDate verificarTextoVazioData(String string) {
        if (string == null || string.isEmpty()) {
            return LocalDate.of(2000, 1, 1); // Retorna uma data padrão se a string estiver vazia ou nula
        } else {
            try {
                return LocalDate.parse(string, fmt); // Tenta converter a string em uma data
            } catch (DateTimeParseException e) {
                System.err.println("Erro ao analisar a data: " + e.getMessage());
                return LocalDate.of(2000, 1, 1); // Retorna uma data padrão em caso de erro de análise
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(textFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 30, 500, -1));

        jButton1.setText("Buscar Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 134, -1));

        jButton2.setText("Adicionar Alunos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicione um arquivo no formato .csv com o padrão aceito:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 5, 710, -1));

        jButton3.setText("Gerar Template CSV");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para adicionar alunos por um arquivo, preencha o template gerado pelo botão \"Gerar Template CSV\".");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 710, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 710, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Atenção! Todos os campos devem estar preenchidos.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 710, -1));

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");

        jf.setFileFilter(filter);
        int retorno = jf.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            file = jf.getSelectedFile();
            textFile.setText(file.getPath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (file == null) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo Selecionado");
        } else {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                lista = service.read();
                ArrayList<DayOfWeek> allDays = new ArrayList<>();
                allDays.addAll(Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.MONDAY, DayOfWeek.THURSDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY));
                String primeiralinha = br.readLine();
                if (primeiralinha.equalsIgnoreCase("Nome,Data de Nascimento,Idade,Nome do Responsavel,Telefone,Email,Endereço,Bairro,Cep,Escola,Tamanho Roupa,Tamanho Calçado,Categoria,Faixa,Grau,Peso,Medicamento Continuo,Observação,Autorização Treino,Autorização Competição,Autorização de Imagem") || primeiralinha.equalsIgnoreCase("Nome;Data de Nascimento;Idade;Nome do Responsavel;Telefone;Email;Endereço;Bairro;Cep;Escola;Tamanho Roupa;Tamanho Calçado;Categoria;Faixa;Grau;Peso;Medicamento Continuo;Observação;Autorização Treino;Autorização Competição;Autorização de Imagem")) {
                    String alno = br.readLine();
                    if (alno.split(",").length > 1) {
                        while (alno != null) {
                            String[] aluno_novo = alno.split(",");
                            Integer id;
                            if (lista == null || lista.size() == 0) {
                                id = 1;
                            } else {
                                id = lista.getLast().getId() + 1;
                            }
                            Aluno novo = new Aluno(verificarTextoVazio(aluno_novo[0]), id, verificarTextoVazio(aluno_novo[4]), verificarTextoVazioNum(aluno_novo[15]), verificarTextoVazioData(aluno_novo[1]), verificarTextoVazio(aluno_novo[3]), verificarTextoVazio(aluno_novo[5]), verificarTextoVazio(aluno_novo[6]), verificarTextoVazio(aluno_novo[7]), verificarTextoVazio(aluno_novo[8]), verificarTextoVazio(aluno_novo[9]), verificarTextoVazio(aluno_novo[10]), verificarTextoVazio(aluno_novo[11]), verificarTextoVazio(aluno_novo[12]), verificarTextoVazio(aluno_novo[13]), (int) verificarTextoVazioNum(aluno_novo[14]), verificarTextoVazio(aluno_novo[16]), verificarTextoVazio(aluno_novo[17]), verificaAutorizacao(aluno_novo[18]), verificaAutorizacao(aluno_novo[19]), verificaAutorizacao(aluno_novo[20]), allDays);
                            lista.add(novo);
                            alno = br.readLine();
                        }
                    } else {
                        while (alno != null) {
                            String[] aluno_novo = alno.split(";");
                            Integer id;
                            if (lista == null || lista.size() == 0) {
                                id = 1;
                            } else {
                                id = lista.getLast().getId() + 1;
                            }
                            Aluno novo = new Aluno(verificarTextoVazio(aluno_novo[0]), id, verificarTextoVazio(aluno_novo[4]), verificarTextoVazioNum(aluno_novo[15]), verificarTextoVazioData(aluno_novo[1]), verificarTextoVazio(aluno_novo[3]), verificarTextoVazio(aluno_novo[5]), verificarTextoVazio(aluno_novo[6]), verificarTextoVazio(aluno_novo[7]), verificarTextoVazio(aluno_novo[8]), verificarTextoVazio(aluno_novo[9]), verificarTextoVazio(aluno_novo[10]), verificarTextoVazio(aluno_novo[11]), verificarTextoVazio(aluno_novo[12]), verificarTextoVazio(aluno_novo[13]), (int) verificarTextoVazioNum(aluno_novo[14]), verificarTextoVazio(aluno_novo[16]), verificarTextoVazio(aluno_novo[17]), verificaAutorizacao(aluno_novo[18]), verificaAutorizacao(aluno_novo[19]), verificaAutorizacao(aluno_novo[20]), allDays);
                            lista.add(novo);
                            alno = br.readLine();
                        }

                    }
                    service.atualizarLista(lista);
                    lista = service.read();
                    TelaPrincipal tc = new TelaPrincipal();
                    tc.setVisible(true);
                    this.dispose();
                } else {
                    throw new RuntimeException("Primeira linha errada");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na leitura \n Verifique o arquivo");
                System.out.println("Erro:" + e.getMessage());
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File path = new File("Template.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write("Nome,Data de Nascimento,Idade,Nome do Responsavel,Telefone,Email,Endereço,Bairro,Cep,Escola,Tamanho Roupa,Tamanho Calçado,Categoria,Faixa,Grau,Peso,Medicamento Continuo,Observação,Autorização Treino,Autorização Competição,Autorização de Imagem");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaPrincipal tc = new TelaPrincipal();
        tc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AdcionarPorExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdcionarPorExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdcionarPorExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdcionarPorExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdcionarPorExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textFile;
    // End of variables declaration//GEN-END:variables
}
