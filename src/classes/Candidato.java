package classes;

public class Candidato {
    
    private String nome;
    private String partido;
    private int numero;
    private int votos;

    public Candidato(){
        this.nome = new String();
        this.partido = new String();
        this.numero = 0;
        this.votos = 0;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPartido(String partido){
        this.partido = partido;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void addVoto(){
        this.votos++;
    }
    public String getNome(){
        return this.nome;
    }

    public String getPartido(){
        return this.partido;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getVotos(){
        return this.votos;
    }
}
