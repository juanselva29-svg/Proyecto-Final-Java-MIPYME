// Importa la clase Scannerdel paquete util que pertenece a java que permite leer datos ingresados por el usuario desde el teclado
import java.util.Scanner;  
// Declaracion de la clase principal del programa (Sistema de Gestion Hospitalaria)
public class Sistema_SGH_UNI
{
    // Metodo principal: punto de entrada de la ejecucion del programa
    public static void main(String[] args)
    {
        // Bandera que indica si ya se agendo una cita, controla el ciclo de seleccion de horario
        boolean cita_agendada = false;
        // 'opcion' guarda la opcion elegida en el menu principal; 'edad' guarda la edad del paciente
        int opcion, edad;
        // Variables que almacenan el nombre y la cedula del paciente que esta usando el sistema
        String nombre, cedula;  
        // Guarda la opcion elegida en el menu del paciente (agendar, cancelar, volver)
        int opcion_p = 0;
        // opcion del switch pediatria
        int opcion_pd;
        // Guarda la opcion elegida en el switch de horarios de dermatologia
        int opcion_dm; 
        // Guarda la opcion elegida en el menu del administrador
        int opcion_admin = 0;
        // Variable utilizada como contador/indice en los bucles for
        int i;  
        // Numero de acceso (pin) que se asigna a cada paciente registrado; se incrementa con cada registro
        int pin = 1;

        Scanner sc = new Scanner(System.in);  // Crea el objeto Scanner para leer la entrada de datos del usuario por consola

        String pacientes[][] = new String[5][4];  // Matriz que almacena hasta 5 pacientes, cada uno con 4 datos: nombre, edad, cedula y pin
        int total_pacientes = 0;  // Contador de la cantidad de pacientes registrados actualmente

        String citas[][] = new String[5][7]; // arreglo bidimensional de citas
        int total_citas = 0;  // Contador de la cantidad de citas registradas actualmente
        
        do {  // Inicia el bucle principal del menu, se repite hasta que el usuario elija salir

            System.out.println("=====| Usuario |=====");  // Muestra en pantalla el mensaje: "=====| Usuario |====="
            System.out.println("1--Administrador");  // Muestra la opcion de menu: "1--Administrador"
            System.out.println("2--Paciente");  // Muestra la opcion de menu: "2--Paciente"
            System.out.println("3--Salir");    // Muestra la opcion de menu: "3--Salir"
            System.out.println("Seleccione una de estas opciones");  // Muestra en pantalla el mensaje: "Seleccione una de estas opciones"
            opcion = sc.nextInt();  // Lee el numero entero ingresado por el usuario y lo guarda en 'opcion'
            sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

            switch (opcion)   // Evalua la opcion elegida en el menu principal (Administrador, Paciente, Salir)
            {
                
                case 1:  // Opcion 1 del switch
                    System.out.println("====|Administrador|====");  // Muestra en pantalla el mensaje: "====|Administrador|===="
                    System.out.println("Ingresa tu usuario");  // Muestra en pantalla el mensaje: "Ingresa tu usuario"
                    String user = sc.nextLine();                     // Lee el nombre de usuario ingresado por el administrador
                    i = 1;  // Reinicia el contador de intentos

                    while (!user.equalsIgnoreCase("Admin26")){  // Repite mientras el usuario ingresado no coincida con el usuario administrador valido
                        System.out.println("usuario no valido, intente denuevo");  // Muestra en pantalla el mensaje: "usuario no valido, intente denuevo"
                        user = sc.nextLine();   // Vuelve a leer el usuario ingresado tras un intento fallido

                        if ( user.equalsIgnoreCase("Admin26")){  // Verifica si el usuario ingresado ya es valido, para informarlo al usuario
                            System.out.println("Usuario valido");  // Muestra en pantalla el mensaje: "Usuario valido"
                        }                                               
                    }

                    System.out.println("Ingrese la contraseña");  // Muestra en pantalla el mensaje: "Ingrese la contraseña"
                    int password = sc.nextInt();  // Lee la contraseña ingresada por el administrador
                    sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                    i = 1;  // Reinicia el contador de intentos
                    while ( password != 7890 && i < 4){  // Repite mientras la contraseña sea incorrecta y no se hayan superado los 4 intentos
                        System.out.println("Contraseña incorrecta, intente denuevo");  // Muestra en pantalla el mensaje: "Contraseña incorrecta, intente denuevo"
                        password = sc.nextInt();  // Vuelve a leer la contraseña ingresada tras un intento fallido
                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)
                        i +=1 ;  // Incrementa el contador de intentos de contraseña
                    }

                    if (password == 7890){  // Verifica si la contraseña ingresada es correcta
                        System.out.println("Contraseña correcta, acceso concedido");  // Muestra en pantalla el mensaje: "Contraseña correcta, acceso concedido"
                    } else {  // En caso contrario...
                        System.out.println("acceso bloqueado, demasiados intentos fallidos");  // Muestra en pantalla el mensaje: "acceso bloqueado, demasiados intentos fallidos"
                        opcion_admin = 4;  // Fuerza la salida del menu de administrador por exceso de intentos fallidos
                    }

                    if ( password == 7890){  // Verifica si la contraseña ingresada es correcta
                        System.out.println("1--Registrar paciente");  // Muestra la opcion de menu: "1--Registrar paciente"
                        System.out.println("2--Verificar citas registradas");  // Muestra la opcion de menu: "2--Verificar citas registradas"
                        System.out.println("3--Ver actividad de citas");  // Muestra la opcion de menu: "3--Ver actividad de citas"
                        System.out.println("4--Volver");  // Muestra la opcion de menu: "4--Volver"
                        System.out.println("Seleccione una opcion");  // Muestra en pantalla el mensaje: "Seleccione una opcion"
                        opcion_admin = sc.nextInt();  // Lee la opcion elegida en el menu del administrador
                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)
                    }

                    switch (opcion_admin)   // Evalua la opcion elegida en el menu del administrador
                    {

                        case 1:  // Opcion 1 del switch
                            if (total_pacientes > 5) {  // Verifica que no se haya superado el limite de pacientes que se pueden registrar
                                System.out.println("No hay mas cupos para registrar pacientes");  // Informa que ya no hay espacio disponible para registrar mas pacientes
                                break;  // Finaliza el caso actual del switch
                            }
                            System.out.println("=====| Registro de Paciente |=====");  // Muestra en pantalla el mensaje: "=====| Registro de Paciente |====="
                            System.out.println("Ingrese el nombre completo del paciente");  // Muestra en pantalla el mensaje: "Ingrese el nombre completo del paciente"
                            String nomReg = sc.nextLine();  // Lee el nombre completo del paciente a registrar
                            System.out.println("Ingrese la edad del paciente");  // Muestra en pantalla el mensaje: "Ingrese la edad del paciente"
                            String edadReg = sc.nextLine();  // Lee la edad del paciente a registrar (como texto)
                            System.out.println("Ingrese el numero de cedula");  // Muestra en pantalla el mensaje: "Ingrese el numero de cedula"
                            String cedReg = sc.nextLine();  // Lee el numero de cedula del paciente a registrar

 
                            pacientes[total_pacientes][0] = nomReg;  // Guarda el nombre del nuevo paciente en la matriz de pacientes
                            pacientes[total_pacientes][1] = edadReg;  // Guarda la edad del nuevo paciente en la matriz de pacientes
                            pacientes[total_pacientes][2] = cedReg;  // Guarda la cedula del nuevo paciente en la matriz de pacientes
                            pacientes[total_pacientes][3] = String.valueOf(pin);  // Guarda el pin de acceso asignado al nuevo paciente (convertido a texto)
                            total_pacientes++;  // Incrementa el contador de pacientes registrados

                            System.out.println("==== Paciente Registrado ====");  // Muestra en pantalla el mensaje: "==== Paciente Registrado ===="
                            System.out.println("Nombre: " + nomReg);  // Muestra en pantalla el nombre del paciente registrado
                            System.out.println("Edad: " + edadReg + " años");  // Muestra en pantalla la edad del paciente registrado
                            System.out.println("Cedula: " + cedReg);  // Muestra en pantalla la cedula del paciente registrado
                            System.out.println("*** Numero de acceso asignado: " + pin );  // Muestra en pantalla el pin de acceso asignado al paciente
                            System.out.println("Entregue este numero al paciente para que pueda agendar su cita");  // Muestra en pantalla el mensaje: "Entregue este numero al paciente para que pueda agendar su cita"
                            pin++;  // Incrementa el pin para que el siguiente paciente registrado reciba uno distinto
                            break;  // Finaliza el caso actual del switch

                        case 2:  // Opcion 2 del switch

                            System.out.println("=====| Registro de citas agendadas |====");  // Muestra en pantalla el mensaje: "=====| Registro de citas agendadas |===="
                            System.out.println("1--citas en medicina general");  // Muestra la opcion de menu: "1--citas en medicina general"
                            System.out.println("2--citas en pediatria");  // Muestra la opcion de menu: "2--citas en pediatria"
                            System.out.println("3--citas en dermatologia");  // Muestra la opcion de menu: "3--citas en dermatologia"
                            System.out.println("4--citas en Ortopedia");  // Muestra la opcion de menu: "4--citas en Ortopedia"
                            System.out.println("5--citas en Ginecologia y Obstetricia");  // Muestra la opcion de menu: "5--citas en Ginecologia y Obstetricia"
                            System.out.println("6--citas en Urologia");  // Muestra la opcion de menu: "6--citas en Urologia"
                            System.out.println("Indique que area medica quiere ver");  // Muestra en pantalla el mensaje: "Indique que area medica quiere ver"
                            int area_medica = sc.nextInt();  // Lee el area medica seleccionada por el administrador para consultar citas
                            sc.nextLine();// mantiene el buffer limpio

                            switch (area_medica)   // Evalua el area medica seleccionada para consultar las citas registradas
                            {
                                case 1:  // Opcion 1 del switch
                                    System.out.println("====| Citas en medicina general |====");  // Muestra en pantalla el mensaje: "====| Citas en medicina general |===="

                                    if (total_citas == 0){  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas en el sistema");  // Muestra en pantalla el mensaje: "No hay citas registradas en el sistema"
                                    } else {  // En caso contrario...
                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Medicina General"))  // Verifica si la cita actual corresponde al area de Medicina General
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Dia: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Hora: " + citas[i][5]);  // Muestra la hora de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)

                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }

                                    }                                    
                                    
                                    break; // case 1 de registro de citas medicina general

                                case 2:  // Opcion 2 del switch
                                    System.out.println("====| Citas en pediatria |====");  // Muestra en pantalla el mensaje: "====| Citas en pediatria |===="
                                    if (total_citas ==0 ) {  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas en el sistema");  // Muestra en pantalla el mensaje: "No hay citas registradas en el sistema"
                                    } else {  // En caso contrario...
                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Pediatria"))  // Verifica si la cita actual corresponde al area de Pediatria
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Fecha: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
    
                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }

                                    }

                                    break; // case 2 de registro de citas pediatria

                                case 3:  // Opcion 3 del switch
                                    System.out.println("====| citas en dermatologia |===");  // Muestra en pantalla el mensaje: "====| citas en dermatologia |==="
                                    if ( total_citas == 0){  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas");  // Muestra en pantalla el mensaje: "No hay citas registradas"
                                    } else {  // En caso contrario...

                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Dermatologia"))  // Verifica si la cita actual corresponde al area de Dermatologia
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Fecha: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
    
                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }
                                    }

