package impressorasInterfacesEstudos.digitalizadora;

public class ScannerScan implements Digitalizadora {
    @Override
    public void digitalizando() {
        System.out.println("Digitalizando via Scanner");
    }
}
