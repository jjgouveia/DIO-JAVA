import Domain.Iphone;
import Domain.SistemaOperacional;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("11", "Apple", "Preto", "123456789", SistemaOperacional.IOS);
        iphone.ligar();
        System.out.println(iphone.getMarca());
        System.out.println(iphone.getStatus());
        iphone.reproduzir();
        iphone.avancar();
        System.out.println(iphone.getMusicaAtual());
        iphone.avancar();
        System.out.println(iphone.getMusicaAtual());
        iphone.avancar();
    }
}