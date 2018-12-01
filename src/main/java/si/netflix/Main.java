package si.netflix;

import org.apache.log4j.BasicConfigurator;
import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");
        KieRuntimeLogger kLogger = ks.getLoggers().newFileLogger(kSession, "test");

        // go !
        kSession.fireAllRules();
        kLogger.close();
    }
}
