public class ContaUsuario extends Thread{
    private int quantidadeSeguidoresAtual;
    private int seguidoresPorDia;
    private int dia;

    public ContaUsuario(int seguidoresPorDia) {
        this.quantidadeSeguidoresAtual = 0;
        this.seguidoresPorDia = seguidoresPorDia;
        this.dia = 1;
    }

    public int getDia() {
        return dia;
    }

    public int getQuantidadeSeguidoresAtual() {
        return quantidadeSeguidoresAtual;
    }

    @Override
    public void run() {
        for(dia=1; dia <= 30; dia++){
            quantidadeSeguidoresAtual += seguidoresPorDia;

            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
