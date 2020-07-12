package Clases;

import java.util.Scanner;

public class AplicaListaSimple {

    static Scanner teclado = new Scanner(System.in);
    static Lista lista = new Lista();
    static Nodo nodo;

    public static void main(String arg[]) {
        menu();
    }

    static void menu() {
        int opcion;

        do {
            System.out.println("\n\nMenú de Opciones");
            System.out.println("==================================");
            System.out.println("[1] Insertar al Inicio de la Lista");
            System.out.println("[2] Insertar al Final de la Lista");
            System.out.println("[3] Mostrar los Elementos");
            System.out.println("[4] Eliminar");
            System.out.println("===================================");
            System.out.println("[0] Salir de la Aplicación");

            System.out.print("Ingrese una Opción : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ingreso();
                    break;
                case 2:
                    ingresoFinal();
                    break;
                case 3:
                    lista.listar();
                    break;
                case 4:
                    lista.eliminar();
            }

        } while (opcion != 0);
    }

    static void ingreso() {
        System.out.print("Ingrese Nombre : ");
        String num = teclado.next();
        lista.agregarInicio(num);
    }
    
    static void ingresoFinal() {
        System.out.print("Ingrese Nombre : ");
        String num = teclado.next();
        lista.agregarFinal(num);
    }

}
