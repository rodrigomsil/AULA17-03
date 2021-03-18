
package AULA17.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExemploServiceImplService", targetNamespace = "http://AULA17/", wsdlLocation = "http://localhost:8080/exemplo?wsdl")
public class ExemploServiceImplService
    extends Service
{

    private final static URL EXEMPLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXEMPLOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EXEMPLOSERVICEIMPLSERVICE_QNAME = new QName("http://AULA17/", "ExemploServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/exemplo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXEMPLOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EXEMPLOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ExemploServiceImplService() {
        super(__getWsdlLocation(), EXEMPLOSERVICEIMPLSERVICE_QNAME);
    }

    public ExemploServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXEMPLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public ExemploServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EXEMPLOSERVICEIMPLSERVICE_QNAME);
    }

    public ExemploServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXEMPLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public ExemploServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExemploServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExemploService
     */
    @WebEndpoint(name = "ExemploServiceImplPort")
    public ExemploService getExemploServiceImplPort() {
        return super.getPort(new QName("http://AULA17/", "ExemploServiceImplPort"), ExemploService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExemploService
     */
    @WebEndpoint(name = "ExemploServiceImplPort")
    public ExemploService getExemploServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://AULA17/", "ExemploServiceImplPort"), ExemploService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXEMPLOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EXEMPLOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EXEMPLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
