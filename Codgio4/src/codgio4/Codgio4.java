package codgio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Codgio4 {

    //vector de matrices
    public static double[][] vector[];
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
        System.out.println("");

        //------------------------------------------------
        //usuario ingresa ruta del archivo
        System.out.println("Ingrese la ruta del archivo de matrices");
        String rutaarchivo = new Scanner(System.in).nextLine();
        String content = getContentOfFile(rutaarchivo);

        Lineasdocumento = content.split("\n");

        //vector de matrices y vector de nombres
        vectorNombres = new String[26];
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
            ncolumnas[i] = ContadorColumnas;
            vector = new double[26][filas.length][ContadorColumnas];
            //vectorNombres[i] = Nombre;

            switch (Nombre) {

                case "A":
                    vectorNombres[0] = Nombre;
                    ;
                    break;
                case "B":
                    vectorNombres[1] = Nombre;
                    ;
                    break;
                case "C":
                    vectorNombres[2] = Nombre;
                    ;
                    break;
                case "D":
                    vectorNombres[3] = Nombre;
                    ;
                    break;
                case "E":
                    vectorNombres[4] = Nombre;
                    ;
                    break;
                case "F":
                    vectorNombres[5] = Nombre;
                    ;
                    break;
                case "G":
                    vectorNombres[6] = Nombre;
                    ;
                    break;
                case "H":
                    vectorNombres[7] = Nombre;
                    ;
                    break;
                case "I":
                    vectorNombres[8] = Nombre;
                    ;
                    break;
                case "J":
                    vectorNombres[9] = Nombre;
                    ;
                    break;
                case "K":
                    vectorNombres[10] = Nombre;
                    ;
                    break;
                case "L":
                    vectorNombres[11] = Nombre;
                    ;
                    break;
                case "M":
                    vectorNombres[12] = Nombre;
                    ;
                    break;
                case "N":
                    vectorNombres[13] = Nombre;
                    ;
                    break;
                case "O":
                    vectorNombres[14] = Nombre;
                    ;
                    break;
                case "P":
                    vectorNombres[15] = Nombre;
                    ;
                    break;
                case "Q":
                    vectorNombres[16] = Nombre;
                    ;
                    break;
                case "R":
                    vectorNombres[17] = Nombre;
                    ;
                    break;
                case "S":
                    vectorNombres[18] = Nombre;
                    ;
                    break;
                case "T":
                    vectorNombres[19] = Nombre;
                    ;
                    break;
                case "U":
                    vectorNombres[20] = Nombre;
                    ;
                    break;
                case "V":
                    vectorNombres[21] = Nombre;
                    ;
                    break;
                case "W":
                    vectorNombres[22] = Nombre;
                    ;
                    break;
                case "X":
                    vectorNombres[23] = Nombre;
                    ;
                    break;
                case "Y":
                    vectorNombres[24] = Nombre;
                    ;
                    break;
                case "Z":
                    vectorNombres[25] = Nombre;
                    ;
                    break;
                default:
                    System.out.println("Letra no valida");
                    ;
                    break;
            }

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
                    System.out.print("[" + auxiliar[j][k] + "]");
                }
                System.out.println("");
            }

            switch (Nombre) {

                case "A":
                    vector[0] = auxiliar;
                    ;
                    break;
                case "B":
                    vector[1] = auxiliar;
                    ;
                    break;
                case "C":
                    vector[2] = auxiliar;
                    ;
                    break;
                case "D":
                    vector[3] = auxiliar;
                    ;
                    break;
                case "E":
                    vector[4] = auxiliar;
                    ;
                    break;
                case "F":
                    vector[5] = auxiliar;
                    ;
                    break;
                case "G":
                    vector[6] = auxiliar;
                    ;
                    break;
                case "H":
                    vector[7] = auxiliar;
                    ;
                    break;
                case "I":
                    vector[8] = auxiliar;
                    ;
                    break;
                case "J":
                    vector[9] = auxiliar;
                    ;
                    break;
                case "K":
                    vector[10] = auxiliar;
                    ;
                    break;
                case "L":
                    vector[11] = auxiliar;
                    ;
                    break;
                case "M":
                    vector[12] = auxiliar;
                    ;
                    break;
                case "N":
                    vector[13] = auxiliar;
                    ;
                    break;
                case "O":
                    vector[14] = auxiliar;
                    ;
                    break;
                case "P":
                    vector[15] = auxiliar;
                    ;
                    break;
                case "Q":
                    vector[16] = auxiliar;
                    ;
                    break;
                case "R":
                    vector[17] = auxiliar;
                    ;
                    break;
                case "S":
                    vector[18] = auxiliar;
                    ;
                    break;
                case "T":
                    vector[19] = auxiliar;
                    ;
                    break;
                case "U":
                    vector[20] = auxiliar;
                    ;
                    break;
                case "V":
                    vector[21] = auxiliar;
                    ;
                    break;
                case "W":
                    vector[22] = auxiliar;
                    ;
                    break;
                case "X":
                    vector[23] = auxiliar;
                    ;
                    break;
                case "Y":
                    vector[24] = auxiliar;
                    ;
                    break;
                case "Z":
                    vector[25] = auxiliar;
                    ;
                    break;
                default:
                    System.out.println("no valida");
                    ;
                    break;
            }
            //vector[i] = auxiliar;
        }

        System.out.println("Archivo recibido correctamente!!");
        System.out.println("");

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

                        System.out.println("Bienvenido Suma de Matrices");

                        boolean confirmarsuma=true;
                        
                        while(confirmarsuma==true){

                       

                        System.out.println("Ingrese Matriz 1:");
                        String Nombrematriz1parasuma;
                        Nombrematriz1parasuma = teclado.next();
                        
                        int posicion = 0;

                        switch (Nombrematriz1parasuma) {

                            case "A":
                                posicion = 0;
                                break;
                            case "B":
                                posicion = 1;
                                break;
                            case "C":
                                posicion = 2;
                                break;
                            case "D":
                                posicion = 3;
                                break;
                            case "E":
                                posicion = 4;
                                break;
                            case "F":
                                posicion = 5;
                                break;
                            case "G":
                                posicion = 6;
                                break;
                            case "H":
                                posicion = 7;
                                break;
                            case "I":
                                posicion = 8;
                                break;
                            case "J":
                                posicion = 9;
                                break;
                            case "K":
                                posicion = 10;
                                break;
                            case "L":
                                posicion = 11;
                                break;
                            case "M":
                                posicion = 12;
                                break;
                            case "N":
                                posicion = 13;
                                break;
                            case "O":
                                posicion = 14;
                                break;
                            case "P":
                                posicion = 15;
                                break;
                            case "Q":
                                posicion = 16;
                                break;
                            case "R":
                                posicion = 17;
                                break;
                            case "S":
                                posicion = 18;
                                break;
                            case "T":
                                posicion = 19;
                                break;
                            case "U":
                                posicion = 20;
                                break;
                            case "V":
                                posicion = 21;
                                break;
                            case "W":
                                posicion = 22;
                                break;
                            case "X":
                                posicion = 23;
                                break;
                            case "Y":
                                posicion = 24;
                                break;
                            case "Z":
                                posicion = 25;
                                break;

                        }                      
                               double [][] matrizs = vector[posicion];  
                               
                                                       
                            
                            
                            System.out.println("Ingrese Matriz 2:");
                            String Nombrematriz1parasuma2;
                        Nombrematriz1parasuma2 = teclado.next();
                        int posicion2 = 0;

                        switch (Nombrematriz1parasuma2) {

                            case "A":
                                posicion2 = 0;
                                break;
                            case "B":
                                posicion2 = 1;
                                break;
                            case "C":
                                posicion2 = 2;
                                break;
                            case "D":
                                posicion2 = 3;
                                break;
                            case "E":
                                posicion2 = 4;
                                break;
                            case "F":
                                posicion2 = 5;
                                break;
                            case "G":
                                posicion2 = 6;
                                break;
                            case "H":
                                posicion2 = 7;
                                break;
                            case "I":
                                posicion2 = 8;
                                break;
                            case "J":
                                posicion2 = 9;
                                break;
                            case "K":
                                posicion2 = 10;
                                break;
                            case "L":
                                posicion2 = 11;
                                break;
                            case "M":
                                posicion2 = 12;
                                break;
                            case "N":
                                posicion2 = 13;
                                break;
                            case "O":
                                posicion2 = 14;
                                break;
                            case "P":
                                posicion2 = 15;
                                break;
                            case "Q":
                                posicion2 = 16;
                                break;
                            case "R":
                                posicion2 = 17;
                                break;
                            case "S":
                                posicion2 = 18;
                                break;
                            case "T":
                                posicion2 = 19;
                                break;
                            case "U":
                                posicion2 = 20;
                                break;
                            case "V":
                                posicion2 = 21;
                                break;
                            case "W":
                                posicion2 = 22;
                                break;
                            case "X":
                                posicion2 = 23;
                                break;
                            case "Y":
                                posicion2 = 24;
                                break;
                            case "Z":
                                posicion2 = 25;
                                break;

                        }                      
                                                                                                            
                                                       
                            double [][] matrizs2 = vector[posicion2];
                        
                               int [][] resultadosuma = new int[matrizs.length][matrizs2[0].length];
                               
                               if(matrizs.length == matrizs2.length && matrizs[0].length == matrizs2[0].length)
                               {
                                   
                            for (int x=0; x < matrizs.length; x++) {
                                for (int y=0; y < matrizs[x].length; y++) {				
                                    resultadosuma[x][y]= (int) (matrizs[x][y]+ matrizs2[x][y]);
                                    
                            }
                                }
                               
                            System.out.println("Resultado de la suma");
                for (int x=0; x < resultadosuma.length; x++) {
                             for (int y=0; y < resultadosuma[x].length; y++) {
                                     
                                            System.out.print(" ["+resultadosuma[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                       }
                                          confirmarsuma = false; 
                                           
                               }
                               if(matrizs.length != matrizs2.length || matrizs[0].length != matrizs2[0].length)
                               {
                                   System.out.println("Matricez no compatibles por diferencias en dimensiones");
                                   System.out.println("Ingresar nuevamente los nombres de las matrices a sumar");
                               }
                               }
                        break;

                    case 2:

                         System.out.println("Bienvenido A Resta de Matrices");
                        
                        boolean confirmarsresta=true;
                        
                        while(confirmarsresta==true){
                        
                        
                        
                        System.out.println("Ingrese Matriz 1:");
                        String Nombrematriz1pararesta;
                        Nombrematriz1pararesta = teclado.next();
                        
                        int posicionresta1 = 0;

                        switch (Nombrematriz1pararesta) {

                            case "A":
                                posicionresta1 = 0;
                                break;
                            case "B":
                                posicionresta1 = 1;
                                break;
                            case "C":
                                posicionresta1 = 2;
                                break;
                            case "D":
                                posicionresta1 = 3;
                                break;
                            case "E":
                                posicionresta1 = 4;
                                break;
                            case "F":
                                posicionresta1 = 5;
                                break;
                            case "G":
                                posicionresta1 = 6;
                                break;
                            case "H":
                                posicionresta1 = 7;
                                break;
                            case "I":
                                posicionresta1 = 8;
                                break;
                            case "J":
                                posicionresta1 = 9;
                                break;
                            case "K":
                                posicionresta1 = 10;
                                break;
                            case "L":
                                posicionresta1 = 11;
                                break;
                            case "M":
                                posicionresta1 = 12;
                                break;
                            case "N":
                                posicionresta1 = 13;
                                break;
                            case "O":
                                posicionresta1 = 14;
                                break;
                            case "P":
                                posicionresta1 = 15;
                                break;
                            case "Q":
                                posicionresta1 = 16;
                                break;
                            case "R":
                                posicionresta1 = 17;
                                break;
                            case "S":
                                posicionresta1 = 18;
                                break;
                            case "T":
                                posicionresta1 = 19;
                                break;
                            case "U":
                                posicionresta1 = 20;
                                break;
                            case "V":
                                posicionresta1 = 21;
                                break;
                            case "W":
                                posicionresta1 = 22;
                                break;
                            case "X":
                                posicionresta1 = 23;
                                break;
                            case "Y":
                                posicionresta1 = 24;
                                break;
                            case "Z":
                                posicionresta1 = 25;
                                break;

                        }                      
                               double [][] matrizr = vector[posicionresta1];  
                               
                                                       
                            
                            
                            System.out.println("Ingrese Matriz 2:");
                            String Nombrematriz1pararesta2;
                        Nombrematriz1pararesta2 = teclado.next();
                        int posicionresta2 = 0;

                        switch (Nombrematriz1pararesta2) {

                            case "A":
                                posicionresta2 = 0;
                                break;
                            case "B":
                                posicionresta2 = 1;
                                break;
                            case "C":
                                posicionresta2 = 2;
                                break;
                            case "D":
                                posicionresta2 = 3;
                                break;
                            case "E":
                                posicionresta2 = 4;
                                break;
                            case "F":
                                posicionresta2 = 5;
                                break;
                            case "G":
                                posicionresta2 = 6;
                                break;
                            case "H":
                                posicionresta2 = 7;
                                break;
                            case "I":
                                posicionresta2 = 8;
                                break;
                            case "J":
                                posicionresta2 = 9;
                                break;
                            case "K":
                                posicionresta2 = 10;
                                break;
                            case "L":
                                posicionresta2 = 11;
                                break;
                            case "M":
                                posicionresta2 = 12;
                                break;
                            case "N":
                                posicionresta2 = 13;
                                break;
                            case "O":
                                posicionresta2 = 14;
                                break;
                            case "P":
                                posicionresta2 = 15;
                                break;
                            case "Q":
                                posicionresta2 = 16;
                                break;
                            case "R":
                                posicionresta2 = 17;
                                break;
                            case "S":
                                posicionresta2 = 18;
                                break;
                            case "T":
                                posicionresta2 = 19;
                                break;
                            case "U":
                                posicionresta2 = 20;
                                break;
                            case "V":
                                posicionresta2 = 21;
                                break;
                            case "W":
                                posicionresta2 = 22;
                                break;
                            case "X":
                                posicionresta2 = 23;
                                break;
                            case "Y":
                                posicionresta2 = 24;
                                break;
                            case "Z":
                                posicionresta2 = 25;
                                break;

                        }                      
                                                                                                            
                                                       
                            double [][] matrizr2 = vector[posicionresta2];

                               int [][] resultadoresta = new int[matrizr.length][matrizr2[0].length];
                             if(matrizr.length == matrizr2.length && matrizr[0].length == matrizr2[0].length)
                             {
                            for (int x=0; x < matrizr.length; x++) {
                                for (int y=0; y < matrizr[x].length; y++) {				
                                    resultadoresta[x][y]= (int) (matrizr[x][y]- matrizr2[x][y]);								
                            }
                                }
                            System.out.println("Resultado de la resta");
                for (int x=0; x < resultadoresta.length; x++) {
                             for (int y=0; y < resultadoresta[x].length; y++) {
                                     
                                            System.out.print(" ["+resultadoresta[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }
                confirmarsresta = false;
                
                        }
                            if (matrizr.length != matrizr2.length || matrizr[0].length != matrizr2[0].length) {
                                System.out.println("Matricez no compatibles por diferencias en dimensiones");
                                System.out.println("Ingrese nuevamente los nombres de las matrices a restar");
                            }
                        }
                        
                        break;

                    case 3: System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Tipo de multiplicacion deseada:");
                            System.out.println("1)Matriz x Valor Numerico");
                            System.out.println("2)Matriz x Matriz");
                            System.out.println("3)Salir");
                            int opciondem = teclado.nextInt();
                        boolean salirmulti = false;
                        
                        while(salirmulti == false){
                        
                        
                            
                            
                        if (opciondem==1) {
                            
                            
                            
                            System.out.println("Ingrese Matriz 1:");
                        String nombrematrizv;
                        nombrematrizv = teclado.next();
                        
                        int posicionmulti = 0;

                        switch (nombrematrizv) {

                            case "A":
                                posicionmulti = 0;
                                break;
                            case "B":
                                posicionmulti = 1;
                                break;
                            case "C":
                                posicionmulti = 2;
                                break;
                            case "D":
                                posicionmulti = 3;
                                break;
                            case "E":
                                posicionmulti = 4;
                                break;
                            case "F":
                                posicionmulti = 5;
                                break;
                            case "G":
                                posicionmulti = 6;
                                break;
                            case "H":
                                posicionmulti = 7;
                                break;
                            case "I":
                                posicionmulti = 8;
                                break;
                            case "J":
                                posicionmulti = 9;
                                break;
                            case "K":
                                posicionmulti = 10;
                                break;
                            case "L":
                                posicionmulti = 11;
                                break;
                            case "M":
                                posicionmulti = 12;
                                break;
                            case "N":
                                posicionmulti = 13;
                                break;
                            case "O":
                                posicionmulti = 14;
                                break;
                            case "P":
                                posicionmulti = 15;
                                break;
                            case "Q":
                                posicionmulti = 16;
                                break;
                            case "R":
                                posicionmulti = 17;
                                break;
                            case "S":
                                posicionmulti = 18;
                                break;
                            case "T":
                                posicionmulti = 19;
                                break;
                            case "U":
                                posicionmulti = 20;
                                break;
                            case "V":
                                posicionmulti = 21;
                                break;
                            case "W":
                                posicionmulti = 22;
                                break;
                            case "X":
                                posicionmulti = 23;
                                break;
                            case "Y":
                                posicionmulti = 24;
                                break;
                            case "Z":
                                posicionmulti = 25;
                                break;

                        }                      
                               double [][] matrizv = vector[posicionmulti];
                               
                            /*for (int i = 0; i < matriz1.length; i++) {
                                for (int j = 0; j < matriz1[0].length; j++) {
                                    System.out.println(""+matriz1[i][j]);
                                }
                            }*/
                            
                            System.out.println("Ingrese Valor Numerico");
                            double valor = teclado.nextDouble();
                            
                            
                            double matrizresultadov[][]= new double[matrizv.length][matrizv[0].length];
                            System.out.println("");
                            
                         for (int i=0; i < matrizresultadov.length; i++) {
                        for (int j=0; j < matrizresultadov[i].length; j++) {
                         matrizresultadov[i][j] = valor * matrizv[i][j];
                                        }
                                    }
                            System.out.println("Resultado");
                         for (int x=0; x < matrizresultadov.length; x++) {
                             for (int y=0; y < matrizresultadov[x].length; y++) {
                                     
                                            System.out.print(" ["+matrizresultadov[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                          
                        }}
                        if (opciondem==2) {
                            
  
                           
                            
                            
                            
                            System.out.println("Ingrese Matriz 1:");
                        String nombrematriz1;
                        nombrematriz1 = teclado.next();
                        
                        int posicionmulti2 = 0;

                        switch (nombrematriz1) {

                            case "A":
                                posicionmulti2 = 0;
                                break;
                            case "B":
                                posicionmulti2 = 1;
                                break;
                            case "C":
                                posicionmulti2 = 2;
                                break;
                            case "D":
                                posicionmulti2 = 3;
                                break;
                            case "E":
                                posicionmulti2 = 4;
                                break;
                            case "F":
                                posicionmulti2 = 5;
                                break;
                            case "G":
                                posicionmulti2 = 6;
                                break;
                            case "H":
                                posicionmulti2 = 7;
                                break;
                            case "I":
                                posicionmulti2 = 8;
                                break;
                            case "J":
                                posicionmulti2 = 9;
                                break;
                            case "K":
                                posicionmulti2 = 10;
                                break;
                            case "L":
                                posicionmulti2 = 11;
                                break;
                            case "M":
                                posicionmulti2 = 12;
                                break;
                            case "N":
                                posicionmulti2 = 13;
                                break;
                            case "O":
                                posicionmulti2 = 14;
                                break;
                            case "P":
                                posicionmulti2 = 15;
                                break;
                            case "Q":
                                posicionmulti2 = 16;
                                break;
                            case "R":
                                posicionmulti2 = 17;
                                break;
                            case "S":
                                posicionmulti2 = 18;
                                break;
                            case "T":
                                posicionmulti2 = 19;
                                break;
                            case "U":
                                posicionmulti2 = 20;
                                break;
                            case "V":
                                posicionmulti2 = 21;
                                break;
                            case "W":
                                posicionmulti2 = 22;
                                break;
                            case "X":
                                posicionmulti2 = 23;
                                break;
                            case "Y":
                                posicionmulti2 = 24;
                                break;
                            case "Z":
                                posicionmulti2 = 25;
                                break;

                        }                      
                               double [][] matriz1 = vector[posicionmulti2];
                           /* for (int x=0; x < matriz1.length; x++) {
                             for (int y=0; y < matriz1[x].length; y++) {
                                     
                                            System.out.print(" ["+matriz1[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }
                           */
                            
                            
                             System.out.println("Ingrese Matriz 2:");
                        String nombrematriz2;
                        nombrematriz2 = teclado.next();
                        
                        int posicionmulti3 = 0;

                        switch (nombrematriz2) {

                            case "A":
                                posicionmulti3 = 0;
                                break;
                            case "B":
                                posicionmulti3 = 1;
                                break;
                            case "C":
                                posicionmulti3 = 2;
                                break;
                            case "D":
                                posicionmulti3 = 3;
                                break;
                            case "E":
                                posicionmulti3 = 4;
                                break;
                            case "F":
                                posicionmulti3 = 5;
                                break;
                            case "G":
                                posicionmulti3 = 6;
                                break;
                            case "H":
                                posicionmulti3 = 7;
                                break;
                            case "I":
                                posicionmulti3 = 8;
                                break;
                            case "J":
                                posicionmulti3 = 9;
                                break;
                            case "K":
                                posicionmulti3 = 10;
                                break;
                            case "L":
                                posicionmulti3 = 11;
                                break;
                            case "M":
                                posicionmulti3 = 12;
                                break;
                            case "N":
                                posicionmulti3 = 13;
                                break;
                            case "O":
                                posicionmulti3 = 14;
                                break;
                            case "P":
                                posicionmulti3 = 15;
                                break;
                            case "Q":
                                posicionmulti3 = 16;
                                break;
                            case "R":
                                posicionmulti3 = 17;
                                break;
                            case "S":
                                posicionmulti3 = 18;
                                break;
                            case "T":
                                posicionmulti3 = 19;
                                break;
                            case "U":
                                posicionmulti3 = 20;
                                break;
                            case "V":
                                posicionmulti3 = 21;
                                break;
                            case "W":
                                posicionmulti3 = 22;
                                break;
                            case "X":
                                posicionmulti3 = 23;
                                break;
                            case "Y":
                                posicionmulti3 = 24;
                                break;
                            case "Z":
                                posicionmulti3 = 25;
                                break;

                        }                      
                               double [][] matriz2 = vector[posicionmulti3];
                               /*
                               for (int x=0; x < matriz2.length; x++) {
                             for (int y=0; y < matriz2[x].length; y++) {
                                     
                                            System.out.print(" ["+matriz2[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }
                               */
                            /*for (int i = 0; i < matriz2.length; i++) {
                                for (int j = 0; j < matriz2[0].length; j++) {
                                    System.out.println(""+matriz2[i][j]);
                                }
                            }*/
                            
                            int matrizresultado[][]= new int[matriz1.length][matriz2[0].length];
                            System.out.println("");
                            
                          if (matriz1[0].length == matriz2.length) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    // aquí se multiplica la matriz
                    matrizresultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                
            }
            
        }
        for (int x=0; x < matrizresultado.length; x++) {
                             for (int y=0; y < matrizresultado[x].length; y++) {
                                     
                                            System.out.print(" ["+matrizresultado[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }
        
                          }
                          if(matriz1[0].length != matriz2.length){System.out.println("Dimensiones no compatibles");}
                          
                        }
                            if (opciondem==3) {
                                salirmulti = true;
                            }
                        
                        
                        
                        
                        
                        break;
                        }

                    case 4: {

                        System.out.println("Has seleccionado la opcion 4: División de matrices");

                        break;
                    }

                    case 5: {

                        System.out.println("Has seleccionado la opcion 5: Transpuesta de una matriz");

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

                        for (int i = 0; i < m7.length; i++) {
                            for (int j = 0; j < m7[i].length; j++) {
                                matrizT[j][i] = m7[i][j];
                            }
                        }

                        //se imprime la matriz transpuesta en forma no linealizada
                        System.out.println("La matriz transpuesta es: ");
                        for (int i = 0; i < matrizT.length; i++) {
                            for (int j = 0; j < matrizT.length; j++) {
                                System.out.print("[ " + matrizT[i][j] + " ]");
                            }
                            System.out.println(" ");
                        }

                        break;
                    }

                    case 6: {

                        System.out.println("Has seleccionado la opcion 6: Matriz Inversa");
                        System.out.println("");

                        Scanner multi = new Scanner(System.in);
                        String letra;
                        DecimalFormat df = new DecimalFormat("#.00");

                        double Matriz3x3[][] = new double[3][3];
                        double Matriz2x2[][] = new double[2][2];
                        double determinante;
                        double inversadet;
                        double Matrizad[][] = new double[3][3];
                        double Trasad[][] = new double[3][3];
                        double R[][] = new double[3][3];
                        System.out.println("Ingrese la matriz para encontrar su inversa: ");
                        letra = multi.nextLine();
                        int posicion = 0;

                        switch (letra) {

                            case "A":
                                posicion = 0;
                                break;
                            case "B":
                                posicion = 1;
                                break;
                            case "C":
                                posicion = 2;
                                break;
                            case "D":
                                posicion = 3;
                                break;
                            case "E":
                                posicion = 4;
                                break;
                            case "F":
                                posicion = 5;
                                break;
                            case "G":
                                posicion = 6;
                                break;
                            case "H":
                                posicion = 7;
                                break;
                            case "I":
                                posicion = 8;
                                break;
                            case "J":
                                posicion = 9;
                                break;
                            case "K":
                                posicion = 10;
                                break;
                            case "L":
                                posicion = 11;
                                break;
                            case "M":
                                posicion = 12;
                                break;
                            case "N":
                                posicion = 13;
                                break;
                            case "O":
                                posicion = 14;
                                break;
                            case "P":
                                posicion = 15;
                                break;
                            case "Q":
                                posicion = 16;
                                break;
                            case "R":
                                posicion = 17;
                                break;
                            case "S":
                                posicion = 18;
                                break;
                            case "T":
                                posicion = 19;
                                break;
                            case "U":
                                posicion = 20;
                                break;
                            case "V":
                                posicion = 21;
                                break;
                            case "W":
                                posicion = 22;
                                break;
                            case "X":
                                posicion = 23;
                                break;
                            case "Y":
                                posicion = 24;
                                break;
                            case "Z":
                                posicion = 25;
                                break;

                        }

                        double[][] matrmul = vector[posicion];

                        //tamaño de la matriz
                        int u = 0;
                        int v = 0;
                        double k;
                        for (int i = 0; i < matrmul.length; i++) {
                            u++;

                            for (int j = 0; j < matrmul[i].length; j++) {
                                v++;

                            }
                        }
                        k = v / u;

                        //comprobacion de que es 3x3 cuadrada
                        if (v / u == 3) {
                            System.out.println(vectorNombres[posicion]);

                            //Matriz3x3____________________________________________________________________________________________________//
                            System.out.println("Matriz original");
                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    Matriz3x3[i][j] = matrmul[i][j];

                                }

                            }
                            System.out.println("");
                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    System.out.print("[" + Matriz3x3[i][j] + "]");

                                }
                                System.out.println("");
                            }
                            System.out.println("");

                            //determinante de la matriz 
                            System.out.println("Determinante");
                            determinante = (Matriz3x3[0][0] * Matriz3x3[1][1] * Matriz3x3[2][2]) + (Matriz3x3[0][1] * Matriz3x3[1][2] * Matriz3x3[2][0]) + (Matriz3x3[0][2] * Matriz3x3[1][0] * Matriz3x3[2][1]) - ((Matriz3x3[0][2] * Matriz3x3[1][1] * Matriz3x3[2][0]) + (Matriz3x3[0][0] * Matriz3x3[1][2] * Matriz3x3[2][1]) + (Matriz3x3[0][1] * Matriz3x3[1][0] * Matriz3x3[2][2]));
                            System.out.println(determinante);
                            System.out.println("");

                            //inversa determinante
                            System.out.println("Determinante Inverso");
                            inversadet = 1 / determinante;
                            System.out.println(df.format(inversadet));
                            System.out.println("");

                            //matriz adjunta
                            System.out.println("Matriz adjunta");
                            Matrizad[0][0] = (Matriz3x3[1][1] * Matriz3x3[2][2]) - (Matriz3x3[1][2] * Matriz3x3[2][1]);
                            Matrizad[0][1] = ((Matriz3x3[1][2] * Matriz3x3[2][0]) - (Matriz3x3[1][0] * Matriz3x3[2][2]));
                            Matrizad[0][2] = (Matriz3x3[1][0] * Matriz3x3[2][1]) - (Matriz3x3[1][1] * Matriz3x3[2][0]);
                            Matrizad[1][0] = ((Matriz3x3[0][2] * Matriz3x3[2][1]) - (Matriz3x3[0][1] * Matriz3x3[2][2]));
                            Matrizad[1][1] = (Matriz3x3[0][0] * Matriz3x3[2][2]) - (Matriz3x3[0][2] * Matriz3x3[2][0]);
                            Matrizad[1][2] = ((Matriz3x3[0][1] * Matriz3x3[2][0]) - (Matriz3x3[0][0] * Matriz3x3[2][1]));
                            Matrizad[2][0] = (Matriz3x3[0][1] * Matriz3x3[1][2]) - (Matriz3x3[0][2] * Matriz3x3[1][1]);
                            Matrizad[2][1] = (-1) * ((Matriz3x3[0][0] * Matriz3x3[1][2]) - (Matriz3x3[0][2] * Matriz3x3[1][0]));
                            Matrizad[2][2] = (Matriz3x3[0][0] * Matriz3x3[1][1]) - (Matriz3x3[0][1] * Matriz3x3[1][0]);

                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    System.out.print("[" + Matrizad[i][j] + "]");
                                }
                                System.out.println("");
                            }

                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    Trasad[j][i] = Matrizad[i][j];
                                }

                            }
                            System.out.println("");

                            //matriz traspuesta de la adjunta
                            System.out.println("Matriz traspuesta adjunta");

                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    System.out.print("[" + Trasad[i][j] + "]");
                                }
                                System.out.println("");
                            }

                            //calculo matriz inversa por metodo de matriz transpuesta
                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    R[i][j] = inversadet * Trasad[i][j];

                                }

                            }

                            //impresion matriz inversa
                            System.out.println("");
                            System.out.println("Matriz inversa");

                            for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    System.out.print("[" + df.format(R[i][j]) + "]");
                                }
                                System.out.println("");
                            }
                            System.out.println("");

                        }

                        if (v / u == 2) {

                            //Matriz2x2______________________________________________________________________________________//
                            //Matriz original
                            System.out.println("Matriz original");
                            for (int i = 0; i < 2; i++) {
                                
                                for (int j = 0; j < 2; j++) {

                                    Matriz2x2[i][j] = matrmul[i][j];

                                }
                                
                            }
                            System.out.println("");
                             for (int i = 0; i < 3; i++) {

                                for (int j = 0; j < 3; j++) {

                                    System.out.print("[" + Matriz2x2[i][j] + "]");

                                }
                                System.out.println("");
                            }
                            System.out.println("");

                            //determinante de la matriz 
                            System.out.println("Determinante");
                            determinante = ((Matriz2x2[0][0] * Matriz2x2[1][1]) - (Matriz2x2[0][1] * Matriz2x2[1][0]));
                            System.out.println(determinante);
                            System.out.println("");

                            //inversa determinante
                            System.out.println("Determinante Inverso");
                            inversadet = 1 / determinante;
                            System.out.println(df.format(inversadet));
                            System.out.println("");
                            //matriz adjunta
                            System.out.println("Matriz adjunta");
                            Matrizad[0][0] = Matriz2x2[1][1];
                            Matrizad[0][1] = -1 * Matriz2x2[1][0];
                            Matrizad[1][0] = -1 * Matriz2x2[0][1];
                            Matrizad[1][1] = Matriz2x2[0][0];

                            for (int i = 0; i < 2; i++) {

                                for (int j = 0; j < 2; j++) {

                                    System.out.print("[" + Matrizad[i][j] + "]");
                                }
                                System.out.println("");
                            }

                            //matriz traspuesta de la adjunta
                            for (int i = 0; i < 2; i++) {

                                for (int j = 0; j < 2; j++) {

                                    Trasad[j][i] = Matrizad[i][j];
                                }

                            }
                            System.out.println("");

                            System.out.println("Matriz traspuesta adjunta");

                            for (int i = 0; i < 2; i++) {

                                for (int j = 0; j < 2; j++) {

                                    System.out.print("[" + Trasad[i][j] + "]");
                                }
                                System.out.println("");
                            }

                            //calculo matriz inversa por metodo de matriz transpuesta
                            for (int i = 0; i < 2; i++) {

                                for (int j = 0; j < 2; j++) {

                                    R[i][j] = inversadet * Trasad[i][j];

                                }

                            }

                            //impresion matriz inversa
                            System.out.println("");
                            System.out.println("Matriz inversa");

                            for (int i = 0; i < 2; i++) {

                                for (int j = 0; j < 2; j++) {

                                    System.out.print("[" + df.format(R[i][j]) + "]");
                                }
                                System.out.println("");
                            }
                            System.out.println("");

                        } else {
                            System.out.println("No es una matriz cuadrada");
                        }

                        break;
                    }

                    case 7: {

                        System.out.println("Has seleccionado la opcion 7: Potencia de la matriz");

                        //ingreso de la letra de la matriz a operar

                        /*
                    Scanner opc1 = new Scanner(System.in);
                    String opcm1; //Opcion que debe elegir el usuario
                    System.out.println("Ingrese la letra de la matriz a operar: ");
                    opcm1 = opc1.nextLine();
                         */
                        //establezco el indice para la letra de la matriz
                        //indicematriz = ;
                        //dentro del switch pongo mi indice que tendrá un valor fijo dependiendo de la letra ingresada
                        //aqui esta la operación sin anidación!!!
                        //el usuario ingresa un numero que será la potencia de la matriz
                        System.out.println("Ingrese el numero a elevar la matriz: ");

                        Scanner elevarnumero = new Scanner(System.in);
                        int numpot; //Opcion que debe elegir el usuario
                        numpot = elevarnumero.nextInt();

                        System.out.println("Ingrese Matriz A Elevar:");
                        String nombrematriz1;
                        nombrematriz1 = teclado.next();
                        
                        int posicionpot = 0;

                        switch (nombrematriz1) {

                            case "A":
                                posicionpot = 0;
                                break;
                            case "B":
                                posicionpot = 1;
                                break;
                            case "C":
                                posicionpot = 2;
                                break;
                            case "D":
                                posicionpot = 3;
                                break;
                            case "E":
                                posicionpot = 4;
                                break;
                            case "F":
                                posicionpot = 5;
                                break;
                            case "G":
                                posicionpot = 6;
                                break;
                            case "H":
                                posicionpot = 7;
                                break;
                            case "I":
                                posicionpot = 8;
                                break;
                            case "J":
                                posicionpot = 9;
                                break;
                            case "K":
                                posicionpot = 10;
                                break;
                            case "L":
                                posicionpot = 11;
                                break;
                            case "M":
                                posicionpot = 12;
                                break;
                            case "N":
                                posicionpot = 13;
                                break;
                            case "O":
                                posicionpot = 14;
                                break;
                            case "P":
                                posicionpot = 15;
                                break;
                            case "Q":
                                posicionpot = 16;
                                break;
                            case "R":
                                posicionpot = 17;
                                break;
                            case "S":
                                posicionpot = 18;
                                break;
                            case "T":
                                posicionpot = 19;
                                break;
                            case "U":
                                posicionpot = 20;
                                break;
                            case "V":
                                posicionpot = 21;
                                break;
                            case "W":
                                posicionpot = 22;
                                break;
                            case "X":
                                posicionpot = 23;
                                break;
                            case "Y":
                                posicionpot = 24;
                                break;
                            case "Z":
                                posicionpot = 25;
                                break;

                        }                      
                               double [][] matrizpoten = vector[posicionpot];
                               /*for (int x=0; x < matrizpoten.length; x++) {
                             for (int y=0; y < matrizpoten[x].length; y++) {
                                     
                                            System.out.print(" ["+matrizpoten[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }*/
                               
                               int matrizpotenresul[][] = new int[matrizpoten.length][matrizpoten[0].length];
                               
                            
                        
                               for (int i = 0; i < matrizpoten.length; i++) {
            for (int j = 0; j < matrizpoten[0].length; j++) {
                for (int k = 0; k < matrizpoten[0].length; k++) {
                    // aquí se multiplica la matriz
                    matrizpotenresul[i][j] += matrizpoten[i][k] * matrizpoten[k][j];  
                    }
                     }
                         } 
                           /* for (int x=0; x < matrizpotenresul.length; x++) {
                             for (int y=0; y < matrizpotenresul[x].length; y++) {
                                     
                                            System.out.print(" ["+matrizpotenresul[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        } */
                           
                    double [][] matrizpotendefi = new double[matrizpotenresul.length][matrizpotenresul[0].length];
                    
                        for (int m = 2; m < numpot; m++) {
                            
                    for (int p = 0; p < matrizpotenresul.length; p++) {
            for (int o = 0; o < matrizpotenresul[0].length; o++) {
                for (int ñ = 0; ñ < matrizpotenresul[0].length; ñ++) {
                    // aquí se multiplica la matriz
                    matrizpotendefi[p][o] += matrizpotenresul[p][ñ] * matrizpoten[ñ][o];   
                }
                     }
                         } 
                    
                    for (int x=0; x < matrizpotenresul.length; x++) {
                             for (int y=0; y < matrizpotenresul[x].length; y++) {
                                     
                                            matrizpotenresul[x][y] = (int) matrizpotendefi[x][y];
                                                                            }
                             System.out.print("");
                                                                        }
                    
                    
                    
                        }   
                        
        for (int x=0; x < matrizpotendefi.length; x++) {
                             for (int y=0; y < matrizpotendefi[x].length; y++) {
                                     
                                            System.out.print(" ["+matrizpotendefi[x][y]+ "] ");
                                                                            }
                             System.out.println("");
                                                                        }
                        break;
                    }

                    case 8: {

                        System.out.println("Has seleccionado la opcion 8: Determinante de una matriz");
                        System.out.println("");

                        //ingreso de la matriz
                        int[][] m8 = new int[3][3];
                        m8[0][0] = 1;
                        m8[0][1] = 2;
                        m8[0][2] = 3;
                        m8[1][0] = 4;
                        m8[1][1] = 5;
                        m8[1][2] = 6;
                        m8[2][0] = 7;
                        m8[2][1] = 8;
                        m8[2][2] = 9;

                        int[][] multi1 = new int[1][1];
                        int[][] multi2 = new int[1][1];
                        int[][] multi3 = new int[1][1];
                        int[][] multi4 = new int[1][1];
                        int[][] multi5 = new int[1][1];
                        int[][] multi6 = new int[1][1];

                        int[][] sumaterm1 = new int[1][1];
                        int[][] restaterm1 = new int[1][1];

                        int[][] determR = new int[1][1];

                        //creación del cada termino
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi1[i][j] = (m8[0][0] * m8[1][1] * m8[2][2]);
                                System.out.print("[ " + multi1[i][j] + " ] +");
                            }
                        }

                        //termino 2
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi2[i][j] = (m8[0][1] * m8[1][2] * m8[2][0]);
                                System.out.print("[ " + multi2[i][j] + " ] +");
                            }
                        }

                        //termino 3
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi3[i][j] = (m8[0][2] * m8[1][0] * m8[2][1]);
                                System.out.print("[ " + multi3[i][j] + " ] - ");
                            }
                        }

                        //termino 4
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi4[i][j] = (m8[2][0] * m8[1][1] * m8[0][2]);
                                System.out.print("[ " + multi4[i][j] + " ] +");
                            }
                        }

                        //termino 5
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi5[i][j] = (m8[2][1] * m8[1][2] * m8[0][0]);
                                System.out.print("[ " + multi5[i][j] + " ] +");
                            }
                        }

                        //termino 6
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                multi6[i][j] = (m8[2][2] * m8[1][0] * m8[0][1]);
                                System.out.print("[ " + multi6[i][j] + " ]");
                            }
                            System.out.println("");
                        }

                        //operación de los 6 terminos (parte positiva)
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                sumaterm1[i][j] = (multi1[0][0] + multi2[0][0] + multi3[0][0]);
                                System.out.print(" " + sumaterm1[i][j] + " - ");
                            }
                        }

                        //operación de los 6 terminos (parte negativa)
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                restaterm1[i][j] = (multi4[0][0] + multi5[0][0] + multi6[0][0]);
                                System.out.print(" " + restaterm1[i][j] + " ");
                            }
                            System.out.println("");
                        }

                        //resta de ambas partes
                        System.out.println("El determinante de la matriz es: ");

                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 1; j++) {
                                determR[i][j] = (sumaterm1[0][0] - restaterm1[0][0]);
                                System.out.print(" " + determR[i][j] + " ");
                            }
                            System.out.println("");
                        }

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
