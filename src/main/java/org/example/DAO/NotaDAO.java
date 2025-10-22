package org.example.DAO;

import org.example.util.Conexao;

import java.sql.*;
import java.time.LocalDate;

public class NotaDAO {

    public void registrarNota(int idFornecedor)throws SQLException {

        String query = """
                INSERT into Fornecedor
                (idFornecedor , dataEntrada)
                VALUES (?,?)
                """;

        try(Connection conn = Conexao.Conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            LocalDate hoje = LocalDate.now();

            stmt.setInt(1, idFornecedor);
            stmt.setDate(2, Date.valueOf(hoje));
            stmt.executeUpdate();

            System.out.println("|-----------------------------------------|");
            System.out.println("|       Nota inserida com Sucesso         |");


        }
    }

    public int pegarIDnota(int idFornecedor)throws SQLException{
        String query = """
                SELECT id
                FROM NotaEntrada where idFornecedor = ? and dataEntrada = ?
                """;

        try(Connection conn = Conexao.Conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            LocalDate hoje = LocalDate.now();

            stmt.setInt(1, idFornecedor);
            stmt.setDate(2, Date.valueOf(hoje));

            ResultSet rs = stmt.executeQuery();

            int idNota = rs.getInt("id");
            return idNota;
        }
    }

    public void inserirNotaItem(){

    }
}
