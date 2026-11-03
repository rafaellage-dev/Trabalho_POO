
import java.util.Scanner;

import setimaArte.Filme;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String novo = "";
        String nome = "";
        String dataL = "";
        String sinopse = "";
        String generos = "";
        String classificacao = "";
        String nota = "";
        String criador = "";
        String orcamento = "";
        String temporadas = "";
        String episodios = "";
        String dataF = "";
        do{
            System.out.println(" Digite um número inteiro positivo, de 0 a 8 para escolher uma desta opções do menu :\n 0 - Parar a operação.\n 1 - Adicionar uma nova série ao catálogo.\n 2 - Mostrar as informações de uma série do catálogo.\n 3 - Atualizar uma série do catálogo.\n 4 - Excluir uma série do catálogo.\n 5 - Adicionar um novo filme ao catálogo.\n 6 - Mostrar as informações de um filme do catálogo.\n 7 - Atualizar um filme do catálogo.\n 8 - Excluir um filme do catálogo.");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Digite o nome da série que você deseja adicionar.");
                    novo = sc.nextLine();
                    nome = novo;
                    System.out.println("Digite a data de lançamento da série que você deseja adicionar.");
                    dataL = sc.nextLine();
                    System.out.println("Digite a sinopse da série que você deseja adicionar.");
                    sinopse = sc.nextLine();
                    System.out.println("Digite os gêneros da série que você deseja adicionar.");
                    generos = sc.nextLine();
                    System.out.println("Digite a classificação indicativa da série que você deseja adicionar.");
                    classificacao = sc.nextLine();
                    System.out.println("Digite a nota da série que você deseja adicionar.");
                    nota = sc.nextLine();
                    System.out.println("Digite o nome do criador da série que você deseja adicionar.");
                    criador = sc.nextLine();
                    System.out.println("Digite o orçamento da série que você deseja adicionar.");
                    orcamento = sc.nextLine();
                    System.out.println("Digite o número de temporadas da série que você deseja adicionar.");
                    temporadas = sc.nextLine();
                    System.out.println("Digite o número de episódios da série da série que você deseja adicionar.");
                    episodios = sc.nextLine();
                    System.out.println("Digite a data de encerramento da série que você deseja adicionar.");
                    dataF = sc.nextLine();
                    Filme novo = new Filme(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, temporadas, episodios, dataF);
                   
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                   
                    break;
                case 6:
                   
                    break;
                case 7:
                   
                    break;
                case 8:
                   
                    break;
                default:
                   
                    break;    
            }
        }while(num != 0);
        System.out.println("Operação interrompida.");
   }
}