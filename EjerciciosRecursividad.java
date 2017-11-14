
public class EjerciciosRecursividad {

    /**
     * Imprime la diagonal inferior izquierda de la matriz mat
     * @param matr: Matriz para utilizar
     * @param row,col: Ambos empiezan en 0:
     * @param tope: Empieza en 0
     * @param maxDim: Dimensiones maximas de la matriz.
     */
    public static void matrizDiagInf(int[][] matr, int row, int col, int tope, int maxDim) {
        if (row == 0){
            System.out.println(matr[row][col]);
            matrizDiagInf(matr,row+1,col,tope+1,maxDim);
        } else {
            if (col == 0 && row < maxDim){
                System.out.print(matr[row][col] + " ");
                matrizDiagInf(matr,row,col+1,tope,maxDim);
            } else if (col == tope){
                System.out.println(matr[row][col]);
                matrizDiagInf(matr,row+1,0,tope+1,maxDim);
            } else if (col < maxDim && row < maxDim){
                System.out.print(matr[row][col] + " ");
                matrizDiagInf(matr,row,col+1,tope,maxDim);
            }
        }
    }

    /**
     * Imprime la diagonal de la matriz mat
     * @param mat: Matriz para utilizar
     * @param row,col: Ambos empiezan en 0:
     * @param tope: Empieza en 0
     * @param maxDim: Dimensiones maximas de la matriz.
     */
    public static void matrizDiagonal(int[][] mat, int row, int col, int tope, int maxDim){
        if (row == 0){
            System.out.println(mat[row][col]);
            matrizDiagonal(mat, row+1, col, tope+1,maxDim);
        }else{
            if (col == 0 && row < maxDim){
                matrizDiagonal(mat,row, col +1, tope, maxDim);
            } else if (col == tope){
                System.out.println(mat[row][col]);
                matrizDiagonal(mat, row +1, 0, tope+1,maxDim);
            } else if (col < maxDim && row < maxDim){
                matrizDiagonal(mat, row, col+1,tope,maxDim);
            }
        }
    }

    /**
     * Imprime la diagonal superior derecha de una matriz cuadrada de row x col
     * @param mat: Matriz para imprimir
     * @param row: Debe empezar en 0
     * @param col: Debe empezar == maxDim
     * @param tope: Debe empezar == maxDim
     * @param maxDim: Dimensiones maximas == row -1 || col-1
     */
    public static void matrizSupDer(int[][] mat, int row, int col, int tope, int maxDim){
        if (row == 0){
            System.out.println(mat[row][col]);
            matrizSupDer(mat,row+1,col,tope-1,maxDim);
        } else {
            if (col == maxDim && row >= 0){
                System.out.println(mat[row][col]);
                matrizSupDer(mat, row, col-1, tope, maxDim);
            } else if (col == tope){
                System.out.println(mat[row][col]);
                matrizSupDer(mat, row+1, maxDim, tope-1,maxDim);
            } else if (row < maxDim && col > 0){
                System.out.println(mat[row][col]);
                matrizSupDer(mat,row,col-1,tope,maxDim);
            }
        }
    }





}
