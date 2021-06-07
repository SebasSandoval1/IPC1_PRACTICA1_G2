package codgio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Codgio4 {

    //vector de matrices
    public static double [][] vector[];
    public static String vectorNombres[];
    public static String Lineasdocumento[];
    public static int nfilas[];
    public static int ncolumnas[];
    
        public static String getContentOfFile(String pathname) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathname);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String content = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                content += linea + "\n";
            }
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }
        
        //---------------------------------------------------------
    //para agregar contenido (la matriz R) al final del archivo

    public static void addToEndFile(String pathname, String data) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(pathname, true); // True indica que se va a agregar datos al final
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            // Escribe los datos en el archivo
            bfwriter.write(data);
            bfwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //---------------------------------------------------------

    public static void main(String[] args) {

        //menu consola para el usuario
        System.out.println("Bienvenido a nuestro humilde programa");

        //------------------------------------------------
        //usuario ingresa ruta del archivo
        System.out.println("Ingrese la ruta del archivo de matrices");
        String rutaarchivo = new Scanner(System.in).nextLine();
        String content = getContentOfFile(rutaarchivo);

         Lineasdocumento = content.split("\n");

        //vector de matrices y vector de nombres
       
        vectorNombres = new String[Lineasdocumento.length];
        nfilas = new int[Lineasdocumento.length];
        ncolumnas = new int[Lineasdocumento.length];

//asignacion de tamaño matriz y nombres
        for (int i = 0; i < Lineasdocumento.length; i++) {

            String NombreMatriz[] = Lineasdocumento[i].split(":");

            String Nombre = NombreMatriz[0].trim();
            //System.out.println(Nombre);
            String VectorM = NombreMatriz[1].trim();

            String[] filas = VectorM.split(";");
            int ContadorColumnas = filas[0].split(",").length;
            
            nfilas[i] = filas.length;
            ncolumnas[i]=ContadorColumnas;
            vector = new double[Lineasdocumento.length][filas.length][ContadorColumnas];
            vectorNombres[i] = Nombre;

        }

        for (int i = 0; i < Lineasdocumento.length; i++) {

            String NombreMatriz[] = Lineasdocumento[i].split(":");

            String Nombre = NombreMatriz[0].trim();

            String VectorM = NombreMatriz[1].trim();

            String[] filas = VectorM.split(";");
            int ContadorColumnas = filas[0].split(",").length;
            double[][] auxiliar = new double[filas.length][ContadorColumnas];
            System.out.println(Nombre);
            for (int j = 0; j < filas.length; j++) {
                String[] columnas = filas[j].split(",");
                
                for (int k = 0; k < columnas.length; k++) {
                    auxiliar[j][k] = Double.parseDouble(columnas[k]);
                    System.out.print("["+auxiliar[j][k]+"]");
                }
                System.out.println("");
            }
            vector[i] = auxiliar;
        }


        System.out.println("Archivo recibido correctamente!!");

        //------------------------------------------------
        boolean cerrar = true;

        while (cerrar == true) {

            //------------------------------------------------
            System.out.println("============MENU============");
            System.out.println("1. Sumar Matrices");
            System.out.println("2. Restar Matrices");
            System.out.println("3. Multiplicar Matrices");
            System.out.println("4. Dividir Matrices");
            System.out.println("5. Transpuesta de Matriz");
            System.out.println("6. Matriz Inversa");
            System.out.println("7. Potencia de una Matriz");
            System.out.println("8. Determinante de la Matriz");
            System.out.println("9. SALIR");
            System.out.println("============================");

            try {

                Scanner teclado = new Scanner(System.in);
                int opcion; //Opcion del usuario
                System.out.println("Escriba una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("");

                    // sumatoria de dos matrices

                    //-------------------------------------------------

                    //ingreso de la primera matriz a operar

                    Scanner op1 = new Scanner(System.in);
                    String opm1; //Opcion que debe elegir el usuario
                    System.out.println("Ingrese la letra de la primera matriz");
                    opm1 = op1.nextLine();

                    switch (opm1) {

                        case "a": {



                        }

                        case "b": {



                        }
                        case "c": {



                        }

                        case "d": {



                        }

                        case "e": {



                        }

                        case "f": {



                        }

                        case "g": {



                        }

                        case "h": {



                        }

                        case "i": {



                        }

                        case "j": {



                        }

                        case "k": {



                        }

                        case "l": {



                        }

                        case "m": {



                        }

                        case "n": {



                        }

                        case "o": {



                        }

                        case "p": {



                        }

                        case "q": {



                        }

                        case "r": {



                        }

                        case "s": {



                        }

                        case "t": {



                        }

                        case "u": {



                        }

                        case "v": {



                        }

                        case "w": {



                        }

                        case "x": {



                        }

                        case "y": {



                        }

                        case "z": {



                        }
                    }

                    //ingreso de la segunda matriz a operar

                    opm1 = op1.nextLine();

                    switch (opm1) {

                        case "a": {


                        }

                        case "b": {


                        }
                        case "c": {


                        }

                        case "d": {


                        }

                        case "e": {


                        }

                        case "f": {


                        }

                        case "g": {


                        }

                        case "h": {


                        }

                        case "i": {


                        }

                        case "j": {


                        }

                        case "k": {


                        }

                        case "l": {


                        }

                        case "m": {


                        }

                        case "n": {


                        }

                        case "o": {


                        }

                        case "p": {


                        }

                        case "q": {


                        }

                        case "r": {


                        }

                        case "s": {


                        }

                        case "t": {


                        }

                        case "u": {


                        }

                        case "v": {


                        }

                        case "w": {


                        }

                        case "x": {


                        }

                        case "y": {


                        }

                        case "z": {


                        }
                    }

                    /*
                    //impresion de las dos matrices a operar (aun no las anclo)

                    int matrizb = 3;

                    double [][] auxiliar2 = vector[matrizb];
                    System.out.println(vectorNombres[3]);


                    for (int i = 0; i < auxiliar2.length; i++) {
                        for (int j = 0; j < auxiliar2[i].length; j++) {
                            System.out.print("[ "+auxiliar2[i][j]+" ]");
                        }
                        System.out.println(" ");
                    }
                    */

                    //-------------------------------------------

                    /*

                    int[][] mR = new int[m1.length][m2[0].length];
                    
                    //proceso de sumatoria de matrices (ya tiene que estar anidado con la lectura de cada matriz)                    
                    //---------------------------------------------

                    //creación de la matriz resultante y luego impresa en la consola

                    for (int i=0; i < m1.length; i++) {
                        for (int j = 0; j < m2.length; j++) {
                            mR[i][j] = m1[i][j] + m2[i][j];
                        }
                    }

                    System.out.println("La matriz resultante R es: ");
                    for (int i=0; i < mR.length; i++) {
                        for (int j=0; j < mR.length; j++) {
                            System.out.print("[ "+ mR[i][j] + " ]");
                        }
                        System.out.println(" ");
                    }

                    //--------------------------------------------------

                     */
                        
                        break;

                    case 2:

                        System.out.println("Has seleccionado la opcion 2");

                        break;

                    case 3: {

                        System.out.println("Has seleccionado la opcion 3");

                        break;
                    }

                    case 4: {

                        System.out.println("Has seleccionado la opcion 4");

                        break;
                    }

                    case 5: {

                        System.out.println("Has seleccionado la opcion 5");

                        break;
                    }

                    case 6: {

                        System.out.println("Has seleccionado la opcion 6");

                        break;
                    }

                    case 7: {

                        System.out.println("Has seleccionado la opcion 7");

                        break;
                    }

                    case 8: {

                        System.out.println("Has seleccionado la opcion 8");

                        break;
                    }
                    case 9: {

                        cerrar = false;
                        System.out.println("SALIENDO");

                        break;
                    }
                    default:

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
        
        
        
        
    
}



