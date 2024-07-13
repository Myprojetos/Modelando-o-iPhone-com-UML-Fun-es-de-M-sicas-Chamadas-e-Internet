package Apple.Smartphone.serviços;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerDeMusica {
    private List<Musica> listaDeMusicas;

    public PlayerDeMusica() {
        listaDeMusicas = new ArrayList<>();
        adicionarMusicas();
    }

    private void adicionarMusicas() {
        listaDeMusicas.add(new Musica("TZ Da Coronel - Faz isso Comigo Não"));
        listaDeMusicas.add(new Musica("Matue -  Anos Luz"));
        listaDeMusicas.add(new Musica("Matue - A morte do Autotune"));
        listaDeMusicas.add(new Musica("Matue - Banco"));
        listaDeMusicas.add(new Musica("Tz da Coronel - Se voce For Embora"));
        listaDeMusicas.add(new Musica("Yunk Vino - CyberPunk"));
        listaDeMusicas.add(new Musica("Yunk Vino - Leans Pt 2"));
        listaDeMusicas.add(new Musica("Yunk Vino - Beyonce 2"));
        listaDeMusicas.add(new Musica("Word A Music"));
        listaDeMusicas.add(new Musica("Yago Oproprio -  LA NOCHE"));
    }

    public void mostrarListaDeMusicas() {
        System.out.println("Lista de músicas disponíveis:");
        for (int i = 0; i < listaDeMusicas.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeMusicas.get(i).getTitulo());
        }
    }

    public void selecionarMusica(int indice) {
        if (indice >= 1 && indice <= listaDeMusicas.size()) {
            Musica musicaSelecionada = listaDeMusicas.get(indice - 1);
            tocarMusica(musicaSelecionada);
        } else {
            System.out.println("Índice inválido. Por favor, selecione um número entre 1 e " + listaDeMusicas.size());
        }
    }

    private void tocarMusica(Musica musica) {
        System.out.println("Musica selecionada: " + musica.getTitulo());
        System.out.println("Tocando música: " + musica.getTitulo());
    }

    public static void main(String[] args) {
        PlayerDeMusica player = new PlayerDeMusica();
        Scanner scanner = new Scanner(System.in);

        player.mostrarListaDeMusicas();
        System.out.print("Selecione uma música pelo número: ");
        int selecao = scanner.nextInt();
        
        player.selecionarMusica(selecao);
    }
}

