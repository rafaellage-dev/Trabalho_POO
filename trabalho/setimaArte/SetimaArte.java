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

    public void Obra(String nome, String data, String sinopse, String genero, String classificacao, String nota, String criador, String orcamento){
        this.nome = nome;
        this.data = data;
        this.sinopse = sinopse;
        this.genero = genero;
        this.classificacao = classificacao;
        this.nota = nota;
        this.criador = criador;
        this.orcamento = orcamento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

}
