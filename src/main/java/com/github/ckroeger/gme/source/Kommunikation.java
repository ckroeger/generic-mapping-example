package com.github.ckroeger.gme.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Kommunikation {

   private final KomType type;

   private final String value;
}
