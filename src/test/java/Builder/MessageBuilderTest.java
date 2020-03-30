package Builder;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MessageBuilderTest {

  @Test
  public void getMessage_createMessageWithBuilderAndCompare_MustBeSame() {
    EmailMessage.MessageBuilder messageBuilder = new EmailMessage.MessageBuilder();
    ARecipient recipient = new ARecipient() {
      @Override
      public void create(String username, String address) {

      }
    };
    List<IRecipient> recipients = new ArrayList<>();

    AEmailMessage message = messageBuilder.buildSubject("subject").buildSender(recipient)
        .buildRecipients(recipients).buildBody("body").build();
    AEmailMessage messageTwo = messageBuilder.build();

    Assert.assertEquals(message, messageTwo);
  }
}