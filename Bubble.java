package Bubble_Sort;

public class Bubble {
    public static void main(String[] args) {
        int vetor[]={1, 6, 2, 8, 4, 3};
        int aux;
        boolean controle;

        for(int i=0; i<vetor.length;++i){
            controle = true;
            for(int j=0;j<(vetor.length-1);++j){
                if (vetor[j]>vetor[i]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i]=aux;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }

        for (int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}