package it.unisannio.logic;

import javax.ejb.Local;

@Local
public interface ConverterLogicLocal {
    double convertToDollar(double euro);
}
