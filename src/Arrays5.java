public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][4];

        dias[0][0] = 00;
        dias[0][1] = 01;
        dias[0][2] = 02;
        dias[0][3] = 03;
        dias[1][0] = 04;
        dias[1][1] = 05;
        dias[1][2] = 06;
        dias[1][3] = 07;

        for (int i=0; i<dias.length;i++){
            System.out.println(dias[i]);
            for (int j=0; j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------------");
        for (int[] dia: dias){
            for (int ref: dia){
                System.out.println(ref);
            }
        }

    }
}
