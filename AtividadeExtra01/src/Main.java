import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de seguidores por dia: ");
        int seguidoresPordia = scanner.nextInt();

        ContaUsuario user = new ContaUsuario(seguidoresPordia);
        user.start();
        scanner.nextLine();
        do{
            System.out.println("\n------- MENU --------");
            System.out.println("[ 1 ] Visualisar quantidade de seguidores atual");
            System.out.println("[ 2 ] Encerrar");
            System.out.print("Resposta: ");
            resp = scanner.nextInt();

            if (resp == 1){
                System.out.println("Dia: "+ user.getDia() + "| Seguidores: " + user.getQuantidadeSeguidoresAtual());
            }
        }while(resp != 2);

        scanner.close();
    }
}
