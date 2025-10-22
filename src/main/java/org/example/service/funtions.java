package org.example.service;

import org.example.view.View;
import org.example.model.*;
import org.example.DAO.*;

import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class funtions {

    Scanner input = new Scanner(System.in);
    View view = new View();
    FornecedorDAO DaoFornecedor = new FornecedorDAO();
    MaterialDAO DaoMaterial =  new MaterialDAO();
    NotaDAO DaoNota = new NotaDAO();


    public void tratadorMenu(int opcao) throws SQLException {


        switch(opcao){

            case 1:
                Fornecedor fornecedor = view.cadastrarFornecedor();
                DaoFornecedor.cadastrarFornecedor(fornecedor);
                break;

            case 2:
                Material material = view.cadastrarMaterial();
                DaoMaterial.cadastrarMaterial(material);
                break;

            case 3:
                int idFornecedor = DaoFornecedor.PegarIDfornecedor();
                DaoNota.registrarNota(idFornecedor);

                int idNota = DaoNota.pegarIDnota(idFornecedor);

                List<NotaEntradaItem> ListaNotas = new ArrayList<>();

                int opsao = 1;
                while(opsao == 1) {

                    if (idFornecedor == -1){
                        System.out.println("Fornecedor nai valido");
                        break;
                    }

                    List<Material> materiais = DaoMaterial.listarMateriais();
                    int escolhido = view.selecionarMaterial();
                    double quantidade = view.inserirQuantidade();

                    NotaEntradaItem notaItem = new NotaEntradaItem(idNota,escolhido, quantidade);
                    ListaNotas.add(notaItem);

                    System.out.println("|-----------------------------------------|");
                    System.out.println("| Deseja Inserir mais um Material?        |\n | 1 - Sim \n | 2 - Não ");
                    System.out.println("| - ");
                    opsao = input.nextInt();

                    for(NotaEntradaItem nota: ListaNotas){

                    }
                }
                break;

            case 0:

                break;
        }

    }
}
