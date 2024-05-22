package usuario;

import celular.Iphone;

public class UsuarioFinal {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Perfeita Simetria");

        iphone.ligar("64992230594");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://github.com/kellyfmachado/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
