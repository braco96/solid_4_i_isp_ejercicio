package org.formacion.isp;

import java.util.Arrays;
import java.util.List;

/**
 * Enum que define los idiomas y sus diccionarios
 */
public enum Idioma {
    EN("i", "am", "angry"),
    ES("tengo", "hambre", "no", "himporta", "la", "hortografia"),
    CA("tenc", "fam");

    private final List<String> diccionario;

    Idioma(String... palabras) {
        this.diccionario = Arrays.asList(palabras);
    }

    public List<String> getDiccionario() {
        return diccionario;
    }
}
