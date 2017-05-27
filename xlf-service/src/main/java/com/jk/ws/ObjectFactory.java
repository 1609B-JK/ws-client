
package com.jk.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
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

    private final static QName _Test3_QNAME = new QName("http://book.ws.jk.com/", "test3");
    private final static QName _Test2_QNAME = new QName("http://book.ws.jk.com/", "test2");
    private final static QName _Test2Response_QNAME = new QName("http://book.ws.jk.com/", "test2Response");
    private final static QName _TheFirstMethod_QNAME = new QName("http://book.ws.jk.com/", "TheFirstMethod");
    private final static QName _Test3Response_QNAME = new QName("http://book.ws.jk.com/", "test3Response");
    private final static QName _TheFirstMethodResponse_QNAME = new QName("http://book.ws.jk.com/", "TheFirstMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TheFirstMethodResponse }
     * 
     */
    public TheFirstMethodResponse createTheFirstMethodResponse() {
        return new TheFirstMethodResponse();
    }

    /**
     * Create an instance of {@link Test3Response }
     * 
     */
    public Test3Response createTest3Response() {
        return new Test3Response();
    }

    /**
     * Create an instance of {@link TheFirstMethod }
     * 
     */
    public TheFirstMethod createTheFirstMethod() {
        return new TheFirstMethod();
    }

    /**
     * Create an instance of {@link Test2Response }
     * 
     */
    public Test2Response createTest2Response() {
        return new Test2Response();
    }

    /**
     * Create an instance of {@link Test2 }
     * 
     */
    public Test2 createTest2() {
        return new Test2();
    }

    /**
     * Create an instance of {@link Test3 }
     * 
     */
    public Test3 createTest3() {
        return new Test3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "test3")
    public JAXBElement<Test3> createTest3(Test3 value) {
        return new JAXBElement<Test3>(_Test3_QNAME, Test3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "test2")
    public JAXBElement<Test2> createTest2(Test2 value) {
        return new JAXBElement<Test2>(_Test2_QNAME, Test2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "test2Response")
    public JAXBElement<Test2Response> createTest2Response(Test2Response value) {
        return new JAXBElement<Test2Response>(_Test2Response_QNAME, Test2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheFirstMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "TheFirstMethod")
    public JAXBElement<TheFirstMethod> createTheFirstMethod(TheFirstMethod value) {
        return new JAXBElement<TheFirstMethod>(_TheFirstMethod_QNAME, TheFirstMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "test3Response")
    public JAXBElement<Test3Response> createTest3Response(Test3Response value) {
        return new JAXBElement<Test3Response>(_Test3Response_QNAME, Test3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheFirstMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.ws.jk.com/", name = "TheFirstMethodResponse")
    public JAXBElement<TheFirstMethodResponse> createTheFirstMethodResponse(TheFirstMethodResponse value) {
        return new JAXBElement<TheFirstMethodResponse>(_TheFirstMethodResponse_QNAME, TheFirstMethodResponse.class, null, value);
    }

}
