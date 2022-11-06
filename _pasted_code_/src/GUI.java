import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.math.*;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.ImageIcon;
public class GUI {
private JFrame frmFichaDePagamento;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JCheckBox chckbxNewCheckBox;

private JCheckBox chckbxNewCheckBox_1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GUI window = new GUI();
window.frmFichaDePagamento.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public GUI() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmFichaDePagamento = new JFrame();
frmFichaDePagamento.setBackground(SystemColor.desktop);
frmFichaDePagamento.setResizable(false);
frmFichaDePagamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmFichaDePagamento.setForeground(Color.LIGHT_GRAY);

frmFichaDePagamento.getContentPane().setBackground(SystemColor.control);
frmFichaDePagamento.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PRO
FESSOR\\Downloads\\Nap2PPO\\Nap2PPO\\Preppy-icon.png"));
frmFichaDePagamento.getContentPane().setFont(new Font("Yu Gothic UI Semibold",
Font.PLAIN, 12));
frmFichaDePagamento.setTitle("Ficha de Pagamento L\u00EDquido de Funcion\u00E1rios");
frmFichaDePagamento.setBounds(100, 100, 665, 492);
frmFichaDePagamento.getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Nome do(a) Funcionário(a):");
lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel.setBounds(71, 69, 172, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("C\u00F3digo do(a) Funcion\u00E1rio(a):");
lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_1.setBounds(71, 34, 172, 20);
frmFichaDePagamento.getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("Salário Base (R$):");
lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_2.setBounds(71, 104, 150, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("Total de Horas Trabalhadas (h/m):");
lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_3.setBounds(71, 139, 212, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_3);

JLabel lblNewLabel_4 = new JLabel("Total de Vendas Mensais (R$):");
lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_4.setBounds(71, 174, 183, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_4);
JLabel lblNewLabel_5 = new JLabel("Total em Adiantamentos (R$): ");
lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_5.setBounds(71, 208, 183, 14);

JLabel lblNewLabel_6 = new JLabel("Descontar INSS?");
lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_6.setBounds(71, 246, 150, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_6);
JLabel lblNewLabel_7 = new JLabel("Salário Bruto (R$):");
lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_7.setBounds(358, 352, 106, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_7);
JLabel lblNewLabel_8 = new JLabel("Sal\u00E1rio L\u00EDquido (R$):");
lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
lblNewLabel_8.setBounds(71, 349, 127, 14);
frmFichaDePagamento.getContentPane().add(lblNewLabel_8);
textField = new JTextField();
textField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField.setBounds(279, 34, 286, 20);
frmFichaDePagamento.getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_1.setBounds(279, 69, 286, 20);
frmFichaDePagamento.getContentPane().add(textField_1);
textField_1.setColumns(10);
textField_2 = new JTextField();
textField_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_2.setBounds(280, 104, 129, 20);
frmFichaDePagamento.getContentPane().add(textField_2);
textField_2.setColumns(10);
textField_3 = new JTextField();
textField_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_3.setBounds(280, 139, 129, 20);
frmFichaDePagamento.getContentPane().add(textField_3);

textField_3.setColumns(10);
textField_4 = new JTextField();
textField_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_4.setBounds(280, 174, 129, 20);
frmFichaDePagamento.getContentPane().add(textField_4);
textField_4.setColumns(10);
textField_5 = new JTextField();
textField_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_5.setBounds(280, 208, 129, 20);
frmFichaDePagamento.getContentPane().add(textField_5);
textField_5.setColumns(10);
textField_6 = new JTextField();
textField_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_6.setBounds(479, 349, 86, 20);
frmFichaDePagamento.getContentPane().add(textField_6);
textField_6.setColumns(10);
textField_7 = new JTextField();
textField_7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
textField_7.setBounds(197, 349, 86, 20);
frmFichaDePagamento.getContentPane().add(textField_7);
textField_7.setColumns(10);
//PRIMEIRA CHECKBOX "SIM";
chckbxNewCheckBox = new JCheckBox("SIM");
chckbxNewCheckBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
chckbxNewCheckBox.addActionListener(new ActionListener() {
//QUANDO A CHECKBOX "SIM" FOR ACIONADA A OUTRA RETORNA FALSE;
double inss = 0;
public void actionPerformed(ActionEvent arg0) {
chckbxNewCheckBox_1.setSelected(false);
}
});

chckbxNewCheckBox.setBounds(278, 245, 59, 23);
frmFichaDePagamento.getContentPane().add(chckbxNewCheckBox);
//SEGUNDA CHECKBOX "NÃO";
chckbxNewCheckBox_1 = new JCheckBox("NÃO");
chckbxNewCheckBox_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
chckbxNewCheckBox_1.addActionListener(new ActionListener() {
//QUANDO A CHECKBOX "NÃO" FOR ACIONADA A OUTRA RETORNA FALSE;
public void actionPerformed(ActionEvent e) {
chckbxNewCheckBox.setSelected(false);
}
});
chckbxNewCheckBox_1.setBounds(350, 245, 59, 23);
frmFichaDePagamento.getContentPane().add(chckbxNewCheckBox_1);
//BOTÃO "CALCULAR";
JButton btnNewButton = new JButton("Calcular");
btnNewButton.setForeground(Color.BLACK);
btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//VARIÁVEIS UTILIZADAS NOS CÁLCULOS;
double salbase, liquido, bruto; //VARIÁVEIS REFERENTES AO SALÁRIO;
double horastrabalhadas, horasextras, valorhora, vendas, totalHorasExtras; //CÁLCULO
DOS ACRÉSSIMOS NO SALÁRIO;
double adiantamento, inss; //CÁLCULO DOS DESCONTOS NO SALÁRIO;
//PEGANDO AS INFORMAÇÕES DO TECLADO E PASSANDO ELAS PARA O TIPO "DOUBLE";
salbase = Double.parseDouble(textField_2.getText());
vendas = Float.parseFloat(textField_4.getText());
horastrabalhadas = Float.parseFloat(textField_3.getText());
adiantamento = Float.parseFloat(textField_5.getText()); //CÁLCULO DE
HORAS EXTRAS;
valorhora = (salbase/220)*1.5; //220h É A JORNADA DE TRABALHO MENSAL OBRIGATÓRIA DE
UM TRABALHADOR CLT;

//NO REGIME CLT, O SALÁRIO BASE DIVIDIDO PELA QUANTIDADE DE HORAS RESULTA
//NO VALOR EM REAIS DE CADA HORA; ESSE VALOR SERÁ ACRESCIDO EM 50%,
//POIS, A HORA EXTRA É 50% MAIOR QUE A HORA NORMAL;
horasextras = horastrabalhadas - 220; //SÃO CONSIDERADAS HORAS EXTRAS O QUE PASSAR DE
220
totalHorasExtras = (horasextras * valorhora); //O TOTAL DE HORAS EXTRAS SERÁ O
PRODUTO
//DA HORA EXTRA COM ACRÉSCIMO E DO
//VALOR DA HORA DE TRABALHO;
//CÁLCULO DA COMISSÃO POR VENDAS;
vendas = (vendas/100) * 5; //O FUNCIONÁRIO RECEBERÁ 5% REFERENTE AO VALOR TOTAL EM
//VENDAS EFETUADOS DURANTE O MÊS;
//CÁLCULO DO INSS, OS IFS DEFINEM A PORCENTAGEM QUE SERÁ DESCONTADA DE CADA FAIXA
SALARIAL;
inss = 0;
if (salbase < 1212)
inss = (salbase/100) * 7.5;
else if (salbase > 1212.1 && salbase < 2427.79)
inss = ((salbase/100) * 9) - 18.18;
else if (salbase > 2427.80 && salbase < 3641.69)
inss = ((salbase/100) * 12) - 91;
else if (salbase > 3641.67 && salbase < 7087.22)
inss = ((salbase/100) * 14) - 163.82;

//CÁLCULO SALÁRIO LÍQUIDO;
liquido = salbase + vendas + totalHorasExtras - adiantamento; //ADIANTAMENTO É O
VALOR RETIRADO PELO
//FUNCIONÁRIO DURANTE O MÊS E QUE É DESCONTADO
//DE SEU SALÁRIO; //CÁLCULO SALÁRIO BRUTO;
bruto = salbase;

//CONDIÇÃO PARA DESCONTAR O INSS;
if (chckbxNewCheckBox.isSelected()) { //SE A CHECKBOX ESTIVER SELECIONADA OCORRERÁ O
DESCONTO;
liquido = liquido - inss;
}

//SETANDO O VALOR LÍQUIDO NO CAMPO DE TEXTO PARA QUE APAREÇA NA TELA
textField_7.setText(String.valueOf(liquido).format("%.2f", liquido));
//SETANDO O VALOR BRUTO NO CAMPO DE TEXTO PARA QUE APAREÇA NA TELA;
textField_6.setText(String.valueOf(bruto).format("%.2f", bruto));
}
});
btnNewButton.setBounds(454, 286, 111, 30);
frmFichaDePagamento.getContentPane().add(btnNewButton);
//BOTÃO "SALVAR E LIMPAR";
JButton btnNewButton_1 = new JButton("Salvar e Limpar");
btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//PEGANDO OS DADOS DO TECLADO E SETANDO NAS VARIÁVEIS DA CLASSE "DadosFuncionários";
DadosFuncionários dadosfuncionarios = new DadosFuncionários();
dadosfuncionarios.setNumeroFun(textField_1.getText());
dadosfuncionarios.setNomeFun(textField.getText());
dadosfuncionarios.setSalBase(textField_2.getText());
dadosfuncionarios.setHoras(textField_3.getText());
dadosfuncionarios.setVendas(textField_4.getText());
dadosfuncionarios.setAdiant(textField_5.getText());
dadosfuncionarios.setSalBruto(textField_6.getText());
dadosfuncionarios.setSalLiquido(textField_7.getText());
//MENSAGEM DE CADASTRO CONCLUIDO;
JOptionPane.showMessageDialog(

frmFichaDePagamento,
dadosfuncionarios.Salvar(),
"Cadastro realizado com sucesso!",
JOptionPane.PLAIN_MESSAGE
);

