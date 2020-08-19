package dialog

class HTMLButton:Button {
    override fun render() {
        println("웹 버튼")
    }

    override fun onClick(callback: () -> Unit) {
        println("웹 버튼 클릭")
    }
}