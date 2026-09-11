public class ColombiaDocumentoFactory extends DocumentoFactory {
    @Override
    public Documento crearDocumento(String tipoDocumento) {
        return new DocumentoColombia(tipoDocumento);
    }

    @Override
    protected String getPais() { return "Colombia"; }
}
