import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EncryptDecrypt extends HttpServlet{

    protected void doPost(HttpServletRequest request,HttpServletResponse response)  throws IOException,ServletException{

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String text = request.getParameter("text");
        String option = request.getParameter("option");

        if (option.equals("Encrypt")){
            out.print(encrypt(text));
        }

        if (option.equals("Decrypt")){
            out.print(decrypt(text));
        }
        

    }

    String decrypt(String message) {
    String signal = message.substring(message.length() - 4);

    if (!signal.equals("e>#8")) {
        return "This Text Is Not Encoded OR Not Encoded By This Encoder";
    } else {
        String decodedMessage = "";

        for (int i = 0; i < message.length() - 4; i++) {
            int chrASCII = (int) message.charAt(i);
            char decodedChar = (char) (chrASCII - 15);
            decodedMessage += decodedChar;
        }

        return "Decoded Message = " + decodedMessage;
    }
}

String encrypt(String message) {
    String encodedMessage = "";

    for (int i = 0; i < message.length(); i++) {
        int chrASCII = (int) message.charAt(i);
        char encodedChar = (char) (chrASCII + 15);
        encodedMessage += encodedChar;
    }

    encodedMessage += "e>#8";

    return "Encoded Message = " + encodedMessage;
}

}