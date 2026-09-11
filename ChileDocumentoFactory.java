public class ChileDocumentoFactory extends DocumentoFactory {
    @Override
    public Documento crearDocumento(String tipoDocumento) {
        return new DocumentoChile(tipoDocumento);
    }

    @Override
    protected String getPais() { return "Chile"; }
}
