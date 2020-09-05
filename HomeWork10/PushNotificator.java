package HomeWork10;

public class PushNotificator implements INotificator {
    @Override
    public boolean send(ISender sender, IRecipient recipient, IContent content) {
        //sender отправляет пуш уведомление recipient с content внутри
        //если удачно - true, нет  - false
        return false;
    }
}
