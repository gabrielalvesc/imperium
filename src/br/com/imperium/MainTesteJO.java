package br.com.imperium;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class MainTesteJO {

	public static void main(String[] args) {
		String arquivoAlunos = "ArquivoAlunos.txt";
		String arquivoInstrutores = "ArquivoInstrutores.txt";
		AcademiaImperium academia = new AcademiaImperium();
		Aluno p = new Aluno();
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		JOptionPane.showMessageDialog(null, "Bem-vindo à academia Imperium!  :) ");
		boolean fecharPrograma = false;
		while (fecharPrograma != true) {
			String menuPrincipal = JOptionPane.showInputDialog("1- Aluno\n2- Instrutor\n\nX- Sair").toUpperCase();
			switch (menuPrincipal) {
			case "1":
				boolean sair = false;
				while (sair != true) {
					String menuAluno = JOptionPane.showInputDialog(
							"1- Cadastrar aluno\n2- Editar aluno\n3- Pesquisar aluno\n4- Listar alunos\n5- Ramover aluno\n\n6- Voltar");
					switch (menuAluno) {
					case "1":
						boolean continuar = true;
						while (continuar != false) {
							Aluno a = new Aluno();
							String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
							a.setNome(nome);
							// setar o nome
							// a.setNome(nome);
							long cpf = Long
									.parseLong(JOptionPane.showInputDialog("CPF: \n(Digite apenas os números do CPF)"));
							// criar CPF na pessoa
							// try {
							// //verificar se o cpf já não está cadastrado
							// } catch (AlunoJaExisteException e) {
							// JOptionPane.showMessageDialog(null,
							// e.getMessage());
							// }
							String sexo = JOptionPane.showInputDialog(null, "Sexo: [M/F]").toUpperCase();

							// pegar a data de nascimento (Vê se cria a classe
							// data ou usa a do java msm)
							a.setDataDocadastro(sdf.format(hoje));
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
							x.setData(sdf.format(hoje));
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
							JOptionPane.showMessageDialog(null, "IMC: " + imc);
							// parte do nível (iniciante/intermediario/avançado)
							// Strategy de kew viadage
							// JOptionPane.showMessageDialog(null,
							// a.toString());
							JOptionPane.showMessageDialog(null,
									"Nome: " + a.getNome() + "\nMatricula: " + a.getMatricula());// Só
																									// um
																									// teste

							// parte do nível (iniciante/intermediario/avançado)
							// Strategy de kew viadage
							int listaSizeBefore = academia.getAlunos().size();
							academia.matricularAluno(a);
							int listaSizeAfter = academia.getAlunos().size();
							if (listaSizeBefore < listaSizeAfter) {
								JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso...");
							} else {
								JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
							}
							JOptionPane.showMessageDialog(null, a.toString());
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
						// Try/Catch (MatriculaNãoExisteEception)
						matricula = Integer.parseInt(JOptionPane.showInputDialog(""));
						// aluno = academia.pesquisaAluno(int matricula); >>>
						// Esse método deve retornar um aluno
						// toString pra mostrar as infos sobre esse aluno
					case "4":
						// List<Aluno> lista = academia.getAlunos();
						// Varre a lista e exibe os alunos matriculados
					case "5":
						// Try/Catch (MatriculaNãoExisteEception)
						matricula = Integer.parseInt(JOptionPane.showInputDialog(""));
						// aluno = academia.pesquisaAluno(int matricula); >>>
						// Esse método deve retornar um aluno
						int resultado = JOptionPane.showConfirmDialog(null,
								"Deseja excluir esse aluno ? "/*
																 * +
																 * aluno.getNome
																 * ()
																 */);
						if (resultado == 0) {
							// removerAluno(matricula);
						} else if (resultado == 1) {
							sair = false;
						}
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
						"1- Cadastrar instrutor\n2- Editar instrutor\n3- Pesquisar instrutor\n4- Listar instrutores\n5- Ramover instrutor\n\n6- Voltar");
				boolean sairMenu = false;
				while (sairMenu != true) {
					switch (menuInstrutor) {
					case "1":
						boolean continuar = false;
						// Try/Catch (InstrutorJaCadastradoException)
						Instrutor i = new Instrutor();
						i.setDataDocadastro(sdf.format(hoje));
						i.setNome(JOptionPane.showInputDialog("Nome completo: ").toUpperCase());
						// i.setCpf(int/string CPF);
						i.setSexo(JOptionPane.showInputDialog("Sexo: [M/F]").toUpperCase());
						i.setDataDeNascimento(JOptionPane.showInputDialog("Data de Nascimento: \n(Ex: 12/12/2012)"));
						i.setEmail(JOptionPane.showInputDialog("E-mail: ").toUpperCase());
						i.setTelefone(JOptionPane.showInputDialog("Telefone: "));
						Endereco e = new Endereco();
						e.setRua(JOptionPane.showInputDialog("Logradouro: ").toUpperCase());
						e.setNumero(JOptionPane.showInputDialog("Número: "));
						e.setCep(Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
						e.setBairro(JOptionPane.showInputDialog("Bairro: ").toUpperCase());
						e.setCidade(JOptionPane.showInputDialog("Cidade: ").toUpperCase());
						i.setEndereco(e);
						int listaSizeBefore = academia.getInstrutores().size();
						academia.cadastrarInstrutor(i);
						int listaSizeAfter = academia.getInstrutores().size();
						if (listaSizeBefore < listaSizeAfter) {
							JOptionPane.showMessageDialog(null, "Instrutor cadastrado com sucesso...");
						} else {
							JOptionPane.showMessageDialog(null, "Instrutor não cadastrado");
						}
						int resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um instrutor ?");
						if (resp == 0) {
							continuar = true;
						} else if (resp == 1) {
							continuar = false;
						}
						break;
					case "2":
						// Aqui vai ter um try/catch
						// (MatriculaNãoExisteException)
						int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno: "));
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
					case "3":
						// Try/Catch (MatriculaNãoExisteEception)
						matricula = Integer.parseInt(JOptionPane.showInputDialog(""));
						// instrutor = academia.pesquisaInstrutor(int
						// matricula); >>>
						// Esse método deve retornar um instrutor
						// toString pra mostrar as infos sobre esse instrutor
					case "4":
						// List<Aluno> lista = academia.getAlunos();
						// Varre a lista e exibe os alunos matriculados
					case "5":
						// Try/Catch (MatriculaNãoExisteEception)
						matricula = Integer.parseInt(JOptionPane.showInputDialog(""));
						// aluno = academia.pesquisaAluno(int matricula); >>>
						// Esse método deve retornar um aluno
						int resultado = JOptionPane.showConfirmDialog(null,
								"Deseja excluir esse aluno ? "/*
																 * +
																 * aluno.getNome
																 * ()
																 */);
						if (resultado == 0) {
							listaSizeBefore = academia.getInstrutores().size();
							// removerAluno(matricula);
							listaSizeAfter = academia.getInstrutores().size();
							if (listaSizeBefore < listaSizeAfter) {
								JOptionPane.showMessageDialog(null, "Instrutor não removido...");
							} else {
								JOptionPane.showMessageDialog(null, "Instrutor removido...");
							}
						} else if (resultado == 1) {
							sairMenu = false;
						}
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
