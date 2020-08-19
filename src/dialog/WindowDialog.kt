package dialog

class WindowDialog : Dialog() {
    override fun createButton(): Button {
        return WindowButton()
    }
}