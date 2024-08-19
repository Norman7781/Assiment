/*
Aung Kaung Myat
6611201
541
 */
public class ABCsolver {
    public static void main(String[] args) {
        int[] num = {6,4,2};
        int[] temp = new int[3];
        String lyric = "CAB";
        if (lyric.charAt(0) == 'A' && lyric.charAt(2) == 'C') {
            if (num[1] > num[2]) {
                temp[0] = num[1];
                num[1] = num[2];
                num[2] = temp[0];

            }
            for (int i : num) {
                System.out.print(i + " ");
            }
        }if(lyric.charAt(0)=='C' && lyric.charAt(2)=='B'){
            if(num[1]>num[2]){
                temp[0]=num[1];
                num[1]=num[2];
                num[2]=temp[0];
            }
            for (int i : num) {
                System.out.print(i + " ");
            }

        }


        }
    }

