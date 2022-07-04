package domain.datasource.airportbook

import domain.model.AirportBooking

interface AirportBookingDataSource {
    fun getAirBookingPais(): List<Pair<AirportBooking, AirportBooking>>
}