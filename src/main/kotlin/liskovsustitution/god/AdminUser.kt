package liskovsustitution.god

class AdminUser: Creatable {
    override fun create() {
        println("-- <GOD> Create ADMIN --")
    }
}