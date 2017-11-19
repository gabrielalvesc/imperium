package br.com.imperium;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.imperium.exceptions.AlunoJaExisteException;

public class MainTesteJO {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem-vindo à academia Imperium!!! :)");
		boolean fecharPrograma = false;
		while(fecharPrograma != true){
			String menuPrincipal = JOptionPane.showInputDialog("1- Aluno\n2- Instrutor\n3- ...\n4- ...\n\nX- Sair").toUpperCase();
			switch (menuPrincipal) {
			case "1":
				boolean sair = false;
				while(sair != true){
					String menuAluno = JOptionPane.showInputDialog("1- Cadastrar aluno\n2- Editar aluno\n3- Pesquisar aluno\n4- Listar alunos\n5- Ramover aluno\n\n6- Voltar");
					switch (menuAluno) {
					case "1":
						boolean continuar = true;
						while (continuar != false){
							Aluno a = new Aluno();
							String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
							a.setNome(nome);
							//setar o nome
							//a.setNome(nome);
							long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF: \n(Digite apenas os números do CPF)"));
							//criar CPF na pessoa
//							try {
//								//verificar se o cpf já não está cadastrado
//							} catch (AlunoJaExisteException e) {
//								JOptionPane.showMessageDialog(null, e.getMessage());
//							}
							String sexo = JOptionPane.showInputDialog(null, "Sexo: \n(Ex: Masculino)").toUpperCase();
							Sexo sex = null;
							if (sexo.equals("MASCULINO")){								
								a.setSexo(sex.MASCULINO);								
							} else if (sexo.equals("FEMININO")){
								a.setSexo(sex.FEMININO);
							}
							//pegar a data de nascimento (Vê se cria a classe data ou usa a do java msm)
							Calendar dtCadastro = null;
							a.setDataDocadastro(dtCadastro.getInstance());
							Endereco e = new Endereco();
							e.setRua(JOptionPane.showInputDialog("Logradouro: "));
							e.setBairro(JOptionPane.showInputDialog("Bairro: "));
							e.setCep(Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
							e.setNumero(JOptionPane.showInputDialog("Número: "));
							e.setCidade(JOptionPane.showInputDialog("Cidade: "));
							a.setEndereco(e);
							a.setTelefone(JOptionPane.showInputDialog("Telefone: "));
							JOptionPane.showMessageDialog(null, "EXAME CORPORAL");
							ExameCorporal x = new ExameCorporal();
							Date hoje = new Date();
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
							x.setData(sdf.format(hoje));
							x.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
							x.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
							x.setAntebracoDireito(Double.parseDouble(JOptionPane.showInputDialog("Antebraço Direito: ")));
							x.setAntebracoEsquerdo(Double.parseDouble(JOptionPane.showInputDialog("Antebraço Esquerdo: ")));
							x.setBracoDireito(Double.parseDouble(JOptionPane.showInputDialog("Braço Direito: ")));
							x.setAntebracoEsquerdo(Double.parseDouble(JOptionPane.showInputDialog("Braço Esquerdo: ")));
							x.setCintura(Double.parseDouble(JOptionPane.showInputDialog("Cintura: ")));
							x.setCoxaDireita(Double.parseDouble(JOptionPane.showInputDialog("Coxa Direita: ")));
							x.setCoxaEsquerda(Double.parseDouble(JOptionPane.showInputDialog("Coxa Esquerda: ")));
							x.setGluteo(Double.parseDouble(JOptionPane.showInputDialog("Glúteo: ")));
							x.setPanturrilhaDireita(Double.parseDouble(JOptionPane.showInputDialog("Panturrilha Direita: ")));
							x.setPanturrilhaEsquerda(Double.parseDouble(JOptionPane.showInputDialog("Panturrilha Esquerda: ")));
							x.setPescoco(Double.parseDouble(JOptionPane.showInputDialog("Pescoço: ")));
							x.setQuadril(Double.parseDouble(JOptionPane.showInputDialog("Quadril: ")));
							x.setTorax(Double.parseDouble(JOptionPane.showInputDialog("Torax: ")));
							x.calcularImc();
							double imc = x.getImc();
							JOptionPane.showMessageDialog(null, "IMC: "+imc);


							//parte do nível (iniciante/intermediario/avançado) Strategy de kew viadage
							JOptionPane.showMessageDialog(null, a.toString());
							int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um aluno ?");
							if (resp==0){
								continuar = true;
							} else if (resp==1){
								continuar = false;
							}
						}
						break;
					case "2":
						break;
					case "6":
						sair = true;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida. Digite novamente: ");
						break;
					}
				}
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Menu instrutor");
				break;
			case "3":
				break;		
			case "X":	
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o programa ?");
				System.out.println(resposta);
				if (resposta==0){
					JOptionPane.showMessageDialog(null, "Até mais!!!");
					fecharPrograma = true;
					break;
				} else if (resposta==1){
					fecharPrograma = false;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
				fecharPrograma = false;
				break;
			}
		}	
		
		
	}

}
