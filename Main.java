// Se importan las clases Java necesarias para generar números aleatorios y leer la entrada del usuario.
import java.util.Random;
import java.util.Scanner; 

public class Main {
    
    public static int[][] RellenarRandom (int[][] Matriz){
        Random rd = new Random(); // Inicializa la clase Java Random bajo la sintaxis "rd"
        
        for(int i=0; i < Matriz.length; i++){
            for(int j=0; j < Matriz.length; j++){
                Matriz[i][j] = rd.nextInt(101);
                System.out.print("[ "+Matriz[i][j]+" ]");
            }
            System.out.println("\n");
        }
        // Este método recibe la matriz cuadratica (dimensión x dimensión) y la rellena con números aleatorios del 0 al 100.
        // Utiliza dos bucles anidados para recorrer cada posición de la matriz.
        // Por cada recorrido, se imprime un elemento de la matriz, teniendo doble función de: almacenar e imprimir
        
        return Matriz; // Devuelve los valores a la variable matriz, acabando la función
    }
    
    public static void SumatoriaAnillos (int[][] Matriz, int[] InicioYFin, int Anillo){
    int Suma = 0; // Inicializa la variable almacenadora "Suma" equivaliendo 0
    
        for(int i=InicioYFin[0] ; i <= InicioYFin[1]; i++){
            if(i == InicioYFin[0] || i == InicioYFin[1] ){
            for(int j= InicioYFin[0]; j <= InicioYFin[1]; j++){
                Suma += Matriz[i][j];   
            }
            }
            else{
                Suma += Matriz[i][InicioYFin[0]];
                Suma += Matriz[i][InicioYFin[1]];
            }
        }
        // En este bucle, la variable de inicializacion y la condicion usan los valores del array "InicioYFin" para recorrer en el anillo indicado
        // Si el bucle se encuentra en la primera o ultima fila del anillo, ocurre un segundo bucle que recorre todos los elementos de la fila, los valores de los elementos son almacenados en la variable "Suma"
        // Sea el caso contrario, se almacenan en la variable "Suma" los elementos de los bordes (primera y última columna)
        
        System.out.println("SUMATORIA DE ANILLO N# " + Anillo + ": "+ Suma); // La variable "Suma" es impresa como dato de salida, acabando la función      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializa la clase Java Scanner bajo la sintaxis "sc"
        
        
        System.out.println("// Ingrese dimension [DXD]: ");
        int Dimension = sc.nextInt(); // Pide al usuario la dimensión de la matriz cuadrada y se almacena en la variable "Dimension"
        int[][]Matriz = new int[Dimension][Dimension]; // Crea la matriz con la dimensión especificada
        
        System.out.println("// Ingrese N# del anillo:");
        int Anillo = sc.nextInt(); // Pide el número del anillo que se quiere sumar y se almacena en la variable "Anillo"
        Matriz = RellenarRandom(Matriz); // Llama a la función "RellenarRandom" para llenar la matriz
        
        
        int[] InicioYFin = {Anillo-1 , Dimension-Anillo}; 
        // Se inicializa el array "InicioYFin" , el cual almacenara los indices del anillo escogido mediante el valor de la variable "Anillo"
        
        // Inicio (InicioYFin[0]) = Equivale a la ecuación matematica "Anillo - 1" ,  representa el indice donde inicia el anillo
        // Fin (InicioYFin[1]) = Equivale a la ecuación matematica "Dimension - Anillo" , representa el indice donde termina el anillo
        
        SumatoriaAnillos(Matriz, InicioYFin , Anillo);
        // Con las coordenadas del anillo definidas, se llama a la función "SumatoriaAnillos" para calcular la suma del anillo n° "Anillo"
    }
}