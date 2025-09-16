/*
Message personnalisés avec arguments
Crée une classe Message qui affiche un message différent selon l'arguent passé en ligne de commande
*/

public class Message {
    public static void main(String[] args){
        String message = switch(args[0]) {
            case "français" -> "Bonjour !";
            case "anglais" -> "Hello !";
            case "espagnol" -> "Hola !";
            default -> "Aucune langue spécifiée";
        };

        System.out.println(message);
    }
}
