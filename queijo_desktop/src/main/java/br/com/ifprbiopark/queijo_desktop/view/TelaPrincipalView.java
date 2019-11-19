package br.com.ifprbiopark.queijo_desktop.view;

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalView() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        painelDesktop = new javax.swing.JDesktopPane();
        pnlMenssagem = new javax.swing.JPanel();
        lblMenssagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuPessoa = new javax.swing.JMenuItem();
        menuEntradaLeite = new javax.swing.JMenuItem();
        menuClassificacaoLeite = new javax.swing.JMenuItem();
        menuItem = new javax.swing.JMenuItem();
        menuProcessamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        painelDesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelDesktopLayout = new javax.swing.GroupLayout(painelDesktop);
        painelDesktop.setLayout(painelDesktopLayout);
        painelDesktopLayout.setHorizontalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        painelDesktopLayout.setVerticalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        lblMenssagem.setText(" ");

        javax.swing.GroupLayout pnlMenssagemLayout = new javax.swing.GroupLayout(pnlMenssagem);
        pnlMenssagem.setLayout(pnlMenssagemLayout);
        pnlMenssagemLayout.setHorizontalGroup(
            pnlMenssagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenssagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenssagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMenssagemLayout.setVerticalGroup(
            pnlMenssagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenssagemLayout.createSequentialGroup()
                .addComponent(lblMenssagem)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        menuCadastro.setText("Cadastro");

        menuPessoa.setText("Pessoa");
        menuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPessoaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuPessoa);

        menuEntradaLeite.setText("Entrada de Leite");
        menuEntradaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntradaLeiteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEntradaLeite);

        menuClassificacaoLeite.setText("Classificação de Leite");
        menuClassificacaoLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClassificacaoLeiteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuClassificacaoLeite);

        menuItem.setText("Item");
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItem);

        menuProcessamento.setText("Processamento");
        menuProcessamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcessamentoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuProcessamento);

        jMenuBar1.add(menuCadastro);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop)
            .addComponent(pnlMenssagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelDesktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenssagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPessoaActionPerformed
        try {
            TelaPessoaView formPessoa = new TelaPessoaView();
            painelDesktop.add(formPessoa);
            formPessoa.setMaximum(false);
            formPessoa.setVisible(true);
            formPessoa.setPosicao();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuPessoaActionPerformed

    private void menuEntradaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntradaLeiteActionPerformed
        try {
            TelaColetaLeiteView formEntradaLeite = new TelaColetaLeiteView();
            painelDesktop.add(formEntradaLeite);
            formEntradaLeite.setMaximum(false);
            formEntradaLeite.setVisible(true);
            formEntradaLeite.setPosicao();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuEntradaLeiteActionPerformed

    private void menuClassificacaoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClassificacaoLeiteActionPerformed
        try {
            TelaClassificacaoLeiteView formClassificacaoLeite = new TelaClassificacaoLeiteView();
            painelDesktop.add(formClassificacaoLeite);
            formClassificacaoLeite.setMaximum(false);
            formClassificacaoLeite.setVisible(true);
            formClassificacaoLeite.setPosicao();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_menuClassificacaoLeiteActionPerformed

    private void menuProcessamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcessamentoActionPerformed
        try {
            TelaProcessamentoView formProcessamentoe = new TelaProcessamentoView();
            painelDesktop.add(formProcessamentoe);
            formProcessamentoe.setMaximum(false);
            formProcessamentoe.setVisible(true);
            formProcessamentoe.setPosicao();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuProcessamentoActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed
        try {
            TelaItemView formItem = new TelaItemView();
            painelDesktop.add(formItem);
            formItem.setMaximum(false);
            formItem.setVisible(true);
            formItem.setPosicao();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_menuItemActionPerformed

    public void setMenssagem(String menssagem, Color corFundo) {
        lblMenssagem.setText(menssagem);
        lblMenssagem.setForeground(Color.WHITE);
        lblMenssagem.setBackground(corFundo);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                lblMenssagem.setText(" ");
                lblMenssagem.setForeground(Color.BLACK);
                lblMenssagem.setBackground(Color.LIGHT_GRAY);
            }
        }, 5000, 1000);
        
        timer.cancel();
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblMenssagem;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuClassificacaoLeite;
    private javax.swing.JMenuItem menuEntradaLeite;
    private javax.swing.JMenuItem menuItem;
    private javax.swing.JMenuItem menuPessoa;
    private javax.swing.JMenuItem menuProcessamento;
    private javax.swing.JDesktopPane painelDesktop;
    private javax.swing.JPanel pnlMenssagem;
    // End of variables declaration//GEN-END:variables
}
