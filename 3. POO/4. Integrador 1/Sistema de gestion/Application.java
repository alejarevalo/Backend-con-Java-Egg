import java.util.Arrays;
import java.util.Scanner;

public class Application {
    static Empleado[] empleados = new Empleado[0];
    static Empleado[] empleadosFiltrados = new Empleado[0];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Empleado myEmpleado = new Empleado();

        // myEmpleado.setNombre("Pedro");
        // myEmpleado.setEdad(25);
        // myEmpleado.setSalario(960000.30);
        // myEmpleado.setDepartamento("Mesa de Entradas");

        // System.out.println(myEmpleado.getNombre());
        // System.out.println(myEmpleado.getEdad());
        // System.out.println(myEmpleado.getSalario());
        // System.out.println(myEmpleado.getDepartamento());

        int opc;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Elija una opción");
            System.out.println("1. Crear empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados ");
            System.out.println("5. Incrementar salario ");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1 -> {
                    System.out.println("Crear empleado");
                    creaEmpleado();

                }
                case 2 -> {
                    System.out.println("Mostrar todos los empleados");
                    mostarEmpleados(empleados);
                }
                case 3 -> {
                    System.out.println("filtrar empleados");
                    filtrarEmpleados();

                }
                case 4 -> {
                    System.out.println("Ordenar empleados");
                }
                case 5 -> {
                    System.out.println("Incrementar salario");
                }
                case 6 -> {
                    System.out.println("Limpiar filtros");
                }
                case 7 -> {
                    System.out.println("Saliendo del programa");
                }

                default -> {
                    System.out.println("Ingrese una opción valida");
                }
            }
        } while (opc != 7);

    }

    public static void creaEmpleado() {
        Empleado myEmpleado = new Empleado();
        System.out.println("Ingrese el Nombre del Empleado: ");
        String nomString = scanner.nextLine();
        System.out.println("Ingrese la Edad: ");
        int edadInt = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese Salario: ");
        double salarioDouble = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el Departamento de Trabajo: ");
        String depaString = scanner.nextLine();
        if (buscarEmpleado(nomString) == -1) {
            myEmpleado.setNombre(nomString);
            myEmpleado.setEdad(edadInt);
            myEmpleado.setSalario(salarioDouble);
            myEmpleado.setDepartamento(depaString);
            empleados = Arrays.copyOf(empleados, empleados.length + 1);
            empleados[empleados.length - 1] = myEmpleado;
        } else {
            System.out.println("El Empleado ya Existe!!!");
        }

    }

    public static void mostarEmpleados(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            empleado.imprimirEmpleados();
        }
    }

    // public static void filtrarEmpleados() {

    // int opc;

    // System.out.println("Filtros:");
    // System.out.println("1- Nombre");
    // System.out.println("2- Edad");
    // System.out.println("3- Salario");
    // System.out.println("4- Departamento");
    // System.out.println("0- No aniadir mas filtros");
    // System.out.println("Elegir Filtro: ");
    // opc = scanner.nextInt();
    // scanner.nextLine();

    // switch (opc) {
    // case 1:
    // System.out.println("Ingresa Nombre: ");
    // String nombre01 = scanner.nextLine();
    // int index = buscarEmpleado(nombre01);
    // empleadosFiltrados = Arrays.copyOf(empleadosFiltrados,
    // empleadosFiltrados.length + 1);
    // empleadosFiltrados[empleadosFiltrados.length - 1] = empleados[index];
    // mostarEmpleados(empleadosFiltrados);
    // break;

    // default:
    // break;
    // }

    // }

    public static void filtrarEmpleados() {
        int filt;

        System.out.println("Elija un filtro");
        System.out.println("1. Nombre ");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        System.out.println("5. Salir");
        filt = scanner.nextInt();
        scanner.nextLine();
        switch (filt) {
            case 1:
                System.out.println("Ingresa el nombre");
                String nombre = scanner.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getNombre().contains(nombre)) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
                imprimirEmpleados(empleadosFiltrados);

                break;
            case 2:
                System.out.println("Ingrese un salario maximo");
                int edadMax = scanner.nextInt();
                System.out.println("Ingrese un salario minimo ");
                int edadMin = scanner.nextInt();
                for (Empleado empleado : empleados) {
                    if (empleado.getEdad() > edadMin && empleado.getEdad() < edadMax) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
                imprimirEmpleados(empleadosFiltrados);
                break;
            case 3:
                System.out.println("Ingrese una edad maximo");
                int salMax = scanner.nextInt();
                System.out.println("Ingrese una edad minimo");
                int salMin = scanner.nextInt();
                for (Empleado empleado : empleados) {
                    if (empleado.getEdad() > salMax && empleado.getEdad() < salMin) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
                imprimirEmpleados(empleadosFiltrados);
                break;
            case 4:
                System.out.println("Ingresa el departamento");
                String departamento = scanner.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getDepartamento().contains(departamento)) {
                        empleadosFiltrados = Arrays.copyOf(empleadosFiltrados, empleadosFiltrados.length + 1);
                        empleadosFiltrados[empleadosFiltrados.length - 1] = empleado;
                    }
                }
                imprimirEmpleados(empleadosFiltrados);

                break;
            default:
                break;
        }

    }

    public static int buscarEmpleado(String nombre) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;

    }
}