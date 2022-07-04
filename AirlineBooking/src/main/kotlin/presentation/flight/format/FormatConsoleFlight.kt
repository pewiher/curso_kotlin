package presentation.flight.format

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FormatConsoleFlight : Formatter<Flight> {
    override fun format(t: Flight): String {
        val departure = t.departureArrivalBooking.first
        val arrival = t.departureArrivalBooking.second
        return """
            ${t.number}
            Origin ${departure.airport.name}
            Origin DateTime ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            
            Arrival ${arrival.airport.name}
            Arrival DateTime ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            
            Duration: ${t.duration}
            Price: $${t.price}
            
        """.trimIndent()
    }
}

