import java.util.Scanner;
public class Citas_Medicas 
{
    public static void main(String[] args) 
    {
        boolean cita_agendada = false;
        int opcion, edad;
        String nombre, cedula;
        int opcion_p;
        int opcion_pd; // opcion del switch pediatria
        int opcion_dm;
        int opcion_admin;
        int i;

        Scanner sc = new Scanner(System.in);

        String citas[][] = new String[5][7]; // arreglo bidimensional
        int total_citas = 0;
        
        do {

            System.out.println("=====| Usuario |=====");
            System.out.println("1--Paciente");
            System.out.println("2--Administrador");
            System.out.println("3--Salir");  
            System.out.println("Seleccione una de estas opciones");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.println("===|Paciente|===");
                    System.out.println("Ingresa tu usuario");
                    String user = sc.nextLine();    

                    
                    while(!user.equalsIgnoreCase("paciente@26")){
                        System.out.println("Usuario no valido, ingreselo nuevamente");
                        user  = sc.nextLine();

                        if (user.equalsIgnoreCase("paciente@26")){
                            System.out.println("Usuario valido");
                        } 
                    }

                    System.out.println("Ingrese su contraseña");
                    int password = sc.nextInt();

                    i = 1;
                    while( password != 5465 && i < 4){
                        System.out.println("Contrseña incorrecta, ingresela nuevamente");
                        password = sc.nextInt();
                        sc.nextLine();
                    }

                    if (password == 5465){
                        System.out.println("Contraseña correcta, bienvenido");

                    } else {
                        System.out.println("Cuenta bloqueada demasiados intentos fallidos");
                    }

                    System.out.println("1--Agendar cita");
                    System.out.println("2--Cancelar cita");
                    System.out.println("3--volver");
                    System.out.println("Seleccione una de estas opciones");
                    opcion_p = sc.nextInt();
                    sc.nextLine();

                    switch (opcion_p) 
                    {
                        case 1:
                            if (total_citas < 5) // condicion para que no se agenden mas citas de las que hay disponibles
                            {
                                System.out.println("====|Agendar cita|====");
                                System.out.println("");
                                System.out.println("====| Especialidades |====");
                                System.out.println("1-- Medicina General");
                                System.out.println("2-- Pediatria");
                                System.out.println("3-- Dermatologia");
                                System.out.println("4-- volver");
                                System.out.println("Seleccione la especialidad");
                                int especialidad = sc.nextInt();
                                sc.nextLine();

                                switch (especialidad) 
                                {
                                    case 1:
                                        cita_agendada = false; // reinicio que permite nuevas citas
                                        System.out.println("===| Medicina General |====");
                                        System.out.println("Todos los dias: 8:00 AM - 3:00PM"); 
                                        
                                        System.out.println("Ingrese el dia de su cita");
                                        String dia = sc.nextLine();

                                        while (!cita_agendada){
                                            System.out.println("======| Horarios |=====");
                                            System.out.println("1--8:00AM");
                                            System.out.println("2--9:00AM (ocupado)");
                                            System.out.println("3--10:00AM");
                                            System.out.println("4--11:00AM");
                                            System.out.println("5--1:00PM");
                                            System.out.println("6--2:00PM (ocupado)");
                                            System.out.println("7--3:00PM");
                                            System.out.println("8--Volver");
                                            System.out.println("Ingrese la hora de su cita");
                                            int hora = sc.nextInt();
                                            sc.nextLine();

                                            switch (hora) 
                                            {
                                                case 1:
                                                    System.out.println(dia + " alas 8:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();                                                   


                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Medicina General";
                                                    citas[total_citas][4] = dia;
                                                    citas[total_citas][5] = "8:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("==== Cita agendada !!====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    total_citas ++;
                                                
                                                    cita_agendada = true;
                                                    
                                                    break;// cierre del case 1

                                                case 2:
                                                    System.out.println(dia + "alas 9:00 AM");
                                                    System.out.println("este dia esta ocupado, ingrese otro");
                                                    break; // cierre del case 2

                                                case 3:
                                                    System.out.println(dia + " alas 10:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Medicina General";
                                                    citas[total_citas][4] = dia;
                                                    citas[total_citas][5] = "10:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("==== Cita agendada !!====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);


                                                    total_citas ++;
                                                
                                                    cita_agendada = true;

                                                    break; // case 3

                                                case 4:
                                                    System.out.println(dia + " alas 11:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Medicina General";
                                                    citas[total_citas][4] = dia;
                                                    citas[total_citas][5] = "11:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("==== Cita agendada !!====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    total_citas ++;
                                                
                                                    cita_agendada = true;

                                                    break; // case 4

                                                case 5:
                                                    System.out.println(dia + " alas 1:00 PM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Medicina General";
                                                    citas[total_citas][4] = dia;
                                                    citas[total_citas][5] = "1:00 PM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("==== Cita agendada !!====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    total_citas ++;
                                                
                                                    cita_agendada = true;

                                                    break; // case 5

                                                case 6:
                                                    System.out.println( dia + " alas 2 PM");
                                                    System.out.println("Este dia esta reservado ingrese otro");

                                                    break; // case 6

                                                case 7:
                                                    System.out.println(dia + " alas 3:00 PM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Medicina General";
                                                    citas[total_citas][4] = dia;
                                                    citas[total_citas][5] = "3:00 PM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Dia:" + citas[total_citas][4]);
                                                    System.out.println("Hora:" + citas[total_citas][5]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);

                                                    total_citas ++;
                                                
                                                    cita_agendada = true;

                                                    break; // case 7

                                                case 8:
                                                    System.out.println("Regresando ...");
                                                    cita_agendada = true;
                                                    break; // case 8
                                            
                                                default:
                                                    System.out.println("Opcion invalida, ingrese un numero del 1 al 8");
                                                    break; // cierre de los cases

                                            } // cirre del switch de horario de atencion


                                        } // cierre del while que repite hasta que ingrese un dia valido
                                        
                                        break; // cierre del case 1(medicina general)

                                    case 2:
                                        System.out.println("===|pediatria|===");
                                        System.out.println("Ingrese la edad del paciente");
                                        edad = sc.nextInt();
                                        sc.nextLine();

                                        if ( edad < 12){
                                            System.out.println("====|Horarios de Atencion|====");
                                            System.out.println("1-- 20/06/2026 Hora: 8:00 AM");
                                            System.out.println("2-- 23/06/2026 Hora: 11:00 AM");
                                            System.out.println("3-- 16/07/2026 Hora: 2:00 PM");
                                            System.out.println("Seleccione la fecha de su cita");
                                            opcion_pd = sc.nextInt();
                                            sc.nextLine();

                                            switch (opcion_pd) {
                                                case 1:
                                                    System.out.println(" cita el: 20/06/2026 alas 8:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese la cedula del padre");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Pediatria";
                                                    citas[total_citas][4] = "20/06/2026 Hora: 8:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;
                                                    
                                                    break; // case 1 padiatria

                                                case 2:
                                                    System.out.println(" cita el: 23/06/2026 alas 11:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese la cedula del padre");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Pediatria";
                                                    citas[total_citas][4] = "23/06/2026 Hora: 11:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;

                                                    break; // case 2

                                                case 3:
                                                    System.out.println(" cita el: 16/07/2026 alas 8:00 AM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese la cedula del padre");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Pediatria";
                                                    citas[total_citas][4] = "16/07/2026 Hora: 2:00 PM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;

                                                    break;

                                                default:
                                                    System.out.println("Opcion invalida");
                                                    break;
                                            } // cierre de horarios de atencion de pediatria



                                        } else {
                                            System.out.println("Esta es un area infantil (menores de 12)");
                                        }


                                        break; // case 2 (pediatria)

                                    case 3:
                                        System.out.println("Dermatologia");
                                        System.out.println("====|Horarios de Atencion|====");
                                            System.out.println("1-- 25/09/2026 Hora: 10:00 AM");
                                            System.out.println("2-- 03/07/2026 Hora: 1:00 PM");
                                            System.out.println("3-- 02/08/2026 Hora: 5:00 PM");
                                            System.out.println("Seleccione la fecha de su cita");
                                            opcion_dm = sc.nextInt();
                                            sc.nextLine();

                                            switch (opcion_dm) 
                                            {
                                                case 1:
                                                    System.out.println("Cita el 25/09/2026 alas 10:00 AM ");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Dermatologia";
                                                    citas[total_citas][4] = "25/09/2026 Hora: 10:00 AM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;
                                                   
                                                    break; // case 1 horario de dermatologia

                                                case 2:
                                                    System.out.println("Cita el 03/07/2026 alas 1:00 PM ");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Dermatologia";
                                                    citas[total_citas][4] = "03/07/2026 Hora: 1:00 PM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;
                                                   
                                                    break;

                                                case 3:
                                                    System.out.println("Cita el 02/08/2026 alas 5:00 PM");
                                                    System.out.println("Ingrese su nombre");
                                                    nombre = sc.nextLine();
                                                    System.out.println("Ingrese su  edad");
                                                    edad = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Ingrese su cedula");
                                                    cedula = sc.nextLine();

                                                    citas[total_citas][0] = nombre;
                                                    citas[total_citas][1] = String.valueOf(edad);
                                                    citas[total_citas][2] = cedula;
                                                    citas[total_citas][3] = "Dermatologia";
                                                    citas[total_citas][4] = "02/08/2026 Hora: 5:00 PM";
                                                    citas[total_citas][6] = "Activa";

                                                    System.out.println("====| Cita agendada |====");
                                                    System.out.println("paciente:" + citas[total_citas][0]);
                                                    System.out.println("Edad:" + citas[total_citas][1] + "años");
                                                    System.out.println("Cedula:" + citas[total_citas][2]);
                                                    System.out.println("Area medica:" + citas[total_citas][3]);
                                                    System.out.println("Fecha:" + citas[total_citas][4]);
                                                    System.out.println("Estado de la cita:" + citas[total_citas][6]);
                                                    total_citas ++;
                                                   
                                                    break;

                                                
                                            
                                                default:
                                                    System.out.println("Opcion no valida");
                                                    break;

                                            } // switch de horarios dermatologia
                                           
                                        break; // switch de case 3(Dermatologia)

                                    case 4:
                                        System.out.println("volver");
                                        break; // case 4 volver
                                
                                    default:
                                        System.out.println("Opcion no valida");
                                        break; // cierre del switch de especialidades medicas
                                }

                            } else {
                                System.out.println("citas llenas por hoy");
                            }// llave de cierre del if que solo permite agendar 10 citas

                            break; // cierre del case 1 de opciones del paciente

                        

                        case 2:
                            System.out.println("====| Cancelar cita |===");
                            System.out.print("Ingrese el nombre del paciente: ");
                            String cancelarNombre = sc.next(); 
                            
                            
                            for (i = 0; i < total_citas; i++) 
                            {
                                
                                if (citas[i][0].equalsIgnoreCase(cancelarNombre)) {
                                    citas[i][6] = "Cancelado"; 
                                    System.out.println("Cita cancelada con éxito.");
                                }
                                
                            }
                            break;                          

                        case 3:
                            System.out.println("Volver");
                            break;
                    
                        default:
                            break; // cierre del switch de opciones del paciente
                    }
                    
                    break; // cierre del case 1(paciente)

                case 2:
                    System.out.println("====|Administrador|====");
                    System.out.println("Ingresa tu usuario");
                    user = sc.nextLine();                   
                    i = 1;

                    while (!user.equalsIgnoreCase("Admin26")){
                        System.out.println("usuario no valido, intente denuevo");
                        user = sc.nextLine(); 

                        if ( user.equalsIgnoreCase("Admin26")){
                            System.out.println("Usuario valido");
                        }                                               
                    }

                    System.out.println("Ingrese la contraseña");
                    password = sc.nextInt();
                    sc.nextLine();

                    i = 1;
                    while ( password != 7890 && i < 4){
                        System.out.println("Contraseña incorrecta, intente denuevo");
                        password = sc.nextInt();
                        sc.nextLine();
                        i +=1 ;
                    }

                    if (password == 7890){
                        System.out.println("Contraseña correcta, acceso concedido");
                        System.out.println("Ver citas");

                    } else {
                        System.out.println("acceso bloqueado");

                    }

                    System.out.println("1--Verificar citas registradas");
                    System.out.println("2-- ver actividad de citas");
                    System.out.println("Seleccione una opcion");
                    opcion_admin = sc.nextInt();
                    sc.nextLine();

                    switch (opcion_admin) 
                    {
                        case 1:
                            System.out.println("=====| Registro de citas agendadas |====");
                            System.out.println("1--citas en medicina general");
                            System.out.println("2--citas en pediatria");
                            System.out.println("3--citas en dermatologia");
                            System.out.println("Indique de que area quiere ver la cita");
                            int area_medica = sc.nextInt();
                            sc.nextLine();

                            switch (area_medica) 
                            {
                                case 1:
                                    System.out.println("====| Citas en medicina general |====");

                                    for (i = 0; i < total_citas; i++)
                                    {
                                        if (citas[i][3].equalsIgnoreCase("Medicina General"))
                                        {
                                            System.out.println("Paciente: " + citas[i][0]);
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            System.out.println("Cedula: " + citas[i][2]);
                                            System.out.println("Area medica: " + citas[i][3]);
                                            System.out.println("Dia: " + citas[i][4]);
                                            System.out.println("Hora: " + citas[i][5]);
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            System.out.println("------------------------");
                                        }
                                    }

                                    
                                    break; // case 1 de registro de citas medicina general

                                case 2:
                                    System.out.println("====| Citas en pediatria |====");
                                    for (i = 0; i < total_citas; i++)
                                    {
                                        if (citas[i][3].equalsIgnoreCase("Pediatria"))
                                        {
                                            System.out.println("Paciente: " + citas[i][0]);
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            System.out.println("Cedula: " + citas[i][2]);
                                            System.out.println("Area medica: " + citas[i][3]);
                                            System.out.println("Fecha: " + citas[i][4]);
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            System.out.println("------------------------");
                                        }
                                    }

                                    break; // case 2 de registro de citas pediatria

                                case 3:
                                    System.out.println("====| citas en dermatologia |===");
                                    for (i = 0; i < total_citas; i++)
                                    {
                                        if (citas[i][3].equalsIgnoreCase("Dermatologia"))
                                        {
                                            System.out.println("Paciente: " + citas[i][0]);
                                            System.out.println("Edad: " + citas[i][1] + " años");
                                            System.out.println("Cedula: " + citas[i][2]);
                                            System.out.println("Area medica: " + citas[i][3]);
                                            System.out.println("Fecha: " + citas[i][4]);
                                            System.out.println("Estado de la cita: " + citas[i][6]);

                                            System.out.println("------------------------");
                                        }
                                    }

                                    break; // case 3 de regsitro de citas en dematologia
                            
                                default:
                                    System.out.println("opcion invalida");
                                    break;
                            }

                          

                            
                            break; // case 1 de opciones admin

                        case 2:
                            System.out.println("=====| Actividad de citas |====");
                            System.out.println("=====| Actividad Global de Citas |=====");
        
                            if (total_citas == 0) {
                                System.out.println("No hay citas registradas en el sistema todavía.");
                            } else {
                                
                                for (i = 0; i < total_citas; i++) {
                                    System.out.println("Paciente: " + citas[i][0]);
                                    System.out.println("Área médica: " + citas[i][3]);
                                    System.out.println("Estado de la cita: " + citas[i][6]);
                                    
                                    System.out.println("----------------------------------------");
                                }
                                
                            }
                            break;
                    
                        default:
                            System.out.println("opcion no valida");
                            break;

                    } // switch de opciones del admin



                    break; // cierre del case 2

                case 3:
                    System.out.println("Saliendo del sistema ...");
                    break;

            
                default:
                    System.out.println("Opcion invalida");
                    break; // switch de paciente, admin

                    

            }

            
        } while ( opcion != 3); // condicion para repetir hasta que el user selccione la opcion 3(salir)
        
    }
    
}
