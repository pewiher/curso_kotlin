package domain.model

import domain.model.baggage.pack.BaggagePackage
import domain.model.seat.Seat
import domain.presentation.Formatter
import java.math.BigDecimal

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggage: BaggagePackage,
    val seat: Seat,
    val totalPrice: BigDecimal = flight.price + baggage.price + seat.price
)  {
    /*
    override fun format(): String {
        return """
            Flight : ${flight.number} - ${flight.price} - ${flight.airCraft.name}
            Passenger: ${passenger.name}
            Baggage: ${baggage.name}
            set: ${seat.number}
        """.trimIndent()
    }*/

}
