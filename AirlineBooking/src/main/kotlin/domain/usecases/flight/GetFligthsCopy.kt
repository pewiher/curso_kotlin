package domain.usecases.flight

import domain.model.*
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

/***
 * Mostrar los vuelos disponibles de un mes
 */
class GetFligthsCopy(
    val formatter: Formatter<Flight>
) {
    fun invoke() : String {
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

        var fligths = listOf(
            flight,
            flight,
            flight
        )

        return formatter.format(fligths)
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