/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package power60.services.app

import org.apache.commons.text.WordUtils
import power60.services.utilities.StringUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
}
