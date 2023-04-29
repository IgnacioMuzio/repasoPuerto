public class Main {
    public static void main(String[] args) {
        Puerto puertito = new Puerto();

        //region hardcodeo

        puertito.addBarco(new LanchaAmarilla("Marca 1", "Modelo 1",300,150,"ABC123"));
        puertito.addBarco(new LanchaAmarilla("Marca 2", "Modelo 1",300,300,"ABC124"));
        puertito.addBarco(new LanchaAmarilla("Marca 3", "Modelo 1",300,400,"ABC125"));
        puertito.addBarco(new Corbeta("Marca 1","Modelo 1",300,"DEF123",10));
        puertito.addBarco(new Corbeta("Marca 2","Modelo 1",300,"DEF124",15));
        puertito.addBarco(new Corbeta("Marca 3","Modelo 1",300,"DEF125",20));

        //endregion

        menu(puertito); //recomiendo este
        //menuConClase(puertito);

    }

    //region Menu Sin Clase

    public static void menu(Puerto puertito){
        int option;
        do{
            Consola.escribir("Menu puerto");
            Consola.escribir("1. Agregar un barco ");
            Consola.escribir("2. Listar barcos");
            Consola.escribir("3. Mandar barcos a recolectar");
            Consola.escribir("4. Mostrar valores totales de recoleccion");
            option = Consola.leerInt("Ingrese un opcion");


            switch (option){
                case 1:
                    Corbeta barco = new Corbeta("Marca Generica", "Modelo generico", 200, "JVC547",10 );
                    puertito.addBarco(barco);
                    break;
                case 2:
                    Consola.escribir(puertito.toString());
                    break;
                case 3:
                    puertito.recolectar();
                    Consola.escribir("Los " + puertito.size() +" barcos salieron a pescar");
                    break;
                case 4:
                    puertito.getMontosTotales();
                    break;
                case 0: Consola.escribir("nv");
            }
        }while(option != 0);
    }

    //endregion

    //region Menu con clase

    public static void menuConClase(Puerto puertito){
        char control = 's';
        int option;
        do {
            option = Menu.execMenu();

            switch (option) {
                case 1:
                    Corbeta barco = new Corbeta("Marca Generica", "Modelo generico", 200, "JVC547",10 );
                    puertito.addBarco(barco);
                    break;
                case 2:
                    Consola.escribir(puertito.toString());
                    break;
                case 3:
                    puertito.recolectar();
                    Consola.escribir("Los " + puertito.size() +" barcos salieron a pescar");
                    break;
                case 4:
                    puertito.getMontosTotales();
                    break;
            }
            if(control != 'n')
                control = Menu.askToRepeat();
            if(control == 'n');
                Consola.escribir("Gracias");
        } while (control == 's');
    }

    //endregion

}