public class UnderlineName extends BaseDecorator{
    public UnderlineName(IShowUserName wrappee) {
        super(wrappee);
    }
    public String getUserName(String name) {

        //System.out.println("***" + name + "***" + "┬─┬ノ( º _ ºノ)");
        return "\033[4;30m"+ super.getUserName(name) +"\033[0m";
    }
}
