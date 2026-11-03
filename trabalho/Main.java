import java.util.ArrayList;
import java.util.Scanner;
import setimaArte.SetimaArte;
import setimaArte.Filme;
import setimaArte.Serie;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
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
        String diretor = "";
        String produtora = "";
        String roteiristas = "";
        String duracao = "";
        ArrayList<Serie> series = new ArrayList<>();
        ArrayList<Filme> filmes = new ArrayList<>();
        do{
            System.out.println(" Digite um número inteiro positivo, de 0 a 8 para escolher uma desta opções do menu :\n 0 - Parar a operação.\n 1 - Adicionar uma nova série ao catálogo.\n 2 - Mostrar as informações de uma série do catálogo.\n 3 - Atualizar uma série do catálogo.\n 4 - Excluir uma série do catálogo.\n 5 - Adicionar um novo filme ao catálogo.\n 6 - Mostrar as informações de um filme do catálogo.\n 7 - Atualizar um filme do catálogo.\n 8 - Excluir um filme do catálogo.");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Digite o nome da série que você deseja adicionar.");
                    nome = sc.nextLine();
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
                    System.out.println("Digite o número de episódios da série que você deseja adicionar.");
                    episodios = sc.nextLine();
                    System.out.println("Digite a data de encerramento da série que você deseja adicionar.");
                    dataF = sc.nextLine();
                    Serie novoS = new Serie(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, temporadas, episodios, dataF);
                    series.add(novoS = new Serie(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, temporadas, episodios, dataF));
                    break;
                case 2:
                    System.out.println("Digite o nome da série que você deseja consultar.");
                    nome = sc.nextLine();
                    if(nome = ){}
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    System.out.println("Digite o nome do filme que você deseja adicionar.");
                    nome = sc.nextLine();
                    System.out.println("Digite a data de lançamento do filme que você deseja adicionar.");
                    dataL = sc.nextLine();
                    System.out.println("Digite a sinopse do filme que você deseja adicionar.");
                    sinopse = sc.nextLine();
                    System.out.println("Digite os gêneros do filme que você deseja adicionar.");
                    generos = sc.nextLine();
                    System.out.println("Digite a classificação indicativa do filme que você deseja adicionar.");
                    classificacao = sc.nextLine();
                    System.out.println("Digite a nota do filme que você deseja adicionar.");
                    nota = sc.nextLine();
                    System.out.println("Digite o nome do criador do filme que você deseja adicionar.");
                    criador = sc.nextLine();
                    System.out.println("Digite o orçamento do filme que você deseja adicionar.");
                    orcamento = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) do(s) diretor(es) do filme que você deseja adicionar.");
                    diretor = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) da(s) produtora(s) do filme que você deseja adicionar.");
                    produtora = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) do(s) roteiristas(s) do filme que você deseja adicionar.");
                    roteiristas = sc.nextLine();
                    System.out.println("Digite a duração do filme que você deseja adicionar.");
                    duracao = sc.nextLine();
                    Filme novoF = new Filme(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, diretor, produtora, roteiristas, duracao);
                    novoF.setNome(nome);
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
