
package Body;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Body package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerificarSaldo_QNAME = new QName("http://Service/", "VerificarSaldo");
    private final static QName _VerificarSaldoResponse_QNAME = new QName("http://Service/", "VerificarSaldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Body
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificarSaldo }
     * 
     */
    public VerificarSaldo createVerificarSaldo() {
        return new VerificarSaldo();
    }

    /**
     * Create an instance of {@link VerificarSaldoResponse }
     * 
     */
    public VerificarSaldoResponse createVerificarSaldoResponse() {
        return new VerificarSaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "VerificarSaldo")
    public JAXBElement<VerificarSaldo> createVerificarSaldo(VerificarSaldo value) {
        return new JAXBElement<VerificarSaldo>(_VerificarSaldo_QNAME, VerificarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarSaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "VerificarSaldoResponse")
    public JAXBElement<VerificarSaldoResponse> createVerificarSaldoResponse(VerificarSaldoResponse value) {
        return new JAXBElement<VerificarSaldoResponse>(_VerificarSaldoResponse_QNAME, VerificarSaldoResponse.class, null, value);
    }

}
