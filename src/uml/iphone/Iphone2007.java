package uml.iphone;

import uml.navegador.Navegador;
import uml.reprodutor.ReprodutorMusical;
import uml.reprodutordevideo.ReprodutorDeVideo;
import uml.telefone.AparelhoTelefonico;

public class Iphone2007 implements AparelhoTelefonico, Navegador, ReprodutorMusical, ReprodutorDeVideo {

    public Iphone2007() {

    }
    @Override
    public void ligar() {
        System.out.println("Ligando aparelho");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void correioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void mutar() {
        System.out.println("Mutando");
    }

    @Override
    public void holdCall() {
        System.out.println("Contato Aguardando");
    }

    @Override
    public void viewContact() {
        System.out.println("Verificando informações do contato");
    }

    @Override
    public void criarConferencia() {
        System.out.println("Adicionando pessoas a chamada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPaginar() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }


    @Override
    public void iniciarVideo() {
        System.out.println("Iniciando vídeo");
    }

    @Override
    public void escolherVideo() {
        System.out.println("Escolhendo vídeo");
    }

    @Override
    public void carregarLegenda() {
        System.out.println("Carregando Legenda");
    }

    @Override
    public void escolherLinguagem() {
        System.out.println("Escolher idioma");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagens");
    }

    @Override
    public void visualizarMensagem() {
        System.out.println("Visualizando mensagens");
    }

    public void inserirWallpaper() {
        System.out.println("Inserindo imagem de fundo");
    }
}
