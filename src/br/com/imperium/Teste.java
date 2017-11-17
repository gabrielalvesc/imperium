package br.com.imperium;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Chegar na academia Matricular-se Agendar (talvez √±) e realizar exame
		 * f√≠sico Dizer tipo f√≠sico Estilo de treino para o tipo f√≠sico do
		 * Aluno
		 */
		/**
		 * IFImperium imperium = new AcademiaImperium();
		 * 
		 * //Criando Aluno e seus dados Aluno aluno1 = new Aluno();
		 * aluno1.setEmail("ciacelojr@gmail.com"); aluno1.setMatricula(229916);
		 * 
		 * Endereco endereco = new Endereco(); endereco.setBairro("centro");
		 * endereco.setCep(5857-000); endereco.setCidade("Rio Tinto");
		 * endereco.setNumero(49); endereco.setRua("Patricio");
		 * aluno1.setEndereco(endereco);
		 * 
		 * aluno1.setNome("Marcelo");
		 * 
		 * Sexo sexo = Sexo.MASCULINO; aluno1.setSexo(sexo);
		 * 
		 * aluno1.setTelefone("(83)9 9314-5340");
		 * 
		 * //Usando Calendar Calendar c = Calendar.getInstance(); c.set(04, 07,
		 * 1996); Calendar d = Calendar.getInstance();
		 * aluno1.setDataDeNascimento(c);
		 * 
		 * //Criando os Exercicios Exercicio exercicioA = new Exercicio();
		 * exercicioA.setNome("Abdominais"); exercicioA.setRepeticoes(20);
		 * exercicioA.setDescanso(1); exercicioA.setId(1023); Exercicio
		 * exercicioB = new Exercicio(); exercicioB.setNome("Flex„o");
		 * exercicioB.setRepeticoes(15); exercicioB.setDescanso(2);
		 * exercicioB.setId(1043); List<Exercicio> exercicios = new
		 * ArrayList<Exercicio>(); exercicios.add(exercicioA);
		 * exercicios.add(exercicioB);
		 * 
		 * //Iinicando classes dias Dia dia1 = Dia.SEG; Dia dia2 = Dia.TER;
		 * 
		 * //Criando Treinos Treino treino = new Treino(exercicios, dia1);
		 * treino.setExercicios(exercicios); Treino treino2 = new
		 * Treino(exercicios, dia2); treino2.setExercicios(exercicios);
		 * 
		 * 
		 * //Padr„o Observer TreinamentoDaSemana treinoDaSemana = new
		 * TreinamentoDaSemana(treino); aluno1.setDataDeNascimento(c);
		 * aluno1.setDataDocadastro(d); aluno1.setSubject(treinoDaSemana);
		 * treinoDaSemana.setTreino(treino2);
		 * //treinoDaSemana.registerObserver(aluno1);
		 * 
		 * 
		 * imperium.matricularAluno(aluno1);
		 * 
		 * System.out.println(treinoDaSemana.getAlunos());
		 * System.out.println(aluno1.toString());
		 */

		/*
		 * 
		 */
		AcademiaImperium academiaImperium = new AcademiaImperium();
		
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 6) {
			
			
			System.out
					.println("Menu:\n [1]Matricular-se\n[2]Realizar Exame FÌsico\n[3]Selecionar Tipo Fisico\n[4]...\n[5]...\n[6]sair"
							);
			switch(opcao){
				
				case 1: 
					
					Pessoa aluno1 = new Aluno();
					System.out.println("Digite o Bairro");
					Endereco endereco = new Endereco(); endereco.setBairro(leitor.next());
					System.out.println("Digite a cidade");
					endereco.setCep(5857-000); endereco.setCidade(leitor.next());
					System.out.println("Digite a rua");
					endereco.setNumero(49); endereco.setRua(leitor.next());
					
					aluno1.setEndereco(endereco); 
					System.out.println("Digite o nome");
					aluno1.setNome(leitor.next());
					 
					Sexo sexo = Sexo.MASCULINO;
					aluno1.setSexo(sexo);
					
					System.out.println("Digite o telefone: (ddd)x xxxx-xxxx");
					aluno1.setTelefone(leitor.next());
					
					
					System.out.println("Digite a data de nascimento");
					
					Calendar c = Calendar.getInstance(); c.set(04, 07,1996);
					Calendar d = Calendar.getInstance();
					aluno1.setDataDeNascimento(c);
					  
					Exercicio exercicioA = new Exercicio();
					
					System.out.println("Digite o exercicio");
					exercicioA.setNome(leitor.next());
					exercicioA.setRepeticoes(20);
					exercicioA.setDescanso(1);
					exercicioA.setId(1023); Exercicio
					exercicioB = new Exercicio();
					exercicioB.setNome("Flex„o");
					exercicioB.setRepeticoes(15);
					exercicioB.setDescanso(2);
					exercicioB.setId(1043);
					List<Exercicio> exercicios = new
					ArrayList<Exercicio>();
					exercicios.add(exercicioA);
					exercicios.add(exercicioB);
					academiaImperium.matricularAluno((Aluno) aluno1);
					break;
					
				case 2:
					
					System.out.println("Digite a matricula do aluno");
					int matricula = leitor.nextInt();
					for(Aluno aluno: academiaImperium.getAlunos()){
						if(aluno.getMatricula()==matricula){
							ExameCorporal exame = new ExameCorporal();
							exame.
						}
					}
						
					
			}
		}
		leitor.close();
	}
}