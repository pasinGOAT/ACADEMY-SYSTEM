import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    
    public void inserirAluno(Aluno aluno) {
    Connection conn = Conexao.conectar();

    try {
        String sql = "INSERT INTO aluno (nome, idade, peso, altura, plano) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, aluno.getNome());
        stmt.setInt(2, aluno.getIdade());
        stmt.setDouble(3, aluno.getPeso());
        stmt.setDouble(4, aluno.getAltura());
        stmt.setString(5, aluno.getPlano());

        stmt.executeUpdate();
        conn.close();
        System.out.println("Aluno inserido com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao inserir aluno: " + e.getMessage());
    }
}

}

