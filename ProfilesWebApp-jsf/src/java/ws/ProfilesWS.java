
package ws;

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
@WebService(name = "ProfilesWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProfilesWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns ws.ProfileDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfile", targetNamespace = "http://ws/", className = "ws.GetProfile")
    @ResponseWrapper(localName = "getProfileResponse", targetNamespace = "http://ws/", className = "ws.GetProfileResponse")
    @Action(input = "http://ws/ProfilesWS/getProfileRequest", output = "http://ws/ProfilesWS/getProfileResponse")
    public ProfileDTO getProfile(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
