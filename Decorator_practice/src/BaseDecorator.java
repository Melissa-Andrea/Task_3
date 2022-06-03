public class BaseDecorator implements IShowUserName{

    private IShowUserName wrappee;

    public BaseDecorator(IShowUserName wrappee) {
        this.wrappee = wrappee;
    }

    public String getUserName(String name) {
      return wrappee.getUserName(name);
    }
}
