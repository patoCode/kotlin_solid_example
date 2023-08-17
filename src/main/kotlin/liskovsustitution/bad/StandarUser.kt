package liskovsustitution.bad

class StandarUser: Managable {
    override fun create() {
        println("** <BAD> Creando un usuario standar **")
    }

    override fun delete() {
        println("** <BAD> BORRANDO un usuario standar **")
    }
}