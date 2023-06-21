public class MessageSender {
        public void sendMessage(String message, String recipient) {
            System.out.println("Sending a general message to " + recipient + ": " + message);
            // Code to send a general message through a default channel
        }

        public void sendMessage(String message, String recipient, String channel) {
            System.out.println("Sending a message to " + recipient + " through " + channel + ": " + message);
            // Code to send a message through the specified channel
        }

        public void sendMessage(String message, String recipient, String channel, String attachment) {
            System.out.println("Sending a message to " + recipient + " through " + channel + " with attachment: " + message);
            // Code to send a message with attachment through the specified channel
        }
    }


