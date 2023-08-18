package interface_segregation.bad

class User: Managable {
    override fun create() {
        println("<BAD> CREATE!!!")
    }

    override fun delete() {
        println("<BAD> DELETE!!!")
    }
}