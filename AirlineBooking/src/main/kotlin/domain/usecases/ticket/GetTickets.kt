package domain.usecases.ticket

import domain.model.*
import domain.model.baggage.pack.regular.RegularBasic
import domain.model.seat.Seat
import domain.model.seat.SeatClass
import domain.model.seat.SeatStatus
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetTickets(
    val formatter: Formatter<Ticket>
) {
    fun invoke(): String {
        var flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320", Airline(
                "FF03",
                "Peter Flight"
                ),
            ),
            price = BigDecimal(100.00),
            departureArrivalBooking = getAirportPair()
        )

        val ticket = Ticket(
            flight,
            Passenger("Peter", "peter@gmail.com", "123456"),
            RegularBasic(BigDecimal(20)),
            Seat("E002", BigDecimal(20), SeatStatus.RESERVED, SeatClass.ECONOMY)
        )

        val tickets = listOf(
            ticket,
            ticket,
            ticket
        )

        return formatter.format(tickets)
    }

    private fun getAirportPair(): Pair<AirportBooking, AirportBooking> {
        return Pair(
            AirportBooking(
                airport = Airport("B0G", "Bogota"),
                dateTime = LocalDateTime.of(
                    2023,
                    Month.DECEMBER,
                    10,
                    0,
                    10,
                    10
                ),
            ),
            AirportBooking(
                airport = Airport("CUN", "CANCUN"),
                dateTime = LocalDateTime.of(
                    2025,
                    Month.APRIL,
                    10,
                    0,
                    10,
                    10
                ),
            )
        );
    }
}