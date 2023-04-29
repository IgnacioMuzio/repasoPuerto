public class Menu {
    public static int execMenu(){
        int option;
        Consola.escribir("Menu puerto");
        Consola.escribir("1. Agregar un barco ");
        Consola.escribir("2. Listar barcos");
        Consola.escribir("3. Mandar barcos a recolectar");
        Consola.escribir("4. Mostrar valores totales de recoleccion");
        return option = getOption(0,4);
    }
    public static char askToRepeat(){
        Consola.escribir("Desea realizar otra funcion?");
        Consola.escribir("1...Si");
        Consola.escribir("0...No");
        int option = getOption(0,1);
        return option == 1 ? 's' : 'n';
    }

    private static int getOption(int min, int max){
        int option=0;
        do {

            if(option < min || option > max){
                option = Consola.leerInt("Ingrese una opcion valida");
            }else{
                option = Consola.leerInt("Ingrese una opcion ");
            }
        } while(option < min || option > max);
        return option;
    }
}
