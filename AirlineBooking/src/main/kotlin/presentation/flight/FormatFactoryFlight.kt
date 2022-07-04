package presentation.flight

import domain.model.Flight
import domain.presentation.Formatter
import presentation.FormatPresentation
import presentation.PresentationFactory
import presentation.flight.format.FormatConsoleFlight
import presentation.flight.format.FormatHtmlFlight

class FormatFactoryFlight : PresentationFactory<Flight> {
    override fun getPresentationFormat(formatPresentation: FormatPresentation): Formatter<Flight> {
        return when(formatPresentation) {
            FormatPresentation.CONSOLE -> FormatConsoleFlight()
            FormatPresentation.HTML -> FormatHtmlFlight()
            else -> FormatConsoleFlight()
        }
    }
}