
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetProfile_QNAME = new QName("http://ws/", "getProfile");
    private final static QName _GetProfileResponse_QNAME = new QName("http://ws/", "getProfileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProfile }
     * 
     */
    public GetProfile createGetProfile() {
        return new GetProfile();
    }

    /**
     * Create an instance of {@link GetProfileResponse }
     * 
     */
    public GetProfileResponse createGetProfileResponse() {
        return new GetProfileResponse();
    }

    /**
     * Create an instance of {@link ProfileDTO }
     * 
     */
    public ProfileDTO createProfileDTO() {
        return new ProfileDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getProfile")
    public JAXBElement<GetProfile> createGetProfile(GetProfile value) {
        return new JAXBElement<GetProfile>(_GetProfile_QNAME, GetProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getProfileResponse")
    public JAXBElement<GetProfileResponse> createGetProfileResponse(GetProfileResponse value) {
        return new JAXBElement<GetProfileResponse>(_GetProfileResponse_QNAME, GetProfileResponse.class, null, value);
    }

}
