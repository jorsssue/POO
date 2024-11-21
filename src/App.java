import java.util.Scanner;

import escuela.Section;
import escuela.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Section lis301 = new Section();
        int opcion;

        do {
            System.out.println("1) Agregar \n2) Buscar \n3) Borrar\n4) Imprimir por género \n5 Imprimir todos \n6) Salir");
            opcion = entrada.nextInt();
        } while (opcion != 6); 
        
        switch (opcion) {
            case 1: //Agregar estudiante
                System.out.println("Ingresa Id, Nombre, Edad, Genero");
                Student st = new Student(entrada.nextInt(), entrada.next(), entrada.nextInt(), entrada.next());
                lis301.addStudent(st);
                break;
            case 2: //Buscar estudiante
                System.out.println("Ingrese Id a buscar");
                lis301.searchStudent(entrada.nextInt());
                break;

            case 3: // Borrar estudiante
            
                break;
            
            case 4: // Imprimir por genero

                break;

            case 5: //Imprmir todos los estudiantes
                System.out.println(lis301.toString());
                break;

            case 6: //Salir

                break;
            default:
                break;
        }


    }
}
