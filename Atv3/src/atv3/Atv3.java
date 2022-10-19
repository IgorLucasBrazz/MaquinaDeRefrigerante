package atv3;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
       Refrigerante cocacolaR = new Refrigerante("Cola-Cola", 5.00f);
       Refrigerante matecouroR = new Refrigerante("Mate Couro", 3.25f);
       Refrigerante guaranaR = new Refrigerante("Guaraná", 4.00f);
       Refrigerante pepsiR = new Refrigerante("Pepsi", 4.50f);
       Refrigerante spriteR = new Refrigerante("Sprite", 3.75f);
       
       MaquinaRefri saldo1 = new MaquinaRefri(10,0);
       saldo1.inicializaMaq(cocacolaR, matecouroR, guaranaR, pepsiR, spriteR, 10, 4, 20, 5, 6);
       
        System.out.println("***********Refri-Delicia***********");
        System.out.println("*************BEM VINDO*************");
        System.out.println("|       (1) - Coca-Cola           |");
        System.out.println("|       (2) - Mate Couro          |");
        System.out.println("|       (3) - Guaraná             |");
        System.out.println("|       (4) - Pepsi               |");
        System.out.println("|       (5) - Sprite              |");
        System.out.println("***********************************");
        
        Scanner maquina = new Scanner(System.in);
        System.out.println("O QUE VOCÊ DESEJA? ");
        int opcaomaq = maquina.nextInt();
        
        if(opcaomaq == 1){
            saldo1.quantidadeRefri("Coca-Cola", 5);
            saldo1.Mostraredito();
            saldo1.inserircredito(9.00f);
            saldo1.PedidoRefri(1);
        }
        else if(opcaomaq == 2){
            saldo1.quantidadeRefri("Mate Couro", 3);
            saldo1.Mostraredito();
            saldo1.inserircredito(4.00f);
            saldo1.PedidoRefri(2);
        }
        else if(opcaomaq == 3){
            saldo1.quantidadeRefri("Guaraná", 7);
            saldo1.Mostraredito();
            saldo1.inserircredito(2.20f);
            saldo1.PedidoRefri(3);
        }
        else if(opcaomaq == 4){
            saldo1.quantidadeRefri("Pepsi", 13);
            saldo1.Mostraredito();
            saldo1.inserircredito(13.90f);
            saldo1.PedidoRefri(4);
        }
        else if(opcaomaq == 5){
            saldo1.quantidadeRefri("Sprite", 9);
            saldo1.Mostraredito();
            saldo1.inserircredito(12.45f);
            saldo1.PedidoRefri(5);
        }
        else if(opcaomaq > 5){
            System.out.println("DESCULPE! NÃO EXISTE ESSA OPÇÃO NESTA MÁQUINA");
        }      
    }
}
