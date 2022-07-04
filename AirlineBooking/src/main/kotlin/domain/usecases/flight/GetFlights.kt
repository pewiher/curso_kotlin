package domain.usecases.flight

import domain.model.*
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

/***
 * Mostrar los vuelos disponibles de un mes
 */
class GetFlights {
    fun invoke(month: Month) : Map<Int, Flight> {
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

        val flightsMap = mapOf(
            1 to flight,
            2 to flight,
            3 to flight
        )

        return flightsMap.filter {flightEntry ->
            flightEntry.value.departureArrivalBooking.first.dateTime.month == month

        }
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