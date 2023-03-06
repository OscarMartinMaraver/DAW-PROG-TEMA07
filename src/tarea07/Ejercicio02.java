package tarea07;

import java.util.ArrayList;

/** Ejercicio 2. Clasificación de mascotas
 * @author Oscar Martín Maraver
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
        
        final int NUMERO_MASCOTAS = 10;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CLASIFICACIÓN DE MASCOTAS");
        System.out.println("-------------------------");

        // Rellenamos la lista con mascotas aleatorias hasta que haya NUMERO_MASCOTAS

        ArrayList<Mascota> arrayMascota = new ArrayList<>();

        int contadorMascota = 0;

        do {
            Mascota m;
            m = Utilidades.mascotaAleatoria();
            arrayMascota.add(m);
            contadorMascota++;

        } while (contadorMascota < NUMERO_MASCOTAS);
        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------
        
        //Clasificación por tipo PERRO
        ArrayList<Mascota> arrayPerro = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getTipo()).startsWith("P")) {
                arrayPerro.add(i);
            } 
        }

        //Clasificación por tipo GATO
        ArrayList<Mascota> arrayGato = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getTipo()).startsWith("G")) {
                arrayGato.add(i);
            } 
        }
        
        //Clasificación por sexo MACHO
        
        ArrayList<Mascota> arrayMacho = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getSexo()).startsWith("M")) {
                arrayMacho.add(i);
            } 
        }
        
        //Clasificación por sexo MACHO
        
        ArrayList<Mascota> arrayHembra = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getSexo()).startsWith("H")) {
                arrayHembra.add(i);
            } 
        }
        
        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------

        System.out.println("1. Contenido inicial de la lista mascotas:");
        System.out.print(arrayMascota.toString());
        System.out.println();
        System.out.println("3. Contenido final de la lista de perr@s:");
        System.out.print(arrayPerro.toString());
        System.out.println();
        System.out.println("4. Contenido final de la lista de gat@s:");
        System.out.print(arrayGato.toString());
        System.out.println();
        System.out.println("5. Contenido final de la lista de mascotas machos:");
        System.out.print(arrayMacho.toString());
        System.out.println();
        System.out.println("6. Contenido final de la lista de mascotas hembras:");
        System.out.print(arrayHembra.toString());
    }

}
