package impressorasInterfacesEstudos.multifuncional;

import impressorasInterfacesEstudos.copiadora.Copiadora;
import impressorasInterfacesEstudos.digitalizadora.Digitalizadora;
import impressorasInterfacesEstudos.impresssora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via Multifuncional");
    }

    @Override
    public void digitalizando() {
        System.out.println("Digitalizando via Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiindo via Multifuncional");
    }
}
