package setimaArte;

import setimaArte.SetimaArte;

public class Serie extends SetimaArte{
    public String temporadas;
    public String episodios;
    public String data_final;
    
    public Serie(String nome, String data, String sinopse, String genero, String classificacao, String nota, String criador, String orcamento, String temporadas, String episodios, String data_final){
        super.Obra(nome, data, sinopse, genero, classificacao, nota, criador, orcamento);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.data_final = data_final;     
    }
    @ Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de temporadas: "+temporadas+"\nNúmero de episodios: "+episodios+"\nData de término: "+data_final);
    }
}
