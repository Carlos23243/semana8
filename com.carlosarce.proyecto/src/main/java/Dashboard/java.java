/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard;

/**
 *
 * @author admin
 */
public class java {
    
  package com.carlosarce.proyecto.dashboard;
   
   import java.util.ArrayList;
   import java.util.List;
   import java.util.Scanner;
   
   public class Dashboard {
       
       private Lis<String>tareas;
       private Scanner scanner;
       
       public Deshboard() {
           tareas = new ArrayList<>();
           scanner = new Scanner(System.in); 
       }
       
       public void mostrarMenu() {
           int opcion = -1;
           mostrarMensajeBienvenida();
           
           while (opcion != o) {
               System.out.print("\n---Menú Dashoard---");
               System.out.print("1. Registrar nueva tarea");
               System.out.print("2. Mostrar tareas");
               System.out.print("o. Salir");
               System.out.print("Seleccione una opción: ");
               
               try{
                   opcion = integer parselnt(scanner.nextLine());
               } catch (NumberFormatException e) {
                   System.out.println("Por favor, ingrese un número válido.");
                   continue;
               }
               switch (opcion){
                   case 1:
                   registrarTarea();
                   break;
                   case 2:
                       mostrarTareas();
                       break;
                   case 0:
                       System.out.println("saliendo del dashoard. ¡Hasta luego!");
                       break;
                   default:
                       System.out.println("Opción no válida.");
          
               }
           }
       }
       
       private void mostrarMensajeBienvenida() {
           System.out.println("==================================");
           System.out.println(" Bienvenido al Dashboaard");
           System.out.println(" Proyecto POO - Gestión de tareas");
           System.out.println("==================================");
       }
       
       private void registrarTarea() {
           System.out.print("Ingrese la dscripción de la tarea: ");
           String tarea = scanner.nextLine();
           if (!tarea.isBlank()) {
               tareas.add(tarea);
               System.out.println("Tarea registrada Correctamente.");
           } else {
               System.out.println("La tarea no puede estar vacía. ");
           }
       }
       
       private void mostrar Tareass() {
           if(tareas isEmpty()){
           System.out.println("No hay tareas registraadas.");
       }else{
               System.out.println("\nTareas registradas.");
               for(inti = 0; ¡<tareas.size();¡++){
           System.out.println((¡+1)+ ""+ tareas. get(¡));
       }
               }
       }
   }
    
}
