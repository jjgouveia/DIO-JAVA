package Domain;

import Interface.NavegadorDeInternet;
import Interface.ReprodutorMusical;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorDeInternet {
    private int volume;
    private List<String> musicas;
    private String musicaAtual;

    private String paginaAtual;

    public Iphone(String modelo, String marca, String cor, String imei, SistemaOperacional sistemaOperacional) {
        super(modelo, marca, cor, imei, sistemaOperacional);
        this.volume = 40;
        this.musicas = List.of("Let it be", "Hey Jude", "Yesterday");
    }

    @Override
    public void ligar() {
        super.setStatus(Status.LIGADO);
        System.out.println("Ligando o Iphone");
    }

    @Override
    public void desligar() {
        super.setStatus(Status.DESLIGADO);
        System.out.println("Desligando o Iphone");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    @Override
    public void lerMensagem() {
        System.out.println("Lendo mensagem");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void reproduzir() {
        if(!this.musicas.isEmpty() || this.musicaAtual == null) {
            this.musicaAtual = this.musicas.get(0);
        }

        System.out.println("Reproduzindo música: " + this.musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void parar() {
        this.musicaAtual = null;
        System.out.println("Parando música");
    }

    @Override
    public void avancar() {
        if(this.musicas.indexOf(this.musicaAtual) == this.musicas.size() - 1) {
            System.out.println("Não há mais músicas para avançar");
            return;
        }

        this.musicaAtual = this.musicas.get(this.musicas.indexOf(this.musicaAtual) + 1);
        System.out.println("Avançando música");
    }

    @Override
    public void retornar() {
        if(this.musicas.indexOf(this.musicaAtual) == 0) {
            System.out.println("Não há mais músicas para retornar");
            return;
        }
        this.musicaAtual = this.musicas.get(this.musicas.indexOf(this.musicaAtual) - 1);
        System.out.println("Retornando música");
    }

    @Override
    public void aumentarVolume() {
        if(this.volume < 100) {
            this.volume += 5;
        } else {
            System.out.println("Volume máximo atingido");
        }
    }

    @Override
    public void abaixarVolume() {
        if(this.volume > 0) {
            this.volume -= 5;
        } else {
            System.out.println("Volume mínimo atingido");
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Carregando a página da DIO");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba disponível");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando a página");
        CompletableFuture.delayedExecutor(60, TimeUnit.SECONDS).execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Página recarregada");
            }
        });
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }
}
