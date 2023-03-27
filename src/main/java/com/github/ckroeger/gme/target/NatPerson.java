package com.github.ckroeger.gme.target;

import com.github.ckroeger.gme.source.Person;
import lombok.Data;

@Data
public class NatPerson extends Person {

   private String vorname;
   private String nachname;
}
