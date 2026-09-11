import java.util.List;

public class DocumentoArgentina implements Documento {
    private String tipo;

    public DocumentoArgentina(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void procesar(String nombreArchivo, String formato) throws Exception {
        if (!esFormatoValido(formato)) {
            throw new IllegalArgumentException("Formato no soportado en Argentina: " + formato);
        }
        System.out.println("[AFIP - Argentina] Procesando " + tipo + " ('" + nombreArchivo + "." + formato + "') bajo normativas de AFIP.");
    }

    private boolean esFormatoValido(String formato) {
        return List.of("pdf", "doc", "docx", "md", "csv", "txt", "xlsx").contains(formato.toLowerCase());
    }

    @Override public String getTipo() { return tipo; }
    @Override public String getPais() { return "Argentina"; }
}
