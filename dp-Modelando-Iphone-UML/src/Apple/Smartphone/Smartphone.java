package Apple.Smartphone;

import java.util.Scanner;

import Apple.Smartphone.serviços.InterfaceNavegadorWeb;
import Apple.Smartphone.serviços.InterfaceReprodutorMusical;
import Apple.Smartphone.serviços.InterfaceTelefone;
import Apple.Smartphone.serviços.PlayerDeMusica;
import Apple.Smartphone.serviços.PlayerDeMusica;

public class Smartphone implements InterfaceNavegadorWeb, InterfaceReprodutorMusical, InterfaceTelefone {
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }


    public static void main(String[] args) {
        int op, op1, op2, op3, op4, op5, op6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ IPHONE 1 ------");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Pagina inicial");
        System.out.println(".");
        System.out.println(".");
        System.out.println(" 1 - Musicas");
        System.out.println("Selecione sua opção:");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
            System.out.println("--- Bem Vindo a Sua Playlist de Musica ---");
            System.out.println(".");
            do{
            PlayerDeMusica player = new PlayerDeMusica();
    
            player.mostrarListaDeMusicas();
            System.out.print("Selecione uma música pelo número: ");
            int selecao = scanner.nextInt();
            System.out.println("__________________________________________________");
            System.out.println(".");
            player.selecionarMusica(selecao);
            System.out.println("__________________________________________________");
            System.out.println(".");
            System.out.println("1 - Selecionar musica");
            System.out.println("2 - Voltar ao menu");
            System.out.println(".");
            System.out.println("Digite a opção desejada: ");
            op1 = scanner.nextInt();
            } while (op1 == 1);
                break;
            
            default:
                break;
        }

    }

}
