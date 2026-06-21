// Importación de la clase Scanner en el paquete util que pertenece a java para lectura de datos por teclado
import java.util.Scanner;

// Clase principal del sistema de citas médicas
public class Sistema_SGH_UNI
// Abre un bloque de código
{
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args)
    // Abre un bloque de código
    {
        // Variable de control para verificar si una cita fue agendada
        boolean cita_agendada = false;

        // Declaración de variables utilizadas en diferentes módulos del sistema
        int opcion, edad; // datos
        String nombre, cedula; // datos
        int opcion_p = 0; // opcion del paciente
        int opcion_pd; // opcion del switch pediatria
        int opcion_dm; // opcion en dermatologia
        int opcion_admin = 0; // opcion del administrador
        int i; // declaracion del contador i

        // Creación del objeto Scanner para capturar datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Almacenamiento de datos mediante un arreglo bidimensional de 5 filas y 7 columnas
        String citas[][] = new String[5][7];

        // Contador de citas registradas en el sistema
        int total_citas = 0;

        // Ciclo principal que mantiene el sistema en ejecución hasta seleccionar la opción salir
        do {

            // Muestra información en pantalla
            // Muestra en pantalla el mensaje: "=====| Usuario |====="
            System.out.println("=====| Usuario |=====");
            // Muestra en pantalla el mensaje: "1--Paciente"
            System.out.println("1--Paciente");
            // Muestra en pantalla el mensaje: "2--Administrador"
            System.out.println("2--Administrador");
            // Muestra en pantalla el mensaje: "3--Salir"
            System.out.println("3--Salir");
            // Muestra en pantalla el mensaje: "Seleccione una de estas opciones"
            System.out.println("Seleccione una de estas opciones");

            // Lectura de información ingresada por el usuario
            // Captura el número ingresado por el usuario y lo guarda en la variable opcion
            opcion = sc.nextInt();
            // Limpia el salto de línea pendiente en el buffer del Scanner
            sc.nextLine();

            // Estructura de selección para controlar el flujo principal del sistema
            // Evalúa el valor de opcion para decidir qué bloque de caso ejecutar
            switch (opcion)
            // Abre un bloque de código
            {
                // Bloque que se ejecuta cuando la opción seleccionada es 1
                case 1:

                    // Inicio del módulo de paciente
                    // Muestra en pantalla el mensaje: "===|Paciente|==="
                    System.out.println("===|Paciente|===");
                    // Muestra en pantalla el mensaje: "Ingresa tu usuario"
                    System.out.println("Ingresa tu usuario");

                    // Lectura del usuario ingresado
                    // Captura el texto ingresado por el usuario y lo guarda en la variable user
                    String user = sc.nextLine();

                    // Validación del usuario mediante ciclo repetitivo
                    // Repite el ciclo mientras se cumpla la condición: !user.equalsIgnoreCase("paciente@26")
                    while(!user.equalsIgnoreCase("paciente@26")){
                        // Muestra en pantalla el mensaje: "Usuario no valido, ingreselo nuevamente"
                        System.out.println("Usuario no valido, ingreselo nuevamente");
                        // Captura el texto ingresado por el usuario y lo guarda en la variable user
                        user  = sc.nextLine();

                        // Verificación de usuario correcto
                        // Evalúa la condición: user.equalsIgnoreCase("paciente@26")
                        if (user.equalsIgnoreCase("paciente@26")){
                            // Muestra en pantalla el mensaje: "Usuario valido"
                            System.out.println("Usuario valido");
                        // Cierra el bloque de código
                        }
                    // Cierra el bloque de código
                    }

                    // Solicitud de contraseña
                    // Muestra en pantalla el mensaje: "Ingrese su contraseña"
                    System.out.println("Ingrese su contraseña");
                    // Captura la contraseña ingresada por el usuario y la guarda en la variable password
                    int password = sc.nextInt();
                    sc.nextLine();

                    // Inicialización del contador de intentos
                    // Reinicia el contador de intentos en 1
                    i = 1;

                    // Validación de contraseña con límite de intentos
                    // Repite el ciclo mientras se cumpla la condición:  password != 5465 && i < 4
                    while( password != 5465 && i < 4){
                        // Muestra en pantalla el mensaje: "Contrseña incorrecta, ingresela nuevamente"
                        System.out.println("Contrseña incorrecta, ingresela nuevamente");
                        // Captura la contraseña ingresada por el usuario y la guarda en la variable password
                        password = sc.nextInt();
                        // Limpia el salto de línea pendiente en el buffer del Scanner
                        sc.nextLine();
                        i +=1; // contador de intentos
                    // Cierra el bloque de código
                    }

                    // Verificación de acceso al sistema
                    // Evalúa la condición: password == 5465 si la contraseña es correcta
                    if (password == 5465){
                        // Muestra en pantalla el mensaje: "Contraseña correcta, bienvenido"
                        System.out.println("Contraseña correcta, bienvenido al SGH ");

                    // Bloque alternativo que se ejecuta si la condición anterior fue falsa
                    } else {
                        // Muestra en pantalla el mensaje: "Cuenta bloqueada demasiados intentos fallidos"
                        System.out.println("Cuenta bloqueada demasiados intentos fallidos");
                        opcion_p = 3;
                    // Cierra el bloque de código
                    }


                    if ( password == 5465){ 
                        // Menú de opciones disponibles para el paciente
                        // Muestra en pantalla el mensaje: "1--Agendar cita"
                        System.out.println("1--Agendar cita");
                        // Muestra en pantalla el mensaje: "2--Cancelar cita"
                        System.out.println("2--Cancelar cita");
                        // Muestra en pantalla el mensaje: "3--volver"
                        System.out.println("3--volver");
                        // Muestra en pantalla el mensaje: "Seleccione una de estas opciones"
                        System.out.println("Seleccione una de estas opciones");

                        // Lectura de la opción seleccionada
                        // Captura el número ingresado por el usuario y lo guarda en la variable opcion_p
                        opcion_p = sc.nextInt();
                        // Limpia el salto de línea pendiente en el buffer del Scanner
                        sc.nextLine();
                    }
                    // Estructura de selección para las opciones del paciente
                    // Evalúa el valor de opcion_p para decidir qué bloque de caso ejecutar
                    switch (opcion_p)
                    // Abre un bloque de código
                    {
                        // Bloque que se ejecuta cuando la opción seleccionada es 1
                        case 1:

                            // Verificación de espacios disponibles para registrar nuevas citas
                            // Evalúa la condición: total_citas < 5
                            if (total_citas < 5)
                            // Abre un bloque de código
                            {
                                // Muestra en pantalla el mensaje: "====|Agendar cita|===="
                                System.out.println("====|Agendar cita|====");
                                // Muestra en pantalla el mensaje: ""
                                System.out.println("");

                                // Menú de especialidades médicas disponibles
                                // Muestra en pantalla el mensaje: "====| Especialidades |===="
                                System.out.println("====| Especialidades |====");
                                // Muestra en pantalla el mensaje: "1-- Medicina General"
                                System.out.println("1-- Medicina General");
                                // Muestra en pantalla el mensaje: "2-- Pediatria"
                                System.out.println("2-- Pediatria");
                                // Muestra en pantalla el mensaje: "3-- Dermatologia"
                                System.out.println("3-- Dermatologia");
                                // Muestra en pantalla el mensaje: "4-- Ortopedia"
                                System.out.println("4-- Ortopedia");
                                // Muestra en pantalla el mensaje: "5-- Ginecologia y Obstetricia"
                                System.out.println("5-- Ginecologia y Obstetricia");
                                // Muestra en pantalla el mensaje: "6-- Urologia"
                                System.out.println("6-- Urologia");
                                // Muestra en pantalla el mensaje: "7-- Volver"
                                System.out.println("7-- Volver");
                                // Muestra en pantalla el mensaje: "Seleccione la especialidad"
                                System.out.println("Seleccione la especialidad");

                                // Lectura de la especialidad seleccionada
                                // Captura el número ingresado por el usuario y lo guarda en la variable especialidad
                                int especialidad = sc.nextInt();
                                // Limpia el salto de línea pendiente en el buffer del Scanner
                                sc.nextLine();

                                // Estructura de selección para las especialidades médicas
                                // Evalúa el valor de especialidad para decidir qué bloque de caso ejecutar
                                switch (especialidad)
                                // Abre un bloque de código
                                {
                                    // Bloque que se ejecuta cuando la opción seleccionada es 1
                                    case 1:
                                        cita_agendada = false; // reinicio que permite nuevas citas
                                        // Muestra en pantalla el mensaje: "===| Medicina General |===="
                                        System.out.println("===| Medicina General |====");
                                        // Muestra en pantalla el mensaje: "Todos los dias: 8:00 AM - 3:00PM"
                                        System.out.println("Todos los dias: 8:00 AM - 3:00PM"); 
                                        
                                        // Muestra en pantalla el mensaje: "Ingrese el dia de su cita"
                                        System.out.println("Ingrese el dia de su cita");
                                        // Captura el texto ingresado por el usuario y lo guarda en la variable dia
                                        String dia = sc.nextLine();

                                        // Repite el ciclo mientras se cumpla la condición: !cita_agendada
                                        while (!cita_agendada){
                                            // Muestra en pantalla el mensaje: "======| Horarios |====="
                                            System.out.println("======| Horarios |=====");
                                            // Muestra en pantalla el mensaje: "1--8:00AM"
                                            System.out.println("1--8:00AM");
                                            // Muestra en pantalla el mensaje: "2--9:00AM (ocupado)"
                                            System.out.println("2--9:00AM (ocupado)");
                                            // Muestra en pantalla el mensaje: "3--10:00AM"
                                            System.out.println("3--10:00AM");
                                            // Muestra en pantalla el mensaje: "4--11:00AM"
                                            System.out.println("4--11:00AM");
                                            // Muestra en pantalla el mensaje: "5--1:00PM"
                                            System.out.println("5--1:00PM");
                                            // Muestra en pantalla el mensaje: "6--2:00PM (ocupado)"
                                            System.out.println("6--2:00PM (ocupado)");
                                            // Muestra en pantalla el mensaje: "7--3:00PM"
                                            System.out.println("7--3:00PM");
                                            // Muestra en pantalla el mensaje: "8--Volver"
                                            System.out.println("8--Volver");
                                            // Muestra en pantalla el mensaje: "Ingrese la hora de su cita"
                                            System.out.println("Ingrese la hora de su cita");
                                            // Captura el número ingresado por el usuario y lo guarda en la variable hora
                                            int hora = sc.nextInt();
                                            // Limpia el salto de línea pendiente en el buffer del Scanner
                                            sc.nextLine();

                                            // Evalúa el valor de hora para decidir qué bloque de caso ejecutar
                                            switch (hora) 
                                            // Abre un bloque de código
                                            {
                                                // Bloque que se ejecuta cuando la opción seleccionada es 1
                                                case 1:
                                                    System.out.println(dia + " alas 8:00 AM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();                                                   


                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Medicina General" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Medicina General";
                                                    // Guarda el día ingresado previamente por el paciente en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = dia;
                                                    // Guarda la hora de la cita "8:00 AM" en la columna 5 del nuevo registro
                                                    citas[total_citas][5] = "8:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("==== Cita agendada !!====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla el día de la cita recién registrada
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    // Muestra en pantalla la hora de la cita recién registrada
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;
                                                    
                                                    break;// cierre del case 1

                                                // Bloque que se ejecuta cuando la opción seleccionada es 2
                                                case 2:
                                                    System.out.println(dia + "alas 9:00 AM");
                                                    // Muestra en pantalla el mensaje: "este dia esta ocupado, ingrese otro"
                                                    System.out.println("este dia esta ocupado, ingrese otro");
                                                    break; // cierre del case 2

                                                // Bloque que se ejecuta cuando la opción seleccionada es 3
                                                case 3:
                                                    System.out.println(dia + " alas 10:00 AM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Medicina General" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Medicina General";
                                                    // Guarda el día ingresado previamente por el paciente en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = dia;
                                                    // Guarda la hora de la cita "10:00 AM" en la columna 5 del nuevo registro
                                                    citas[total_citas][5] = "10:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("==== Cita agendada !!====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla el día de la cita recién registrada
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    // Muestra en pantalla la hora de la cita recién registrada
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);


                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;

                                                    break; // case 3

                                                // Bloque que se ejecuta cuando la opción seleccionada es 4
                                                case 4:
                                                    System.out.println(dia + " alas 11:00 AM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Medicina General" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Medicina General";
                                                    // Guarda el día ingresado previamente por el paciente en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = dia;
                                                    // Guarda la hora de la cita "11:00 AM" en la columna 5 del nuevo registro
                                                    citas[total_citas][5] = "11:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("==== Cita agendada !!====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla el día de la cita recién registrada
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    // Muestra en pantalla la hora de la cita recién registrada
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;

                                                    break; // case 4

                                                // Bloque que se ejecuta cuando la opción seleccionada es 5
                                                case 5:
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Medicina General" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Medicina General";
                                                    // Guarda el día ingresado previamente por el paciente en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = dia;
                                                    // Guarda la hora de la cita "1:00 PM" en la columna 5 del nuevo registro
                                                    citas[total_citas][5] = "1:00 PM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("==== Cita agendada !!====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla el día de la cita recién registrada
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    // Muestra en pantalla la hora de la cita recién registrada
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;

                                                    break; // case 5

                                                // Bloque que se ejecuta cuando la opción seleccionada es 6
                                                case 6:
                                                    System.out.println( dia + " alas 2 PM");
                                                    // Muestra en pantalla el mensaje: "Este dia esta reservado ingrese otro"
                                                    System.out.println("Este dia esta reservado ingrese otro");

                                                    break; // case 6

                                                // Bloque que se ejecuta cuando la opción seleccionada es 7
                                                case 7:
                                                    System.out.println(dia + " alas 3:00 PM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Medicina General" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Medicina General";
                                                    // Guarda el día ingresado previamente por el paciente en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = dia;
                                                    // Guarda la hora de la cita "3:00 PM" en la columna 5 del nuevo registro
                                                    citas[total_citas][5] = "3:00 PM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla el día de la cita recién registrada
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    // Muestra en pantalla la hora de la cita recién registrada
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;

                                                    break; // case 7

                                                // Bloque que se ejecuta cuando la opción seleccionada es 8
                                                case 8:
                                                    // Muestra en pantalla el mensaje: "Regresando ..."
                                                    System.out.println("Regresando ...");
                                                    // Marca la cita como agendada para finalizar el ciclo de selección de horario
                                                    cita_agendada = true;
                                                    break; // case 8
                                            
                                                // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                                default:
                                                    // Muestra en pantalla el mensaje: "Opcion invalida, ingrese un numero del 1 al 8"
                                                    System.out.println("Opcion invalida, ingrese un numero del 1 al 8");
                                                    break; // cierre de los cases

                                            } // cirre del switch de horario de atencion


                                        } // cierre del while que repite hasta que ingrese un dia valido
                                        
                                        break; // cierre del case 1(medicina general)

                                    // Bloque que se ejecuta cuando la opción seleccionada es 2
                                    case 2:
                                        // Muestra en pantalla el mensaje: "===|pediatria|==="
                                        System.out.println("===|pediatria|===");
                                        // Muestra en pantalla el mensaje: "Ingrese la edad del paciente"
                                        System.out.println("Ingrese la edad del paciente");
                                        // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                        edad = sc.nextInt();
                                        // Limpia el salto de línea pendiente en el buffer del Scanner
                                        sc.nextLine();

                                        // Evalúa la condición:  edad < 12
                                        if ( edad < 12){
                                            // Muestra en pantalla el mensaje: "====|Horarios de Atencion|===="
                                            System.out.println("====|Horarios de Atencion|====");
                                            // Muestra en pantalla el mensaje: "1-- 20/06/2026 Hora: 8:00 AM"
                                            System.out.println("1-- 20/06/2026 Hora: 8:00 AM");
                                            // Muestra en pantalla el mensaje: "2-- 23/06/2026 Hora: 11:00 AM"
                                            System.out.println("2-- 23/06/2026 Hora: 11:00 AM");
                                            // Muestra en pantalla el mensaje: "3-- 16/07/2026 Hora: 2:00 PM"
                                            System.out.println("3-- 16/07/2026 Hora: 2:00 PM");
                                            // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                            System.out.println("Seleccione la fecha de su cita");
                                            // Captura el número ingresado por el usuario y lo guarda en la variable opcion_pd
                                            opcion_pd = sc.nextInt();
                                            // Limpia el salto de línea pendiente en el buffer del Scanner
                                            sc.nextLine();

                                            // Evalúa el valor de opcion_pd para decidir qué bloque de caso ejecutar
                                            switch (opcion_pd) {
                                                // Bloque que se ejecuta cuando la opción seleccionada es 1
                                                case 1:
                                                    // Muestra en pantalla el mensaje: "cita el: 20/06/2026 alas 8:00 AM"
                                                    System.out.println(" cita el: 20/06/2026 alas 8:00 AM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula del padre o de la madre");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Pediatria" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Pediatria";
                                                    // Guarda la fecha/hora de la cita "20/06/2026 Hora: 8:00 AM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "20/06/2026 Hora: 8:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                    
                                                    break; // case 1 padiatria

                                                // Bloque que se ejecuta cuando la opción seleccionada es 2
                                                case 2:
                                                    // Muestra en pantalla el mensaje: "cita el: 23/06/2026 alas 11:00 AM"
                                                    System.out.println(" cita el: 23/06/2026 alas 11:00 AM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula del padre o de la madre");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Pediatria" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Pediatria";
                                                    // Guarda la fecha/hora de la cita "23/06/2026 Hora: 11:00 AM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "23/06/2026 Hora: 11:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;

                                                    break; // case 2

                                                // Bloque que se ejecuta cuando la opción seleccionada es 3
                                                case 3:
                                                    // Muestra en pantalla el mensaje: "cita el: 16/07/2026 alas 8:00 AM"
                                                    System.out.println(" cita el: 16/07/2026 alas 8:00 AM");
                                                   // Solicita al usuario que ingrese el nombre completo del paciente
                                                   System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula del padre o de la madre");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Pediatria" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Pediatria";
                                                    // Guarda la fecha/hora de la cita "16/07/2026 Hora: 2:00 PM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "16/07/2026 Hora: 2:00 PM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;

                                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                                    break;

                                                // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                                default:
                                                    // Muestra en pantalla el mensaje: "Opcion invalida"
                                                    System.out.println("Opcion invalida");
                                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                                    break;
                                            } // cierre de horarios de atencion de pediatria



                                        // Bloque alternativo que se ejecuta si la condición anterior fue falsa
                                        } else {
                                            // Muestra en pantalla el mensaje: "Esta es un area infantil (menores de 12)"
                                            System.out.println("Esta es un area infantil (menores de 12)");
                                        // Cierra el bloque de código
                                        }


                                        break; // case 2 (pediatria)

                                    // Bloque que se ejecuta cuando la opción seleccionada es 3
                                    case 3:
                                        // Muestra en pantalla el mensaje: "Dermatologia"
                                        System.out.println("Dermatologia");
                                        // Muestra en pantalla el mensaje: "====|Horarios de Atencion|===="
                                        System.out.println("====|Horarios de Atencion|====");
                                            // Muestra en pantalla el mensaje: "1-- 25/09/2026 Hora: 10:00 AM"
                                            System.out.println("1-- 25/09/2026 Hora: 10:00 AM");
                                            // Muestra en pantalla el mensaje: "2-- 03/07/2026 Hora: 1:00 PM"
                                            System.out.println("2-- 03/07/2026 Hora: 1:00 PM");
                                            // Muestra en pantalla el mensaje: "3-- 02/08/2026 Hora: 5:00 PM"
                                            System.out.println("3-- 02/08/2026 Hora: 5:00 PM");
                                            // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                            System.out.println("Seleccione la fecha de su cita");
                                            // Captura el número ingresado por el usuario y lo guarda en la variable opcion_dm
                                            opcion_dm = sc.nextInt();
                                            // Limpia el salto de línea pendiente en el buffer del Scanner
                                            sc.nextLine();

                                            // Evalúa el valor de opcion_dm para decidir qué bloque de caso ejecutar
                                            switch (opcion_dm) 
                                            // Abre un bloque de código
                                            {
                                                // Bloque que se ejecuta cuando la opción seleccionada es 1
                                                case 1:
                                                    // Muestra en pantalla el mensaje: "Cita el 25/09/2026 alas 10:00 AM"
                                                    System.out.println("Cita el 25/09/2026 alas 10:00 AM ");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Dermatologia" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Dermatologia";
                                                    // Guarda la fecha/hora de la cita "25/09/2026 Hora: 10:00 AM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "25/09/2026 Hora: 10:00 AM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                   
                                                    break; // case 1 horario de dermatologia

                                                // Bloque que se ejecuta cuando la opción seleccionada es 2
                                                case 2:
                                                    // Muestra en pantalla el mensaje: "Cita el 03/07/2026 alas 1:00 PM"
                                                    System.out.println("Cita el 03/07/2026 alas 1:00 PM ");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Dermatologia" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Dermatologia";
                                                    // Guarda la fecha/hora de la cita "03/07/2026 Hora: 1:00 PM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "03/07/2026 Hora: 1:00 PM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                   
                                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                                    break;

                                                // Bloque que se ejecuta cuando la opción seleccionada es 3
                                                case 3:
                                                    // Muestra en pantalla el mensaje: "Cita el 02/08/2026 alas 5:00 PM"
                                                    System.out.println("Cita el 02/08/2026 alas 5:00 PM");
                                                    // Solicita al usuario que ingrese el nombre completo del paciente
                                                    System.out.println("Porfavor, Ingrese su nombre completo");
                                                    // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                    nombre = sc.nextLine();
                                                    // Solicita al usuario que ingrese la edad del paciente
                                                    System.out.println("Porfavor, Ingrese la edad");
                                                    // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                    edad = sc.nextInt();
                                                    sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                    // Solicita al usuario que ingrese el número de cédula del paciente
                                                    System.out.println("Porfavor, Ingrese el numero de cedula");
                                                    // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                    cedula = sc.nextLine();

                                                    // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                    citas[total_citas][0] = nombre;
                                                    // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                    citas[total_citas][2] = cedula;
                                                    // Guarda el área médica "Dermatologia" en la columna 3 del nuevo registro de la cita
                                                    citas[total_citas][3] = "Dermatologia";
                                                    // Guarda la fecha/hora de la cita "02/08/2026 Hora: 5:00 PM" en la columna 4 del nuevo registro
                                                    citas[total_citas][4] = "02/08/2026 Hora: 5:00 PM";
                                                    // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                    citas[total_citas][6] = "Activa";

                                                    // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                    System.out.println("====| Cita agendada |====");
                                                    // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    // Muestra en pantalla la edad registrada del paciente
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    // Muestra en pantalla la cédula registrada del paciente
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    // Muestra en pantalla el área médica de la cita recién registrada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    // Muestra en pantalla la fecha completa de la cita recién registrada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    // Muestra en pantalla el estado actual de la cita recién registrada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    // Incrementa en uno el contador total de citas registradas (total_citas)
                                                    total_citas ++;
                                                   
                                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                                    break;
                                               
                                            
                                                // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                                default:
                                                    // Muestra en pantalla el mensaje: "Opcion no valida"
                                                    System.out.println("Opcion no valida");
                                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                                    break;

                                            } // switch de horarios dermatologia
                                           
                                        break; // switch de case 3(Dermatologia)

                                    // Bloque que se ejecuta cuando la opción seleccionada es 4
                                    case 4:
                                        // Muestra en pantalla el mensaje: "====| Ortopedia |===="
                                        System.out.println("====| Ortopedia |====");
                                        // Muestra en pantalla el mensaje: "====| Horarios de atencion |===="
                                        System.out.println("====| Horarios de atencion |====");
                                        // Muestra en pantalla el mensaje: "1-- 05/08/2026 Hora: 9:00 AM"
                                        System.out.println("1-- 05/08/2026 Hora: 9:00 AM");
                                        // Muestra en pantalla el mensaje: "2-- 12/08/2026 Hora: 11:00 AM"
                                        System.out.println("2-- 12/08/2026 Hora: 11:00 AM");
                                        // Muestra en pantalla el mensaje: "3-- 19/08/2026 Hora: 2:00 PM"
                                        System.out.println("3-- 19/08/2026 Hora: 2:00 PM");
                                        // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                        System.out.println("Seleccione la fecha de su cita");
                                        // Captura el número ingresado por el usuario y lo guarda en la variable opcion_ortopedia
                                        int opcion_ortopedia = sc.nextInt();
                                        // Limpia el salto de línea pendiente en el buffer del Scanner
                                        sc.nextLine();

                                        // Evalúa el valor de opcion_ortopedia para decidir qué bloque de caso ejecutar
                                        switch (opcion_ortopedia) {
                                            // Bloque que se ejecuta cuando la opción seleccionada es 1
                                            case 1:
                                                // Muestra en pantalla el mensaje: "Cita el 05/08/2026 alas 9:00 AM"
                                                System.out.println("Cita el 05/08/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ortopedia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ortopedia";
                                                // Guarda la fecha/hora de la cita "05/08/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "05/08/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                   
                                                
                                                break; // case 1 horarios de ortopedia

                                            // Bloque que se ejecuta cuando la opción seleccionada es 2
                                            case 2:
                                                // Muestra en pantalla el mensaje: "Cita el 12/08/2026 alas 11:00 AM"
                                                System.out.println("Cita el 12/08/2026 alas 11:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ortopedia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ortopedia";
                                                // Guarda la fecha/hora de la cita "12/08/2026 Hora: 11:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "12/08/2026 Hora: 11:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                   
                                                
                                                break; // case 2 horarios de ortopedia

                                            // Bloque que se ejecuta cuando la opción seleccionada es 3
                                            case 3:
                                                // Muestra en pantalla el mensaje: "Cita el 19/08/2026"
                                                System.out.println("Cita el 19/08/2026");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ortopedia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ortopedia";
                                                // Guarda la fecha/hora de la cita "19/08/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "19/08/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                   
                                                
                                                break; // case 3 horarios de ortopedia


                                            // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                            default:
                                                // Muestra en pantalla el mensaje: "Opcion no valida"
                                                System.out.println("Opcion no valida");
                                                // Finaliza la ejecución del bloque case actual y sale del switch
                                                break;
                                        } // switch de horarios de ortopedia

                                        break;// case 4(ortopedia)

                                    // Bloque que se ejecuta cuando la opción seleccionada es 5
                                    case 5:
                                        // Muestra en pantalla el mensaje: "Ginecologia y Obstetricia"
                                        System.out.println("Ginecologia y Obstetricia");
                                        // Muestra en pantalla el mensaje: "1-- 10/07/2026 Hora: 9:00 AM"
                                        System.out.println("1-- 10/07/2026 Hora: 9:00 AM");
                                        // Muestra en pantalla el mensaje: "2-- 17/07/2026 Hora: 12:00 PM"
                                        System.out.println("2-- 17/07/2026 Hora: 12:00 PM");
                                        // Muestra en pantalla el mensaje: "3-- 24/07/2026 Hora: 3:00 PM"
                                        System.out.println("3-- 24/07/2026 Hora: 3:00 PM");
                                        // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                        System.out.println("Seleccione la fecha de su cita");
                                        // Captura el número ingresado por el usuario y lo guarda en la variable opcion_ginecologia
                                        int opcion_ginecologia = sc.nextInt();
                                        // Limpia el salto de línea pendiente en el buffer del Scanner
                                        sc.nextLine();

                                        // Evalúa el valor de opcion_ginecologia para decidir qué bloque de caso ejecutar
                                        switch (opcion_ginecologia) 
                                        // Abre un bloque de código
                                        {
                                            // Bloque que se ejecuta cuando la opción seleccionada es 1
                                            case 1:
                                                // Muestra en pantalla el mensaje: "Cita el 10/07/2026 alas 9:00 AM"
                                                System.out.println("Cita el 10/07/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ginecologia y Obstetricia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";
                                                // Guarda la fecha/hora de la cita "10/07/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "10/07/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                   
                                                
                                                break; // case 1 de horarios de ginecologia y obs

                                            // Bloque que se ejecuta cuando la opción seleccionada es 2
                                            case 2:
                                               // Muestra en pantalla el mensaje: "Cita el 17/07/2026 alas 9:00 AM"
                                               System.out.println("Cita el 17/07/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ginecologia y Obstetricia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";
                                                // Guarda la fecha/hora de la cita "17/07/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "17/07/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;                                                   
                                                
                                                break; // case 2 de horarios de ginecologia y obs 

                                            // Bloque que se ejecuta cuando la opción seleccionada es 3
                                            case 3:
                                                // Muestra en pantalla el mensaje: "Cita el 24/07/2026 alas 9:00 AM"
                                                System.out.println("Cita el 24/07/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Ginecologia y Obstetricia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";
                                                // Guarda la fecha/hora de la cita "24/07/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "24/07/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;                                                   
                                                
                                                break; // case 3 de horarios de ginecologia y obs
                                        
                                            // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                            default:
                                                // Muestra en pantalla el mensaje: "Opcion no valida"
                                                System.out.println("Opcion no valida");
                                                // Finaliza la ejecución del bloque case actual y sale del switch
                                                break;

                                        } // switch del case 5 ginecologia y obstetricia

                                    // Bloque que se ejecuta cuando la opción seleccionada es 6
                                    case 6:
                                        // Muestra en pantalla el mensaje: "Urologia"
                                        System.out.println("Urologia");
                                        // Muestra en pantalla el mensaje: "====| Horarios de Atención |===="
                                        System.out.println("====| Horarios de Atención |====");                                       
                                        // Muestra en pantalla el mensaje: "1-- 08/09/2026 Hora: 9:00 AM"
                                        System.out.println("1-- 08/09/2026 Hora: 9:00 AM");
                                        // Muestra en pantalla el mensaje: "2-- 15/09/2026 Hora: 11:00 AM"
                                        System.out.println("2-- 15/09/2026 Hora: 11:00 AM");
                                        // Muestra en pantalla el mensaje: "3-- 22/09/2026 Hora: 4:00 PM"
                                        System.out.println("3-- 22/09/2026 Hora: 4:00 PM");
                                        // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita:"
                                        System.out.println("Seleccione la fecha de su cita:");
                                        // Captura el número ingresado por el usuario y lo guarda en la variable opcion_urologia
                                        int opcion_urologia = sc.nextInt();
                                        // Limpia el salto de línea pendiente en el buffer del Scanner
                                        sc.nextLine();

                                        // Evalúa el valor de opcion_urologia para decidir qué bloque de caso ejecutar
                                        switch (opcion_urologia) {
                                            // Bloque que se ejecuta cuando la opción seleccionada es 1
                                            case 1:
                                                // Muestra en pantalla el mensaje: "Cita el 08/09/2026 alas 9:00 AM"
                                                System.out.println("Cita el 08/09/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Urologia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Urologia";
                                                // Guarda la fecha/hora de la cita "08/07/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "08/07/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                
                                                break;// case 1 de seleccion de fecha en urologia

                                            // Bloque que se ejecuta cuando la opción seleccionada es 2
                                            case 2:
                                                // Muestra en pantalla el mensaje: "Cita el 15/09/2026 alas 9:00 AM"
                                                System.out.println("Cita el 15/09/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Urologia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Urologia";
                                                // Guarda la fecha/hora de la cita "15/09/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "15/09/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                                
                                                break;// case 2 de seleccion de fecha en urologia 

                                            // Bloque que se ejecuta cuando la opción seleccionada es 3
                                            case 3:
                                                // Muestra en pantalla el mensaje: "Cita el 22/09/2026 alas 9:00 AM"
                                                System.out.println("Cita el 22/09/2026 alas 9:00 AM");
                                                // Solicita al usuario que ingrese el nombre completo del paciente
                                                System.out.println("Porfavor, Ingrese su nombre completo");
                                                // Captura el nombre ingresado por el usuario y lo guarda en la variable nombre
                                                nombre = sc.nextLine();
                                                // Solicita al usuario que ingrese la edad del paciente
                                                System.out.println("Porfavor, Ingrese la edad");
                                                // Captura la edad ingresada por el usuario y la guarda en la variable edad
                                                edad = sc.nextInt();
                                                sc.nextLine(); // Mantiene limpio el buffer despues de un nextInt
                                                // Solicita al usuario que ingrese el número de cédula del paciente
                                                System.out.println("Porfavor, Ingrese el numero de cedula");
                                                // Captura la cédula ingresada por el usuario y la guarda en la variable cedula
                                                cedula = sc.nextLine();

                                                // Guarda el nombre del paciente en la columna 0 del nuevo registro de la cita
                                                citas[total_citas][0] = nombre;
                                                // Convierte la edad a texto (String) y la guarda en la columna 1 del nuevo registro
                                                citas[total_citas][1] = String.valueOf(edad);
                                                // Guarda la cédula del paciente en la columna 2 del nuevo registro de la cita
                                                citas[total_citas][2] = cedula;
                                                // Guarda el área médica "Urologia" en la columna 3 del nuevo registro de la cita
                                                citas[total_citas][3] = "Urologia";
                                                // Guarda la fecha/hora de la cita "22/09/2026 Hora: 9:00 AM" en la columna 4 del nuevo registro
                                                citas[total_citas][4] = "22/09/2026 Hora: 9:00 AM";
                                                // Establece el estado inicial de la cita como "Activa" en la columna 6 del nuevo registro
                                                citas[total_citas][6] = "Activa";

                                                // Imprime el encabezado del mensaje de confirmación de cita agendada
                                                System.out.println("====| Cita agendada |====");
                                                // Muestra en pantalla el nombre del paciente que acaba de registrar la cita
                                                System.out.println("paciente:" + citas[total_citas][0]);
                                                // Muestra en pantalla la edad registrada del paciente
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                // Muestra en pantalla la cédula registrada del paciente
                                                System.out.println("Cedula:" + citas[total_citas][2]);
                                                // Muestra en pantalla el área médica de la cita recién registrada
                                                System.out.println("Area medica:" + citas[total_citas][3]);
                                                // Muestra en pantalla la fecha completa de la cita recién registrada
                                                System.out.println("Fecha:" + citas[total_citas][4]);
                                                // Muestra en pantalla el estado actual de la cita recién registrada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                // Incrementa en uno el contador total de citas registradas (total_citas)
                                                total_citas ++;
                                               
                                                break;// case 3 de seleccion de fecha en urologia 
                                        
                                            // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                            default:
                                                // Muestra en pantalla el mensaje: "Opcion no valida"
                                                System.out.println("Opcion no valida");
                                                // Finaliza la ejecución del bloque case actual y sale del switch
                                                break;
                                        }// switch del case 6 horarios de urologia


                                    // Bloque que se ejecuta cuando la opción seleccionada es 7
                                    case 7:
                                        // Muestra en pantalla el mensaje: "volver"
                                        System.out.println("volver");
                                        break; // case 7 volver
                                
                                    // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                    default:
                                        // Muestra en pantalla el mensaje: "Opcion no valida"
                                        System.out.println("Opcion no valida");
                                        break; // cierre del switch de especialidades medicas
                                // Cierra el bloque de código
                                }

                            // Bloque alternativo que se ejecuta si la condición anterior fue falsa
                            } else {
                                // Muestra en pantalla el mensaje: "citas llenas por hoy"
                                System.out.println("citas llenas por hoy");
                            }// llave de cierre del if que solo permite agendar 10 citas

                            break; // cierre del case 1 de opciones del paciente

                        

                        // Bloque que se ejecuta cuando la opción seleccionada es 2
                        case 2:
                            // Muestra en pantalla el mensaje: "====| Cancelar cita |==="
                            System.out.println("====| Cancelar cita |===");
                            // Muestra en pantalla (sin salto de línea) el mensaje: "Ingrese el nombre del paciente:"
                            System.out.print("Ingrese el nombre del paciente: ");
                            // Lee el nombre del paciente a buscar y lo guarda en la variable cancelarNombre
                            String cancelarNombre = sc.nextLine(); 
                            
                            
                            // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                            for (i = 0; i < total_citas; i++) 
                            // Abre un bloque de código
                            {
                                
                                // Compara el nombre del paciente en el registro i con el nombre ingresado para cancelar
                                if (citas[i][0].equalsIgnoreCase(cancelarNombre)) {
                                    // Cambia el estado de la cita encontrada a "Cancelado" en la columna 6 del registro i
                                    citas[i][6] = "Cancelado"; 
                                    // Muestra en pantalla el mensaje: "Cita cancelada con éxito."
                                    System.out.println("Cita cancelada con éxito.");
                                // Cierra el bloque de código
                                }
                                
                            // Cierra el bloque de código
                            }
                            // Finaliza la ejecución del bloque case actual y sale del switch
                            break;                          

                        // Bloque que se ejecuta cuando la opción seleccionada es 3
                        case 3:
                            // Muestra en pantalla el mensaje: "Volver"
                            System.out.println("Volver");
                            // Finaliza la ejecución del bloque case actual y sale del switch
                            break;
                    
                        // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                        default:
                            break; // cierre del switch de opciones del paciente
                    // Cierra el bloque de código
                    }
                    
                    break; // cierre del case 1(paciente)

                // Bloque que se ejecuta cuando la opción seleccionada es 2
                case 2:
                    // Muestra en pantalla el mensaje: "====|Administrador|===="
                    System.out.println("====|Administrador|====");
                    // Muestra en pantalla el mensaje: "Ingresa tu usuario"
                    System.out.println("Ingresa tu usuario");
                    // Captura el texto ingresado por el usuario y lo guarda en la variable user
                    user = sc.nextLine();                   
                    // Reinicia el contador de intentos en 1
                    i = 1;

                    // Repite el ciclo mientras se cumpla la condición: !user.equalsIgnoreCase("Admin26")
                    while (!user.equalsIgnoreCase("Admin26")){
                        // Muestra en pantalla el mensaje: "usuario no valido, intente denuevo"
                        System.out.println("usuario no valido, intente denuevo");
                        // Captura el texto ingresado por el usuario y lo guarda en la variable user
                        user = sc.nextLine(); 

                        // Evalúa la condición:  user.equalsIgnoreCase("Admin26")
                        if ( user.equalsIgnoreCase("Admin26")){
                            // Muestra en pantalla el mensaje: "Usuario valido"
                            System.out.println("Usuario valido");
                        // Cierra el bloque de código
                        }                                               
                    // Cierra el bloque de código
                    }

                    // Muestra en pantalla el mensaje: "Ingrese la contraseña"
                    System.out.println("Ingrese la contraseña");
                    // Captura la contraseña ingresada por el usuario y la guarda en la variable password
                    password = sc.nextInt();
                    // Limpia el salto de línea pendiente en el buffer del Scanner
                    sc.nextLine();

                    // Reinicia el contador de intentos en 1
                    i = 1;
                    // Repite el ciclo mientras se cumpla la condición:  password != 7890 && i < 4
                    while ( password != 7890 && i < 4){
                        // Muestra en pantalla el mensaje: "Contraseña incorrecta, intente denuevo"
                        System.out.println("Contraseña incorrecta, intente denuevo");
                        // Captura la contraseña ingresada por el usuario y la guarda en la variable password
                        password = sc.nextInt();
                        // Limpia el salto de línea pendiente en el buffer del Scanner
                        sc.nextLine();
                        // Incrementa en uno el contador de intentos fallidos
                        i +=1 ;
                    // Cierra el bloque de código
                    }

                    // Evalúa la condición: password == 7890
                    if (password == 7890){
                        // Muestra en pantalla el mensaje: "Contraseña correcta, acceso concedido"
                        System.out.println("Contraseña correcta, acceso concedido");
                        // Muestra en pantalla el mensaje: "Ver citas"
                        System.out.println("Ver citas");

                    // Bloque alternativo que se ejecuta si la condición anterior fue falsa
                    } else {
                        // Muestra en pantalla el mensaje: "acceso bloqueado, demasiados intentos fallidos"
                        System.out.println("acceso bloqueado, demasiados intentos fallidos");
                        opcion_admin = 3;
                    // Cierra el bloque de código
                    }

                    if ( password == 7890){
                        // Muestra en pantalla el mensaje: "1--Verificar citas registradas"
                        System.out.println("1--Verificar citas registradas");
                        // Muestra en pantalla el mensaje: "2--ver actividad de citas"
                        System.out.println("2--ver actividad de citas");
                        // muestra en pantalla el mensaje 3-- volver
                        System.out.println("3--Volver");
                        // Muestra en pantalla el mensaje: "Seleccione una opcion"
                        System.out.println("Seleccione una opcion");
                        // Captura el número ingresado por el usuario y lo guarda en la variable opcion_admin
                        opcion_admin = sc.nextInt();
                        // Limpia el salto de línea pendiente en el buffer del Scanner
                        sc.nextLine();
                    }
                    // Evalúa el valor de opcion_admin para decidir qué bloque de caso ejecutar
                    switch (opcion_admin) 
                    // Abre un bloque de código
                    {
                        // Bloque que se ejecuta cuando la opción seleccionada es 1
                        case 1:
                            // Muestra en pantalla el mensaje: "=====| Registro de citas agendadas |===="
                            System.out.println("=====| Registro de citas agendadas |====");
                            // Muestra en pantalla el mensaje: "1--citas en medicina general"
                            System.out.println("1--citas en medicina general");
                            // Muestra en pantalla el mensaje: "2--citas en pediatria"
                            System.out.println("2--citas en pediatria");
                            // Muestra en pantalla el mensaje: "3--citas en dermatologia"
                            System.out.println("3--citas en dermatologia");
                            // Muestra en pantalla el mensaje: "4--citas en Ortopedia"
                            System.out.println("4--citas en Ortopedia");
                            // Muestra en pantalla el mensaje: "5--citas en Ginecologia y Obstetricia"
                            System.out.println("5--citas en Ginecologia y Obstetricia");
                            // Muestra en pantalla el mensaje: "6--citas en Urologia"
                            System.out.println("6--citas en Urologia");
                            // Muestra en pantalla el mensaje: "Indique que area medica quiere ver"
                            System.out.println("Indique que area medica quiere ver");
                            // Captura el número ingresado por el usuario y lo guarda en la variable area_medica
                            int area_medica = sc.nextInt();
                            sc.nextLine();// mantiene el buffer limpio

                            // Evalúa el valor de area_medica para decidir qué bloque de caso ejecutar
                            switch (area_medica) 
                            // Abre un bloque de código
                            {
                                // Bloque que se ejecuta cuando la opción seleccionada es 1
                                case 1:
                                    // Muestra en pantalla el mensaje: "====| Citas en medicina general |===="
                                    System.out.println("====| Citas en medicina general |====");

                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Medicina General"
                                        if (citas[i][3].equalsIgnoreCase("Medicina General"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra el día de la cita del registro i
                                            System.out.println("Dia: " + citas[i][4]);
                                            // Muestra la hora de la cita del registro i
                                            System.out.println("Hora: " + citas[i][5]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    
                                    break; // case 1 de registro de citas medicina general

                                // Bloque que se ejecuta cuando la opción seleccionada es 2
                                case 2:
                                    // Muestra en pantalla el mensaje: "====| Citas en pediatria |===="
                                    System.out.println("====| Citas en pediatria |====");
                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Pediatria"
                                        if (citas[i][3].equalsIgnoreCase("Pediatria"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra la fecha completa de la cita del registro i
                                            System.out.println("Fecha: " + citas[i][4]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    break; // case 2 de registro de citas pediatria

                                // Bloque que se ejecuta cuando la opción seleccionada es 3
                                case 3:
                                    // Muestra en pantalla el mensaje: "====| citas en dermatologia |==="
                                    System.out.println("====| citas en dermatologia |===");
                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Dermatologia"
                                        if (citas[i][3].equalsIgnoreCase("Dermatologia"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra la fecha completa de la cita del registro i
                                            System.out.println("Fecha: " + citas[i][4]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    break; // case 3 de regsitro de citas en dematologia

                                // Bloque que se ejecuta cuando la opción seleccionada es 4
                                case 4:
                                    // Muestra en pantalla el mensaje: "====| Citas en Ortopedia |===="
                                    System.out.println("====| Citas en Ortopedia |====");
                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Ortopedia"
                                        if (citas[i][3].equalsIgnoreCase("Ortopedia"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra la fecha completa de la cita del registro i
                                            System.out.println("Fecha: " + citas[i][4]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    break; // case 4 de regsitro de citas en ortopedia

                                // Bloque que se ejecuta cuando la opción seleccionada es 5
                                case 5:
                                    // Muestra en pantalla el mensaje: "====| Citas en Ginecologia y Obstetricia |===="
                                    System.out.println("====| Citas en Ginecologia y Obstetricia |====");
                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Ginecologia y Obstetricia"
                                        if (citas[i][3].equalsIgnoreCase("Ginecologia y Obstetricia"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra la fecha completa de la cita del registro i
                                            System.out.println("Fecha: " + citas[i][4]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    break; // case 5 de regsitro de citas en ginecologia y obstetricia

                                // Bloque que se ejecuta cuando la opción seleccionada es 6
                                case 6:
                                    // Muestra en pantalla el mensaje: "====| Citas en Urologia |===="
                                    System.out.println("====| Citas en Urologia |====");
                                    // Inicia un ciclo que recorre todas las citas registradas (desde 0 hasta total_citas)
                                    for (i = 0; i < total_citas; i++)
                                    // Abre un bloque de código
                                    {
                                        // Verifica si la cita en la posición i corresponde al área médica "Urologia"
                                        if (citas[i][3].equalsIgnoreCase("Urologia"))
                                        // Abre un bloque de código
                                        {
                                            // Muestra el nombre del paciente correspondiente al registro i
                                            System.out.println("Paciente: " + citas[i][0]);
                                            // Muestra la edad del paciente correspondiente al registro i
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            // Muestra la cédula del paciente correspondiente al registro i
                                            System.out.println("Cedula: " + citas[i][2]);
                                            // Muestra el área médica del registro i
                                            System.out.println("Area medica: " + citas[i][3]);
                                            // Muestra la fecha completa de la cita del registro i
                                            System.out.println("Fecha: " + citas[i][4]);
                                            // Muestra el estado actual de la cita del registro i
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            // Imprime una línea separadora entre cada cita mostrada
                                            System.out.println("------------------------");
                                        // Cierra el bloque de código
                                        }
                                    // Cierra el bloque de código
                                    }

                                    break; // case 6 de regsitro de citas en urologia
                            
                                // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                                default:
                                    // Muestra en pantalla el mensaje: "opcion invalida"
                                    System.out.println("opcion invalida");
                                    // Finaliza la ejecución del bloque case actual y sale del switch
                                    break;

                            } // switch de area medica
                          
                           
                            break; // case 1 de opciones admin

                        // Bloque que se ejecuta cuando la opción seleccionada es 2
                        case 2:
                            // Muestra en pantalla el mensaje: "=====| Actividad de citas |===="
                            System.out.println("=====| Actividad de citas |====");
                            // Muestra en pantalla el mensaje: "=====| Actividad Global de Citas |====="
                            System.out.println(""); // separa la info por estetica
                            System.out.println("=====| Actividad Global de Citas |=====");
        
                            // Evalúa la condición: total_citas == 0
                            if (total_citas == 0) {
                                // Muestra en pantalla el mensaje: "No hay citas registradas en el sistema todavía."
                                System.out.println("No hay citas registradas en el sistema todavía.");
                            // Bloque alternativo que se ejecuta si la condición anterior fue falsa
                            } else {
                                
                                // Inicia un ciclo con la condición: i = 0; i < total_citas; i++
                                for (i = 0; i < total_citas; i++) {
                                    // Muestra el nombre del paciente correspondiente al registro i
                                    System.out.println("Paciente: " + citas[i][0]);
                                    // Muestra el área médica del registro i
                                    System.out.println("Área médica: " + citas[i][3]);
                                    // Muestra el estado actual de la cita del registro i
                                    System.out.println("Estado de la cita: " + citas[i][6]);
                                    
                                    // Imprime una línea separadora entre cada cita mostrada
                                    System.out.println("----------------------------------------");
                                // Cierra el bloque de código
                                }
                                
                            // Cierra el bloque de código
                            }
                            // Finaliza la ejecución del bloque case actual y sale del switch
                            break;

                        case 3:
                            System.out.println("Regresando...");
                            break;

                        // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                        default:
                            // Muestra en pantalla el mensaje: "opcion no valida"
                            System.out.println("opcion no valida");
                            // Finaliza la ejecución del bloque case 2 y sale del switch
                            break;

                    } // switch de opciones del admin



                    break; // cierre del case 2

                // Bloque que se ejecuta cuando la opción seleccionada es 3
                case 3:
                    // Muestra en pantalla el mensaje: "Saliendo del sistema ... por estetica "
                    System.out.println("Saliendo del sistema ...");
                    // Finaliza la ejecución del bloque case 3 y sale del switch
                    break;

            
                // Bloque que se ejecuta si el valor no coincide con ninguno de los casos anteriores
                default:
                    // Muestra en pantalla el mensaje: "Opcion invalida"
                    System.out.println("Opcion invalida");
                    break; // switch de paciente, admin

                    
            } // cierre del switch principal(paciente, admin y la opcion salir)

            
        } while ( opcion != 3); // condicion para repetir hasta que el user selccione la opcion 3(salir)
        // Cierra el objeto Scanner y libera los recursos de entrada del teclado
        sc.close();
        
    // Cierra el bloque de código del metodo main
    }
    
// Cierra el bloque de código de la clase citas_medicas26
}
