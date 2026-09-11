public interface Documento {
    void procesar(String nombreArchivo, String formato) throws Exception;
    String getTipo();
    String getPais();
}
