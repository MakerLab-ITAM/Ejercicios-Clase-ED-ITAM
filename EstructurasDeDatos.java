/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.lang.reflect.Array;
import java.util.ArrayList; 
import java.util.Stack; 
import java.util.Queue; 

/**
 *
 * @author downvec
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] matrizGrande = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int[][] matrizBestia = {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9,10},
                {11,12,13,14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27,28,29,30},
                {31,32,33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60},
                {61,62,63,64,65,66,67,68,69,70},
                {71,72,73,74,75,76,77,78,79,80},
                {81,82,83,84,85,86,87,88,89,90},
                {91,92,93,94,95,96,97,98,99,100}

        };
        
        //imprimeMat(matriz,3,3,3);

        //EjerciciosRecursividad.matrizDiagInf(matriz,0,0,0,3);
        //EjerciciosRecursividad.matrizDiagInf(matrizGrande,0,0,0,5);
        EjerciciosRecursividad.matrizDiagInf(matrizBestia,0,0,0,10);

        //EjerciciosRecursividad.matrizDiagonal(matriz, 0,0,0,3);
        //EjerciciosRecursividad.matrizDiagonal(matrizGrande, 0,0,0,5);
        //EjerciciosRecursividad.matrizDiagonal(matrizBestia,0,0,0,10);


        
    }
    
    public static void eliminaElementosMenores(int n , MyQueue cola ){
        for (Object elemento: cola.elementos){
            if ((int) elemento < n)
                System.out.println(elemento);
                cola.pop();
        }
    }

    /*
    public static <T> void eliminaRepetidosConsecutivos(MyQueue<T> cola){
        // Se asume la cola no esta vacia 
        T temp; 
        MyQueue colaAux = new MyQueue(cola.size); 
        
        while ( !cola.isEmpty()){
            temp = cola.pop(); 
            colaAux.push(temp);
            
            /*
            if (cola.peek().equals(temp)){
                cola.pop(); 
            } else {
                colaAux.push(cola.pop());
            }

        }
        
        //Revertir a cola original 
        while ( !colaAux.isEmpty()){
            cola.push(colaAux.pop()); 
        }
        
    }
    
    public static <T> void eliminaRepetidosNoConsecutivos(MyQueue<T> cola){
        T temp; 
        T temp2; 
        ArrayList histogram = new ArrayList(); 
        MyQueue colaAux = new MyQueue(cola.size); 
        
        while (!cola.isEmpty()){
            temp = cola.pop(); 
            histogram.add(temp); 
            
            if (histogram.contains(temp)){
                temp = null; 
            } else {
                colaAux.push(temp);
            }
        }
        
        for (Object element : histogram){
            cola.push( (T) element); 
        }
    }
    
    
    public static <T> boolean esColaPalindrome(Queue<T> cola){
        Stack pilaRev = new Stack(); 
        Stack pilaAux = new Stack(); 
        T tempPila; 
        T tempCola; 
        boolean ans = true; 
        
        while(!cola.isEmpty()){
            pilaRev.push(cola.remove());
        }
        
        while(!pilaRev.isEmpty() && ans){
            tempPila =  (T) pilaRev.pop();
            tempCola = (T) cola.remove(); 
            
            ans = (tempPila.equals(tempCola)); 
            pilaAux.push(tempPila); 
        }
        
        while (!pilaRev.isEmpty()){
            cola.add( (T) pilaAux.pop()); 
        }
        
        return ans; 
    }
    */
    
    public static long factorialRecursivo(int n){
        if (n == 0 || n == 1)
            return 1; 
        else
            return (n * factorialRecursivo(n-1));
        
    }
    
    public static double fibonacciRecursivo(int n){
        if (n == 0 || n==1)
            return n; 
        else 
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2); 
    }
    
    public static double aExpB(int a, int b){
        if (b == 0 )
            return 1; 
        else 
            return a * aExpB(a, b-1); 
    }

    
    public void reversaRec(int[] ar, int n){
        if (n==0)
            System.out.println(ar[0]);
        else 
            System.out.println(ar[n-1]);
            reversaRec(ar, n-1); 
    }
    
    
    //Tarea: num1 & num2. Obtener multilicacion, a traves de sumas. 
    
    
    //Recursividad 
    public static long particion(int m, int n){
        if (m ==1 || n==1)
            return 1; 
        else 
            if ( m < n )
                return particion(m, m); 
            else 
                if (m == n)
                    return 1 + particion(m,n-1); 
                else 
                    if (m > n)
                        return particion(m,n-1) + particion(m-n, n ); 
                    
        return -1; 
    }
    
    //Numeros de catalan 
    public static long nCatalan(int n){
        int suma = 0;
        if (n==1){
            return 1; 
        }else{
            
            for (int i=1; i<n ;i++)
                suma +=  nCatalan(i) * nCatalan(n-i); 
            
            
            return suma; 
        }
        
    }
    
    public static void imprimeMat(int[][] v ,int m, int n, int p){
       if (m > 0){
           if (n > 0){
               System.out.println(v[m-1][n-1]); 
               imprimeMat(v,m,n-1,p); 
           }
       } else {
           imprimeMat(v,m-1,p,p); 
       }
          
    }
    
  
    
    public static void imprimeMatriz(int[][] mat, int m, int n, int mRep, int nRep ){
        if (n>0){
            if (m%2==0){
                System.out.println(mat[m-1][n-1]);
                imprimeMatriz(mat,m,n-1,mRep,nRep);
            }else{
                imprimeMatriz(mat,m-1,n,mRep,nRep);
            }
        }else {
            if (nRep<mRep){
                System.out.println(mat[m-1][nRep]);
                imprimeMatriz(mat,m,n,mRep,n+1);
            }
        }

    }
    
    
    /*
    public static void matZigZag(int[][] mat, int m, int n, int mm, int nn, boolean fromLtoR){
        if (n == nn){
            System.out.println(mat[m-1][0]); 
            matZigZag(mat,m,)
        }
    }
*/
    
    public boolean comparaVect(int[] vec1, int[] vec2){
        boolean ans = false ; 
         
        for (int i=0; i < vec1.length; i++){
            int componente = vec1[i];
            System.out.println(componente);
            for (int j=0; j< vec2.length; j++){
                int componente2 = vec2[j];
                System.out.println(componente2);
                ans = (componente == componente2); 
            }
        }
        return ans; 
    }
    
    public static void matrizDiagonal(int[][] mat, int m, int n, int mm, int nn){
        if (m == 0){
            System.out.println(mat[0][0]);
            matrizDiagonal(mat,0, nn-(n-1), mm, nn); 
        } else {
            if (n == 0){
                System.out.println(mat[m][0]); 
                matrizDiagonal(mat,m,n+1,mm,nn); 
            } else {
                System.out.println(mat[m][n]); 
                matrizDiagonal(mat,m,n,mm,nn); 
            }
        }
    }

    public static void matrizVertical(int[][] matr, int m, int n, int mm, int nn){
        if (m==0){
            System.out.println(matr[m][nn]);
            matrizVertical(matr, m, n, m, nn++);
        } else {

        }

    }
    
    
}
