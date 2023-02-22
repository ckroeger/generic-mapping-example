package com.github.ckroeger.gme;

import uk.co.jemos.podam.typeManufacturers.TypeManufacturer;

public Interface TypeManufacturerHolder<T> {

   TypeManufacturer<T> getTypeManufacturer();

   Class<T> getType();
}
