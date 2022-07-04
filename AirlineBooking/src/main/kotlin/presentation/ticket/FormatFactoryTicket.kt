package presentation.ticket

import domain.model.Ticket
import domain.presentation.Formatter
import presentation.FormatPresentation
import presentation.PresentationFactory
import presentation.ticket.format.FormatConsoleTicket

class FormatFactoryTicket : PresentationFactory<Ticket> {
    override fun getPresentationFormat(formatPresentation: FormatPresentation): Formatter<Ticket> {
        return FormatConsoleTicket()
    }
}