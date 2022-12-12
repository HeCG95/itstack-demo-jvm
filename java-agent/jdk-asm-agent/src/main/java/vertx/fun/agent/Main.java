package vertx.fun.agent;

import java.lang.instrument.Instrumentation;

public class Main {

    public static void premain(String agentArgs, Instrumentation instrumentation){
        instrumentation.addTransformer(new LogTransformer());
    }

}