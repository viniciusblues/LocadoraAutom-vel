package br.com.locadora.carro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {

        LocadoraCarro[] carros = {
                new LocadoraCarro("Fiat147", "FIAT", ModeloCarro.COMPACT, 1995, 1955),
                new LocadoraCarro("Palio", "FIAT", ModeloCarro.SEDAN, 2012, 2012),
                new LocadoraCarro("Argo", "FIAT", ModeloCarro.HATCH, 2019, 2020),
                new LocadoraCarro("Freemont", "FIAT", ModeloCarro.SUV, 2014, 2014),
                new LocadoraCarro("Estrada", "FIAT", ModeloCarro.PICKUP, 2008, 2008),
                new LocadoraCarro("Ducato", "FIAT", ModeloCarro.VAN, 2014, 2015),
                new LocadoraCarro("Ford KA", "FORD", ModeloCarro.COMPACT, 2014, 2014),
                new LocadoraCarro("Fusion", "FORD", ModeloCarro.SEDAN, 2012, 2012),
                new LocadoraCarro("Fiesta", "FORD", ModeloCarro.HATCH, 2019, 2020),
                new LocadoraCarro("Eco Sporte", "FORD", ModeloCarro.SUV, 2014, 2014),
                new LocadoraCarro("Ranger", "FORD", ModeloCarro.PICKUP, 2008, 2008),
                new LocadoraCarro("Transit", "FORD", ModeloCarro.VAN, 2014, 2015),
                new LocadoraCarro("UP", "VOLKSWAGEN", ModeloCarro.COMPACT, 2015, 2015),
                new LocadoraCarro("Virtus", "VOLKSWAGEN", ModeloCarro.SEDAN, 2018, 2018),
                new LocadoraCarro("Gol", "VOLKSWAGEN", ModeloCarro.HATCH, 2019, 2020),
                new LocadoraCarro("Tiguan", "VOLKSWAGEN", ModeloCarro.SUV, 2020, 2020),
                new LocadoraCarro("Saveiro", "VOLKSWAGEN", ModeloCarro.PICKUP, 2008, 2008),
                new LocadoraCarro("Furgão", "VOLKSWAGEN", ModeloCarro.VAN, 1998, 1998)

        };

        Cliente cliente = new Cliente();
        cliente.setNomeCliente(JOptionPane.showInputDialog("Digite Seu Nome!"));
        JOptionPane.showMessageDialog(null, "Seu Nome é: " + cliente.getNomeCliente());
        System.out.println("Cliente: " + cliente.getNomeCliente());

        ModeloCarro[] itens = {ModeloCarro.COMPACT, ModeloCarro.HATCH, ModeloCarro.PICKUP, ModeloCarro.SEDAN, ModeloCarro.SUV, ModeloCarro.VAN};
        Object modeloSelecionado = JOptionPane.showInputDialog(null,
                "Escolha Uma Opção", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens[1]);

        System.out.println("Voce escolheu  : " + modeloSelecionado);

        List<String> carrosDisponiveis = new ArrayList<String>();

        for (int i = 0; i < carros.length; i++) {
            LocadoraCarro carro = carros[i];

            if (carro.getModeloCarro() == modeloSelecionado) {

                carrosDisponiveis.add(carro.getNomeCarro());

                System.out.println(carro.getNomeCarro());
            }

        }

        modeloSelecionado = JOptionPane.showInputDialog(null,
                "Escolha um carro", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null,
                carrosDisponiveis.toArray(), carrosDisponiveis.toArray()[0]);

    }

}
