public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 8;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("opcao invalida");
        }
        }

        /*if (dia == 1 ){
            System.out.println("domingo");
        }else if (dia == 2){
            System.out.println("segunda");
        }else if (dia == 3){
            System.out.println("terça");
        }else if (dia == 4){
            System.out.println("quarta");
        }else if (dia == 5){
            System.out.println("quinta");
        }else if (dia == 6){
            System.out.println("sexta");
        }else if (dia == 7){
            System.out.println("sabado");
        }*/
}
