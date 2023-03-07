package tarea07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 * Ejercicio 3. La mascota del mes
 *
 * @author Oscar Martín Maraver
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int MESES = 12;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("LA MASCOTA DEL MES");
        System.out.println("-------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        LocalDate fecha = LocalDate.parse("2023-01-01");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        HashMap<LocalDate, Mascota> mascotaMes = new HashMap<>();
        Mascota m;
        int contadorMes = 0;
        do {
            m = Utilidades.mascotaAleatoria();
            if (mascotaMes.containsValue(m)) {
                System.out.println("La mascota ya se encuentra en el conjunto");
            } else {
                mascotaMes.put(fecha, m);
                contadorMes++;
                fecha = fecha.plusMonths(1);
            }
        } while (contadorMes < MESES);

        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.printf("Contenido final del mapa de mascotas organizado por fechas:\n\n");

        for (LocalDate llave : mascotaMes.keySet()) {
            String fechaFormato = llave.format(formato);
            String mascota = mascotaMes.get(llave).toString();
            System.out.printf("Fecha %s: %s", fechaFormato, mascota);
        }
    }
}