//LIMPANDO OS CAMPOS DE TEXTO E AS CHECKBOXS;
textField.setText("");
textField_1.setText("");

textField_2.setText("");
textField_3.setText("");
textField_4.setText("");
textField_5.setText("");
textField_6.setText("");
textField_7.setText("");
chckbxNewCheckBox.setSelected(false);
chckbxNewCheckBox_1.setSelected(false);
}
});
btnNewButton_1.setBounds(71, 397, 127, 30);
frmFichaDePagamento.getContentPane().add(btnNewButton_1);
//BOTÃO "SAIR";
JButton btnNewButton_2 = new JButton("Sair");
btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//PAINEL PEDINDO AÇÃO DE CONFIRMAÇÃO PARA SAIR;
Object[] options = {"NÃO", "SIM" };
int escolha = JOptionPane.showOptionDialog(

frmFichaDePagamento,
"Deseja realmente sair? ",
"Ação necessária!",
JOptionPane.DEFAULT_OPTION,
JOptionPane.WARNING_MESSAGE,
null, options, options [1]
);

//0 PARA NÃO SAIR E 1 PARA SAIR;
if (escolha == 0) {
}
else if(escolha == 1){

System.exit(0);
}
}
});
btnNewButton_2.setBounds(454, 397, 111, 32);
frmFichaDePagamento.getContentPane().add(btnNewButton_2);
//APLICANDO FUNDO PERSONALIZADO NA INTERFACE GRÁFICA ULTIZANDO JLABEL;
JLabel label = new JLabel("");
label.setIcon(new ImageIcon("C:\\Users\\PROFESSOR\\Pictures\\azul.png"));
label.setBounds(0, -18, 708, 481);
frmFichaDePagamento.getContentPane().add(label);
}
}