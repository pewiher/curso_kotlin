package enums.functions

enum class ErrorType(
    val message: String
) {
    UNKNOWN_ERROR("Unknown Error") {
        override val userMessage: String = "Unexpected error occurred"

        override fun getCodeError(): String = "UE00"
    },

    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "User no logged session"

        override fun getCodeError(): String = "UE01"

        override fun getRetryIntens(): Int = 2
    };

    abstract val userMessage: String
    abstract fun getCodeError(): String
    open fun getRetryIntens(): Int = 1
}