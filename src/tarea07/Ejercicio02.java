package tarea07;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Ejercicio 2. Clasificación de mascotas
 *
 * @author Oscar Martín Maraver
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 10;
        
        // Auxiliares
        
        int contadorMascota=0; //para recorrer bucle do-while

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CLASIFICACIÓN DE MASCOTAS");
        System.out.println("-------------------------");

        // Rellenamos la lista con mascotas aleatorias hasta que haya NUMERO_MASCOTAS
        ArrayList<Mascota> arrayMascota = new ArrayList<>();
        Mascota m;
        
        do {
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
            if ((i.getTipo()).toUpperCase().startsWith("P")) {
                arrayPerro.add(i);
            }
        }

        //Clasificación por tipo GATO
        ArrayList<Mascota> arrayGato = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getTipo()).toUpperCase().startsWith("G")) {
                arrayGato.add(i);
            }
        }

        //Clasificación por sexo MACHO
        ArrayList<Mascota> arrayMacho = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getSexo()).toUpperCase().startsWith("M")) {
                arrayMacho.add(i);
            }
        }

        //Clasificación por sexo MACHO
        ArrayList<Mascota> arrayHembra = new ArrayList<>();

        for (Mascota i : arrayMascota) {
            if ((i.getSexo()).toUpperCase().startsWith("H")) {
                arrayHembra.add(i);
            }
        }

        //Eliminando a los PERROS de la lista de mascotas original
        ArrayList<Mascota> arrayMascotaFin = new ArrayList<>();
        ArrayList<String> arrayNomElim = new ArrayList<>();
        HashSet<String> conjuntoNomElim = new HashSet<>();
        ArrayList<Integer> arrayPosElim = new ArrayList<>();
        int posicion = 0;

        for (Mascota i : arrayMascota) {
            arrayMascotaFin.add(i);
            posicion++;
            if ((i.getTipo()).toUpperCase().startsWith("P")) {
                arrayNomElim.add(i.getNombre());
                conjuntoNomElim.add(i.getNombre());
                arrayPosElim.add(posicion);
                arrayMascotaFin.remove(i);
            }
        }

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        System.out.println("1. Contenido inicial de la lista mascotas:");
        System.out.print(arrayMascota.toString());
        System.out.println();
        System.out.println("2. Contenido final de la lista de mascotas:");
        System.out.print(arrayMascotaFin.toString());
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
        System.out.println();
        System.out.println("7. Contenido final de la lista de nombres de mascotas eliminadas:");
        System.out.print(arrayNomElim.toString());
        System.out.println();
        System.out.println("8. Contenido final de la lista de posiciones eliminadas:");
        System.out.print(arrayPosElim.toString());
        System.out.println();
        System.out.println("9. Contenido final del conjunto de nombres de mascotas eliminadas:");
        System.out.println(conjuntoNomElim.toString());
    }

}
