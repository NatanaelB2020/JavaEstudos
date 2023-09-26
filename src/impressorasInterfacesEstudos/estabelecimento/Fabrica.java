package impressorasInterfacesEstudos.estabelecimento;

import impressorasInterfacesEstudos.copiadora.Copiadora;
import impressorasInterfacesEstudos.digitalizadora.Digitalizadora;
import impressorasInterfacesEstudos.impresssora.Deskjet;
import impressorasInterfacesEstudos.impresssora.Impressora;
import impressorasInterfacesEstudos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional multifuncional = new Multifuncional();

        Deskjet deskjet = new Deskjet();
        Impressora impressora = deskjet;
        Copiadora copiadora = multifuncional;
        Digitalizadora digitalizadora = multifuncional;
//
//        Impressora impressora = new Deskjet();
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizando();
    }
}
