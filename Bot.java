import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.*;

public class Bot {
	public static JDA ourJDA;
	public static String prefix = "~";

	public static void main(String[] args) throws LoginException {

		ourJDA = new JDABuilder(AccountType.BOT).setToken("THETOKEN").build();
		ourJDA.getPresence().setStatus(OnlineStatus.IDLE);
		ourJDA.getPresence().setGame(Game.watching(""));
		// These commands we get from the Commands.java
		ourJDA.addEventListener(new Commands());
	}
}
