package br.com.imperium;

import javax.swing.JOptionPane;

import br.com.imperium.exceptions.AlunoNaoExisteException;
import br.com.imperium.exceptions.InstrutorJaCadastradoException;
import br.com.imperium.exceptions.InstrutorNaoExisteException;

public class MainTesteJO {

	public static void main(String[] args) throws Exception {
		//teste
		String arquivoAlunos = "ArquivoAlunos.txt";
		String arquivoInstrutores = "ArquivoInstrutores.txt";
		AcademiaImperium academia = new AcademiaImperium();
		JOptionPane.showMessageDialog(null, "Bem-vindo à academia Imperium!  :) ");
		boolean fecharPrograma = false;
		while (fecharPrograma != true) {
			String menuPrincipal = JOptionPane.showInputDialog("1- Aluno\n2- Instrutor\n\nX- Sair").toUpperCase();
			switch (menuPrincipal) {
			case "1":
				boolean sair = false;
				while (sair != true) {
					String menuAluno = JOptionPane.showInputDialog(
							"1- Cadastrar aluno\n2- Editar aluno\n3- Pesquisar aluno\n4- Listar alunos\n5- Remover aluno\n\n6- Voltar");
					switch (menuAluno) {
					case "1":
						boolean continuar = true;
						while (continuar != false) {
							Aluno aluno = new Aluno();
							aluno.setNome(JOptionPane.showInputDialog("Nome: "));
							aluno.setCpf(JOptionPane.showInputDialog("CPF: \n(Digite apenas os números do CPF)"));
							aluno.setSexo(JOptionPane.showInputDialog(null, "Sexo: \n(Ex: Masculino)").toUpperCase());
							aluno.setDataDeNascimento(
									(JOptionPane.showInputDialog(null, "Data de nascimento: \n(Ex: xx/yy/mmnn)")));
							aluno.setEmail(JOptionPane.showInputDialog("Email: "));
							aluno.setTelefone(JOptionPane.showInputDialog("Telefone: "));
							aluno.setDataDocadastro(
									JOptionPane.showInputDialog(null, "Data do cadastro: \n(Ex: xx/yy/mmnn)"));
							aluno.definirStatus("ativo");
							aluno.setMatricula(1 + (int) (Math.random() * 1000));
							Endereco endereco = new Endereco();
							endereco.setRua(JOptionPane.showInputDialog("Logradouro: "));
							endereco.setBairro(JOptionPane.showInputDialog("Bairro: "));
							endereco.setCep(Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
							endereco.setNumero(JOptionPane.showInputDialog("Número: "));
							endereco.setCidade(JOptionPane.showInputDialog("Cidade: "));
							aluno.setEndereco(endereco);
							JOptionPane.showMessageDialog(null, "EXAME CORPORAL");
							ExameCorporal x = new ExameCorporal();
							x.setData((JOptionPane.showInputDialog(null, "Data de hoje: \n(Ex: xx/yy/mmnn)")));
							x.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
							x.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
							x.setAntebracoDireito(
									Double.parseDouble(JOptionPane.showInputDialog("Antebraço Direito: ")));
							x.setAntebracoEsquerdo(
									Double.parseDouble(JOptionPane.showInputDialog("Antebraço Esquerdo: ")));
							x.setBracoDireito(Double.parseDouble(JOptionPane.showInputDialog("Braço Direito: ")));
							x.setAntebracoEsquerdo(Double.parseDouble(JOptionPane.showInputDialog("Braço Esquerdo: ")));
							x.setCintura(Double.parseDouble(JOptionPane.showInputDialog("Cintura: ")));
							x.setCoxaDireita(Double.parseDouble(JOptionPane.showInputDialog("Coxa Direita: ")));
							x.setCoxaEsquerda(Double.parseDouble(JOptionPane.showInputDialog("Coxa Esquerda: ")));
							x.setGluteo(Double.parseDouble(JOptionPane.showInputDialog("Glúteo: ")));
							x.setPanturrilhaDireita(
									Double.parseDouble(JOptionPane.showInputDialog("Panturrilha Direita: ")));
							x.setPanturrilhaEsquerda(
									Double.parseDouble(JOptionPane.showInputDialog("Panturrilha Esquerda: ")));
							x.setPescoco(Double.parseDouble(JOptionPane.showInputDialog("Pescoço: ")));
							x.setQuadril(Double.parseDouble(JOptionPane.showInputDialog("Quadril: ")));
							x.setTorax(Double.parseDouble(JOptionPane.showInputDialog("Torax: ")));
							x.calcularImc();
							double imc = x.getImc();
							x.setImc(imc);
							aluno.adicionarExame(x);
							JOptionPane.showMessageDialog(null, "IMC: " + imc);
							JOptionPane.showMessageDialog(null,
									"Nome: " + aluno.getNome() + "\nMatricula: " + aluno.getMatricula());

							// parte do nível (iniciante/intermediario/avançado)
							academia.matricularAluno(aluno);
							JOptionPane.showMessageDialog(null, aluno.toString());
							int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um aluno ?");
							if (resp == 0) {
								continuar = true;
							} else if (resp == 1) {
								continuar = false;
							}
						}
						break;
					case "2":
						// Aqui vai ter um try/catch
						// (MatriculaNãoExisteExection)
						int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno: "));
						// Aluno aluno = academia.pesquisaAluno(int matricula);
						// >>> Esse método deve retornar um aluno
						// String infoAluno = "1- Nome: "+aluno.getNome()+"\n2-
						// Telefone: "+aluno.getTelefone()...;
						// int editar = JOptionPane.showInputDialog(infoAluno);
						// Faz um switch para as opções e depois um inputDialog
						// pra dar set nas mudanças
						break;
					case "3":
						matricula = Integer.parseInt(JOptionPane.showInputDialog(""));
						try{
							JOptionPane.showMessageDialog(null, academia.pesquisarAluno(matricula));
							
						}catch(AlunoNaoExisteException exe) {
							exe.getMessage();
						}
						break;
					case "4":
						String varAlunos = null;
						for(Aluno al: academia.getAlunos()) {
							varAlunos+= "Nome: "+al.getNome()+" Matrícula: "+al.getMatricula()+"\n";
						}
						JOptionPane.showMessageDialog(null, varAlunos);
						break;
					case "5":
						
						matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula do aluno que deseja remover?"));
						
						try {
							academia.pesquisarAluno(matricula);
							academia.removerAluno(matricula);
							JOptionPane.showMessageDialog(null, "Aluno removido com sucesso.");
						}catch(AlunoNaoExisteException ex) {
							ex.getMessage();
						}
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
				String menuInstrutor = JOptionPane.showInputDialog(
						"1- Cadastrar instrutor\n2- Editar instrutor\n3- Pesquisar instrutor\n4- Listar instrutores\n5- Remover instrutor\n\n6- Voltar");
				boolean sairMenu = false;
				while (sairMenu != true) {
					switch (menuInstrutor) {
					case "1":
						Instrutor i = new Instrutor();
						i.setNome(JOptionPane.showInputDialog("Nome completo: ").toUpperCase());
						i.setCpf(JOptionPane.showInputDialog("CPF: "));
						i.setSexo(JOptionPane.showInputDialog("Sexo: [M/F]").toUpperCase());
						i.setDataDeNascimento(JOptionPane.showInputDialog("Data de Nascimento: \n(Ex: 12/12/2012)"));
						i.setEmail(JOptionPane.showInputDialog("E-mail: ").toUpperCase());
						i.setTelefone(JOptionPane.showInputDialog("Telefone: "));
						i.setDataDeNascimento(JOptionPane.showInputDialog("Data de nascimento"));
						i.setDataDocadastro(JOptionPane.showInputDialog("Data do cadastro: "));
						Endereco e = new Endereco();
						e.setRua(JOptionPane.showInputDialog("Logradouro: ").toUpperCase());
						e.setNumero(JOptionPane.showInputDialog("Número: "));
						e.setCep(Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
						e.setBairro(JOptionPane.showInputDialog("Bairro: ").toUpperCase());
						e.setCidade(JOptionPane.showInputDialog("Cidade: ").toUpperCase());
						i.setEndereco(e);
						try {
							academia.cadastrarInstrutor(i);
							JOptionPane.showMessageDialog(null, "Instrutor cadastrado com sucesso...");
						}catch(InstrutorJaCadastradoException exe) {
							exe.getMessage();
						}
						break;
					case "2":
						// Aqui vai ter um try/catch
						// (MatriculaNãoExisteException)
						String cpf = JOptionPane.showInputDialog("Digite o CPF do instrutor: ");
						// Instrutor ins = academia.pesquisaInstrutor(int
						// matricula);
						// >>> Esse método deve retornar um instrutor
						// String infoInstrutor = "1- Nome:
						// "+instrutor.getNome()+"\n2-...
						// Telefone: "+instrutor.getTelefone()...;
						// int editar =
						// JOptionPane.showInputDialog(infoInstrutor);
						// Faz um switch para as opções e depois um inputDialog
						// pra dar set nas mudanças
						break;
					case "3":
						String cpfer = JOptionPane.showInputDialog("Digite o CPF do instrutor: ");
						try {
							
							String varer = academia.pesquisarIntsrutor(cpfer);
							JOptionPane.showMessageDialog(null, varer);
						}catch(InstrutorNaoExisteException exe) {
							exe.getMessage();
						}
						break;
					case "4":
						String insTexto = "";
						for(Instrutor ins: academia.getInstrutores()) {
							insTexto+=ins.getNome()+"\n";
							
						}
						JOptionPane.showMessageDialog(null, insTexto);
						break;
					case "5":
						String cpfRemove = JOptionPane.showInputDialog("CPF do instrutor que deseja remover: ");
						try {
							academia.pesquisarIntsrutor(cpfRemove);
							academia.removerInstrutor(cpfRemove);
							JOptionPane.showMessageDialog(null, "Instrutor removido!");
						}catch(InstrutorNaoExisteException exe) {
							exe.getMessage();
							exe.printStackTrace();
			
						}
								
						break;
					case "6":
						sairMenu = true;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida. Digite novamente: ");
						break;
					}
				}
				break;
			case "X":
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o programa ?");
				System.out.println(resposta);
				if (resposta == 0) {
					JOptionPane.showMessageDialog(null, "Até mais!!!");
					fecharPrograma = true;
					break;
				} else if (resposta == 1) {
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