                                    break; // case 3 de regsitro de citas en dematologia

                                case 4:  // Opcion 4 del switch
                                    System.out.println("====| Citas en Ortopedia |====");  // Muestra en pantalla el mensaje: "====| Citas en Ortopedia |===="
                                    if (total_citas == 0){  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas");  // Muestra en pantalla el mensaje: "No hay citas registradas"
                                    } else {  // En caso contrario...

                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Ortopedia"))  // Verifica si la cita actual corresponde al area de Ortopedia
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Fecha: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
    
                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }
                                    }

                                    break; // case 4 de regsitro de citas en ortopedia

                                case 5:  // Opcion 5 del switch
                                    System.out.println("====| Citas en Ginecologia y Obstetricia |====");  // Muestra en pantalla el mensaje: "====| Citas en Ginecologia y Obstetricia |===="
                                    if ( total_citas == 0){  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas");  // Muestra en pantalla el mensaje: "No hay citas registradas"
                                    } else {  // En caso contrario...

                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Ginecologia y Obstetricia"))  // Verifica si la cita actual corresponde al area de Ginecologia y Obstetricia
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Fecha: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
    
                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }
                                    }

                                    break; // case 5 de regsitro de citas en ginecologia y obstetricia

                                case 6:  // Opcion 6 del switch
                                    System.out.println("====| Citas en Urologia |====");  // Muestra en pantalla el mensaje: "====| Citas en Urologia |===="
                                    if (total_citas == 0){  // Verifica si no hay ninguna cita registrada en el sistema
                                        System.out.println("No hay citas registradas");  // Muestra en pantalla el mensaje: "No hay citas registradas"
                                    } else {  // En caso contrario...

                                        for (i = 0; i < total_citas; i++)  // Recorre todas las citas registradas en el sistema
                                        {
                                            if (citas[i][3].equalsIgnoreCase("Urologia"))  // Verifica si la cita actual corresponde al area de Urologia
                                            {
                                                System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                                System.out.println("Edad: " + citas[i][1] + " años");  // Muestra la edad del paciente de la cita
                                                System.out.println("Cedula: " + citas[i][2]);  // Muestra la cedula del paciente de la cita
                                                System.out.println("Area medica: " + citas[i][3]);  // Muestra el area medica de la cita
                                                System.out.println("Fecha: " + citas[i][4]);  // Muestra el dia o fecha de la cita
                                                System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
    
                                                System.out.println("------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                            }
                                        }
                                    }

                                    break; // case 6 de regsitro de citas en urologia
                            
                                default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                    System.out.println("opcion invalida");  // Muestra en pantalla el mensaje: "opcion invalida"
                                    break;  // Finaliza el caso actual del switch

                            } // switch de area medica
                          
                           
                            break; // case 2 de opciones admin

                        case 3:  // Opcion 3 del switch

                            System.out.println("=====| Actividad Global de Citas |=====");  // Muestra en pantalla el mensaje: "=====| Actividad Global de Citas |====="
        
                            if (total_citas == 0) {  // Verifica si no hay ninguna cita registrada en el sistema
                                System.out.println("No hay citas registradas en el sistema todavía.");  // Muestra en pantalla el mensaje: "No hay citas registradas en el sistema todavía."
                            } else {  // En caso contrario...
                                
                                for (i = 0; i < total_citas; i++) {  // Recorre todas las citas registradas en el sistema
                                    System.out.println("Paciente: " + citas[i][0]);  // Muestra el nombre del paciente de la cita
                                    System.out.println("Área médica: " + citas[i][3]);  // Muestra el area medica de la cita
                                    System.out.println("Estado de la cita: " + citas[i][6]);  // Muestra el estado actual de la cita (Activa/Cancelado)
                                    
                                    System.out.println("----------------------------------------");  // Imprime una linea separadora para mejorar la legibilidad en consola
                                }
                                
                            }
                            break;  // Finaliza el caso actual del switch

                        case 4:  // Opcion 4 del switch
                            System.out.println("Regresando ...");  // Muestra en pantalla el mensaje: "Regresando ..."
                            break;  // Finaliza el caso actual del switch
                    
                        default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                            System.out.println("opcion no valida");  // Muestra en pantalla el mensaje: "opcion no valida"
                            break;  // Finaliza el caso actual del switch

                    } // switch de opciones del admin

                    break; // cierre del case 1 (Admin)

                case 2:  // Opcion 2 del switch

                    System.out.println("===|Paciente|===");  // Muestra en pantalla el mensaje: "===|Paciente|==="
                    System.out.println("Ingrese su numero de acceso asignado por el administrador");  // Muestra en pantalla el mensaje: "Ingrese su numero de acceso asignado por el administrador"
                    String pinIngresado = sc.nextLine().trim();  // Lee el pin de acceso ingresado por el paciente y elimina espacios en blanco sobrantes

                    int idxPaciente = -1;   // Indice del paciente encontrado segun el pin ingresado; -1 significa que no se encontro
                    for (i = 0; i < total_pacientes; i++) {  // Recorre todos los pacientes registrados en el sistema
                        if (pacientes[i][3].equals(pinIngresado)) {  // Compara el pin ingresado con el pin guardado de cada paciente registrado
                            idxPaciente = i;  // Guarda la posicion del paciente encontrado en la matriz
                            break;  // Finaliza el caso actual del switch
                        }
                    }

                    if (idxPaciente == -1) {  // Verifica si el pin ingresado no corresponde a ningun paciente registrado
                        System.out.println("Numero de acceso no valido. Contacte al administrador para registrarse.");  // Muestra en pantalla el mensaje: "Numero de acceso no valido. Contacte al administrador para registrarse."
                        break;  // Finaliza el caso actual del switch
                    }

                    System.out.println("Numero valido, bienvenido al SGH " + pacientes[idxPaciente][0]);  // Saluda al paciente mostrando su nombre

                    // Tomar los datos del paciente desde el arreglo de pacientes registrados
                    nombre = pacientes[idxPaciente][0];  // Obtiene el nombre del paciente desde la matriz de pacientes registrados
                    edad   = Integer.parseInt(pacientes[idxPaciente][1]);  // Obtiene la edad del paciente y la convierte de texto a numero entero
                    cedula = pacientes[idxPaciente][2];  // Obtiene la cedula del paciente desde la matriz de pacientes registrados

                    System.out.println("1--Agendar cita");  // Muestra la opcion de menu: "1--Agendar cita"
                    System.out.println("2--Cancelar cita");  // Muestra la opcion de menu: "2--Cancelar cita"
                    System.out.println("3--volver");  // Muestra la opcion de menu: "3--volver"
                    System.out.println("Seleccione una de estas opciones");  // Muestra en pantalla el mensaje: "Seleccione una de estas opciones"
                    opcion_p = sc.nextInt();  // Lee la opcion elegida por el paciente (agendar, cancelar o volver)
                    sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                    switch (opcion_p)   // Evalua la opcion elegida en el menu del paciente
                    {
                        case 1:  // Opcion 1 del switch
                            if (total_citas < 5) // condicion para que no se agenden mas citas de las que hay disponibles
                            {
                                System.out.println("====|Agendar cita|====");  // Muestra en pantalla el mensaje: "====|Agendar cita|===="
                                System.out.println("");  // Imprime una linea vacia (separador visual)
                                System.out.println("====| Especialidades |====");  // Muestra en pantalla el mensaje: "====| Especialidades |===="
                                System.out.println("1-- Medicina General");  // Muestra la opcion de menu: "1-- Medicina General"
                                System.out.println("2-- Pediatria");  // Muestra la opcion de menu: "2-- Pediatria"
                                System.out.println("3-- Dermatologia");  // Muestra la opcion de menu: "3-- Dermatologia"
                                System.out.println("4-- Ortopedia");  // Muestra la opcion de menu: "4-- Ortopedia"
                                System.out.println("5-- Ginecologia y Obstetricia");  // Muestra la opcion de menu: "5-- Ginecologia y Obstetricia"
                                System.out.println("6-- Urologia");  // Muestra la opcion de menu: "6-- Urologia"
                                System.out.println("7-- Volver");  // Muestra la opcion de menu: "7-- Volver"
                                System.out.println("Seleccione la especialidad");  // Muestra en pantalla el mensaje: "Seleccione la especialidad"
                                int especialidad = sc.nextInt();  // Lee la especialidad medica elegida por el paciente
                                sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                switch (especialidad)   // Evalua la especialidad medica elegida para agendar la cita
                                {
                                    case 1:  // Opcion 1 del switch
                                        cita_agendada = false; // reinicio que permite nuevas citas
                                        System.out.println("===| Medicina General |====");  // Muestra en pantalla el mensaje: "===| Medicina General |===="
                                        System.out.println("Todos los dias: 8:00 AM - 3:00PM");   // Muestra en pantalla el mensaje: "Todos los dias: 8:00 AM - 3:00PM"
                                        
                                        System.out.println("Ingrese el dia de su cita");  // Muestra en pantalla el mensaje: "Ingrese el dia de su cita"
                                        String dia = sc.nextLine();  // Lee el dia en que el paciente desea agendar su cita de medicina general

                                        while (!cita_agendada){  // Repite hasta que el paciente logre agendar una cita en un horario disponible
                                            System.out.println("======| Horarios |=====");  // Muestra en pantalla el mensaje: "======| Horarios |====="
                                            System.out.println("1--8:00AM");  // Muestra la opcion de menu: "1--8:00AM"
                                            System.out.println("2--9:00AM (ocupado)");  // Muestra la opcion de menu: "2--9:00AM (ocupado)"
                                            System.out.println("3--10:00AM");  // Muestra la opcion de menu: "3--10:00AM"
                                            System.out.println("4--11:00AM");  // Muestra la opcion de menu: "4--11:00AM"
                                            System.out.println("5--1:00PM");  // Muestra la opcion de menu: "5--1:00PM"
                                            System.out.println("6--2:00PM (ocupado)");  // Muestra la opcion de menu: "6--2:00PM (ocupado)"
                                            System.out.println("7--3:00PM");  // Muestra la opcion de menu: "7--3:00PM"
                                            System.out.println("8--Volver");  // Muestra la opcion de menu: "8--Volver"
                                            System.out.println("Ingrese la hora de su cita");  // Muestra en pantalla el mensaje: "Ingrese la hora de su cita"
                                            int hora = sc.nextInt();  // Lee la hora elegida por el paciente para su cita
                                            sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                            switch (hora)   // Evalua la hora elegida para la cita de medicina general
                                            {
                                                case 1:  // Opcion 1 del switch
                                                    System.out.println(dia + " alas 8:00 AM");  // Muestra el dia elegido junto con la hora seleccionada

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Medicina General";  // Guarda el area medica de la nueva cita: Medicina General
                                                    citas[total_citas][4] = dia;  // Guarda el dia elegido por el paciente en la nueva cita
                                                    citas[total_citas][5] = "8:00 AM";  // Guarda la hora elegida en la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("==== Cita agendada !!====");  // Muestra en pantalla el mensaje: "==== Cita agendada !!===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Dia:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Hora:" + citas[total_citas][5]);  // Muestra la hora de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada

                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario
                                                    
                                                    break;// cierre del case 1

                                                case 2:  // Opcion 2 del switch
                                                    System.out.println(dia + "alas 9:00 AM");  // Muestra el dia elegido junto con la hora seleccionada
                                                    System.out.println("este dia esta ocupado, ingrese otro");  // Muestra en pantalla el mensaje: "este dia esta ocupado, ingrese otro"
                                                    break; // cierre del case 2

                                                case 3:  // Opcion 3 del switch
                                                    System.out.println(dia + " alas 10:00 AM");  // Muestra el dia elegido junto con la hora seleccionada

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Medicina General";  // Guarda el area medica de la nueva cita: Medicina General
                                                    citas[total_citas][4] = dia;  // Guarda el dia elegido por el paciente en la nueva cita
                                                    citas[total_citas][5] = "10:00 AM";  // Guarda la hora elegida en la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("==== Cita agendada !!====");  // Muestra en pantalla el mensaje: "==== Cita agendada !!===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Dia:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Hora:" + citas[total_citas][5]);  // Muestra la hora de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada


                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario

                                                    break; // case 3

                                                case 4:  // Opcion 4 del switch
                                                    System.out.println(dia + " alas 11:00 AM");  // Muestra el dia elegido junto con la hora seleccionada

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Medicina General";  // Guarda el area medica de la nueva cita: Medicina General
                                                    citas[total_citas][4] = dia;  // Guarda el dia elegido por el paciente en la nueva cita
                                                    citas[total_citas][5] = "11:00 AM";  // Guarda la hora elegida en la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("==== Cita agendada !!====");  // Muestra en pantalla el mensaje: "==== Cita agendada !!===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Dia:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Hora:" + citas[total_citas][5]);  // Muestra la hora de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada

                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario

                                                    break; // case 4

                                                case 5:  // Opcion 5 del switch
                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Medicina General";  // Guarda el area medica de la nueva cita: Medicina General
                                                    citas[total_citas][4] = dia;  // Guarda el dia elegido por el paciente en la nueva cita
                                                    citas[total_citas][5] = "1:00 PM";  // Guarda la hora elegida en la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("==== Cita agendada !!====");  // Muestra en pantalla el mensaje: "==== Cita agendada !!===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Dia:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Hora:" + citas[total_citas][5]);  // Muestra la hora de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada

                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario

                                                    break; // case 5

                                                case 6:  // Opcion 6 del switch
                                                    System.out.println( dia + " alas 2 PM");  // Muestra el dia elegido junto con la hora seleccionada
                                                    System.out.println("Este dia esta reservado ingrese otro");  // Muestra en pantalla el mensaje: "Este dia esta reservado ingrese otro"

                                                    break; // case 6

                                                case 7:  // Opcion 7 del switch
                                                    System.out.println(dia + " alas 3:00 PM");  // Muestra el dia elegido junto con la hora seleccionada

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Medicina General";  // Guarda el area medica de la nueva cita: Medicina General
                                                    citas[total_citas][4] = dia;  // Guarda el dia elegido por el paciente en la nueva cita
                                                    citas[total_citas][5] = "3:00 PM";  // Guarda la hora elegida en la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Dia:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Hora:" + citas[total_citas][5]);  // Muestra la hora de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada

                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario

                                                    break; // case 7

                                                case 8:  // Opcion 8 del switch
                                                    System.out.println("Regresando ...");  // Muestra en pantalla el mensaje: "Regresando ..."
                                                    cita_agendada = true;  // Marca que la cita ya fue agendada, para salir del bucle de seleccion de horario
                                                    break; // case 8
                                            
                                                default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                    System.out.println("Opcion invalida, ingrese un numero del 1 al 8");  // Muestra en pantalla el mensaje: "Opcion invalida, ingrese un numero del 1 al 8"
                                                    break; // cierre de los cases

                                            } // cierre del switch de horario de atencion


                                        } // cierre del while que repite hasta que ingrese un dia valido
                                        
                                        break; // cierre del case 1(medicina general)

                                    case 2:  // Opcion 2 del switch
                                        System.out.println("===|pediatria|===");  // Muestra en pantalla el mensaje: "===|pediatria|==="
                                        System.out.println("Ingrese la edad del paciente");  // Muestra en pantalla el mensaje: "Ingrese la edad del paciente"
                                        int edadPed = sc.nextInt();  // Lee la edad del paciente para validar si corresponde al area de pediatria
                                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                        if ( edadPed < 12){  // Verifica si la edad del paciente corresponde al area de pediatria (menor de 12 años)
                                            System.out.println("====|Horarios de Atencion|====");  // Muestra en pantalla el mensaje: "====|Horarios de Atencion|===="
                                            System.out.println("1-- 20/06/2026 Hora: 8:00 AM");  // Muestra la opcion de menu: "1-- 20/06/2026 Hora: 8:00 AM"
                                            System.out.println("2-- 23/06/2026 Hora: 11:00 AM");  // Muestra la opcion de menu: "2-- 23/06/2026 Hora: 11:00 AM"
                                            System.out.println("3-- 16/07/2026 Hora: 2:00 PM");  // Muestra la opcion de menu: "3-- 16/07/2026 Hora: 2:00 PM"
                                            System.out.println("Seleccione la fecha de su cita");  // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                            opcion_pd = sc.nextInt();  // Lee la fecha/horario elegido para la cita de pediatria
                                            sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                            switch (opcion_pd) {  // Evalua la fecha/horario elegido para la cita de pediatria
                                                case 1:  // Opcion 1 del switch
                                                    System.out.println(" cita el: 20/06/2026 alas 8:00 AM");  // Muestra en pantalla el mensaje: " cita el: 20/06/2026 alas 8:00 AM"

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Pediatria";  // Guarda el area medica de la nueva cita: Pediatria
                                                    citas[total_citas][4] = "20/06/2026 Hora: 8:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                    
                                                    break; // case 1 padiatria

                                                case 2:  // Opcion 2 del switch
                                                    System.out.println(" cita el: 23/06/2026 alas 11:00 AM");  // Muestra en pantalla el mensaje: " cita el: 23/06/2026 alas 11:00 AM"

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Pediatria";  // Guarda el area medica de la nueva cita: Pediatria
                                                    citas[total_citas][4] = "23/06/2026 Hora: 11:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas

                                                    break; // case 2

                                                case 3:  // Opcion 3 del switch
                                                    System.out.println(" cita el: 16/07/2026 alas 2:00 PM");  // Muestra en pantalla el mensaje: " cita el: 16/07/2026 alas 2:00 PM"

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Pediatria";  // Guarda el area medica de la nueva cita: Pediatria
                                                    citas[total_citas][4] = "16/07/2026 Hora: 2:00 PM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas

                                                    break;  // Finaliza el caso actual del switch

                                                default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                    System.out.println("Opcion invalida");  // Muestra en pantalla el mensaje: "Opcion invalida"
                                                    break;  // Finaliza el caso actual del switch
                                            } // cierre de horarios de atencion de pediatria



                                        } else {  // En caso contrario...
                                            System.out.println("Esta es un area infantil (menores de 12)");  // Muestra en pantalla el mensaje: "Esta es un area infantil (menores de 12)"
                                        }


                                        break; // case 2 (pediatria)

                                    case 3:  // Opcion 3 del switch
                                        System.out.println("Dermatologia");  // Muestra en pantalla el mensaje: "Dermatologia"
                                        System.out.println("====|Horarios de Atencion|====");  // Muestra en pantalla el mensaje: "====|Horarios de Atencion|===="
                                            System.out.println("1--25/09/2026 Hora: 10:00 AM");  // Muestra la opcion de menu: "1--25/09/2026 Hora: 10:00 AM"
                                            System.out.println("2--03/07/2026 Hora: 1:00 PM");  // Muestra la opcion de menu: "2--03/07/2026 Hora: 1:00 PM"
                                            System.out.println("3--02/08/2026 Hora: 5:00 PM");  // Muestra la opcion de menu: "3--02/08/2026 Hora: 5:00 PM"
                                            System.out.println("Seleccione la fecha de su cita");  // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                            opcion_dm = sc.nextInt();  // Lee la fecha/horario elegido para la cita de dermatologia
                                            sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                            switch (opcion_dm)   // Evalua la fecha/horario elegido para la cita de dermatologia
                                            {
                                                case 1:  // Opcion 1 del switch
                                                    System.out.println("Cita el 25/09/2026 alas 10:00 AM ");  // Muestra en pantalla el mensaje: "Cita el 25/09/2026 alas 10:00 AM "

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Dermatologia";  // Guarda el area medica de la nueva cita: Dermatologia
                                                    citas[total_citas][4] = "25/09/2026 Hora: 10:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                    break; // case 1 horario de dermatologia

                                                case 2:  // Opcion 2 del switch
                                                    System.out.println("Cita el 03/07/2026 alas 1:00 PM ");  // Muestra en pantalla el mensaje: "Cita el 03/07/2026 alas 1:00 PM "

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Dermatologia";  // Guarda el area medica de la nueva cita: Dermatologia
                                                    citas[total_citas][4] = "03/07/2026 Hora: 1:00 PM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                    break;  // Finaliza el caso actual del switch

                                                case 3:  // Opcion 3 del switch
                                                    System.out.println("Cita el 02/08/2026 alas 5:00 PM");  // Muestra en pantalla el mensaje: "Cita el 02/08/2026 alas 5:00 PM"

                                                    citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                    citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                    citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                    citas[total_citas][3] = "Dermatologia";  // Guarda el area medica de la nueva cita: Dermatologia
                                                    citas[total_citas][4] = "02/08/2026 Hora: 5:00 PM";  // Guarda la fecha y hora de la nueva cita
                                                    citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                    System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                    System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                    System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                    System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                    System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                    total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                    break;  // Finaliza el caso actual del switch
                                               
                                            
                                                default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                    System.out.println("Opcion no valida");  // Muestra en pantalla el mensaje: "Opcion no valida"
                                                    break;  // Finaliza el caso actual del switch

                                            } // switch de horarios dermatologia
                                           
                                        break; // switch de case 3(Dermatologia)

                                    case 4:  // Opcion 4 del switch
                                        System.out.println("====| Ortopedia |====");  // Muestra en pantalla el mensaje: "====| Ortopedia |===="
                                        System.out.println("====| Horarios de atencion |====");  // Muestra en pantalla el mensaje: "====| Horarios de atencion |===="
                                        System.out.println("1-- 05/08/2026 Hora: 9:00 AM");  // Muestra la opcion de menu: "1-- 05/08/2026 Hora: 9:00 AM"
                                        System.out.println("2-- 12/08/2026 Hora: 11:00 AM");  // Muestra la opcion de menu: "2-- 12/08/2026 Hora: 11:00 AM"
                                        System.out.println("3-- 19/08/2026 Hora: 2:00 PM");  // Muestra la opcion de menu: "3-- 19/08/2026 Hora: 2:00 PM"
                                        System.out.println("Seleccione la fecha de su cita");  // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                        int opcion_ortopedia = sc.nextInt();  // Lee la fecha/horario elegido para la cita de ortopedia
                                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                        switch (opcion_ortopedia) {  // Evalua la fecha/horario elegido para la cita de ortopedia
                                            case 1:  // Opcion 1 del switch
                                                System.out.println("Cita el 05/08/2026 alas 9:00 AM");  // Muestra en pantalla el mensaje: "Cita el 05/08/2026 alas 9:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ortopedia";  // Guarda el area medica de la nueva cita: Ortopedia
                                                citas[total_citas][4] = "05/08/2026 Hora: 9:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                
                                                break; // case 1 horarios de ortopedia

                                            case 2:  // Opcion 2 del switch
                                                System.out.println("Cita el 12/08/2026 alas 11:00 AM");  // Muestra en pantalla el mensaje: "Cita el 12/08/2026 alas 11:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ortopedia";  // Guarda el area medica de la nueva cita: Ortopedia
                                                citas[total_citas][4] = "12/08/2026 Hora: 11:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                break; // case 2 horarios de ortopedia

                                            case 3:  // Opcion 3 del switch
                                                System.out.println("Cita el 19/08/2026 alas 2:00 PM");  // Muestra en pantalla el mensaje: "Cita el 19/08/2026 alas 2:00 PM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ortopedia";  // Guarda el area medica de la nueva cita: Ortopedia
                                                citas[total_citas][4] = "19/08/2026 Hora: 2:00 PM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                   
                                                break; // case 3 horarios de ortopedia

                                            default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                System.out.println("Opcion no valida");  // Muestra en pantalla el mensaje: "Opcion no valida"
                                                break;  // Finaliza el caso actual del switch
                                        } // switch del case 4 ortopedia

                                        break; // case 4 (Ortopedia)

                                    case 5:  // Opcion 5 del switch
                                        System.out.println("====| Ginecologia y Obstetricia |====");  // Muestra en pantalla el mensaje: "====| Ginecologia y Obstetricia |===="
                                        System.out.println("====| Horarios de atencion |====");  // Muestra en pantalla el mensaje: "====| Horarios de atencion |===="
                                        System.out.println("1-- 10/07/2026 Hora: 8:00 AM");  // Muestra la opcion de menu: "1-- 10/07/2026 Hora: 8:00 AM"
                                        System.out.println("2-- 17/07/2026 Hora: 9:00 AM");  // Muestra la opcion de menu: "2-- 17/07/2026 Hora: 9:00 AM"
                                        System.out.println("3-- 24/07/2026 Hora: 9:00 AM");  // Muestra la opcion de menu: "3-- 24/07/2026 Hora: 9:00 AM"
                                        System.out.println("Seleccione la fecha de su cita");  // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita"
                                        int opcion_gin = sc.nextInt();  // Lee la fecha/horario elegido para la cita de ginecologia y obstetricia
                                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                        switch (opcion_gin) {  // Evalua la fecha/horario elegido para la cita de ginecologia y obstetricia
                                            case 1:  // Opcion 1 del switch
                                                System.out.println("Cita el 10/07/2026 alas 8:00 AM");  // Muestra en pantalla el mensaje: "Cita el 10/07/2026 alas 8:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";  // Guarda el area medica de la nueva cita: Ginecologia y Obstetricia
                                                citas[total_citas][4] = "10/07/2026 Hora: 8:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                break; // case 1 de horarios de ginecologia y obs

                                            case 2:  // Opcion 2 del switch
                                               System.out.println("Cita el 17/07/2026 alas 9:00 AM");  // Muestra en pantalla el mensaje: "Cita el 17/07/2026 alas 9:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";  // Guarda el area medica de la nueva cita: Ginecologia y Obstetricia
                                                citas[total_citas][4] = "17/07/2026 Hora: 9:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;                                                     // Incrementa el contador de citas registradas
                                                
                                                break; // case 2 de horarios de ginecologia y obs 

                                            case 3:  // Opcion 3 del switch
                                                System.out.println("Cita el 24/07/2026 alas 9:00 AM");  // Muestra en pantalla el mensaje: "Cita el 24/07/2026 alas 9:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Ginecologia y Obstetricia";  // Guarda el area medica de la nueva cita: Ginecologia y Obstetricia
                                                citas[total_citas][4] = "24/07/2026 Hora: 9:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;                                                     // Incrementa el contador de citas registradas
                                                
                                                break; // case 3 de horarios de ginecologia y obs
                                        
                                            default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                System.out.println("Opcion no valida");  // Muestra en pantalla el mensaje: "Opcion no valida"
                                                break;  // Finaliza el caso actual del switch

                                        } // switch del case 5 ginecologia y obstetricia

                                        break; // case 5 (Ginecologia y Obstetricia)

                                    case 6:  // Opcion 6 del switch
                                        System.out.println("Urologia");  // Muestra en pantalla el mensaje: "Urologia"
                                        System.out.println("====| Horarios de Atención |====");                                         // Muestra en pantalla el mensaje: "====| Horarios de Atención |===="
                                        System.out.println("1-- 08/09/2026 Hora: 9:00 AM");  // Muestra la opcion de menu: "1-- 08/09/2026 Hora: 9:00 AM"
                                        System.out.println("2-- 15/09/2026 Hora: 11:00 AM");  // Muestra la opcion de menu: "2-- 15/09/2026 Hora: 11:00 AM"
                                        System.out.println("3-- 22/09/2026 Hora: 4:00 PM");  // Muestra la opcion de menu: "3-- 22/09/2026 Hora: 4:00 PM"
                                        System.out.println("Seleccione la fecha de su cita:");  // Muestra en pantalla el mensaje: "Seleccione la fecha de su cita:"
                                        int opcion_urologia = sc.nextInt();  // Lee la fecha/horario elegido para la cita de urologia
                                        sc.nextLine();  // Limpia el buffer del Scanner (consume el salto de linea pendiente tras nextInt)

                                        switch (opcion_urologia) {  // Evalua la fecha/horario elegido para la cita de urologia
                                            case 1:  // Opcion 1 del switch
                                                System.out.println("Cita el 08/09/2026 alas 9:00 AM");  // Muestra en pantalla el mensaje: "Cita el 08/09/2026 alas 9:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Urologia";  // Guarda el area medica de la nueva cita: Urologia
                                                citas[total_citas][4] = "08/09/2026 Hora: 9:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                break;// case 1 de seleccion de fecha en urologia

                                            case 2:  // Opcion 2 del switch
                                                System.out.println("Cita el 15/09/2026 alas 11:00 AM");  // Muestra en pantalla el mensaje: "Cita el 15/09/2026 alas 11:00 AM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Urologia";  // Guarda el area medica de la nueva cita: Urologia
                                                citas[total_citas][4] = "15/09/2026 Hora: 11:00 AM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                                
                                                break;// case 2 de seleccion de fecha en urologia 

                                            case 3:  // Opcion 3 del switch
                                                System.out.println("Cita el 22/09/2026 alas 4:00 PM");  // Muestra en pantalla el mensaje: "Cita el 22/09/2026 alas 4:00 PM"

                                                citas[total_citas][0] = nombre;  // Guarda el nombre del paciente en la nueva cita
                                                citas[total_citas][1] = String.valueOf(edad);  // Guarda la edad del paciente en la nueva cita (convertida a texto)
                                                citas[total_citas][2] = cedula;  // Guarda la cedula del paciente en la nueva cita
                                                citas[total_citas][3] = "Urologia";  // Guarda el area medica de la nueva cita: Urologia
                                                citas[total_citas][4] = "22/09/2026 Hora: 4:00 PM";  // Guarda la fecha y hora de la nueva cita
                                                citas[total_citas][6] = "Activa";  // Marca la nueva cita con estado 'Activa'

                                                System.out.println("====| Cita agendada |====");  // Muestra en pantalla el mensaje: "====| Cita agendada |===="
                                                System.out.println("paciente:" + citas[total_citas][0]);  // Muestra el nombre del paciente de la cita recien agendada
                                                System.out.println("Edad:" + citas[total_citas][1] + "años");  // Muestra la edad del paciente de la cita recien agendada
                                                System.out.println("Cedula:" + citas[total_citas][2]);  // Muestra la cedula del paciente de la cita recien agendada
                                                System.out.println("Area medica:" + citas[total_citas][3]);  // Muestra el area medica de la cita recien agendada
                                                System.out.println("Fecha:" + citas[total_citas][4]);  // Muestra el dia/fecha de la cita recien agendada
                                                System.out.println("Estado de la cita:" + citas[total_citas][6]);  // Muestra el estado de la cita recien agendada
                                                total_citas ++;  // Incrementa el contador de citas registradas
                                               
                                                break;// case 3 de seleccion de fecha en urologia 
                                        
                                            default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                                System.out.println("Opcion no valida");  // Muestra en pantalla el mensaje: "Opcion no valida"
                                                break;  // Finaliza el caso actual del switch
                                        }// switch del case 6 horarios de urologia

                                        break; // case 6 (Urologia)

                                    case 7:  // Opcion 7 del switch
                                        System.out.println("volver");  // Muestra en pantalla el mensaje: "volver"
                                        break; // case 7 volver
                                
                                    default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                                        System.out.println("Opcion no valida");  // Muestra en pantalla el mensaje: "Opcion no valida"
                                        break; // cierre del switch de especialidades medicas
                                }

                            } else {  // En caso contrario...
                                System.out.println("citas llenas por hoy");  // Muestra en pantalla el mensaje: "citas llenas por hoy"
                            }// llave de cierre del if que solo permite agendar 10 citas

                            break; // cierre del case 1 de opciones del paciente
                        

                        case 2:  // Opcion 2 del switch
                            System.out.println("====| Cancelar cita |===");  // Muestra en pantalla el mensaje: "====| Cancelar cita |==="
                            System.out.print("Ingrese el nombre del paciente: ");  // Solicita un dato al usuario mostrando el texto: "Ingrese el nombre del paciente: "
                            String cancelarNombre = sc.nextLine();   // Lee el nombre del paciente cuya cita se desea cancelar
                                                       
                            for (i = 0; i < total_citas; i++)   // Recorre todas las citas registradas en el sistema
                            {
                                
                                if (citas[i][0].equalsIgnoreCase(cancelarNombre)) {  // Compara el nombre ingresado con el nombre de cada cita registrada
                                    citas[i][6] = "Cancelado";   // Cambia el estado de la cita encontrada a 'Cancelado'
                                    System.out.println("Cita cancelada con éxito.");  // Muestra en pantalla el mensaje: "Cita cancelada con éxito."
                                }
                                
                            }
                            break;                            // Finaliza el caso actual del switch

                        case 3:  // Opcion 3 del switch
                            System.out.println("Volver");  // Muestra en pantalla el mensaje: "Volver"
                            break;  // Finaliza el caso actual del switch
                    
                        default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                            break; // cierre del switch de opciones del paciente
                    }
                    
                    break; // cierre del case 2 (Paciente)

                case 3:  // Opcion 3 del switch
                    System.out.println("Saliendo del sistema ...");  // Muestra en pantalla el mensaje: "Saliendo del sistema ..."
                    break;  // Finaliza el caso actual del switch

            
                default:  // Caso por defecto: se ejecuta si el usuario ingresa una opcion no contemplada
                    System.out.println("Opcion invalida");  // Muestra en pantalla el mensaje: "Opcion invalida"
                    break; // switch de paciente, admin

                    
            } // cierre del switch principal(admin, paciente, salir del sistema)

            
        } while ( opcion != 3); // condicion para repetir hasta que el user selccione la opcion 3(salir)
        sc.close();  // Cierra el Scanner para liberar el recurso de lectura de entrada
        
    }
    
}