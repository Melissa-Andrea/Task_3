public class DarkModeName extends BaseDecorator{
    public DarkModeName(IShowUserName wrappee) {
        super(wrappee);
    }

    public String getUserName(String name) {

        //System.out.println("!!!"+"\033[4;30m" + name + "(╯°□°)╯︵ ┻━┻");
        return "!!!"+  super.getUserName(name) +"!!!"+ "(╯°□°)╯︵ ┻━┻";
    }
}
