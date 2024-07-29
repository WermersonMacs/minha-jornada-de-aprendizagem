public class ExercicioControleFluxo {
    public static void main(String[] args) {
        float salario = 5500;
        String mensagem;

        if(salario < 1000){
            mensagem = "Seu imposto sobre o salario " + salario * 0.05f;
        }else if (salario >= 1000 && salario <2000){
            mensagem = "Seu imposto sobre o salario " + salario * 0.1f;
        }else if (salario >= 2000 && salario < 4000){
            mensagem = "Seu imposto sobre o salario " + salario * 0.15f;
        }else if(salario > 5000){
            mensagem = "Seu imposto sobre o salario " + salario * 0.2f;
        }else {
            mensagem = "Erro de Sintaxe" ;
        }
        System.out.println(mensagem);

    }
}
