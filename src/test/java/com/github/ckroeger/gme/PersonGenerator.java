package com.github.ckroeger.gme;

import com.github.ckroeger.gme.source.Person;
import lombok.extern.slf4j.Slf4j;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.Arrays;

@Slf4j
public class PersonGenerator {

   public Person generatePersonWithRandomData(Class<? extends Person> tClass){
      PodamFactory factory = new PodamFactoryImpl();
      return factory.manufacturePojo(tClass);
   }

   public Person generatePersonWithRandomData(Class<? extends Person> tClass, TypeManufacturerHolder... typeManufacturerHolders){
      PodamFactory factory = new PodamFactoryImpl();
      final DataProviderStrategy strategy = factory.getStrategy();
      Arrays.stream(typeManufacturerHolders).forEach(s -> strategy.addOrReplaceTypeManufacturer(s.getType(), s.getTypeManufacturer()));
      return factory.manufacturePojo(tClass);
   }

}
