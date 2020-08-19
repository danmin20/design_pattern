import dialog.Dialog
import dialog.WebDialog
import dialog.WindowDialog
import java.lang.Exception

lateinit var dialog: Dialog

fun initialize() {
    val os = "window"

    dialog = when (os) {
        "window" -> WindowDialog()
        "web" -> WebDialog()
        else -> throw Exception("Unknown OS type")
    }
}

fun main(args: Array<String>) {
    initialize()
    dialog.render()
}
