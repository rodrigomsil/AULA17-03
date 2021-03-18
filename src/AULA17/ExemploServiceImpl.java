package AULA17;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "AULA17.ExemploService")
public class ExemploServiceImpl implements ExemploService {


    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @WebMethod
    public String nome(String name) {
        return "Rodrigo Miranda Silva";
    }
}