import java.util.List;

public class DocumentoMexico implements Documento {
    private String tipo;

    public DocumentoMexico(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void procesar(String nombreArchivo, String formato) throws Exception {
        if (!esFormatoValido(formato)) {
            throw new IllegalArgumentException("Formato no soportado en México: " + formato);
        }
        System.out.println("[SAT - México] Procesando " + tipo + " ('" + nombreArchivo + "." + formato + "') bajo regulaciones del SAT.");
    }

    private boolean esFormatoValido(String formato) {
        return List.of("pdf", "doc", "docx", "md", "csv", "txt", "xlsx").contains(formato.toLowerCase());
    }

    @Override public String getTipo() { return tipo; }
    @Override public String getPais() { return "México"; }
}
