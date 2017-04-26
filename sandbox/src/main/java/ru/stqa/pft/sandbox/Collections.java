package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Админ on 26.04.2017.
 */
public class Collections {

  public static void main (String [] agrs) {
    String[] langs = {"Java", "C#", "Python", "PHP"};

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for (String l: languages) {
      System.out.println("Я хочу выучить " + l);
    }
  }
}
