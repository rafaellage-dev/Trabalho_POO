package setimaArte;

import setimaArte.SetimaArte;

public class Filme extends SetimaArte{
    public String diretor;
    public String produtora;
    public String roteiristas;
    public String duracao;

    public Filme(String nome, String data, String sinopse, String genero, String classificacao, String nota, String criador, String orcamento, String diretor, String produtora, String roteiristas, String duracao){
       super.Obra(nome, data, sinopse, genero, classificacao, nota, criador, orcamento);
       this.diretor = diretor;
       this.produtora = produtora;
       this.roteiristas = roteiristas;
       this.duracao = duracao;
    }
    @ Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Diretor(es): "+diretor+"\nProdutora: "+produtora+"\nRoteirista(s): "+roteiristas+"\nDuração do filme: "+duracao);
    }
}
