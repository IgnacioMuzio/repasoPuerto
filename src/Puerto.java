import java.util.ArrayList;

public class Puerto {
    private ArrayList<Barco> puerto;

    public Puerto() {
        this.puerto = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "puerto=" + puerto +
                '}';
    }

    public void addBarco(Barco barco){
        if(!puerto.contains(barco)){
            puerto.add(barco);
        }else{
            System.out.println("Patente ya registrada.");
        }
    }

    public void recolectar(){
        for(Barco barquito : puerto){
            if(barquito instanceof iPesca){
                ((iPesca) barquito).recolectar();
            }
        }
    }

    public int size(){
        return puerto.size();
    }
    public void getMontosTotales(){
        int cantCorbeta=0;
        int cantLanchaAmarilla=0;
        for(Barco barquito : puerto){
            if(barquito instanceof Corbeta){
                cantCorbeta+=((Corbeta) barquito).getMonto();
            }
            else if(barquito instanceof LanchaAmarilla) {
                cantLanchaAmarilla += ((LanchaAmarilla) barquito).getMonto();
            }
        }
            System.out.println("El monto total recaudado por las corbetas fue de: "+ cantCorbeta +"dolares");
            System.out.println("El monto total recaudado por las lanchas amarillas fue de: "+ cantLanchaAmarilla +"dolares");
            System.out.println("El monto total recaudado fue de: "+ (cantCorbeta+cantLanchaAmarilla) +"dolares");
    }




}
