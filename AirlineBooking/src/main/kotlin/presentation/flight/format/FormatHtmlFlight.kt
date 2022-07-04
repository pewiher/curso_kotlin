package presentation.flight.format

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FormatHtmlFlight : Formatter<Flight> {
    override fun format(t: Flight): String {
        val departure = t.departureArrivalBooking.first
        val arrival = t.departureArrivalBooking.second
        return """
            ${t.number}
            <strong>Origin ${departure.airport.name} </strong> <br/>
            <p>Origin DateTime ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}</p>
            
            Arrival ${arrival.airport.name}
            Arrival DateTime ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            
            Duration: ${t.duration}
            Price: $${t.price}
            
        """.trimIndent()
    }
}