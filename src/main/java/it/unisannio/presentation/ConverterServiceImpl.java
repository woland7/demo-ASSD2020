package it.unisannio.presentation;

import it.unisannio.logic.ConverterLogicLocal;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/converter")
public class ConverterServiceImpl implements ConverterService{
    @EJB
    ConverterLogicLocal converterLogic;

    @Override
    public Response convert(double euro) {
        double dollar = converterLogic.convertToDollar(euro);
        return MyResposeBuilder.createResponse(Response.Status.OK, dollar);
    }
}
