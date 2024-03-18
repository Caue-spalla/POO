package pjAula3_27_02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmAluno extends JFrame{
	JButton btCadastrar, btLimpar;
	JTextField txtNome, txtEndereco;
	JLabel lbNome, lbEndereco;
	private static final long serialVersionUID = 1L;
	public frmAluno() {
		super("Exemplo");
		setSize(300,300);
		setLayout(new FlowLayout());
		
		lbEndereco = new JLabel("Endereço");
		lbNome = new JLabel("Nome");
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		txtEndereco = new JTextField(20);
		txtNome = new JTextField(20);
		
		add(lbEndereco);
		add(txtEndereco);
		add(lbNome);
		add(txtNome);
		add(btCadastrar);
		add(btLimpar);
		setVisible(true);
	}
	public static void main(String[] args) {
		frmAluno form = new frmAluno();		
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
}
