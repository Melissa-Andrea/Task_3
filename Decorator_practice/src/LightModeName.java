public class LightModeName extends BaseDecorator{

    public LightModeName(IShowUserName wrappee) {
        super(wrappee);
    }
    public String getUserName(String name) {
        super.getUserName(name);
        return "***" + name + "***" + "┬─┬ノ( º _ ºノ)";
       // return "***" + name + "***" + "┬─┬ノ( º _ ºノ)";
    }
}
