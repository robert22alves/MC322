package biblioteca.models;

import java.lang.reflect.*;

import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;
import biblioteca.models.acervo.salas.Sala;
import biblioteca.models.servicos.Emprestimo;


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
    public static void imprimirLista (Arraylist<?> lista){
        try {

            if (!(lista.get(0) instanceof ItemMultimidia || lista.get(0) instanceof Membro || lista.get(0) instanceof Sala || lista.get(0) instanceof Emprestimo)) {
                throw new IllegalArgumentException("Membro, Item Multimidia, Sala ou Emprestimo");
            }

            Arraylist<?> array1 = lista.getField();
            for (Field a : array1.getField()) {
                System.out.println(a);
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
