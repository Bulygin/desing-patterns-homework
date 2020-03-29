package Builder;


import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageBuilderTest {

  MessageBuilder messageBuilderTestOne = new MessageBuilder();
  ARecipient recipient = new ARecipient() {
    public void create(String username, String address) {
      this.Username = "TestUserNameRecipient";
      this.Address = "TestAddressRecipient";
    }
  };
  ARecipient sender = new ARecipient() {
    public void create(String username, String address) {
      this.Address = "TestUserNameSender";
      this.Username = "TestAddressSender";
    }
  };
  List<IRecipient> recipients = new ArrayList<IRecipient>();
  AEmailMessage messageOne = new AEmailMessage() {
    public void send() {

    }

    public IEmailMessage receive() {
      return null;
    }

    public IEmailMessage create(IRecipient sender, IRecipient... recepient) {
      return null;
    }
  };

  @Before
  public void createMessageWithoutBuilder() {
    messageOne.body = "TestBody";
    messageOne.subject = "TestSubject";
    messageOne.sender = sender;
    messageOne.recipients = recipients;
  }

  @Test
  public void getMessage_createMessageWithBuilderAndCompare_MustBeSame() {
    messageBuilderTestOne.createMessage();
    messageBuilderTestOne.buildBody("TestBody");
    recipients.add(recipient);
    messageBuilderTestOne.buildRecipients(recipients);
    messageBuilderTestOne.buildSender(sender);
    messageBuilderTestOne.buildSubject("TestSubject");
    AEmailMessage messageTwo = messageBuilderTestOne.getMessage();
    Assert.assertEquals(messageTwo.body, messageOne.body);
    Assert.assertEquals(messageTwo.subject, messageOne.subject);
    Assert.assertEquals(messageTwo.recipients, messageOne.recipients);
    Assert.assertEquals(messageTwo.sender, messageOne.sender);
  }
}