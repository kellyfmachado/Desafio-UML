classDiagram
    class ReprodutorMusical {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class AparelhoTelefonico {
        +atender() void
        +iniciarCorreioVoz() void
        +ligar(String numero) void
    }

    class NavegadorInternet {
        +atualizarPagina() void
        +adicionarNovaAba() void
        +exibirPagina(String url) void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

