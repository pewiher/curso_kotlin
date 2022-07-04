package data.airportbook

import domain.datasource.airport.AirportDataSource
import domain.model.Airport

class AirportBookingLocalSource : AirportDataSource {
    override fun getAirports(): List<Airport> {
        TODO("Not yet implemented")
    }
}