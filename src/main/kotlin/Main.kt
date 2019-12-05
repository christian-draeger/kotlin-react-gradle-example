import kotlin.browser.document

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}

fun main() {
    render(document.getElementById("root")) {
        app()
    }
}