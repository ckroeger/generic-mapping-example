package com.github.ckroeger.gme.typemanufacturer;

import com.github.ckroeger.gme.TypeManufacturerHolder;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturer;

public class IntegerManufacturer implements TypeManufacturerHolder<Integer> {

   private IntegerManufacturer() {
      // get instance via getInstance()
   }

   @Override
   public TypeManufacturer<Integer> getTypeManufacturer() {
      return (dataProviderStrategy, attributeMetadata, map) -> Integer.valueOf(-1);
   }

   @Override
   public Class<Integer> getType() {
      return Integer.class;
   }

   public static IntegerManufacturer getInstance() {
      return new IntegerManufacturer();
   }
}
