package projeto_concorrentes;


public class ordena{    
    public void Shell_sort(int[] vet, int n) {
        int i , j , value;
        int gap = 1;
        while(gap < n) {
            gap = 3*gap+1;
        }
        while ( gap > 1) {
            gap /= 3;
            for(i = gap; i < n; i++) {
                value = vet[i];
                j = i;
                while (j >= gap && value < vet[j - gap]) {
                    vet[j] = vet [j - gap];
                    j = j - gap;
                }
                vet [j] = value;
            }
        }
    }
    
}
