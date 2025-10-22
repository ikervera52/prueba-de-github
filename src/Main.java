import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final private static Scanner sc = new Scanner(System.in);
    public static String cadena;
    public static void main(String[] args) {

        boolean error;
        do {

            error = true;

            try {
                opciones();
                error = false;
            }

            catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("** El valor tiene que ser un numero **");
            }

            catch (DateTimeParseException ex){
                sc.nextLine();
                System.out.println("** La fecha tiene que ser en formato dd/MM/yyyy **");
            }

            catch (NumberFormatException ex){
                sc.nextLine();
                System.out.println("** La cadena tiene que ser numérica y de números enteros **");
            }

            catch (StringIndexOutOfBoundsException ex){
                sc.nextLine();
                System.out.println("** El numero tiene que ser positivo y del 1 al " + cadena.length() + " **");
            }

            catch (NullPointerException ex){
                sc.nextLine();
                System.out.println("** ¿Has introducido la cena en la opción 1? **");
            }

            catch (Exception e) {
                sc.nextLine();
                System.out.println("** Error: " + e.getClass() + " **");
            }

        }while (error);
    }

    public static void opciones () {

        System.out.println("""
                --Menú de opciones--\s
                1. solicitar una cadena de caracteres\s
                2. Visualizar el carácter de la posición x de una cadena de caracteres\s
                3. Convertir la cadena de caracteres en un número entero\s
                4. Convertir la cadena de caracteres en una fecha\s
                5. Finalizar""");
        System.out.print("Que quieres hacer: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                solicitarCadena();
                break;
            case 2:
                visualizarCaracter();
                break;
            case 3:
                convertiranumero();
                break;
            case 4:
                covertirafecha();
                break;
            case 5:
                finalizar();
                break;
        }

    }
}