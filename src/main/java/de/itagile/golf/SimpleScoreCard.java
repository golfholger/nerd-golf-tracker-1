package de.itagile.golf;

public class SimpleScoreCard implements ScoreCard {

	private int currentHole = 1;
	private int score;

	public void increaseScore() {
		score++;
	}

	public void completeCurrentHole() {
		currentHole++;
	}

	public int score() {
		return score;
	}

	public int currentHole() {
		return currentHole;
	}
}