public class Content {
    
    private final String title;
    private final String imageUrl;

    public Content(String titulo, String urlImagem) {
        this.title = titulo;
        this.imageUrl = urlImagem;
    }

    public String getTitulo() {
        return title;
    }
    public String getUrlImagem() {
        return imageUrl;
    }
    
}
