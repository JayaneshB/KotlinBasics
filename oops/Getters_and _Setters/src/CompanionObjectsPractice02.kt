fun main() {
    val myBook=Book(Book.getEditor())
    println(myBook.editor.editorName)
}
class Book(val editor: Editor) {
    companion object  {
        fun getEditor()=Editor(editorName = "Gopinath")
    }
}
class Editor(val editorName:String){

}