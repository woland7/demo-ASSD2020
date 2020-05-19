package it.unisannio.appplication;

import javax.ejb.Local;

@Local
public interface CurrencyConverterLocal {
   float convert(float euro);
}
