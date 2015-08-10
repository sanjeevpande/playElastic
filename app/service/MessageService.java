package service;

import model.Message;

import java.util.List;

/**
 * Created by Kavya on 10-08-2015.
 */
public interface MessageService {

    public Message saveMessage(Message message);

    public Message getMessage(String index);

    public List<Message> getMessages();

    public Message updateMessage(Message message);

    public boolean deleteMessage(Message message);
}
