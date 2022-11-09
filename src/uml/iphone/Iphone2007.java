package uml;

import uml.navegador.Navegador;
import uml.reprodutor.ReprodutorMusical;
import uml.telefone.AparelhoTelefonico;

public class Iphone2007 implements AparelhoTelefonico, Navegador, ReprodutorMusical {

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
}
