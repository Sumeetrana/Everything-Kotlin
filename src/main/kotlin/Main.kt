import javax.xml.crypto.Data

fun main() {

}

class App: A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

class FirstDelegate: A {
    override fun print() {}
}

class SecondDelegate: B {
    override fun print2() {}
}