public class Voo {
    private String nomeVoo;
    private String origem;
    private String destino;
    private String tipoAviao;
    private int numAcentos;
    private int qtdePassageiros;
    private Passageiro[] vetPassageiros;

    public Voo(){
        this.vetPassageiros = new Passageiro[180];
        this.qtdePassageiros = 0;
    }

    public String getNomeVoo(){
        return this.nomeVoo;
    }
    public void setNomeVoo(String nv){
        this.nomeVoo = nv;
    }


}
