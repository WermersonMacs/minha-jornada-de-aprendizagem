public class ControleFluxo6 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // porem as parcelas nao podem ser menores que mil

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal;parcela>=1; parcela--){
        double valorParcela = valorTotal/parcela;
           if (valorParcela <=1000){
              continue;
           }
            System.out.println("Parcela "+parcela+" R$: "+ valorParcela);
            System.out.println("consumidor de memoriaw");
        }



    }
}
