public abstract class DocumentoFactory {
    
    // Método Factory abstracto
    public abstract Documento crearDocumento(String tipoDocumento);

    // Método principal de negocio
    public void procesarDocumento(String tipo, String nombreArchivo, String formato) {
        try {
            Documento doc = crearDocumento(tipo);
            doc.procesar(nombreArchivo, formato);
        } catch (Exception e) {
            System.err.println("❌ Error al procesar documento en " + getPais() + ": " + e.getMessage());
        }
    }

    protected abstract String getPais();
}
