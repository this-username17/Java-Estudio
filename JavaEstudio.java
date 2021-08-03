package javaestudio;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaEstudio {
        //variable de clase
        private static int VariableDeClase;
        
    public static void main(String[] args) {
        
        //VARIABLES
        int NombreVariable = 13;
            //USAR VARIABLE DE CLASE
            int VariableDeClase1 = JavaEstudio.VariableDeClase;
        //CONSTANTES
        final int NombreConstante = 10; //final: palabra para declarar constante
        
        
        
        //sout+tab, abreviatura para imprimir en consola
        System.out.println("");
        System.out.println("Digite \n"
                + "1. Ingresar dinero a la cuenta\n" //saltos de linea con \n
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir");

        //PEDIR DATOS POR CONSOLA
        //se instancia la clase Scanner
        Scanner EntradaDeDatos = new Scanner(System.in); //se crea el objeto para utilizar el método scanner

        // se crea la variable o constante en la que se guardará el dato ingresado
        int DatoPorEntrada;
        String DatoPorEntrada1;

        System.out.println("Digite un número");

        /*se pide el número y luego se guarda en la variable (DatoPorEntrada)para luego usar 
        el método correspondiente del objeto creado (Entrada de Datos) de la Clase Scanner        */
        DatoPorEntrada = EntradaDeDatos.nextInt();//con este método pide en consola el dato 

        /* Si es para un entero se usa NextInt, pero si es para un float se usa nextFloat
        Depende del tipo de dato*/
        System.out.println("Digite una frase");
        DatoPorEntrada1 = new Scanner(System.in).nextLine(); // para guardar cadenas
        char letra = EntradaDeDatos.next().charAt(0); // para guardar caracteres

        //OPERADORES ARITMETICOS
        float numero1 = 23;
        float numero2 = 25;
        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        float resto = numero1 % numero2;

        //OPERADORES ARITMETICOS COMBINADOS CON ASIGNACIÓN
        //Se usa para todos los operadores aritmeticos 
        numero1 = 10;
        numero1 = numero1 + 5; // es lo mismo que
        numero1 += 5;

        //OPERADORES DE INCREMENTO Y DE DECREMENTO
        //incremento en 1 como sufijo (después de la variable)
        numero1++; //es igual que
        numero1 += 1; // o que 
        numero1 = numero1 + 1; //aumenta en 1 el valor

        //decremento en 1 como sufijo (después de la variable)
        numero1--; //es igual que
        numero1 -= 1; // o que 
        numero1 = numero1 - 1; //aumenta en 1 el valor

        //incremento en 1 como prefujo (después de la variable)
        ++numero1; //es igual que
        numero1 += 1; // o que 
        numero1 = numero1 + 1;
        /*
       Como prefijo se usa para que le incremento se vea cuando el valor se use
       en otra varible ej:
         */
        numero2 = numero1++;
        /*
       Si se pone como sufijo el valor de "numero2 es el valor de numero1 sin incremento pero
       Si se pone como prefijo se hace el incremento en la variable "numero 2". 
         */

        //decremento en 1 como prefijo (después de la variable)
        --numero1; //es igual que
        numero1 -= 1; // o que 
        numero1 = numero1 - 1; //disminuye en 1 el valor

        //CLASE MATH
        //Funciona para operaciones algebricas como
        //RAIZ Cuadrada
        /*//se puede crear una varible y definirla llamando
      la clase Math y el método sqrt, el cual solo puede guardar
      en una variable de tipo double*/
        double raiz = Math.sqrt(numero1);
        raiz = Math.sqrt(9);

        /* se puede hacer la conversión de la variable a entero así:    
        Colocando "int" entre parentesis antes de la clase Math */
        raiz = (int) Math.sqrt(numero1);

        //ELEVAR A CUALQUIER POTENCIA
        double base = 5;
        double exponente = 10;
        double resultado = Math.pow(base, exponente);

        //REDONDEAR
        // si es un float se debe guardar dentro de un int
        numero1 = 5.3f;
        int resultado1 = Math.round(numero1);

        // si es un double se debe guardar dentro de un long
        double numero3 = 5.9;
        long resultado3 = Math.round(numero3);

        //numero random
        numero3 = Math.random();

        //COMPARACIÓN DE NÚMEROS, "==" es para comparar si son iguales, el = es para asignar+
        // "!=" se usa para que comparar que sean diferentes
        // también se usan < o >, <=, >=
        //CONDICIONALES - IF ELSE
        //condicional simple if
        //condicional doble if else
        int dato = 5;
        System.out.println("Digite un número");
        int dato1 = EntradaDeDatos.nextInt();
        if (dato1 == dato) {
            /*si se cumple lo que está en parentesis
          se ejecuta lo que esta entre las llaves*/
            System.out.println("El número es 5");
        } else if (dato != dato1){System.out.println("love");}
        else { //si no se cumple el "if" entonces se ejecuta el else
            System.out.println("El número no es 5");
        }

        //CONDICIONALES - SWITCH
        /* SE USA COMO UN MENÚ, DONDE ELIGES EL DATO O VARIOS CONDICIONALES PARA UNA
        SITUACIÓN, DONDE SE PUEDEN PRESENTAR MULTIPLES SITUACIONES
        (Para usar caracteres o letras para seleccionar la situación
        Se debe usar comillas simples ej: 's')*/
        System.out.println("Digite un número del 1 al 4");
        int dato2 = EntradaDeDatos.nextInt();
        switch (dato2) {
            case 1:
                System.out.println("Eres un ganador");
                break;
            case 2:
                System.out.println("Perdedor");
                break;
            case 3:
                System.out.println("Eres un ganador");
                break;
            case 4: //combinar casos, si es 4 va a salir "perdedor" igual que el caso 5
            case 5:
                System.out.println("Perdedor");
                break;
            default:
                System.out.println("No elegiste una opción válida");
        }
        char letra1 = EntradaDeDatos.next().charAt(0);

        if (Character.isUpperCase(letra1)) {
            //se usa este método para identificar mayusculas

            System.out.println("es una letra mayuscula");
        } else {
            System.out.println("es una letra minuscula");
        }

        //CICLOS
        /*WHILE: MIENTRAS (MIENTRAS SE CUMPLA UNA CONDICIÓN SE EJECUTA EL CICLO)
        REPETICIONES INDEFINIDAS, MUCHAS VECES NO SE SABE CUANTAS VECES SE PUEDE REPETIR
    
         */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++; //aumenta la i para imprimir los números del 1 al 10 se pone despues de la impresión para que lo aumente desde el 1
        }

        /* DO WHILE: SE EJECUTA AL MENOS UNA SOLA VEZ ANTES DE VERIFICAR LA CONDICIÓN DEL CICLO WHILE
         */
        do {
            System.out.println(i);
            i++;
        } while (i < 12); //se ejecutará 2 veces imprimiendo 10 y 11, el 10 siempre se mostrará

        /* CICLO FOR
     for (inicialización; condición; aumento o decremento) {Instrucciones;}
         */
        for (int a = 1; a < 10; a += 2) { // aumento de dos en dos hasta el 9
            System.out.println(a);
        }
        //ARRAYS
        /* un array nos guarda un conjunto de datos de un mismo tipo, el tamaño se declara 
    y no puede cambiar. 
   Array unidimensional: declaración
    tipo de dato + [ ] + nombre del array + = + new + [dimensión]
         */
        int[] PrimerArray = new int[3];
        int[] SegundoArray = new int[3];
        // para que tomen valores se puede hacer de dos formas, en conjunto o individualmente

        //individualmente
        PrimerArray[2] = 2;
        PrimerArray[1] = 1;
        PrimerArray[0] = 0;

        SegundoArray[2] = 0;
        SegundoArray[1] = 1;
        SegundoArray[0] = 2;

        // en conjunto, pero aquí se crea el array y se le asignan los valores de una vez
        int[] PrimerArray1 = {0, 1, 2};

        // imprimir todo un arreglo
        for (int v = 0; v < 3; v++) { //aunque es mejor usar el for each
            System.out.println(PrimerArray[v]);
        }
        //llenar un arreglo por consola
        int nElementos; //esta variable será la que definirá la dimensión del arreglo
        nElementos = EntradaDeDatos.nextInt();
        int[] TercerArray = new int[nElementos];
        System.out.println("Digite los elementos del arreglo");

        for (int q = 0; q < nElementos; q++) {
            System.out.println((q + 1) + ". Digite los numerp");
            TercerArray[q] = EntradaDeDatos.nextInt();
        } //llave del main
//FOR EACH
        //Para usar todos los elementos de un arreglo
        for (int q : PrimerArray) {
            System.out.println("Números: " + i);
        }
    
//ARRAYLIST
   
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(23);//agregar un elemento
        numeros.add(4,67); //agregará el 67 en la posición 4
        numeros.forEach(numero89 -> System.out.println("números en la lista: " + numero89)); //recorre el array y ejecuta la instrucción
        for (Integer numero:numeros) { //for each normal
            System.out.println(numero);
   
        }      
    
    }
    
    
 
        
}