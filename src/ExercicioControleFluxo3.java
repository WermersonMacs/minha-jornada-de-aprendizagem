public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        int numerosPares = 10000;

        for (int i = 0; i<=numerosPares; i++){
            if(i%2 == 0){
                System.out.println("NumerosPares: "+ i);
            }
        }
    }
}