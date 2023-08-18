package interface_segregation

import interface_segregation.bad.User
import interface_segregation.god.Admin
import interface_segregation.god.Client

class InterfaceSegregation {
    fun Demo(){
        println("== Principio I ==")
        // VIOLATION EXAMPLE
        // Si todo esta en una sola interface como la MANAGABLE
        // cuando Quisieramos crear un usuario que solo CREE, pero que no ELIMINE
        // No podriamos hacerlo ya que tenemos las dos opraciones en una sola interface
        var normalUser = User()
        normalUser.create()
        normalUser.delete()

        // GOD APPLICATION
        // En cambio si las interfaces son atomicas nos permitiremos crear usuarios especializados
        // Usuarios que solo escriban(cliente) y usuarios que puedan ademas de escribir,
        // hacer cosas adicionales(ADMIN)

        var client = Client()
        var admin = Admin()

        client.create()

        admin.create()
        admin.delete()




    }
}