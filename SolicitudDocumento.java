public class SolicitudDocumento {
    private String tipo;
    private String nombreArchivo;
    private String formato;

    public SolicitudDocumento(String tipo, String nombreArchivo, String formato) {
        this.tipo = tipo;
        this.nombreArchivo = nombreArchivo;
        this.formato = formato;
    }

    public String getTipo() { return tipo; }
    public String getNombreArchivo() { return nombreArchivo; }
    public String getFormato() { return formato; }
}
