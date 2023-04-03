import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcoes;

        System.out.println("Help Java\n1.1 Instrução IF Simples\n2.2 Instrução IF com blocos de comandos\n3.3 Instrução IF aninhado\n4.4 Instrução SWITCH. Escolha uma opção:");
        opcoes = entrada.nextInt();

        entrada.close();

        switch (opcoes) {
        case 1:
            System.out.println(
            "ESTRUTURA IF SIMPLES\n.if (condicao)\n.  instrucao;\n.else  instrucao;");
        break;
        case 2:
            System.out.println("ESTRUTURA IF BLOCO\n.if (condicao) {\n.instrucao1;\n.instrucao2;\n. } else {\n. instrucao3;\n.instrucao4;}");
        break;
        case 3:
            System.out.println("ESTRUTURA IF ANINHADO\n.if (condicao) {\n.instrucao1;\n.instrucao2;\n. } else if (condicao2) {\n. instrucao4;\n. instrucao5;\n.} else {\n.instrucao5;}");
        break;
        case 4:
            System.out.println("SWITCH\n.switch (expressao) {\n.case constante1:\n.instrucao1;\n.instrucao2;\n.break;\n.case constante2:\n.instrucao3\n.instrucao4;\n.break;\n.default:\n.instrucao5;}  ");
        break;
        default:
         System.out.println("Opção inválida");
        }  
    }
}


