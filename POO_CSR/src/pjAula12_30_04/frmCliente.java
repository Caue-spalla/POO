package pjAula12_30_04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class frmCliente extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	JLabel lbNome, lbCNPJ, lbTelefone, lbStatus;
	JTextField txtNome;
	JFormattedTextField txtCNPJ, txtTelefone;
	JComboBox<String> cbxStatus;
	MaskFormatter maskCNPJ, maskTelefone;
	String status[] = {"Ativo","Inativo"};
	JButton btCadastrar, btLimpar, btPesquisar, btSair;
	JPanel pnCampos, pnButtons;
	BorderLayout layout;
	GridLayout gridCampos, gridButtons;
	File arquivo = new File("Clientes.txt");
	
	public frmCliente() {
		setTitle("Cadastro de clientes.");
		setLayout(layout = new BorderLayout());
		setSize(400,200);
		setLocation(150,150);
		
		pnCampos = new JPanel();
		pnButtons = new JPanel();
		gridCampos = new GridLayout(4,2);
		gridButtons = new GridLayout(1,4);
		lbCNPJ = new JLabel("CNPJ: ");
		lbStatus = new JLabel("Status: ");
		lbTelefone = new JLabel("Telefone: ");
		lbNome = new JLabel("Nome: ");
		
		txtNome = new JTextField(20);
		
		try {
			maskCNPJ = new MaskFormatter("##.###.###/####-##");
			maskTelefone = new MaskFormatter("(##)####-#####");
		} catch (ParseException e) {
			System.err.println("Falha na máscara.");
		}
		
		txtCNPJ = new JFormattedTextField(maskCNPJ);
		txtTelefone = new JFormattedTextField(maskTelefone);
		
		cbxStatus = new JComboBox<String>(status);
		
		btCadastrar = new JButton("Cadastrar");
		btCadastrar.setMnemonic('C');
		btCadastrar.setToolTipText("Cadastra o cliente.");
		btCadastrar.addActionListener(this);
		
		btPesquisar = new JButton("Pesquisar");
		btPesquisar.setMnemonic('P');
		btPesquisar.setToolTipText("Pesquisa pelo cliente.");
		btPesquisar.addActionListener(this);
		
		btLimpar = new JButton("Limpar");
		btLimpar.setMnemonic('L');
		btLimpar.setToolTipText("Limpa os campos.");
		btLimpar.addActionListener(this);
		
		btSair = new JButton("Sair");
		btSair.setMnemonic('S');
		btSair.setToolTipText("Sai do cadastro.");
		btSair.addActionListener(this);
		
		pnCampos.setLayout(gridCampos);
		pnButtons.setLayout(gridButtons);
		
		pnCampos.add(lbCNPJ);
		pnCampos.add(txtCNPJ);
		pnCampos.add(lbNome);
		pnCampos.add(txtNome);
		pnCampos.add(lbTelefone);
		pnCampos.add(txtTelefone);
		pnCampos.add(lbStatus);
		pnCampos.add(cbxStatus);
		add(pnCampos, BorderLayout.CENTER);
		
		pnButtons.add(btCadastrar);
		pnButtons.add(btPesquisar);
		pnButtons.add(btLimpar);
		pnButtons.add(btSair);
		add(pnButtons, BorderLayout.SOUTH);
		
		setResizable(false);
		setVisible(true);
	}
	
	private void limpar() {
		txtCNPJ.setText("");
		txtNome.setText("");
		txtTelefone.setText("");
		cbxStatus.setSelectedIndex(0);
		txtCNPJ.requestFocus();
	}
	
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btCadastrar) {
			
			try {
				if(!arquivo.exists()) {
					@SuppressWarnings("resource")
					OutputStream f0 = new FileOutputStream("Clientes.txt");
				}
			} catch (FileNotFoundException e2) {
				System.err.println("Arquivo não encontrado.");
			}
			
			PrintWriter out;
			try {
				out = new PrintWriter(new FileWriter(arquivo, true));
				out.print(txtNome.getText());
				out.print(" | ");
				out.print(txtCNPJ.getText());
				out.print(" | ");
				out.print(txtTelefone.getText());
				out.print(" | ");
				out.println(status[cbxStatus.getSelectedIndex()]);
				out.close();
				
				
				JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso!", "Inclusão no arquivo de texto", JOptionPane.INFORMATION_MESSAGE);
				limpar();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Erro na manipulação do arquivo." + e1, "Erro no arquivo de texto", JOptionPane.ERROR_MESSAGE);
			}
			
			
			
			
		}
		if(e.getSource() == btPesquisar) {
			frmConsulta consulta = new frmConsulta(arquivo);
			consulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(e.getSource() == btLimpar) {
			limpar();
		}
		if(e.getSource() == btSair) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		frmCliente frm = new frmCliente();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
