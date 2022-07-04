import domain.model.*
import domain.usecases.flight.GetFlights
import presentation.FormatPresentation
import presentation.flight.FormatFactoryFlight

fun main() {
    /*val checkedBaggage = Checked()
    println(checkedBaggage.emoji)
    println()

    val basicPrice = BigDecimal(200)
    val clasicPrice = BigDecimal(400)

    val basicClub: VClub = ClubBasic(price = basicPrice)
    val clasicClub: VClub = ClubClassic(clasicPrice)

    println(basicClub.name)
    println(basicClub.price)

    println(clasicClub.name)
    println(clasicClub.price)

    val basic: Regular = RegularBasic(basicPrice)
    val clasic: Regular = RegularClassic(clasicPrice)

    println(basic.name)
    println(basic.price)

    println(clasic.name)
    println(clasic.price)

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

    println(flight.format())

    val ticket = Ticket(
        flight,
        Passenger("Peter", "peter@gmail.com", "123456"),
        RegularBasic(BigDecimal(20)),
        Seat("E002", BigDecimal(20), SeatStatus.RESERVED, SeatClass.ECONOMY)
    )

    println(ticket.format())*/

    /*
    //val getFligths = GetFligths(FormatConsoleFlight())
    val getFligths = GetFligths(FormatHtmlFlight())
    println(getFligths.invoke())

    val getTickets = GetTickets(FormatConsoleTicket())
    //val getTickets = GetTickets(FormatHtmlTicket())
    println(getTickets.invoke())

     */

    val format = FormatPresentation.CONSOLE
    val factory = FormatFactoryFlight().getFormatFlight(format)
    var getFligth = GetFlights(factory)
    println(getFligth.invoke())
}

