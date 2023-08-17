package liskovsustitution.bad

class AdminUser: Managable {
    override fun create() {
        println("** <BAD> Creando un usuario ADMIN **")
    }

    override fun delete() {
        println("** <BAD> BORRANDO A UN ADMIN **")
    }
}