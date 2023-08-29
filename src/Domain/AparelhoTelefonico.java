package Domain;

public abstract class AparelhoTelefonico {
    private int numero;
    private String modelo;
    private String marca;
    private String cor;
    private String imei;
    private SistemaOperacional sistemaOperacional;

    private Status status;

    public AparelhoTelefonico(String modelo, String marca, String cor, String imei, SistemaOperacional sistemaOperacional) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.imei = imei;
        this.sistemaOperacional = sistemaOperacional;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void fazerChamada();
    public abstract void atenderChamada();
    public abstract void enviarMensagem();
    public abstract void lerMensagem();
    public abstract void iniciarCorreioVoz();

    public int getNumero() {
        return numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImei() {
        return imei;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }
}
