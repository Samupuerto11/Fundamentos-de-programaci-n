import java.util.Scanner;

public class T02E03_CondicionAñoBisiesto {
    public void main(String[] args) {
        //declarar variables
        int year; // almacenar año debido a que es mejor no utilizar la ´ñ
        Scanner sc = new Scanner(System.in);
        boolean esBisiesto = false;


        //texto
        System.out.print("Introdusca el año: ");
        year = sc.nextInt();

        //condicion
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
           esBisiesto = true;
        }
        /*if (esBisiesto){
            System.out.println("El año" + year + " es bisiesto");
        }else {
            System.out.println("El año " + year + " no es bisiesto");
        }*/

        System.out.println("El año " + year + (esBisiesto?"": " no") + " es bisiesto");
    sc.close();
    }
}
