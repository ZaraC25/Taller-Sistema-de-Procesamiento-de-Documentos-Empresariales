public class MexicoDocumentoFactory extends DocumentoFactory {
    @Override
    public Documento crearDocumento(String tipoDocumento) {
        return new DocumentoMexico(tipoDocumento);
    }

    @Override
    protected String getPais() { return "México"; }
}
