package biblioteca.models;

import java.lang.reflect.*;

import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;

public class CReflection {
    public static void imprimirAtributos(Object object) {
        try {

            if (!(object instanceof ItemMultimidia || object instanceof Membro)) {
                throw new IllegalArgumentException("Membro ou Item Multimidia");
            }

            Class<?> class1 = object.getClass();
            for (Field f : class1.getFields()) {
                System.out.println(f);
            }

        }
        catch (IllegalArgumentException e) {
            System.err.println("Parametro incorreto: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void imprimirMetodos(Object object) {
        try {
            
            if (!(object instanceof ItemMultimidia || object instanceof Membro)) {
                throw new IllegalArgumentException("Membro ou Item Multimidia");
            }

            Class<?> class1 = object.getClass();
            for (Method m : class1.getMethods()) {
                System.out.println(m);
            }

        }
        catch (IllegalArgumentException e) {
            System.err.println("Parametro incorreto: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
