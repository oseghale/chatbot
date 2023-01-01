public class ChatbotService {

    String  language;

    public String helloMessage(){
        if(language.equals("english")){
            return "Happy New Year!";
        }else if(language.equals("spanish")){
            return "Feliz Año Nuevo!";
        }else if(language.equals("afrikaans")){
            return "Gelukkige Nuwe Jaar!";
        }
        return "language not programmed";
    }
}
