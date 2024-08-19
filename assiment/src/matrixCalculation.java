/*
Aung Kaung Myat
6611201
541
 */
public class matrixCalculation {
    public static void main(String[] args) {
        int[][] matrixA={{1,2},{2,3}};
        int[][] matrixB={{3,4},{4,5}};
        System.out.println("matrixA");
        print2Darray(matrixA);
        System.out.println("matrixB");
        print2Darray(matrixB);
        System.out.println("Sum of matrixA and matrixB");
        printsum(matrixA,matrixB);
        System.out.println("multiply of matrixA and matrixB");
        multiply(matrixA,matrixB);


    }
    public static void multiply(int[][] matrixA, int[][] matrixB){
        for(int num=0; num<matrixA.length;num++){
            for(int num2=0; num2<matrixA[num].length;num2++) {
                System.out.print(matrixA[num][num2] * matrixB[num][num2] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void printsum(int[][] matrixA, int[][] matrixB){
        for(int i=0; i<matrixA.length;i++){
            for(int j=0; j<matrixA[i].length;j++) {
                System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void print2Darray(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }
}
