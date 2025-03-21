import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class StringManipulationService {

    @WebMethod
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @WebMethod
    public int countCharacters(String text) {
        return text.length();
    }
}