package pjAula10_16_04.br.program.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pjAula10_16_04.br.program.modelagem.Produto;
import pjAula10_16_04.br.program.modelagem.Situacao;
import pjAula10_16_04.br.program.modelagem.UnidadeMedida;


public class frmProduto extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JLabel lbCodigo, lbDescricao, lbUnidadeMedida, lbLargura, lbComprimento, lbSituacao, lbLocalizacao;
	JTextField txtCodigo, txtDescricao, txtLargura, txtComprimento, txtLocalizacao;
	@SuppressWarnings("rawtypes")
	JComboBox cbxUnidadeMedida, cbxSituacao;
	JPanel pnCampos, pnBotoes;
	JButton btnIncluir, btnExcluir, btnAlterar, btnPesquisar, btnLimpar;
	List<Produto> bdProduto = new ArrayList<Produto>();
	
	public frmProduto() {
		super("Cadastro de produto");
		setSize(500,250);
		setLayout(new BorderLayout());
		
		lbCodigo = new JLabel("C�digo");
		lbComprimento = new JLabel("Comprimento");
		lbDescricao = new JLabel("Descri��o");
		lbLargura = new JLabel("Largura");
		lbLocalizacao = new JLabel("Localiza��o");
		lbSituacao = new JLabel("Situa��o");
		lbUnidadeMedida = new JLabel("Un. medida");
		
		txtCodigo = new JTextField(20);
		txtComprimento = new JTextField(20);
		txtDescricao = new JTextField(20);
		txtLargura = new JTextField(20);
		txtLocalizacao = new JTextField(20);
		
		btnAlterar = new JButton("Alterar");
		btnExcluir = new JButton("Excluir");
		btnIncluir = new JButton("Incluir");
		btnPesquisar = new JButton("Pesquisar");
		btnLimpar = new JButton("Limpar");
		
		cbxSituacao = new JComboBox<Situacao>(Situacao.values());
		cbxUnidadeMedida = new JComboBox<String>(UnidadeMedida.getUnidades());
		
		pnCampos = new JPanel(new GridLayout(7,2));
		pnBotoes = new JPanel(new GridLayout(1,4));
		
		pnCampos.add(lbCodigo);
		pnCampos.add(txtCodigo);
		
		pnCampos.add(lbComprimento);
		pnCampos.add(txtComprimento);
		
		pnCampos.add(lbDescricao);
		pnCampos.add(txtDescricao);
		
		pnCampos.add(lbLargura);
		pnCampos.add(txtLargura);
		
		pnCampos.add(lbLocalizacao);
		pnCampos.add(txtLocalizacao);
		
		pnCampos.add(lbSituacao);
		pnCampos.add(cbxSituacao);
		
		pnCampos.add(lbUnidadeMedida);
		pnCampos.add(cbxUnidadeMedida);
		
		add(pnCampos, BorderLayout.CENTER);
		
		pnBotoes.add(btnIncluir);
		pnBotoes.add(btnPesquisar);
		pnBotoes.add(btnAlterar);
		pnBotoes.add(btnExcluir);
		pnBotoes.add(btnLimpar);
		
		add(pnBotoes, BorderLayout.SOUTH);
		
		setVisible(true);
		
		btnIncluir.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnPesquisar.addActionListener(this);
		btnLimpar.addActionListener(this);
	}
	
	
	
	private Produto instanciar(){
		Produto p = new Produto();
		try {
			p.setCodigo(Integer.parseInt(txtCodigo.getText()));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Codigo de produto invalido", "Valida��o", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		try {
			p.setComprimento(Float.parseFloat(txtComprimento.getText()));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Comprimento invalido", "Valida��o", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		
		try {
			p.setLargura(Float.parseFloat(txtLargura.getText()));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Largura invalida", "Valida��o", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		p.setLocalizacao(txtLocalizacao.getText());
		p.setDescricao(txtDescricao.getText());
		p.setSituacao(Situacao.values()[cbxSituacao.getSelectedIndex()]);
		p.setUn(UnidadeMedida.values()[cbxUnidadeMedida.getSelectedIndex()]);
		
		return p;
	}
	
	public static void main(String[] args) {
		frmProduto frm = new frmProduto();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void limpar(){
		txtCodigo.setText(null);
		txtComprimento.setText(null);
		txtDescricao.setText(null);
		txtLargura.setText(null);
		txtLocalizacao.setText(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIncluir) {
			Produto p = instanciar();
			if(p != null) {
				bdProduto.add(p);
				limpar();
			}
		}
		if(e.getSource() == btnAlterar) {
			for(Produto p: bdProduto) {
				if(Integer.parseInt(txtCodigo.getText()) == p.getCodigo()) {
					Produto teste = new Produto();
					if(teste != null) {
						p = instanciar();
						JOptionPane.showConfirmDialog(null, "Alterado");
						limpar();
					}
				}
			}
		}
		System.out.println(bdProduto);
	}	
}
