

package estructurasdedatos;

public class EjerciciosRecursividad {

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
    
    public static void matrizDiagForw(int[][] mat, int row, int col, int tope, int maxDim){
        if (row == 0){
            System.out.println(mat[row][col]);
            matrizDiagForw(mat, row +1, col, tope-1, maxDim); 
        } else {
            if (col == maxDim){
                System.out.println(mat[row][col]);
                matrizDiagForw(mat, row, col-1,tope,maxDim);
            } else if (col == tope){
                System.out.println(mat[row][col]);
                matrizDiagForw(mat, row+1,0,tope-1,maxDim);
            } else if (row < maxDim){
                matrizDiagForw(mat, row ,col, tope, maxDim);
            }
        }
    }



}
