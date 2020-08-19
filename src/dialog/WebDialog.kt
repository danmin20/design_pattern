package dialog

class WebDialog : Dialog() {
    override fun createButton(): Button {
        return HTMLButton()
    }
}