package projeto_concorrentes;

public class MinhaThread extends Thread {
    
    public String nome;
    public int tempo;
    public int semente;
    public int[] vet=new int[1000000];
    Numeros gera = new Numeros();
    ordena shell = new ordena();
    gravarArquivo arquivo = new gravarArquivo();
    
    public MinhaThread(String nome, int tempo, int semente) {
        this.nome = nome;
        this.tempo = tempo;
        this.semente = semente;
        start();
    }
  
    @Override
    public void run(){
        try {
            String nomeArq = "1a.txt";
            gera.gerador(semente, vet);
            shell.Shell_sort(vet,1000000);  
            for(int i=0;i<1000000;i++){
                System.out.println(nome+" "+vet[i]);
            }
            arquivo.gravar(semente, vet, nomeArq);
            
        } catch (Exception e) {
        
        }           
            
    }
    
}
