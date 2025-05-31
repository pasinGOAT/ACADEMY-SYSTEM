  import java.util.ArrayList;
  import java.util.Scanner;
  import javax.sound.sampled.SourceDataLine;


  public class App {
      public static void main(String[] args) throws Exception {
      Scanner ler = new Scanner (System.in);
      ArrayList<alunos> listaAlunos = new ArrayList<>();
        

      alunos aluno = new alunos(null, 0, 0, 0, null);
        aluno.setNome("Marcus Vinicius Couto Pasin");
        aluno.setIdade(18);
        aluno.setPeso(62.8);
        aluno.setAltura(1.80);
        aluno.setPlano("Exclusive");

      
      System.out.println("BEM-VINDO AO SISTEMA DE ACADEMIA");
      System.out.println("ESCOLHA SEU MÉTODO DESEJADO:");
      System.out.println("1 - Cadastrar Aluno");
      System.out.println("2 - Exibir Informações");
      System.out.println("3 - Excluir Aluno");
      System.out.println("4 - Sair");
      int op = ler.nextInt();
      ler.nextLine();

      do {
        if (op == 4) {
          System.out.println("Encerrrando Programa...");
          break;
        } 
      } 
      //bloco de código  *TODO DO WHILE TEM QUE SER FINALIZADO COM A CONDIÇÃO DE WHILE NO FINAL
      while (op != 4); //CONDIÇÃO DENTRO DO PARENTESE,  NO CASO, A CONSIDÃO NESSA PARTE É ENQUANTO FOR DIFERENTE DE 4 O PROGRMAA IRÁ RODAR E CONTINUAR O CÓDIGO

      switch (op) {
        case 1:
          System.out.println("=== Cadastro de Alunos ===");
          System.out.println("nome: ");
          String nome = ler.nextLine();

            System.out.println("idade: ");
            int idade = ler.nextInt();

            System.out.println("peso: ");
            double peso = ler.nextDouble();

            System.out.println("altura: ");
            double altura = ler.nextDouble();

            System.out.println("Selecione o plano: ");
            System.out.println("• Basic");
            System.out.println("• Premium ");
            System.out.println("• Exclusive ");
            String plano = ler.nextLine();
          
        alunos novoAluno = new alunos(nome, idade, peso, altura, plano);
          novoAluno.setAltura(altura);
          
            listaAlunos.add(novoAluno);
          System.out.println("Aluno cadastrado com suesso!");

          break;
      }

    }
  }
