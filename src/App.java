  import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class App {
      public static void main(String[] args) throws Exception {
      Scanner ler = new Scanner (System.in);
     


Connection conn = Conexao.conectar();

      ArrayList<Aluno> listaAlunos = new ArrayList<>();
        

      Aluno aluno = new Aluno(null, 0, 0, 0, null);
        aluno.setNome("Marcus Vinicius Couto Pasin");
        aluno.setIdade(18);
        aluno.setPeso(62.8);
        aluno.setAltura(1.80);
        aluno.setPlano("Exclusive");
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.inserirAluno(aluno);


      do {
        System.out.println("BEM-VINDO AO SISTEMA DE ACADEMIA");
        System.out.println("ESCOLHA SEU MÉTODO DESEJADO:");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Exibir Informações");
        System.out.println("3 - Excluir Aluno");
        System.out.println("4 - Sair");
        int op = ler.nextInt();
        ler.nextLine();

        if (op == 4) {
          System.out.println("Encerrrando Programa...");
          break;
        }

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
            ler.nextLine(); // consume newline

            System.out.println("Selecione o plano: ");
            System.out.println("• Basic");
            System.out.println("• Premium ");
            System.out.println("• Exclusive ");
            String plano = ler.nextLine();

            Aluno novoAluno = new Aluno(nome, idade, peso, altura, plano);
            novoAluno.setAltura(altura);

            listaAlunos.add(novoAluno);
            System.out.println("Aluno cadastrado com suecsso!");
            break;

         case 2:
    System.out.println("=== Exibir Informações ===");
    AlunoDAO alunoDAO2 = new AlunoDAO();
    List<Aluno> alunos = alunoDAO.listarAlunos();

    if (alunos.isEmpty()) {
        System.out.println("Nenhum aluno cadastrado no banco.");
    } else {
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Idade: " + a.getIdade());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("Altura: " + a.getAltura());
            System.out.println("Plano: " + a.getPlano());
            System.out.println("-------------------------");
        }
    }
    break;

          case 3:
          
            System.out.println("=== Excluir Aluno ===");
            if (listaAlunos.isEmpty()) {
              System.out.println("Nenhum aluno cadastrado.");
            } else {
              System.out.println("Digite o nome do aluno a ser excluído:");
              String nomeExcluir = ler.nextLine();
              
              AlunoDAO AlunoDAOExcluir = new AlunoDAO();
              AlunoDAOExcluir.excluirAluno(nomeExcluir);
              break;
            }

          default:
            System.out.println("Opção inválida. Tente novamente.");
        }
      }
      while (true);

      ler.close();
          }    
          }  
