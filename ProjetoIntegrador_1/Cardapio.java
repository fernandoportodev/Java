package ProjetoIntegrador_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in); 

        int escolhaMassa;
        boolean escolhaRecheio;

        ArrayList<String> cardapio = new ArrayList<>();
        //LISTA CARDAPIO
        ArrayList<String> pedido = new ArrayList<>();
        //LISTA DE PEDIDO

        //CONTEÚDOS DA LISTA
        cardapio.add("Massa Fina");
        cardapio.add("Massa Média");
        cardapio.add("Massa Grossa");
        
        cardapio.add("Molho de Tomate");
        cardapio.add("Molho Pesto");
        cardapio.add("Molho Alfredo");
        
        cardapio.add("Marguerita");
        cardapio.add("Bacon com queijo");
        cardapio.add("Peperoni");
        cardapio.add("Calabresa ralada com 3 queijos");
        cardapio.add("Brócolis com queijo e alho");
        cardapio.add("Portuguesa");
        cardapio.add("Brigadeiro com morango");

        //CONTEÚDOS DA LISTA

        System.out.println(cardapio);
        System.out.println("----------------------------------------------------");


        System.out.println("Digite o tipo de massa: \n0- Fina \t 1- Média \t 2- Grossa ");
            escolhaMassa = leia.nextInt();

            if(escolhaMassa == 0) {
                cardapio.get(0);
                System.out.println(cardapio.get(0) + " escolhida!");
            }
            else if(escolhaMassa == 1) {
                cardapio.get(1);
                System.out.println(cardapio.get(1) + " escolhida!");
            }
            else if(escolhaMassa == 2) {
                cardapio.get(2);
                System.out.println(cardapio.get(2) + " escolhida!");
            }
            else {
                System.out.println("Escolha inválida");
            }

            pedido.add(cardapio.get(escolhaMassa));

//            System.out.println("Deseja " + cardapio.get(3) + "?");
//                escolhaRecheio = leia.nextBoolean();


    }
}