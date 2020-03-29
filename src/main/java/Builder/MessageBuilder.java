package Builder;

import java.util.List;


public class MessageBuilder {

  AEmailMessage message;

  void createMessage() {
    message = new AEmailMessage() {
      public void send() {
      }

      public IEmailMessage receive() {
        return null;
      }

      public IEmailMessage create(IRecipient sender, IRecipient... recepient) {
        return null;
      }
    };
  }

  void buildRecipients(List<IRecipient> recipients) {
    message.recipients = recipients;
  }

  void buildSender(ARecipient recipient) {
    message.sender = recipient;
  }

  void buildBody(String body) {
    message.body = body;
  }

  void buildSubject(String subject) {
    message.subject = subject;
  }


  AEmailMessage getMessage() {
    return message;
  }
}
