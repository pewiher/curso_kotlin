package constructores

import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter


fun main() {

    val blogRapido = Blog(name = "Test", author = "Peter", date = LocalDateTime.of(
        2022,
        Month.APRIL,
        2,
        13,
        15
    ));
    println(blogRapido.publish())

    val blog = Blog(name = "Test", author = "Peter", date = LocalDateTime.of(
        2022,
        Month.APRIL,
        12,
        10,
        10
    ), content = "Mi contenido", category = "Mi categoria")

    println(blog.publish())
}