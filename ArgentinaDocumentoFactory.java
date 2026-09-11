public class ArgentinaDocumentoFactory extends DocumentoFactory {
    @Override
    public Documento crearDocumento(String tipoDocumento) {
        return new DocumentoArgentina(tipoDocumento);
    }

    @Override
    protected String getPais() { return "Argentina"; }
}
