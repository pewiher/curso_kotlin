package domain.model.baggage.pack.vclub

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubClassic(price: BigDecimal) : VClub(price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
    override val name: String = "Classic Plus"
}