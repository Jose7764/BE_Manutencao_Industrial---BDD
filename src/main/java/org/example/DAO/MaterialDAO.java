package org.example.DAO;

import org.example.model.*;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO {

    public void cadastrarMaterial(Material material)throws SQLException {

        String query = """
                INSERT into Material
                (nome, unidade, estoque)
                VALUES (?,?,?)
                """;

        try (Connection conn = Conexao.Conectar();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, material.getNome());
            stmt.setString(2, material.getUnidade());
            stmt.setDouble(3, material.getEstoque());
            stmt.executeUpdate();

            System.out.println("|-----------------------------------------|");
            System.out.println("|     Material Cadastrado com Sucesso     |");
            System.out.println("|-----------------------------------------|");

        }catch (Exception e){
            System.err.println("|-----------------------------------------|");
            System.err.println("|      Erro ao cadastrar Material         |");
            System.err.println("|-----------------------------------------|\n\n\n");
            throw new RuntimeException();
        }

    }

    public List<Material> listarMateriais()throws SQLException{
        List<Material> listaMaterial = new ArrayList<>();

        String query = """
                SELECT id, nome, unidade, estoque
                FROM Material 
                """;

        try(Connection conn = Conexao.Conectar(); PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String unidade = rs.getString("unidade");
                double estoque = rs.getDouble("estoque");

                Material material = new Material(id, nome, unidade, estoque);
                listaMaterial.add(material);
            }
        }
        return listaMaterial;
    }

}
