/*
Message personnalisés avec arguments
Crée une classe Message qui affiche un message différent selon l'arguent passé en ligne de commande
*/

public class Message {
    public static void main(String[] args){
        String message;
        switch(args[0]){
            case "français" : message = "Bonjour !"; break;
            case "anglais" : message = "Hello !"; break;
            case "espagnol" : message = "Hello !"; break;
            default: message = "Aucune langue spécifiée"; break;
        }

        System.out.println(message);
    }
}
