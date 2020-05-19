package it.unisannio;



import it.unisannio.appplication.CurrencyConverterLocal;

import javax.ejb.Stateless;


/**
 * Session Bean implementation class CurrencyConverter
 */
@Stateless
public class CurrencyConverter implements CurrencyConverterLocal {
    private final float convFactor = 1.087f;
    /**
     * Default constructor. 
     */
    public CurrencyConverter() {
        // TODO Auto-generated constructor stub
    }
    public float convert(float euro) {
    	return euro*convFactor;
    }

}
