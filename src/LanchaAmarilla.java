import java.util.Random;

import static java.lang.Math.random;

public class LanchaAmarilla extends Barco implements iPesca{
    private static final int capPorHora = 20;

    private int recolectado;

    public LanchaAmarilla(String marca, String modelo, int capCombustible, int capCarga, String patente) {
        super(marca, modelo, capCombustible, capCarga, patente);
    }

    public LanchaAmarilla() {
    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    @Override
    public String toString() {
        return "LanchaAmarilla{} " + super.toString() + "Capacidad de carga por hora= " + capPorHora;
    }
    @Override
    public void recolectar(){
        int recolectado=0;
        Random random = new Random();
        for(int i=0;i<12 && recolectado<=this.getCapCarga();i++){
            recolectado+= random.nextInt(20);
            Consola.escribir("entre");
        }
        if(recolectado>=this.getCapCarga()){
            this.recolectado= getCapCarga();
        }else{
            this.recolectado= recolectado;
        }
    }

    @Override
    public int getMonto() {
        return recolectado*11;
    }
}
