package com.github.ckroeger.gme.source;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Person {

   private String name1;
   private String name2;
   private String name3;

   private String strasse;

   private String hausnummer;

   private Integer postleitzahl;
   private List<Kommunikation> kommunikationen;

}
