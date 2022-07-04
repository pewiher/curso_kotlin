package domain.usecases.baggage

import domain.model.baggage.pack.BaggagePackage

/**
 * Mostrar los tipos de equipajes disponibles
 */
class GetBaggagePackage {
    operator fun invoke(): Map<Int, BaggagePackage> {
        return mapOf();
    }
}