package dialog

class WindowButton:Button {
    override fun render() {
        println("윈도우 버튼")
    }

    override fun onClick(callback: () -> Unit) {
        println("윈도우 버튼 클릭")
    }
}