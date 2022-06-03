import java.util.HashMap;

public class Inputs {
    HashMap<String, String> inputs = new HashMap<>();

    public Inputs(HashMap<String, String> inputs) {
        this.inputs = inputs;
    }

    public HashMap<String, String> getInputs() {
        return inputs;
    }

    public void sanitizerInput(String replace, String value){
        inputs.replace(replace, value);
    }
}
