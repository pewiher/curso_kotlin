package presentation.ticket.format

import domain.model.Ticket
import domain.presentation.Formatter

class FormatHtmlTicket : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            <strong>Flight : ${t.flight.number} - ${t.flight.price} - ${t.flight.airCraft.name} </strong>
            <p>Passenger: ${t.passenger.name}</p> <br/>
            Baggage: ${t.baggage.name}
            set: ${t.seat.number}
        """.trimIndent()
    }
}