package Builder;

public interface IEmailMessage {

  void send(); // отправить письмо

  IEmailMessage receive(); // получить письмо

  IEmailMessage create(IRecipient sender, IRecipient... recepient); // создать письмо
}
