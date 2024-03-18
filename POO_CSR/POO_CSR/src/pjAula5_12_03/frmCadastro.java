package pjAula5_12_03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author CaueSpalla
 * @data 12/03/2024
 *Classe de modelagem conceitual de cadastro
 */
public class frmCadastro extends JFrame implements ActionListener{
	//1º Passo - Declaração
	JButton btnCadastrar, btnLimpar;
	JTextField txtSenha, txtNome;
	JLabel lbNome, lbSenha;
	JPanel pnCampos, pnBotoes, pnGrid;
	JButton vetButtons[];
	public frmCadastro(){
		super("Login");
		setSize(240,240);
		setLayout(new BorderLayout());
		
		//2 passo construção
		lbNome = new JLabel("Nome");
		lbSenha = new JLabel("Senha");
		txtNome = new JTextField(20);
		txtSenha = new JTextField(20);
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		pnCampos = new JPanel(new FlowLayout());
		pnBotoes = new JPanel(new FlowLayout());
		pnGrid = new JPanel(new GridLayout(4,4));
		vetButtons = new JButton[16];
		
		for (int i = 0; i <= 9; i++) {
			JButton button = new JButton(String.valueOf(i));
			vetButtons[i] = button; 
		}
		
		//3 passo Adicinar elementos a gui
		pnCampos.add(lbNome);
		pnCampos.add(txtNome);
		pnCampos.add(lbSenha);
		pnCampos.add(txtSenha);
		
		pnBotoes.add(btnCadastrar);
		pnBotoes.add(btnLimpar);
		
		for (int i = 0; i <= 9; i++) {
			pnGrid.add(vetButtons[i]);
			vetButtons[i].addActionListener(this);
		}
		
		add(pnCampos, new BorderLayout().NORTH);
		add(pnGrid, new BorderLayout().CENTER);
		add(pnBotoes, new BorderLayout().SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		txtNome.setText(e.getSource().toString());
	}
}
