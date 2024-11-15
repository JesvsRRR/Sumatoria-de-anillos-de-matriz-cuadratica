package anillo;

import java.util.Random;
import java.util.Scanner;


public class ANILLO {
    
    public static int[][] RellenarRandom (int[][] Matriz){
        Random rd = new Random();
        for(int i=0; i < Matriz.length; i++){
            for(int j=0; j < Matriz.length; j++){
                Matriz[i][j] = rd.nextInt(101);
                System.out.print("[ "+Matriz[i][j]+" ]");
            }
            System.out.println("\n");
        }
        return Matriz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("// Ingrese dimension [DXD]: ");
        int Dimension = sc.nextInt();
        int[][]Matriz = new int[Dimension][Dimension];
        
        System.out.println("// Ingrese N# del anillo:");
        int Anillo = sc.nextInt();
        Matriz = RellenarRandom(Matriz);
        
        int desde = Anillo-1, hasta = Dimension - Anillo, suma = 0;
        
        for(int i=desde ; i <= hasta; i++){
            if(i == desde || i == hasta ){
            for(int j= Anillo - 1; j <= hasta; j++){
                suma += Matriz[i][j];   
            }
            }
            else{
                suma += Matriz[i][Anillo - 1];
                suma += Matriz[i][hasta];
            }
        }
        System.out.println("SUMATORIA DE ANILLO N# " + Anillo + ": "+ suma);
                
        
        
    }
    
}
