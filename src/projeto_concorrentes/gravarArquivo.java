package projeto_concorrentes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class gravarArquivo {
    
    public void gravar(int semente, int[] vet, String nome)throws IOException{
        
        FileWriter arq = new FileWriter("C:\\Users\\lesli\\Desktop\\vet"+semente+nome);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println("Thread #"+semente);
        for (int i = 0; i < 1000000; i++) {
            gravarArq.println(" "+vet[i]);
        }
        
        arq.close();
        
    }
}
