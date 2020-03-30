package Builder;

import java.util.List;

public class EmailMessage extends AEmailMessage {

  private List<IRecipient> recipients; // получатели
  private IRecipient sender; // отправитель
  private String body; // текст письма
  private String subject; // тема письма

  private EmailMessage(MessageBuilder emailMessageBuilder) {
    this.recipients = emailMessageBuilder.recipients;
    this.sender = emailMessageBuilder.sender;
    this.body = emailMessageBuilder.body;
    this.subject = emailMessageBuilder.subject;
  }

  @Override
  public void send() {

  }

  @Override
  public IEmailMessage receive() {
    return null;
  }

  @Override
  public IEmailMessage create(IRecipient sender, IRecipient... recepient) {
    return null;
  }

  static class MessageBuilder {

    List<IRecipient> recipients; // получатели
    IRecipient sender; // отправитель
    String body; // текст письма
    String subject; // тема письма

    MessageBuilder buildRecipients(List<IRecipient> recipients) {
      this.recipients = recipients;
      return this;
    }

    MessageBuilder buildSender(ARecipient recipient) {
      this.sender = recipient;
      return this;
    }

    MessageBuilder buildBody(String body) {
      this.body = body;
      return this;
    }

    MessageBuilder buildSubject(String subject) {
      this.subject = subject;
      return this;
    }

    AEmailMessage build() {
      return new EmailMessage(this);
    }
  }
}
