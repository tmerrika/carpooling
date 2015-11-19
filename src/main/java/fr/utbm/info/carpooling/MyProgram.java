package fr.utbm.info.carpooling;

import fr.utbm.info.carpooling.agent.BootAgent;
import fr.utbm.info.carpooling.agent.DemandAgent;
import fr.utbm.info.carpooling.agent.RequestAgent;

import io.janusproject.Boot;
import io.janusproject.kernel.Kernel;
import io.janusproject.util.LoggerCreator;
import io.sarl.lang.core.Agent;

import java.util.logging.Level;

import com.google.inject.Module;
public class MyProgram {
    public static void main(String[] args) throws Exception {
    	Boot.setOffline(true);
		Boot.setVerboseLevel(LoggerCreator.toInt(Level.INFO));
		Boot.showJanusLogo();
    	
       /* Class<? extends Agent> agentType = MyAgent.class;
        Boot.startJanus(
            (Class<Module>) null,
            agentType,
            "abcde");*/
            
        // FIXME: It is preferable to launch a BootAgent, and create the RequestAgent and DemandAgent inside the BootAgent (in SARL)
        Class<? extends Agent> booter = BootAgent.class;
        Kernel kernel = Boot.startJanus(
            (Class<Module>) null,
            booter);
    }
}
