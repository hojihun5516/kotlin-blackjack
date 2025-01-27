package blackjack.domains.participants

import blackjack.domains.deck.Card
import blackjack.domains.deck.Cards
import blackjack.domains.deck.PokerNumber
import blackjack.domains.deck.PokerShape
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class PlayerTest {
    @Test
    @DisplayName("player는 card를 한장 추가한다")
    fun `sut add card`() {
        // Arrange
        val player = Player("modernflow", Cards())

        // Act
        player.drawCard(Card(PokerNumber.ACE, PokerShape.CLOVER))

        // Assert
        assertThat(player.cards.values.size).isEqualTo(1)
    }
}
