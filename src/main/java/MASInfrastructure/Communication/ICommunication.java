package MASInfrastructure.Communication;

import MASInfrastructure.Agent.InfraAgentReference;

import java.util.ArrayList;
import java.util.Optional;

public interface ICommunication {

    void sendMessageBroadcast(MASInfrastructure.Communication.IMessage message);

    void sendMessage(MASInfrastructure.Communication.IMessage message);

    Optional<MASInfrastructure.Communication.IMessage> receiveMessage(InfraAgentReference reciever);

    ArrayList<MASInfrastructure.Communication.IMessage> receiveMessages(InfraAgentReference reciever);

}
