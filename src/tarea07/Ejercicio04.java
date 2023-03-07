package tarea07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Ejercicio 4. Clasificación de mascotas coincidentes
 *
 * @author Oscar Martín Maraver
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 20;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");

        // Rellenamos la lista con mascotas aleatorias hasta que haya NUMERO_MASCOTAS
        ArrayList<Mascota> arrayMascota1 = new ArrayList<>();
        ArrayList<Mascota> arrayMascota2 = new ArrayList<>();
        int contadorMascota = 0;
        Mascota m;
        Mascota n;

        do {
            m = Utilidades.mascotaAleatoria();
            n = Utilidades.mascotaAleatoria();
            arrayMascota1.add(m);
            arrayMascota2.add(n);
            contadorMascota++;
        } while (contadorMascota < NUMERO_MASCOTAS);

        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        LinkedHashMap<String, List<Integer>> clasifMascota = new LinkedHashMap<>();
        int contComparacion = 0;

        for (Mascota i : arrayMascota1) {
            if (i.getNombre().equals(arrayMascota2.get(contComparacion).getNombre())) {
                if (!clasifMascota.containsKey(i.getNombre())) {
                    ArrayList<Integer> posicion = new ArrayList<>();
                    clasifMascota.put(i.getNombre(), posicion);
                }
                clasifMascota.get(i.getNombre()).add(arrayMascota1.indexOf(i) + 1);
            }
            contComparacion++;
        }

        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.println("Contenido inicial de la lista mascotas1:");
        System.out.print(arrayMascota1.toString());
        System.out.println();
        System.out.println("Contenido inicial de la lista mascotas2:");
        System.out.print(arrayMascota2.toString());
        System.out.println();
        System.out.println("Clasificación de coincidencias:");
        System.out.print(clasifMascota.toString());
    }
}
