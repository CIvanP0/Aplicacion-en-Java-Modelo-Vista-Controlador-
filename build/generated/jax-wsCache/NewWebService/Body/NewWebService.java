
package Body;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "VerificarSaldo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VerificarSaldo", targetNamespace = "http://Service/", className = "Body.VerificarSaldo")
    @ResponseWrapper(localName = "VerificarSaldoResponse", targetNamespace = "http://Service/", className = "Body.VerificarSaldoResponse")
    @Action(input = "http://Service/NewWebService/VerificarSaldoRequest", output = "http://Service/NewWebService/VerificarSaldoResponse")
    public boolean verificarSaldo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

}