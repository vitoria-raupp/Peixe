public class Peixe {
    private String especie;
    private double comprimento;

    public Peixe(String especie, double comprimento) {
        this.especie = especie;
        this.comprimento = comprimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public boolean equals(Object comparacao){
        if (this == comparacao) return true;
        if (!(comparacao instanceof Peixe)) return false;
        Peixe bicho = (Peixe)comparacao;
        return bicho.comprimento ==(this.comprimento)&& bicho.especie == (this.especie);
    }
    @Override
    public String toString(){
        return "Especie: " + this.especie + " Comprimento: " + this.comprimento;
    }

    Peixe() {
        throw new UnsupportedOperationException();
    }

    boolean removePeixe() {
        throw new UnsupportedOperationException();
    }
    
}
