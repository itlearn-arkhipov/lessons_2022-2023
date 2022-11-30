package classes.example11;

public class Main {
    public final String MY_VARIABLE_1 = "Variable Initialized";
    public final static String MY_VARIABLE_2;
    public final String MY_VARIABLE_3;
    public final String MY_VARIABLE_4;

    static {
        MY_VARIABLE_2 = "Static Varible Initialized";
    }

    {
        MY_VARIABLE_3 = "block Initialized";
    }

    public Main() {
        MY_VARIABLE_4 = "Constructor Initialized";
    }
}

