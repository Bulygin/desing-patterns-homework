package Builder;

import java.util.List;
import java.util.Objects;

public abstract class AEmailMessage implements IEmailMessage {

  List<IRecipient> recipients; // получатели
  IRecipient sender; // отправитель
  String body; // текст письма
  String subject; // тема письма
}
