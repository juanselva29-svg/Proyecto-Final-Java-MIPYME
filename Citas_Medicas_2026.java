
// Importa Scanner para leer datos desde el teclado
import java.util.Scanner;

// Clase principal del sistema de gestión de citas médicas
public class Citas_Medicas_2026 {
   // Método principal donde inicia la ejecución del programa
   public static void main(String[] args) {
      boolean cita_agendada = false;
      // Objeto Scanner para capturar datos ingresados por el usuario
      Scanner sc = new Scanner(System.in);
      // Matriz para almacenar información de las citas
      String[][] citas = new String[5][7];
      int total_citas = 0;

      int opcion;
       do {
         // Muestra información o mensajes en pantalla
         System.out.println("=====| SISTEMA DE GESTION HOSPITALARIA SGH |  HAN |=====");
         // Muestra información o mensajes en pantalla
         System.out.println("1--Paciente");
         // Muestra información o mensajes en pantalla
         System.out.println("2--Administrador");
         // Muestra información o mensajes en pantalla
         System.out.println("3--Salir");
         // Muestra información o mensajes en pantalla
         System.out.println("Seleccione una de estas opciones:");
         opcion = sc.nextInt();
         sc.nextLine();
         // Estructura de selección para evaluar opciones del usuario
         switch (opcion) {
            // Opción 1 del menú o submenú
            case 1:
               // Muestra información o mensajes en pantalla
               System.out.println();
               // Muestra información o mensajes en pantalla
               System.out.println();
               // Muestra información o mensajes en pantalla
               System.out.println("===|Paciente|===");
               // Muestra información o mensajes en pantalla
               System.out.println("Ingresa tu usuario:");
               String user = sc.nextLine();

               while (!user.equalsIgnoreCase("juan")) {
                  // Muestra información o mensajes en pantalla
                  System.out.println();
                  // Muestra información o mensajes en pantalla
                  System.out.println("Usuario no válido, ingreselo nuevamente");
                  user = sc.nextLine();
                  if (user.equalsIgnoreCase("juan")) {
                     // Muestra información o mensajes en pantalla
                     System.out.println();
                     // Muestra información o mensajes en pantalla
                     System.out.println("Usuario válido");
                  }
               }

               // Muestra información o mensajes en pantalla
               System.out.println("Ingrese su contraseña:");
               int password = sc.nextInt();

               for (int intentos = 1; password != 0 && intentos < 4; ++intentos) {
                  // Muestra información o mensajes en pantalla
                  System.out.println("Contraseña incorrecta, ingresela nuevamente");
                  password = sc.nextInt();
                  sc.nextLine();
               }

               if (password == 0) {
                  // Muestra información o mensajes en pantalla
                  System.out.println();
                  // Muestra información o mensajes en pantalla
                  System.out.println("Contraseña correcta, bienvenido");
               } else {
                  // Muestra información o mensajes en pantalla
                  System.out.println();
                  // Muestra información o mensajes en pantalla
                  System.out.println("Cuenta bloqueada demasiados intentos fallidos");
               }

               // Muestra información o mensajes en pantalla
               System.out.println();
               // Muestra información o mensajes en pantalla
               System.out.println("1--Agendar cita");
               // Muestra información o mensajes en pantalla
               System.out.println("2--Cancelar cita");
               // Muestra información o mensajes en pantalla
               System.out.println("3--volver");
               // Muestra información o mensajes en pantalla
               System.out.println("Seleccione una de estas opciones:");
               int opcion_p = sc.nextInt();
               sc.nextLine();
               // Estructura de selección para evaluar opciones del usuario
               switch (opcion_p) {
                  // Opción 1 del menú o submenú
                  case 1:
                     if (total_citas >= 5) {
                        continue;
                     }

                     // Muestra información o mensajes en pantalla
                     System.out.println("====|Agendar cita|====");
                     // Muestra información o mensajes en pantalla
                     System.out.println("");
                     // Muestra información o mensajes en pantalla
                     System.out.println("====| Especialidades |====");
                     // Muestra información o mensajes en pantalla
                     System.out.println("1-- Medicina General");
                     // Muestra información o mensajes en pantalla
                     System.out.println("2-- Pediatría");
                     // Muestra información o mensajes en pantalla
                     System.out.println("3-- Dermatología");
                     // Muestra información o mensajes en pantalla
                     System.out.println("4-- Ortopedia");
                     // Muestra información o mensajes en pantalla
                     System.out.println("5-- Ginecología y Obstetricia");
                     // Muestra información o mensajes en pantalla
                     System.out.println("6-- Urología");
                     // Muestra información o mensajes en pantalla
                     System.out.println("7-- Volver");
                     // Muestra información o mensajes en pantalla
                     System.out.println("Seleccione la especialidad requerida:");
                     // Muestra información o mensajes en pantalla
                     System.out.println();
                     int especialidad = sc.nextInt();
                     sc.nextLine();
                     // Estructura de selección para evaluar opciones del usuario
                     switch (especialidad) {
                        // Opción 1 del menú o submenú
                        case 1:
                           cita_agendada = false;
                           // Muestra información o mensajes en pantalla
                           System.out.println();
                           // Muestra información o mensajes en pantalla
                           System.out.println("===| Medicina General |====");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Todos los días: 8:00 AM - 3:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Ingrese el día que requiere su cita:");
                           String dia = sc.nextLine();

                           while (true) {
                              if (cita_agendada) {
                              }

                              // Muestra información o mensajes en pantalla
                              System.out.println("======| Horarios |=====");
                              // Muestra información o mensajes en pantalla
                              System.out.println("1--8:00AM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("2--9:00AM (ocupado)");
                              // Muestra información o mensajes en pantalla
                              System.out.println("3--10:00AM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("4--11:00AM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("5--1:00PM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("6--2:00PM (ocupado)");
                              // Muestra información o mensajes en pantalla
                              System.out.println("7--3:00PM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("8--Volver");
                              // Muestra información o mensajes en pantalla
                              System.out.println("Ingrese la hora que desea su cita:");
                              int hora = sc.nextInt();
                              sc.nextLine();
                              // Estructura de selección para evaluar opciones del usuario
                              switch (hora) {
                                 // Opción 1 del menú o submenú
                                 case 1:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 8:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese su nombre completo por favor:");
                                    String nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                    int edad = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese el número de cédula:");
                                    String cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Medicina General";
                                    citas[total_citas][4] = dia;
                                    citas[total_citas][5] = "8:00 AM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica:" + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Día:" + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Hora:" + citas[total_citas][5]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                    ++total_citas;
                                    cita_agendada = true;
                                    break;
                                 // Opción 2 del menú o submenú
                                 case 2:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 9:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Esa hora esta reservada, ingrese otra hora");
                                    break;
                                 // Opción 3 del menú o submenú
                                 case 3:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 10:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese su nombre completo por favor:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                     edad = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese el número de cédula:");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Medicina General";
                                    citas[total_citas][4] = dia;
                                    citas[total_citas][5] = "10:00 AM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica:" + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Día:" + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Hora:" + citas[total_citas][5]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                    ++total_citas;
                                    cita_agendada = true;
                                    break;
                                 // Opción 4 del menú o submenú
                                 case 4:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 11:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese su nombre completo por favor:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                     edad = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese el número de cédula:");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Medicina General";
                                    citas[total_citas][4] = dia;
                                    citas[total_citas][5] = "11:00 AM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica: " + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Día: " + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Hora: " + citas[total_citas][5]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                    ++total_citas;
                                    cita_agendada = true;
                                    break;
                                 // Opción 5 del menú o submenú
                                 case 5:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 1:00 PM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese su nombre completo por favor:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                     edad = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Introduzca su número de cédula:");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Medicina General";
                                    citas[total_citas][4] = dia;
                                    citas[total_citas][5] = "1:00 PM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica: " + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Día: " + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Hora: " + citas[total_citas][5]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                    ++total_citas;
                                    cita_agendada = true;
                                    break;
                                 // Opción 6 del menú o submenú
                                 case 6:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 2:00 PM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Esa hora esta reservada, ingrese otra hora");
                                    break;
                                 // Opción 7 del menú o submenú
                                 case 7:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println(dia + " a las 3:00 PM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese su nombre completo por favor:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                     edad = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Introduzca su número de cedula");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Medicina General";
                                    citas[total_citas][4] = dia;
                                    citas[total_citas][5] = "3:00 PM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica:" + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Día:" + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Hora:" + citas[total_citas][5]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                    ++total_citas;
                                    cita_agendada = true;
                                    break;
                                 // Opción 8 del menú o submenú
                                 case 8:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Regresando ...");
                                    cita_agendada = true;
                                    break;
                                 default:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Opción invalida, ingrese un numero del 1 al 8");
                              }
                           }
                           // Opción 2 del menú o submenú
                        case 2:
                           // Muestra información o mensajes en pantalla
                           System.out.println("===| PEDIATRÍA |===");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Ingrese la edad del paciente:");
                           int edad_paciente = sc.nextInt();
                           sc.nextLine();
                           if (edad_paciente < 12) {
                              // Muestra información o mensajes en pantalla
                              System.out.println("====| Horarios de Atención |====");
                              // Muestra información o mensajes en pantalla
                              System.out.println("1-- 20/06/2026 Hora: 8:00 AM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("2-- 23/06/2026 Hora: 11:00 AM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("3-- 16/07/2026 Hora: 2:00 PM");
                              // Muestra información o mensajes en pantalla
                              System.out.println("Seleccione la fecha de su cita:");
                              int opcion_pd = sc.nextInt();
                              sc.nextLine();
                              // Estructura de selección para evaluar opciones del usuario
                              switch (opcion_pd) {
                                 // Opción 1 del menú o submenú
                                 case 1:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cita el: 20/06/2026 a las 8:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Ingrese por favor su nombre completo:");
                                    String nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                    edad_paciente = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la cédula del padre o tutor:");
                                    String cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad_paciente);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Pediatría";
                                    citas[total_citas][4] = "20/06/2026 Hora: 8:00 AM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica: " + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Fecha: " + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                    ++total_citas;
                                    continue;
                                 // Opción 2 del menú o submenú
                                 case 2:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cita el: 23/06/2026 a las 11:00 AM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese el nombre completo:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                    edad_paciente = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la cédula del padre o tutor:");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad_paciente);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Pediatría";
                                    citas[total_citas][4] = "23/06/2026 Hora: 11:00 AM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica: " + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Fecha: " + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                    ++total_citas;
                                    continue;
                                 // Opción 3 del menú o submenú
                                 case 3:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cita el: 16/07/2026 a las 2:00 PM");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese el nombre completo:");
                                     nombre = sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la edad (años):");
                                    edad_paciente = sc.nextInt();
                                    sc.nextLine();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println();
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Por favor, ingrese la cédula del padre o tutor:");
                                     cedula = sc.nextLine();
                                    citas[total_citas][0] = nombre;
                                    citas[total_citas][1] = String.valueOf(edad_paciente);
                                    citas[total_citas][2] = cedula;
                                    citas[total_citas][3] = "Pediatría";
                                    citas[total_citas][4] = "16/07/2026 Hora: 2:00 PM";
                                    citas[total_citas][6] = "Activa";
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("====| Cita agendada |====");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Paciente: " + citas[total_citas][0]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Edad: " + citas[total_citas][1] + " años");
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Cédula: " + citas[total_citas][2]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Área médica: " + citas[total_citas][3]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Fecha: " + citas[total_citas][4]);
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                    ++total_citas;
                                    continue;
                                 default:
                                    // Muestra información o mensajes en pantalla
                                    System.out.println("Opción inválida");
                              }
                           } else {
                              // Muestra información o mensajes en pantalla
                              System.out.println("Esta es un área infantil (menores de 12 años)");
                           }
                           continue;
                        // Opción 3 del menú o submenú
                        case 3:
                           // Muestra información o mensajes en pantalla
                           System.out.println("Dermatología");
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Horarios de Atención |====");
                           // Muestra información o mensajes en pantalla
                           System.out.println("1-- 25/09/2026 Hora: 10:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("2-- 03/07/2026 Hora: 1:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("3-- 02/08/2026 Hora: 5:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Seleccione la fecha de su cita:");
                           int opcion_dm = sc.nextInt();
                           sc.nextLine();
                           // Estructura de selección para evaluar opciones del usuario
                           switch (opcion_dm) {
                              // Opción 1 del menú o submenú
                              case 1:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 25/09/2026 a las 10:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Dermatología";
                                 citas[total_citas][4] = "25/09/2026 Hora: 10:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 2 del menú o submenú
                              case 2:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 03/07/2026 a las 1:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                  nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                  cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Dermatología";
                                 citas[total_citas][4] = "03/07/2026 Hora: 1:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 3 del menú o submenú
                              case 3:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 02/08/2026 a las 5:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                  nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                  cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Dermatología";
                                 citas[total_citas][4] = "02/08/2026 Hora: 5:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              default:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Opción no válida");
                                 continue;
                           }
                           // Opción 4 del menú o submenú
                        case 4:
                           // Muestra información o mensajes en pantalla
                           System.out.println("Ortopedia");
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Horarios de Atención |====");
                           // Muestra información o mensajes en pantalla
                           System.out.println("1-- 05/08/2026 Hora: 9:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("2-- 12/08/2026 Hora: 11:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("3-- 19/08/2026 Hora: 2:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Seleccione la fecha de su cita:");
                           int opcion_ortopedia = sc.nextInt();
                           sc.nextLine();
                           // Estructura de selección para evaluar opciones del usuario
                           switch (opcion_ortopedia) {
                              // Opción 1 del menú o submenú
                              case 1:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 05/08/2026 a las 9:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ortopedia";
                                 citas[total_citas][4] = "05/08/2026 Hora: 9:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 2 del menú o submenú
                              case 2:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 12/08/2026 a las 11:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                  nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                  cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ortopedia";
                                 citas[total_citas][4] = "12/08/2026 Hora: 11:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 3 del menú o submenú
                              case 3:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 19/08/2026 a las 2:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                  nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                  cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ortopedia";
                                 citas[total_citas][4] = "19/08/2026 Hora: 2:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              default:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Opción no válida");
                                 continue;
                           }
                           // Opción 5 del menú o submenú
                        case 5:
                           // Muestra información o mensajes en pantalla
                           System.out.println("Ginecología y Obstetricia");
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Horarios de Atención |====");
                           // Muestra información o mensajes en pantalla
                           System.out.println("1-- 10/07/2026 Hora: 9:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("2-- 17/07/2026 Hora: 12:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("3-- 24/07/2026 Hora: 3:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Seleccione la fecha de su cita:");
                           int opcion_ginecologia = sc.nextInt();
                           sc.nextLine();
                           // Estructura de selección para evaluar opciones del usuario
                           switch (opcion_ginecologia) {
                              // Opción 1 del menú o submenú
                              case 1:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 10/07/2026 a las 9:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ginecología y Obstetricia";
                                 citas[total_citas][4] = "10/07/2026 Hora: 9:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 2 del menú o submenú
                              case 2:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 17/07/2026 a las 12:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                  nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                  cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ginecología y Obstetricia";
                                 citas[total_citas][4] = "17/07/2026 Hora: 12:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 3 del menú o submenú
                              case 3:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 24/07/2026 a las 3:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                  edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Ginecología y Obstetricia";
                                 citas[total_citas][4] = "24/07/2026 Hora: 3:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              default:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Opción no válida");
                                 continue;
                           }
                           // Opción 6 del menú o submenú
                        case 6:
                           // Muestra información o mensajes en pantalla
                           System.out.println("Urología");
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Horarios de Atención |====");
                           // Muestra información o mensajes en pantalla
                           System.out.println("1-- 08/09/2026 Hora: 9:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("2-- 15/09/2026 Hora: 11:00 AM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("3-- 22/09/2026 Hora: 4:00 PM");
                           // Muestra información o mensajes en pantalla
                           System.out.println("Seleccione la fecha de su cita:");
                           int opcion_urologia = sc.nextInt();
                           sc.nextLine();
                           // Estructura de selección para evaluar opciones del usuario
                           switch (opcion_urologia) {
                              // Opción 1 del menú o submenú
                              case 1:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 08/09/2026 a las 9:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Urología";
                                 citas[total_citas][4] = "08/09/2026 Hora: 9:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 2 del menú o submenú
                              case 2:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 15/09/2026 a las 11:00 AM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Urología";
                                 citas[total_citas][4] = "15/09/2026 Hora: 11:00 AM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              // Opción 3 del menú o submenú
                              case 3:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cita el 22/09/2026 a las 4:00 PM");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el nombre completo:");
                                 String nombre = sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese la edad (años):");
                                 int edad = sc.nextInt();
                                 sc.nextLine();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println();
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Por favor, ingrese el número de cédula:");
                                 String cedula = sc.nextLine();
                                 citas[total_citas][0] = nombre;
                                 citas[total_citas][1] = String.valueOf(edad);
                                 citas[total_citas][2] = cedula;
                                 citas[total_citas][3] = "Urología";
                                 citas[total_citas][4] = "22/09/2026 Hora: 4:00 PM";
                                 citas[total_citas][6] = "Activa";
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("====| Cita agendada |====");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[total_citas][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[total_citas][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cédula: " + citas[total_citas][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Área médica: " + citas[total_citas][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[total_citas][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[total_citas][6]);
                                 ++total_citas;
                                 continue;
                              default:
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Opción no válida");
                                 continue;
                           }
                           // Opción 7 del menú o submenú
                        case 7:
                           // Muestra información o mensajes en pantalla
                           System.out.println("Volver");
                        default:
                           continue;
                     }
                     // Opción 2 del menú o submenú
                  case 2:
                     // Muestra información o mensajes en pantalla
                     System.out.println("====| Cancelar cita |===");
                     System.out.print("Ingrese el nombre del paciente: ");
                     String nombre_cancelar = sc.nextLine();

                     for (int j = 0; j < total_citas; ++j) {
                        if (citas[j][0].equalsIgnoreCase(nombre_cancelar)) {
                           citas[j][6] = "Cancelado";
                           // Muestra información o mensajes en pantalla
                           System.out.println("Cita cancelada con éxito.");
                        }
                     }
                     continue;
                  // Opción 3 del menú o submenú
                  case 3:
                     // Muestra información o mensajes en pantalla
                     System.out.println("Volver");
                     continue;
               }
               // Opción 2 del menú o submenú
            case 2:
               // Muestra información o mensajes en pantalla
               System.out.println("====|Administrador|====");
               // Muestra información o mensajes en pantalla
               System.out.println("Ingresa tu usuario");
               String user_admin = sc.nextLine();
               int i = 1;

               while (!user_admin.equalsIgnoreCase("Admin26")) {
                  // Muestra información o mensajes en pantalla
                  System.out.println("usuario no valido, intente denuevo");
                  user_admin = sc.nextLine();
                  if (user_admin.equalsIgnoreCase("Admin26")) {
                     // Muestra información o mensajes en pantalla
                     System.out.println("Usuario valido");
                  }
               }

               // Muestra información o mensajes en pantalla
               System.out.println("Ingrese la contraseña");
               int password_admin = sc.nextInt();
               sc.nextLine();

               for (int intentos_admin = 1; password_admin != 7890 && intentos_admin < 4; ++intentos_admin) {
                  // Muestra información o mensajes en pantalla
                  System.out.println("Contraseña incorrecta, intente denuevo");
                  password_admin = sc.nextInt();
                  sc.nextLine();
               }

               if (password_admin == 7890) {
                  // Muestra información o mensajes en pantalla
                  System.out.println("Contraseña correcta, acceso concedido");
                  // Muestra información o mensajes en pantalla
                  System.out.println("Ver citas");
               } else {
                  // Muestra información o mensajes en pantalla
                  System.out.println("acceso bloqueado");
               }

               // Muestra información o mensajes en pantalla
               System.out.println("1--Verificar citas registradas");
               // Muestra información o mensajes en pantalla
               System.out.println("2-- ver actividad de citas");
               // Muestra información o mensajes en pantalla
               System.out.println("Seleccione una opcion");
               int opcion_admin = sc.nextInt();
               sc.nextLine();
               // Estructura de selección para evaluar opciones del usuario
               switch (opcion_admin) {
                  // Opción 1 del menú o submenú
                  case 1:
                     // Muestra información o mensajes en pantalla
                     System.out.println("=====| Registro de citas agendadas |====");
                     // Muestra información o mensajes en pantalla
                     System.out.println("1--citas en medicina general");
                     // Muestra información o mensajes en pantalla
                     System.out.println("2--citas en pediatria");
                     // Muestra información o mensajes en pantalla
                     System.out.println("3--citas en dermatologia");
                     // Muestra información o mensajes en pantalla
                     System.out.println("Indique de que area quiere ver la cita");
                     int area_medica = sc.nextInt();
                     sc.nextLine();
                     // Estructura de selección para evaluar opciones del usuario
                     switch (area_medica) {
                        // Opción 1 del menú o submenú
                        case 1:
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Citas en medicina general |====");
                           i = 0;

                           while (true) {
                              if (i >= total_citas) {
                              

                              if (citas[i][3].equalsIgnoreCase("Medicina General")) {
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[i][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[i][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cedula: " + citas[i][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Area medica: " + citas[i][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Dia: " + citas[i][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Hora: " + citas[i][5]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[i][6]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("------------------------");
                              }

                              ++i;
                           }
                           // Opción 2 del menú o submenú
                        case 2:
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| Citas en pediatria |====");
                           i = 0;

                           while (true) {
                              if (i >= total_citas) {
                                 {                            

                              if (citas[i][3].equalsIgnoreCase("Pediatria")) {
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[i][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[i][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cedula: " + citas[i][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Area medica: " + citas[i][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[i][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[i][6]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("------------------------");
                              }

                              ++i;
                           }
                           // Opción 3 del menú o submenú
                        case 3:
                           // Muestra información o mensajes en pantalla
                           System.out.println("====| citas en dermatologia |===");
                           i = 0;

                           while (true) {
                              if (i >= total_citas) {
                              }

                              if (citas[i][3].equalsIgnoreCase("Dermatologia")) {
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Paciente: " + citas[i][0]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Edad: " + citas[i][1] + " años");
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Cedula: " + citas[i][2]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Area medica: " + citas[i][3]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Fecha: " + citas[i][4]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("Estado de la cita: " + citas[i][6]);
                                 // Muestra información o mensajes en pantalla
                                 System.out.println("------------------------");
                              }

                              ++i;
                           }
                        default:
                           // Muestra información o mensajes en pantalla
                           System.out.println("opcion invalida");
                           continue;
                     }
                     // Opción 2 del menú o submenú
                  case 2:
                     // Muestra información o mensajes en pantalla
                     System.out.println("=====| Actividad de citas |====");
                     // Muestra información o mensajes en pantalla
                     System.out.println("=====| Actividad Global de Citas |=====");
                     if (total_citas == 0) {
                        // Muestra información o mensajes en pantalla
                        System.out.println("No hay citas registradas en el sistema todavía.");
                        continue;
                     } else {
                        i = 0;

                        while (true) {
                           if (i >= total_citas) {
         
                           }

                           // Muestra información o mensajes en pantalla
                           System.out.println("Paciente: " + citas[i][0]);
                           // Muestra información o mensajes en pantalla
                           System.out.println("Área médica: " + citas[i][3]);
                           // Muestra información o mensajes en pantalla
                           System.out.println("Estado de la cita: " + citas[i][6]);
                           // Muestra información o mensajes en pantalla
                           System.out.println("----------------------------------------");
                           ++i;
                        }
                     }
                  default:
                     // Muestra información o mensajes en pantalla
                     System.out.println("opcion no valida");
                     continue;
               }
               // Opción 3 del menú o submenú
            case 3:
               // Muestra información o mensajes en pantalla
               System.out.println("Saliendo del sistema ...");
               break;
            default:
               // Muestra información o mensajes en pantalla
               System.out.println("Opcion invalida");
         }
      } while (opcion != 3);

   }
}