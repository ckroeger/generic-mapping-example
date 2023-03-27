package com.github.ckroeger.gme;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ckroeger.gme.source.Person;
import com.github.ckroeger.gme.typemanufacturer.EmptyStringManufacturer;
import com.github.ckroeger.gme.typemanufacturer.IntegerManufacturer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class PersonGeneratorTest {

   @Test
   void generatePersonWithRandomData() {
      PersonGenerator uut = new PersonGenerator();
      final Person person = uut.generatePersonWithRandomData();
      log.info(objectAsJSON(person));
   }

   @Test
   void generatePersonWithDefinedData() {
      PersonGenerator uut = new PersonGenerator();
      final Person person = uut.generatePersonWithRandomData(EmptyStringManufacturer.getInstance(), IntegerManufacturer.getInstance());
      log.info(objectAsJSON(person));
   }

   private static String objectAsJSON(Object object) {
      try {
         ObjectMapper mapper = new ObjectMapper();
         return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
      } catch (JsonProcessingException e) {
         return "error converting in json " + e.getMessage();
      }
   }
}