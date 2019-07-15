package projeto_concorrentes;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Numeros{
    
    gravarArquivo arquivo = new gravarArquivo();
    
    
    public void gerador(int semente, int[] vet)throws IOException{   
        
        String nomeArq = "0b.txt";
        
    Random gerador = new Random(semente);
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 1000000; i++) {
            vet[i]=gerador.nextInt();
        }
        arquivo.gravar(semente, vet, nomeArq);
    }
}