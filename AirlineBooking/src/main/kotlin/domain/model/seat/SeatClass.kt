package domain.model.seat

enum class SeatClass(
    val code: String
) {
    ECONOMY(code = "E"),
    PLUS(code = "P"),
    BUSINESS(code = "B"),
    FIRST(code = "F"),
}