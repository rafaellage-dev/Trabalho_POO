package setimaArte;

public abstract class SetimaArte {
    public String nome;
    public String data;
    public String sinopse;
    public String genero;
    public String classificacao;
    public String nota;
    public String criador;
    public String orcamento;

    public void mostrarInfo(){
        System.out.println("Nome: "+nome+"\nData de lançamento: "+data+"\nSinopse: "+sinopse+"\nGêneros: "+genero+"\nClassificação indicativa: "+classificacao+"\nNota: "+nota+"\nCriador: "+criador+"\nOrçamento: "+orcamento);
    }
}
