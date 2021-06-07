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

                            break;
                        }

                        case "b": {

                            break;
                        }
                        case "c": {

                            break;
                        }

                        case "d": {

                            break;
                        }

                        case "e": {

                            break;
                        }

                        case "f": {

                            break;
                        }

                        case "g": {

                            break;
                        }

                        case "h": {

                            break;
                        }

                        case "i": {

                            break;
                        }

                        case "j": {

                            break;
                        }

                        case "k": {

                            break;
                        }

                        case "l": {

                            break;
                        }

                        case "m": {

                            break;
                        }

                        case "n": {

                            break;
                        }

                        case "o": {

                            break;
                        }

                        case "p": {

                            break;
                        }

                        case "q": {

                            break;
                        }

                        case "r": {

                            break;
                        }

                        case "s": {

                            break;
                        }

                        case "t": {

                            break;
                        }

                        case "u": {

                            break;
                        }

                        case "v": {

                            break;
                        }

                        case "w": {

                            break;
                        }

                        case "x": {

                            break;
                        }

                        case "y": {

                            break;
                        }

                        case "z": {

                            break;
                        }
                    }
                    
                    //ingreso de la segunda matriz a operar

                    System.out.println("Ingrese la letra de la segunda matriz: ");
                    opm1 = op1.nextLine();

                    switch (opm1) {

                        case "a": {

                        break;
                        }

                        case "b": {
                            
                        break;
                        }
                        case "c": {
                            
                        break;
                        }

                        case "d": {

                        break;
                        }

                        case "e": {

                        break;
                        }

                        case "f": {

                        break;
                        }

                        case "g": {

                        break;
                        }

                        case "h": {

                        break;
                        }

                        case "i": {

                        break;
                        }

                        case "j": {

                        break;
                        }

                        case "k": {

                        break;
                        }

                        case "l": {

                        break;
                        }

                        case "m": {

                        break;
                        }

                        case "n": {

                        break;
                        }

                        case "o": {

                        break;
                        }

                        case "p": {

                        break;
                        }

                        case "q": {

                        break;
                        }

                        case "r": {

                        break;
                        }

                        case "s": {

                        break;
                        }

                        case "t": {

                        break;
                        }

                        case "u": {

                        break;
                        }

                        case "v": {

                        break;
                        }

                        case "w": {

                        break;
                        }

                        case "x": {

                        break;
                        }

                        case "y": {
                            
                        break;
                        }

                        case "z": {

                        break;
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

                        System.out.println("Has seleccionado la opcion 3: Multiplicación");
                        
                        //submenú de la opción multiplicacion de matrices

                    System.out.println("============MENU MULTIPLICACIÓN============");
                    System.out.println("1. Multiplicar matriz por un número");
                    System.out.println("2. Multiplicar matriz por otra matriz");
                    System.out.println("===========================================");

                    Scanner numeropedido = new Scanner(System.in);
                    int numero; //Opcion que debe elegir el usuario
                    System.out.println("¿Qué operación desea realizar?: ");
                    numero = numeropedido.nextInt();

                    //--------------------------------------------------------------
                    
                     switch (numero) {

                        case 1: {

                            System.out.println("Has seleccionado la opción 1: Matriz por un número");

                            Scanner teclado2 = new Scanner(System.in);
                            int indicenumero; //Opcion que debe elegir el usuario
                            System.out.println("¿Qué operación desea realizar?: ");
                            indicenumero = teclado2.nextInt();

                            int[][] m5 = new int[3][3];
                            m5[0][0] = 1;
                            m5[0][1] = 2;
                            m5[0][2] = 3;
                            m5[1][0] = 4;
                            m5[1][1] = 5;
                            m5[1][2] = 6;
                            m5[2][0] = 7;
                            m5[2][1] = 8;
                            m5[2][2] = 9;

                            int[][] maResul = new int[m5.length][m5[0].length];

                            for (int i=0; i < m5.length; i++) {
                                for (int j = 0; j < m5.length; j++) {
                                    maResul[i][j] = indicenumero * m5[i][j];
                                }
                            }

                            System.out.println("La matriz resultante R es: ");
                            for (int i=0; i < maResul.length; i++) {
                                for (int j=0; j < maResul.length; j++) {
                                    System.out.print("[ "+ maResul[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            break;

                        }

                        case 2: {

                            System.out.println("Has seleccionado la opción 2: Matriz por otra matriz");

                            //multiplicacion de dos matrices propuestas por el usuario

                            int[][] m5 = new int[3][3];
                            m5[0][0] = 1;
                            m5[0][1] = 2;
                            m5[0][2] = 3;
                            m5[1][0] = 4;
                            m5[1][1] = 5;
                            m5[1][2] = 6;
                            m5[2][0] = 7;
                            m5[2][1] = 8;
                            m5[2][2] = 9;

                            int[][] m6 = new int[3][3];
                            m6[0][0] = 9;
                            m6[0][1] = 6;
                            m6[0][2] = 8;
                            m6[1][0] = 1;
                            m6[1][1] = 4;
                            m6[1][2] = 7;
                            m6[2][0] = 2;
                            m6[2][1] = 3;
                            m6[2][2] = 5;

                            int[][] matResultantes = new int[m5.length][m6[0].length];
                            int[][] primerTerR = new int[1][1];
                            int[][] segundoTerR = new int[1][1];
                            int[][] tercerTerR = new int[1][1];
                            int[][] cuartoTerR = new int[1][1];
                            int[][] quintoTerR = new int[1][1];
                            int[][] sextoTerR = new int[1][1];
                            int[][] septTerR = new int[1][1];
                            int[][] octaTerR = new int[1][1];
                            int[][] noveTerR = new int[1][1];

                            //selección de las matrices a operar

                            //---------------------------------------------



                            //---------------------------------------------


                            //creación de la matriz resultante y luego impresa en la consola

                            //---------------------------------------------
                            
                            //creación del primer termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    primerTerR[i][j] = (m5[0][0]*m6[0][0])+(m5[0][1]*m6[1][0])+(m5[0][2]*m6[2][0]);
                                }
                            }

                            //creacion del segundo termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    segundoTerR[i][j] = (m5[0][0]*m6[0][1])+(m5[0][1]*m6[1][1])+(m5[0][2]*m6[2][1]);
                                }
                            }

                            //creacion del tercer termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    tercerTerR[i][j] = (m5[0][0]*m6[0][2])+(m5[0][1]*m6[1][2])+(m5[0][2]*m6[2][2]);
                                }
                            }

                            //creación del cuarto termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    cuartoTerR[i][j] = (m5[1][0]*m6[0][0])+(m5[1][1]*m6[1][0])+(m5[1][2]*m6[2][0]);
                                }
                            }

                            //creación del quinto termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    quintoTerR[i][j] = (m5[1][0]*m6[0][1])+(m5[1][1]*m6[1][1])+(m5[1][2]*m6[2][1]);
                                }
                            }

                            //creación del sexto termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    sextoTerR[i][j] = (m5[1][0]*m6[0][2])+(m5[1][1]*m6[1][2])+(m5[1][2]*m6[2][2]);
                                }
                            }

                            //creación del septimo termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    septTerR[i][j] = (m5[2][0]*m6[0][0])+(m5[2][1]*m6[1][0])+(m5[2][2]*m6[2][0]);
                                }
                            }

                            //creación del octavo termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    octaTerR[i][j] = (m5[2][0]*m6[0][1])+(m5[2][1]*m6[1][1])+(m5[2][2]*m6[2][1]);
                                }
                            }

                            //creación del noveno termino de la matriz resultante

                            for (int i = 0; i < 1; i++) {
                                for (int j = 0; j < 1; j++) {
                                    noveTerR[i][j] = (m5[2][0]*m6[0][2])+(m5[2][1]*m6[1][2])+(m5[2][2]*m6[2][2]);
                                }
                            }

                            //------------------------------------------------------

                            //impresion de cada termino de la matriz resultante

                            System.out.println("El primer termino de la matriz es: ");
                            for (int i=0; i < primerTerR.length; i++) {
                                for (int j=0; j < primerTerR.length; j++) {
                                    //System.out.print("[ "+ primerTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El segundo termino de la matriz es: ");
                            for (int i=0; i < segundoTerR.length; i++) {
                                for (int j=0; j < segundoTerR[0].length; j++) {
                                    //System.out.print("[ "+ segundoTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El tercer termino de la matriz es: ");
                            for (int i=0; i < tercerTerR.length; i++) {
                                for (int j=0; j < tercerTerR[0].length; j++) {
                                    System.out.print("[ "+ tercerTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El cuarto termino de la matriz es: ");
                            for (int i=0; i < cuartoTerR.length; i++) {
                                for (int j=0; j < cuartoTerR[0].length; j++) {
                                    System.out.print("[ "+ cuartoTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El quinto termino de la matriz es: ");
                            for (int i=0; i < quintoTerR.length; i++) {
                                for (int j=0; j < quintoTerR[0].length; j++) {
                                    System.out.print("[ "+ quintoTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El sexto termino de la matriz es: ");
                            for (int i=0; i < sextoTerR.length; i++) {
                                for (int j=0; j < sextoTerR[0].length; j++) {
                                    System.out.print("[ "+ sextoTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El septimo termino de la matriz es: ");
                            for (int i=0; i < septTerR.length; i++) {
                                for (int j=0; j < septTerR[0].length; j++) {
                                    System.out.print("[ "+ septTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El octavo termino de la matriz es: ");
                            for (int i=0; i < octaTerR.length; i++) {
                                for (int j=0; j < octaTerR[0].length; j++) {
                                    System.out.print("[ "+ octaTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            System.out.println("El noveno termino de la matriz es: ");
                            for (int i=0; i < noveTerR.length; i++) {
                                for (int j=0; j < noveTerR[0].length; j++) {
                                    System.out.print("[ "+ noveTerR[i][j] + " ]");
                                }
                                System.out.println(" ");
                            }

                            //impresion de la matriz resultante

                            System.out.println("Matriz Resultante R: ");

                            matResultantes[0][0] = primerTerR[0][0];
                            matResultantes[0][1] = segundoTerR[0][0];
                            matResultantes[0][2] = tercerTerR[0][0];
                            matResultantes[1][0] = cuartoTerR[0][0];
                            matResultantes[1][1] = quintoTerR[0][0];
                            matResultantes[1][2] = sextoTerR[0][0];
                            matResultantes[2][0] = septTerR[0][0];
                            matResultantes[2][1] = octaTerR[0][0];
                            matResultantes[2][2] = noveTerR[0][0];

                            for (int x=0; x < matResultantes.length; x++) {
                                System.out.print("[");
                                for (int y=0; y < matResultantes[x].length; y++) {
                                    System.out.print (matResultantes[x][y]);
                                    if (y!=matResultantes[x].length-1) System.out.print("\t");
                                }
                                System.out.println("]");
                            }

                            //--------------------------------------------------------
                            
                            break;

                        }

                    }

                        break;
                    }

                    case 4: {

                        System.out.println("Has seleccionado la opcion 4");

                        break;
                    }

                    case 5: {

                        System.out.println("Has seleccionado la opcion 5");
                        
                    int[][] m7 = new int[3][3];
                    
                    m7[0][0] = 1;
                    m7[0][1] = 2;
                    m7[0][2] = 3;
                    m7[1][0] = 4;
                    m7[1][1] = 5;
                    m7[1][2] = 6;
                    m7[2][0] = 7;
                    m7[2][1] = 8;
                    m7[2][2] = 9;

                    int[][] matrizT = new int[m7[0].length][m7.length];

                    for (int i=0; i < m7.length; i++) {
                        for (int j=0; j < m7[i].length; j++) {
                            matrizT[j][i] = m7[i][j];
                        }
                    }

                    //se imprime la matriz transpuesta en forma no linealizada

                    System.out.println("La matriz transpuesta es: ");
                    for (int i=0; i < matrizT.length; i++) {
                        for (int j=0; j < matrizT.length; j++) {
                            System.out.print("[ "+ matrizT[i][j] + " ]");
                        }
                        System.out.println(" ");
                    }

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



