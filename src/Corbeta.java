import java.util.Random;

public class Corbeta extends Barco implements iPesca{

    private int cantJaulas;
    private static final int capJaula=10;

    private int recolectado;

    public Corbeta(String marca, String modelo, int capCombustible, String patente, int cantJaulas) {
        super(marca, modelo, capCombustible, (cantJaulas*capJaula), patente);
        this.cantJaulas = cantJaulas;
    }

    public Corbeta() {
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    @Override
    public String toString() {
        return "Corbeta{" +
                "cantJaulas=" + cantJaulas +
                "} " + super.toString();
    }


    @Override
    public void recolectar() {
        Random random = new Random();
        recolectado = random.nextInt(getCapCarga());
    }

    @Override
    public int getMonto() {
        return recolectado*11;
    }
}
