package tarea07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/** Ejercicio 5. Ordenación de mascotas
 * @author Oscar Martín Maraver
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("ORDENACIÓN DE MASCOTAS");
        System.out.println("----------------------");
        // No se piden datos al usuario, ya que vamos a introducir unos datos concretos
        ArrayList <Mascota> mascota = new ArrayList<>();
       
        String[] caractHappy={"Pelo corto","Tricolor"};
        String[] caractNube={"Pelo largo", "Blanco", "25kg"};
        String[] caractTana={"Pelo largo"};
        String[] caractKhal = {};

        Mascota m= new Mascota ("Happy End", 14,"Gata", "Hembra", "Europeo", caractHappy);
        Mascota n= new Mascota ( "Nube", 8, "Perro", "Macho", "Samoyedo", caractNube);
        Mascota o= new Mascota ("Tana", 7, "Gata", "Hembra", "Azul ruso", caractTana);
        Mascota p= new Mascota ("Khal", 6, "Perro", "Macho", "Akita Inu", caractKhal);
        mascota.add(m);
        mascota.add(n);
        mascota.add(o);
        mascota.add(p);

        
        // Mostramos el contenido inicial de la lista
        System.out.println("Contenido inicial de la lista:"+"\n");
           for(Mascota i: mascota){
           System.out.printf( "%d. %s\n", mascota.indexOf(i)+1, i.toString());
        }
        System.out.println();   
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        // Ordenación de la lista por nombre de la mascota (alfabético) y la mostramos por pantalla
        
        Collections.sort(mascota, new ComparadorMascotasPorNombre());
        
        System.out.println("Ordenación de la lista por nombre (alfabético):"+"\n");
        for(Mascota i: mascota){
           System.out.printf( "%d. %s\n", mascota.indexOf(i)+1, i.toString());
        }
        System.out.println(); 
        
        // Ordenación de la lista por edades y la mostramos por pantalla

        Collections.sort(mascota, new ComparadorMascotasPorEdad());
        
        System.out.println("Ordenación de la lista por edad:"+"\n");
        for(Mascota i: mascota){
           System.out.printf( "%d. %s\n", mascota.indexOf(i)+1, i.toString());
        }
        System.out.println();
        
        // Ordenación de la lista por número de características de las mascotas y la mostramos por pantalla
        
        Collections.sort(mascota, new ComparadorMascotasPorNumCaracteristicas());
        
        System.out.println("Ordenación de la lista por número de características que describen a la mascota:"+"\n");
        for(Mascota i: mascota){
           System.out.printf( "%d. %s\n", mascota.indexOf(i)+1, i.toString());
        }
        System.out.println();
    }

   static class ComparadorMascotasPorNombre implements Comparator<Mascota> {

        @Override
        public int compare(Mascota mascota1, Mascota mascota2) {
            return mascota1.getNombre().compareTo(mascota2.getNombre());
        }
    }
   
    static class ComparadorMascotasPorEdad implements Comparator<Mascota> {

        @Override
        public int compare(Mascota mascota1, Mascota mascota2) {
            int resultado;
            if (mascota1.getEdad() < mascota2.getEdad()) {
                resultado = - 1;
            } else {
                if (mascota1.getEdad() > mascota2.getEdad()) {
                    resultado = 1;
                } else {
                    resultado = 0;
                }
            }
            return resultado;
        }
    }
   
    static class ComparadorMascotasPorNumCaracteristicas implements Comparator<Mascota> {

        @Override
        public int compare(Mascota mascota1, Mascota mascota2) {
            int resultado;
            if (mascota1.getCaracteristicas().size() < mascota2.getCaracteristicas().size()) {
                resultado = -1;
            } else {
                if (mascota1.getCaracteristicas().size() > mascota2.getCaracteristicas().size()) {
                    resultado = 1;
                } else {
                    resultado = 0;
                }
            }
            return resultado;
        }
    }
   
}

