package presentation.ticket.format

import domain.model.Ticket
import domain.presentation.Formatter

class FormatConsoleTicket : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            Flight : ${t.flight.number} - ${t.flight.price} - ${t.flight.airCraft.name}
            Passenger: ${t.passenger.name}
            Baggage: ${t.baggage.name}
            set: ${t.seat.number}
        """.trimIndent()
    }
}