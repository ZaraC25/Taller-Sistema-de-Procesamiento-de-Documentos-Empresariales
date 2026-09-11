import java.util.List;

public class DocumentoChile implements Documento {
    private String tipo;

    public DocumentoChile(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void procesar(String nombreArchivo, String formato) throws Exception {
        if (!esFormatoValido(formato)) {
            throw new IllegalArgumentException("Formato no soportado en Chile: " + formato);
        }
        System.out.println("[SII - Chile] Procesando " + tipo + " ('" + nombreArchivo + "." + formato + "') bajo regulaciones del SII.");
    }

    private boolean esFormatoValido(String formato) {
        return List.of("pdf", "doc", "docx", "md", "csv", "txt", "xlsx").contains(formato.toLowerCase());
    }

    @Override public String getTipo() { return tipo; }
    @Override public String getPais() { return "Chile"; }
}
