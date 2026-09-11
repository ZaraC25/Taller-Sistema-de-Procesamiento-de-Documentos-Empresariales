import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GlobalDocs Solutions - Sistema de Procesamiento ===\n");

        // Instanciación de fábricas por país
        DocumentoFactory factoryColombia = new ColombiaDocumentoFactory();
        DocumentoFactory factoryMexico = new MexicoDocumentoFactory();
        DocumentoFactory factoryArgentina = new ArgentinaDocumentoFactory();
        DocumentoFactory factoryChile = new ChileDocumentoFactory();

        // Lote de prueba para Colombia
        List<SolicitudDocumento> loteColombia = List.of(
            new SolicitudDocumento("Factura Electrónica", "factura_001", "pdf"),
            new SolicitudDocumento("Contrato Legal", "contrato_empresa", "docx"),
            new SolicitudDocumento("Reporte Financiero", "balance_anual", "xlsx"),
            new SolicitudDocumento("Certificado Digital", "certificado", "png"), // Formato no permitido (Gnera error)
            new SolicitudDocumento("Declaración Tributaria", "retenciones_2026", "csv")
        );

        // Lote de prueba para México
        List<SolicitudDocumento> loteMexico = List.of(
            new SolicitudDocumento("Factura Electrónica", "cfdi_sat", "xml"), // Formato no permitido (Genera error)
            new SolicitudDocumento("Declaración Tributaria", "impuestos", "txt")
        );

        System.out.println("--- Procesando Lote: Colombia ---");
        procesarLote(factoryColombia, loteColombia);

        System.out.println("\n--- Procesando Lote: México ---");
        procesarLote(factoryMexico, loteMexico);

        System.out.println("\n--- Procesando Prueba Individual: Chile ---");
        factoryChile.procesarDocumento("Contrato Legal", "acuerdo_chile", "pdf");

        System.out.println("\n--- Procesando Prueba Individual: Argentina ---");
        factoryArgentina.procesarDocumento("Reporte Financiero", "informe_afip", "md");
    }

    // Procesamiento por lotes
    public static void procesarLote(DocumentoFactory factory, List<SolicitudDocumento> lote) {
        for (SolicitudDocumento doc : lote) {
            factory.procesarDocumento(doc.getTipo(), doc.getNombreArchivo(), doc.getFormato());
        }
    }
}
