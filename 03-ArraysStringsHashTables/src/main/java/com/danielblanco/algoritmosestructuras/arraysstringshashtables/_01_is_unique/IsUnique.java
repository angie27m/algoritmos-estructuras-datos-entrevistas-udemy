package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.HashSet;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {

  private static int CHARS_QUANTITY = 128;

  public boolean isUnique(String text) {

    // Esta solución es de complejidad constante: O(1)
    if (text.length() > CHARS_QUANTITY) {
      return false;
    }

    // Esta solución es de complejidad líneal: O(n)
    Set<Character> characters = new HashSet<>();
    for (Character c : text.toCharArray()) {
      if (characters.contains(c)) {
        return false;
      } else {
        characters.add(c);
      }
    }

    return true;    
  }
}
