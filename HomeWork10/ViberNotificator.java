package HomeWork10;

public class ViberNotificator implements INotificator {
    @Override
    public boolean send(ISender sender, IRecipient recipient, IContent content) {
        //sender отправляет viber message со своего номера на номер recipient с content внутри
        //если удачно - true, нет  - false
        return false;
    }
}
