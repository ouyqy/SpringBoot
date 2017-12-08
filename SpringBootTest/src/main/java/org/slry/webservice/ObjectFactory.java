
package org.slry.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.slry.webservice package. 
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

    private final static QName _GetSlryXX_QNAME = new QName("http://webservice.slry.org/", "getSlryXX");
    private final static QName _GetSlryXXResponse_QNAME = new QName("http://webservice.slry.org/", "getSlryXXResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.slry.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSlryXX }
     * 
     */
    public GetSlryXX createGetSlryXX() {
        return new GetSlryXX();
    }

    /**
     * Create an instance of {@link GetSlryXXResponse }
     * 
     */
    public GetSlryXXResponse createGetSlryXXResponse() {
        return new GetSlryXXResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSlryXX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.slry.org/", name = "getSlryXX")
    public JAXBElement<GetSlryXX> createGetSlryXX(GetSlryXX value) {
        return new JAXBElement<GetSlryXX>(_GetSlryXX_QNAME, GetSlryXX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSlryXXResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.slry.org/", name = "getSlryXXResponse")
    public JAXBElement<GetSlryXXResponse> createGetSlryXXResponse(GetSlryXXResponse value) {
        return new JAXBElement<GetSlryXXResponse>(_GetSlryXXResponse_QNAME, GetSlryXXResponse.class, null, value);
    }

}
