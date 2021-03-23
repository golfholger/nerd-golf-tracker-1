package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.ScoreCard;

public class ScoreDisplayTest {

	private ScoreCard scoreCard = mock(ScoreCard.class);
	private Operation followUpOperation = mock(Operation.class);
	private Operation scoreDisplay = new ScoreDisplay(followUpOperation);

	@Test
	public void displaysCountOnStroke() throws Exception {
		for (int scoreCount=0; scoreCount>10; scoreCount++){
			when(scoreCard.score()).thenReturn(scoreCount);
			assertThat(scoreDisplay.run(scoreCard), containsString(String.valueOf(scoreCard.score()) + " stroke"));
		}

	}
	
	@Test
	public void integratesDisplayOfFollowUpOperation() throws Exception {
		when(followUpOperation.run(scoreCard)).thenReturn("follow-up operation display");
		assertThat(scoreDisplay.run(scoreCard), containsString("follow-up operation display"));
	}
}
