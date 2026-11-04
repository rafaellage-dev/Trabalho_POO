// Alunos : Antonio de Sousa e Silva Cunha - RA : 22608943; Rafael Nogueira Lage - RA : 22602383 
import java.util.ArrayList;
import java.util.Scanner;
import setimaArte.SetimaArte;
import setimaArte.Filme;
import setimaArte.Serie;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contagemS = -1;
        int contagemF = -1;
        int index = 0;
        boolean escolha = true;
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
        ArrayList<Serie> series;
        series = new ArrayList<Serie>();
        ArrayList<Filme> filmes;
        filmes= new ArrayList<Filme>();
        do{
            System.out.println(" \nDigite um número inteiro positivo, de 0 a 8 para escolher uma desta opções do menu :\n 0 - Parar a operação.\n 1 - Adicionar uma nova série ao catálogo.\n 2 - Mostrar as informações de uma série do catálogo.\n 3 - Atualizar uma série do catálogo.\n 4 - Excluir uma série do catálogo.\n 5 - Adicionar um novo filme ao catálogo.\n 6 - Mostrar as informações de um filme do catálogo.\n 7 - Atualizar um filme do catálogo.\n 8 - Excluir um filme do catálogo.");
            num = sc.nextInt();
            sc.nextLine();
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
                    contagemS += 1;
                    System.out.println("O index desta série é : "+contagemS); 
                    break;
                case 2:
                    System.out.println("Digite 'true' caso você queira visualizar todas as séries, ou digite 'false' caso você deseje visualizar apenas uma série");
                    escolha = sc.nextBoolean();
                    if(escolha){
                        for(int i=0; i <= index; i++){
                            series.get(index).mostrarInfo();
                            }
                    } else{
                    System.out.print("Digite o index da série que você deseja consultar : ");
                    index = sc.nextInt();
                    series.get(index).mostrarInfo();
                    }
                    break;
                case 3:
                    System.out.print("Digite o index da série que você deseja atualizar (que terá suas informações apresentadas para que você compare o update) : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    series.get(index).mostrarInfo();
                    series.remove(index);
                    contagemS -= 1;
                    System.out.println("Digite o nome da versão atualizada da série.");
                    nome = sc.nextLine();
                    System.out.println("Digite a data de lançamento da versão atualizada da série.");
                    dataL = sc.nextLine();
                    System.out.println("Digite a sinopse da versão atualizada da série.");
                    sinopse = sc.nextLine();
                    System.out.println("Digite os gêneros da versão atualizada da série.");
                    generos = sc.nextLine();
                    System.out.println("Digite a classificação indicativa da versão atualizada da série.");
                    classificacao = sc.nextLine();
                    System.out.println("Digite a nota da versão atualizada da série.");
                    nota = sc.nextLine();
                    System.out.println("Digite o nome do criador da versão atualizada da série.");
                    criador = sc.nextLine();
                    System.out.println("Digite o orçamento da versão atualizada da série.");
                    orcamento = sc.nextLine();
                    System.out.println("Digite o número de temporadas da versão atualizada da série.");
                    temporadas = sc.nextLine();
                    System.out.println("Digite o número de episódios da versão atualizada da série.");
                    episodios = sc.nextLine();
                    System.out.println("Digite a data de encerramento da versão atualizada da série.");
                    dataF = sc.nextLine();
                    Serie novoS1 = new Serie(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, temporadas, episodios, dataF);
                    series.add(novoS1 = new Serie(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, temporadas, episodios, dataF));
                    contagemS += 1;
                    System.out.println("Série atualizada com sucesso! O index de todas as séries com index maior que "+index+" foram diminuídos por um, o novo index desta série é :  "+contagemS); 
                    break;
                case 4:
                    System.out.print("Digite o index da série que você deseja deletar : ");
                    index = sc.nextInt();
                    series.remove(index);
                    contagemS -= 1;
                    System.out.println("Série deletada com sucesso! O index de todas as séries com index maior que "+index+" foram diminuídos por um."); 
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
                    filmes.add(novoF = new Filme(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, diretor, produtora, roteiristas, duracao));
                    contagemF += 1;
                    System.out.println("O index deste filme é : "+contagemF); 
                    break;
                case 6:
                    System.out.println("Digite 'true' caso você queira visualizar todos os filmes, ou digite 'false' caso você deseje visualizar apenas um filme");
                    escolha = sc.nextBoolean();
                    if(escolha){
                        for(int i=0; i <= index; i++){
                        filmes.get(index).mostrarInfo();
                        }
                    } else{
                    System.out.print("Digite o index do filme que você deseja consultar : ");
                    index = sc.nextInt();
                    filmes.get(index).mostrarInfo();
                    }
                    break;
                case 7:
                    System.out.print("Digite o index do filme que você deseja atualizar (que terá suas informações apresentadas para que você compare o update) : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    filmes.get(index).mostrarInfo();
                    filmes.remove(index);
                    contagemF -= 1;
                    System.out.println("Digite o nome da versão atualizada do filme.");
                    nome = sc.nextLine();
                    System.out.println("Digite a data da versão atualizada de lançamento do filme.");
                    dataL = sc.nextLine();
                    System.out.println("Digite a sinopse da versão atualizada do filme.");
                    sinopse = sc.nextLine();
                    System.out.println("Digite os gêneros da versão atualizada do filme.");
                    generos = sc.nextLine();
                    System.out.println("Digite a classificação da versão atualizada indicativa do filme.");
                    classificacao = sc.nextLine();
                    System.out.println("Digite a nota da versão atualizada do filme.");
                    nota = sc.nextLine();
                    System.out.println("Digite o nome do criador da versão atualizada do filme.");
                    criador = sc.nextLine();
                    System.out.println("Digite o orçamento da versão atualizada do filme.");
                    orcamento = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) do(s) diretor(es) da versão atualizada do filme.");
                    diretor = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) da(s) produtora(s) da versão atualizada do filme.");
                    produtora = sc.nextLine();
                    System.out.println("Digite o(s) nome(s) do(s) roteiristas(s) da versão atualizada do filme.");
                    roteiristas = sc.nextLine();
                    System.out.println("Digite a duração do filme.");
                    duracao = sc.nextLine();
                    Filme novoF1 = new Filme(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, diretor, produtora, roteiristas, duracao);
                    filmes.add(novoF1 = new Filme(nome, dataL, sinopse, generos, classificacao, nota, criador, orcamento, diretor, produtora, roteiristas, duracao));
                    contagemF += 1;
                    System.out.println("Filme atualizado com sucesso! O index de todos os filmes com index maior que "+index+" foram diminuídos por um, o novo index deste filme é :  "+contagemS); 
                    break;
                case 8:
                    System.out.print("Digite o index do filme que você deseja deletar : ");
                    index = sc.nextInt();                    
                    filmes.remove(index);
                    contagemF -= 1;
                    System.out.println("Filme deletado com sucesso! O index de todos os filmes com index maior que "+index+" foram diminuídos por um."); 
                    break;
                default:
                   System.out.println("O número digitado não é válido para nenhuma operação, tente novamente.");
                    break;    
            }
        }while(num != 0);
        System.out.println("Operação interrompida.");
   }
}
