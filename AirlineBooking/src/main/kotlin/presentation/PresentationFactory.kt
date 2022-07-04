package presentation

import domain.presentation.Formatter

interface PresentationFactory<T> {
    fun getPresentationFormat(formatPresentation: FormatPresentation) : Formatter<T>
}