public abstract class Barco {

    private String marca;
    private String modelo;

    private int capCombustible;

    private int capCarga;

    private String patente;

    public Barco(String marca, String modelo, int capCombustible, int capCarga, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.capCombustible = capCombustible;
        this.capCarga = capCarga;
        this.patente = patente;
    }

    public Barco() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapCombustible() {
        return capCombustible;
    }

    public void setCapCombustible(int capCombustible) {
        this.capCombustible = capCombustible;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capCombustible=" + capCombustible +
                ", capCarga=" + capCarga +
                ", patente='" + patente + '\'' +
                '}';
    }

    public boolean equals (Object obj){
        if(obj==null){
            return false;
        }else if(this==obj){
            return true;
        }else{
            Barco barquito = (Barco) obj;
            return this.patente.equals(barquito.getPatente());
        }
    }
}
