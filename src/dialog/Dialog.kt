package dialog

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val okButton = createButton()
        okButton.onClick { closeDialog() }
    }

    private fun closeDialog() {
        println("Closed")
    }
}