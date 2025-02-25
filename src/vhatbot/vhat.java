package vhatbot;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
public class vhat {
        public static String generateResponse(String input) {
            String response = "Sorry, i did not understand this";
            if (input.matches("(?i).*\\b(hi|hello|hey|namaste|greetings)\\b.*")) {
                response = "Hey! How can I help you?";
            } else if (input.matches("(?i).*\\b(weather|rain|sun|cloud|forecast)\\b.*")) {
                response = "I can't tell you about weather but I suggest you to check your  weather forecast";
            } else if (input.matches("(?i).*\\b(name|who are you)\\b.*")) {
                response = "I am an AIBOT. How can I help you?";
            } else if (input.matches("(?i).*\\b(time|date)\\b.*")) {
                response = "I can't check the time for you, but you can easily check your clock!";
            } else if (input.matches("(?i).*\\b(bye|goodbye|see you soon)\\b.*")) {
                response = "Goodbye! see you soon!";
            } else if (input.matches("(?i).*\\b(how are you)\\b.*")) {
                response = "I'm doing great, How can I help you?";
            }

            return response;
        }
        public static void simulateConversation() {
            List<String> userInputs = new ArrayList<>();
            userInputs.add("hello");
            userInputs.add("What is the weather today?");
            userInputs.add("How are you?");
            userInputs.add("Who are you?");
            userInputs.add("Tell me the time");
            userInputs.add("goodbye");
            for (String input : userInputs) {
                System.out.println("User: " + input);
                String botResponse = generateResponse(input);
                System.out.println("Bot: " + botResponse);
                System.out.println();
            }
        }
        public static void main(String[] args) {
            simulateConversation();
        }
    }


