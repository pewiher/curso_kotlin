package constructores

import java.time.LocalDateTime
import java.time.LocalTime
import java.util.Date

class Blog(
    val name: String,
    val author: String,
    val date: LocalDateTime,
) {
    private var body: String = ""
    private var category: String = ""

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ) : this(name,author, date){
        this.body = content
        this.category = category
    }

    fun publish(): String {
        return """
            Nombre: $name
            Autor: $author
            Date: $date
            ${getContent()}
            ${getCategorySection()}
        """.trimIndent()
    }

    private fun getContent(): String {
        return if(body.isNotBlank() && body.isNotEmpty()) {
            """Contenido: $body
            """.trimIndent()
        } else ""
    }

    private fun getCategorySection(): String {
        return if(category.isNotBlank() && category.isNotEmpty()) {
            """Catgeoria: $category
            """.trimIndent()
        } else ""
    }

}