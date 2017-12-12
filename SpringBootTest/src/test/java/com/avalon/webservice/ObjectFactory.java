
package com.avalon.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avalon.webservice package. 
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

    private final static QName _ReturnString_QNAME = new QName("http://webservice.avalon.com/", "returnString");
    private final static QName _ReturnStringResponse_QNAME = new QName("http://webservice.avalon.com/", "returnStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avalon.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnString }
     * 
     */
    public ReturnString createReturnString() {
        return new ReturnString();
    }

    /**
     * Create an instance of {@link ReturnStringResponse }
     * 
     */
    public ReturnStringResponse createReturnStringResponse() {
        return new ReturnStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.avalon.com/", name = "returnString")
    public JAXBElement<ReturnString> createReturnString(ReturnString value) {
        return new JAXBElement<ReturnString>(_ReturnString_QNAME, ReturnString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.avalon.com/", name = "returnStringResponse")
    public JAXBElement<ReturnStringResponse> createReturnStringResponse(ReturnStringResponse value) {
        return new JAXBElement<ReturnStringResponse>(_ReturnStringResponse_QNAME, ReturnStringResponse.class, null, value);
    }

}
