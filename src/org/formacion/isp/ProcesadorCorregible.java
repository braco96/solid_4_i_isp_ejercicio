package org.formacion.isp;

/**
 * Interfaz avanzada que extiende la básica y añade corrección
 */
public interface ProcesadorCorregible extends ProcesadorBasico {
    boolean correcto(Idioma idioma);
}
