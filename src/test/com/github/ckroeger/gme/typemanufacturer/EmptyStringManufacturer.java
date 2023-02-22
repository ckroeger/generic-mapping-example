package com.github.ckroeger.gme.typemanufacturer;

import com.github.ckroeger.gme.TypeManufacturerHolder;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturer;

public class EmptyStringManufacturer implements TypeManufacturerHolder<String> {

   private EmptyStringManufacturer() {
      // get instance via getInstance()
   }

   @Override
   public TypeManufacturer<String> getTypeManufacturer() {
      return (dataProviderStrategy, attributeMetadata, map) -> "leer";
   }

   @Override
   public Class<String> getType() {
      return String.class;
   }

   public static EmptyStringManufacturer getInstance() {
      return new EmptyStringManufacturer();
   }
}
