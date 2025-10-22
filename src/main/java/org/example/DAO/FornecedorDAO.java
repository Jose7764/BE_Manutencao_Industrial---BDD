package org.example.DAO;

import org.example.model.Fornecedor;
import org.example.view.View;
import org.example.util.Conexao;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FornecedorDAO {

    View view = new View();

    public void cadastrarFornecedor(Fornecedor fornecedor)throws SQLException {

        String query = """
                INSERT INTO Fornecedor
                ( nome , cnpj)
                VALUES (?,?)
                """;

        try(Connection conn = Conexao.Conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.executeUpdate();

            System.out.println("|-----------------------------------------|");
            System.out.println("|    Fornecedor Cadastrado com Sucesso    |");
            System.out.println("|-----------------------------------------|");
        } catch (Exception e) {

            System.err.println("|-----------------------------------------|");
            System.err.println("|      Erro ao cadastrar Fornecedor       |");
            System.err.println("|-----------------------------------------|\n\n\n");
            throw new RuntimeException(e);
        }


    }

    public int PegarIDfornecedor()throws SQLException{

        String cnpj = view.selecionarFornecedor();

        String query = """
                SELECT id
                FROM Fornecedor where cnpj = ?
                """;

        try (Connection conn = Conexao.Conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, cnpj);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                int idFornecedor = rs.getInt("id");
                return idFornecedor;
            }else{
                return -1;
            }



        }

    };
}
