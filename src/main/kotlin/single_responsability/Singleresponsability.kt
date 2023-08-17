package single_responsability

import utils.User

class Singleresponsability {

    fun Demo(){
        val userDummy = User(1, "Ken Master", "ken.master@sfv.cc", "1234567890")

        // Sin aplicar el principio
        val noSingle = Bad()
        println("Hola soy: ${userDummy.name}")
        noSingle.sendNotification(userDummy)
        noSingle.deleteUser(userDummy)

        // Aplicando el principio de Single Responsability,
        // con los elementos modificados para este proposito
        val userAcountServices = UserAccountService()
        val emailContentProvider = EmailContentProvider()
        val emailService = EmailService()
        println("=== Aplicando el principio ===")
        println("Hola soy: ${userDummy.name}")

        emailContentProvider.prepareContent()
        emailService.sendNotification(userDummy)
        userAcountServices.deleteUser(userDummy)
    }

}