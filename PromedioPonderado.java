// Jordi Josue Dominguez Ovando

import java.util.Scanner;

public class PromedioPonderado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el número de EE: ");
        int experienciasEducativas = entrada.nextInt();

        double[] calificacion = new double[experienciasEducativas];
        double[] creditos = new double[experienciasEducativas];

        // funcion que recibe las calificaciones y creditos
        calificacionCreditos(entrada, calificacion, creditos);

        // funcion que calcula el promedio
        double promedio = mediaPonderada(calificacion, creditos);
        System.out.printf("El promedio ponderado es de %.3f", promedio);
    }

    public static void calificacionCreditos(Scanner entrada, double[] calificacion, double[] creditos){
        for(int i = 0; i < calificacion.length; i++){
            System.out.print(i + 1 +". Experiencia Educativa - Créditos: ");
            creditos[i] = entrada.nextDouble();
            
            System.out.print(i + 1 +". Experiencia Educativa - Calificación: ");
            calificacion[i] = entrada.nextDouble();
            System.out.println("");
        }
    }

    public static double mediaPonderada(double[] calificacion, double[] creditos) {
        double sumaFactoresPonderados = 0;
        double sumaCreditos = 0;

        for(int i = 0; i < calificacion.length; i++){
            sumaFactoresPonderados += calificacion[i] * creditos[i];
            sumaCreditos += creditos[i];
        }

        return sumaFactoresPonderados / sumaCreditos;
    }
}