package dialog

interface Button {
    fun render()
    fun onClick(callback: () -> Unit)
}