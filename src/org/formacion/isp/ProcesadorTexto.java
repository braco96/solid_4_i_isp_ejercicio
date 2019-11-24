package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementación de ProcesadorCorregible.
 * Permite añadir palabras, generar el texto completo
 * y verificar la corrección contra un Idioma.
 */
public class ProcesadorTexto implements ProcesadorCorregible {

    private List<String> texto = new ArrayList<>();

    @Override
    public void nueva(String palabra) {
        texto.add(palabra);
    }

    @Override
    public String texto() {
        return texto.stream().collect(Collectors.joining(" "));
    }

    @Override
    public boolean correcto(Idioma idioma) {
        for (String palabra : texto) {
            if (!idioma.getDiccionario().contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
