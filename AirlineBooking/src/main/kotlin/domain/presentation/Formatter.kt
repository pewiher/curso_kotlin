package domain.presentation

interface Formatter<T> {
    fun format(t: T): String
    fun format(ts: List<T>) : String {
        val stringBuilder = StringBuilder()
        ts.forEach {
            stringBuilder.append(format(it))
        }
        return stringBuilder.toString()
    }

}