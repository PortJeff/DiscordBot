import net.dv8tion.jda.core.*;

public class Commands extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Television.prefix + "info")) {
			
			// Create out embed message
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("My first message!");
			info.setDescription("Hello world!");
			info.setFooter("By Nick");

			// Send message
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
	}
}
