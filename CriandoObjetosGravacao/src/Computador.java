public class Computador implements Comportamento{
    private boolean ligado; // atributo
    public Computador(){
        this.ligado = false;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O computador esta ligado!");
    }
    @Override
    public void processarDados(String dados) {
        if(ligado){
            System.out.println("Processando " + dados.toUpperCase());
        }else{
            System.out.println("Erro: computador está DESLIGADO e não pode processar dados.");
        }
    }
    @Override
    public String desligar() {
        this.ligado = false;
        return("Computador Desligado.");
    }
}
