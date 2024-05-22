package celular;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        //Funções de reprodutor musical
        public void tocar(){
            System.out.println("Tocando música...");
        };
        public void pausar(){
            System.out.println("Pausando música...");
        };
        public void selecionarMusica (String musica){
            System.out.println("Selecionado música: " + musica);
        };

        //Funções de aparelho telefônico
        public void atender(){
            System.out.println("Atendendo ligação!");
        };
        public void iniciarCorreioVoz(){
            System.out.println("Iniciando correio de voz...");
        };
        public void ligar(String numero){
            System.out.println("Ligando para: " + numero);
        };
        
        //Funções de navegador de internet
        public void atualizarPagina(){
            System.out.println("Atualizando página!");
        };
        public void adicionarNovaAba(){
            System.out.println("Adicionando nova aba!");
        };
        public void exibirPagina(String url){
            System.out.println("Exibindo página: " + url);
        };
        
}
