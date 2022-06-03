import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserRegistration implements IUserRegistration{
    private final HashMap< EventName, List<IListener>> subscribers = new HashMap<>();

    public UserRegistration(EventName... operations){
        for (EventName operation : operations){
            subscribers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(IListener listener, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.add(listener);
    }

    public void unsubscribe(IListener listener, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.remove(listener);
    }
    @Override
    public void register(User newUser) {
        System.out.println("New user: " + newUser.getName());
        this.trigger(EventName.REGISTER, newUser);
    }

    private void trigger(EventName eventName, User event) {
        List<IListener> currentList = subscribers.get(eventName);
        for (IListener listener : currentList) {
            listener.notify(event);
        }
    }
}
