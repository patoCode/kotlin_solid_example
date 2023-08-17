package liskovsustitution

import liskovsustitution.bad.*
import liskovsustitution.bad.StandarUser as badUser
import liskovsustitution.god.*
import liskovsustitution.god.StandarUser as godUser

class Liskovsustitution {

    fun Demo(){
        // VIOLATION
        // Toda la funcionalidad esta en una sola llamada, lo cual rompe el principio "S"
        // No se puede evitar funcionalidad de manera facil,
        // por ejemplo: un ADMIN no deberia eleiminarse nunca
        var userNoPrinciple = badUser()
        DemoBad(userNoPrinciple)

        // APPLY PRINCIPLE
        // La funcionalidad esta separada
        // se puede decidir que funcionalidad lanzar y cual no,
        // dependiendo de la situacion, tipo, etc.
        var userWithPrinciple = godUser()
        DemoGodCreate(userWithPrinciple)
        DemoGodDelete(userWithPrinciple)

    }

    private fun DemoBad(anything: Managable){
        anything.create()
        anything.delete()
    }

    private fun DemoGodCreate(anything: Creatable){
        anything.create()
    }

    private fun DemoGodDelete(anything: Deletable){
        anything.delete()
    }


}