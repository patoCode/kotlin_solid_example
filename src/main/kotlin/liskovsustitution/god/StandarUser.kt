package liskovsustitution.god

class StandarUser: Creatable, Deletable {
    override fun create() {
        println("-- <GOD> Standar user created! --")
    }

    override fun delete() {
        println("-- <GOD> Standar user deleted! --")
    }

}