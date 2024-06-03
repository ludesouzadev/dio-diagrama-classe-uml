
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorWeb navegadorWeb;

    // Métodos de ReprodutorMusical
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void retomarMusica() {
        System.out.println("Retomando música.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Ajustando o volume para: " + volume);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void efetuarChamada(String numero) {
        System.out.println("Efetuando chamada para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void recusarChamada() {
        System.out.println("Recusando chamada.");
    }

    // Métodos de NavegadorWeb
    @Override
    public void acessarPagina(String url) {
        System.out.println("Acessando página: " + url);
    }

    @Override
    public void navegarPagina() {
        System.out.println("Navegando na página.");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}
