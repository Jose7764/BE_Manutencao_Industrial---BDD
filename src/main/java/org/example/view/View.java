package org.example.view;

import java.util.Scanner;
import org.example.model.*;

public class View {

    Scanner input = new Scanner(System.in);

    public int Menu(){

        System.out.println("|-----------------------------------------|");
        System.out.println("|            Menu de Manutenção           |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1 - Cadastrar Fornecedor                |");
        System.out.println("| 2 - Cadastrar Material                  |");
        System.out.println("| 3 - Registrar Nota de Entrada           |");
        System.out.println("| 4 - Criar Requisição de Material        |");
        System.out.println("| 5 - Atender Requisição                  |");
        System.out.println("| 6 - Cancelar Requisição                 |");
        System.out.println("|                                         |");
        System.out.println("|                               0 - Sair  |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| - ");
        int opcao = input.nextInt();
        return opcao;
    }

    public Fornecedor cadastrarFornecedor(){

        System.out.println("|-----------------------------------------|");
        System.out.println("|                Cadastro                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o nome:                          |");
        System.out.println("| - ");
        String nome = input.nextLine();

        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o CNPJ:                          |");
        System.out.println("| - ");
        String cnpj = input.nextLine();

        Fornecedor fornecedor = new Fornecedor(nome, cnpj);
        return fornecedor;
    }

    public Material cadastrarMaterial(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|                Cadastro                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o nome:                          |");
        System.out.println("| - ");
        String nome = input.nextLine();

        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite a Unidade:                        |");
        System.out.println("| - ");
        String unidade = input.nextLine();

        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o estoque:                        |");
        System.out.println("| - ");
        double estoque = input.nextDouble();

        Material material = new Material(nome, unidade , estoque);
        return material;
    };

    public String selecionarFornecedor(){

        System.out.println("|-----------------------------------------|");
        System.out.println("|      Cadastro de Nota Entrada           |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o cnpj:                          |");
        System.out.println("| - ");
        String cnpj = input.nextLine();

        return cnpj;
    }

    public int selecionarMaterial(){
        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite o escolhido:                     |");
        System.out.println("| - ");
        int opcao = input.nextInt();

        return opcao;
    }

    public double inserirQuantidade(){
        System.out.println("|-----------------------------------------|");
        System.out.println("| Digite a quantidade:                    |");
        System.out.println("| - ");
        double quantidade = input.nextInt();

        return quantidade;
    }


}

;
