package interface_segregation.god

class Client: Creatable {
    override fun create() {
        println("<GOD> CREATE BY CLIENT!!!")
    }
}


class Admin: Creatable,Deletable{

    override fun create() {
        println("<GOD> CREATED BY ADMIN!!!")
    }
    override fun delete() {
        println("<GOD> DELETE BY ADMIN!!!")
    }
}