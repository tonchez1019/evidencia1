import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int respuesta = 1;
        String aux;
        int aux2;
        Doctor p1 = new Doctor();
        Cliente p2 = new Cliente();
        Cita p3 = new Cita();
        String Usuario = "tecmi";
        int Contraseña = 1019;
        System.out.println("Bienvenido Usuario y Contraseña ");

        System.out.println("Usuario");
        aux = sc.nextLine();

        sc.nextLine();
        System.out.println("Contraseña");
        aux2 = sc.nextInt();
        if ((aux.equals(Usuario)) && (aux2 == Contraseña)) {

            do {
                System.out.println(
                        "Bienvenido \n 1-Dar de alta a doctor. \n 2-Dar de alta a paciente \n 3-Hacer cita \n");
                respuesta = sc.nextInt();

                switch (respuesta) {
                    case 1:
                        System.out.println("Dame Nombre de doctor");
                        String NombreDoc = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Marticula del doctor");
                        String MatriculaDoc = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Especialidad de; doctor");
                        String Especialidad = sc.nextLine();

                        sc.nextLine();

                        createNewDoctor(NombreDoc, MatriculaDoc, Especialidad);
                        break;

                    case 2:
                        System.out.println("Dame Nombre de Paciente");
                        String NombreClit = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Matricula de Paciente");
                        String MatriculaClit = sc.nextLine();

                        sc.nextLine();

                        createNewClient(NombreClit, MatriculaClit);
                        
                        
                        break;
                    case 3:
                        System.out.println("Dame Nombre de doctor");
                        String DoctorN = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Dame Nombre de paciente");
                        String PacienteN = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Fecha de la cita");
                        String Fecha = sc.nextLine();

                        sc.nextLine();

                        System.out.println("Hora de la cita");
                        String Hora = sc.nextLine();

                        sc.nextLine();
                        System.out.println("Motivo de la cita");
                        String Motivo = sc.nextLine();

                        sc.nextLine();

                        createNewCita(DoctorN, PacienteN, Fecha, Hora, Motivo);
                        break;
                    case 0:
                        System.out.println("Gracias hasta luego");
                    default:
                        System.out.println("Operacion no valida");
                        break;
                }

            } while (respuesta != 0);
        } else {
            System.out.println("Contraseña o usuario incorrecta ACCESO DENEGADO");
        }

    }

    public static void createNewDoctor(String Nombre, String Matricula, String Especialidad) {
        Doctor p1 = new Doctor(Nombre, Matricula, Especialidad);

        p1.create();
        p1.subido();
        System.out.println("Doctor Creado : " + p1.Auxiliar);
    }

    public static void createNewClient(String Nombre, String Matricula) {
        Cliente p2 = new Cliente(Nombre, Matricula);

        p2.createC();
        p2.subido();
        System.out.println("Cliente Creado : " + p2.AuxiliarC);
    }

    public static void createNewCita(String DoctorCita, String PacienteCita, String Fecha, String Hora,
            String MotivoCita) {
        Cita p3 = new Cita(DoctorCita, PacienteCita, Fecha, Hora, MotivoCita);

        p3.createC();
        p3.addC();
        System.out.println("Cita Creada" + p3.AuxiliarCitas);
    }
}
