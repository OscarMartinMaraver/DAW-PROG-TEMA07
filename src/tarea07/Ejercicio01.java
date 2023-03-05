package tarea07;

import java.util.HashSet;

/**
 * Ejercicio 1. Gestionando mascotas
 * @author Oscar Martín Maraver
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
        
        final int NUMERO_MASCOTAS = 4;
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CONJUNTOS DE MASCOTAS");
        System.out.println("---------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        
        // Rellenamos los conjuntos con aleatorios hasta que haya NUMERO_MASCOTAS
        
        HashSet<Mascota> conjuntoUno=new HashSet<>();
        HashSet<Mascota> conjuntoDos=new HashSet<>();
        

        int contadorMascota=0;
        
        do {
            Mascota m,n;
            m= Utilidades.mascotaAleatoria();
            n= Utilidades.mascotaAleatoria();
            if (!conjuntoUno.add(m)||!conjuntoDos.add(n)) {
                System.out.println("La masota ya se encuentra en el conjunto");
            } else {
                conjuntoUno.add(m);
                conjuntoDos.add(n);
                contadorMascota++;
            }
        } while (contadorMascota < NUMERO_MASCOTAS);

        // Cálculo de la Unión de los dos conjuntos 
        
        
        // Cálculo de la Intersección de los conjuntos
        
        
        // Cálculo de la Diferencia de los conjuntos
        
        
        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------
                
        System.out.println("Conjunto Mascotas1:");
        /*
        Podria recorrerse la lista e imprimir cada elemeto
        for (Mascota i : conjuntoUno) {
            System.out.print(i.toString());
        }
        */
        //O imprimir la lista directamete
        System.out.print(conjuntoUno.toString());
        
        System.out.println();
        System.out.println("Conjunto Mascotas2:");
        
        System.out.print(conjuntoDos.toString());

    }
   
}
