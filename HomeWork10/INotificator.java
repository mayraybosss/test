package HomeWork10;

public interface INotificator {

    boolean send(ISender sender, IRecipient recipient, IContent content);

}
