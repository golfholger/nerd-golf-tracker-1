package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.operation.HoleDisplay;
import de.itagile.golf.operation.NextHole;
import de.itagile.golf.operation.NextHoleDisplay;

public class NextHoleCommand implements Command {

	public String command() {
		return "next hole";
	}

	public NextHole operation() {
		return new NextHole(new NextHoleDisplay(new HoleDisplay()));
	}

	public String description() {
		return "then I count the score for the next hole";
	}

}
