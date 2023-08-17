package single_responsability

import utils.User

class Bad {

    fun sendNotification(user: User){
        println("Preparando correo")
        println("Enviando correo a ${user.email}")
    }

    fun deleteUser(user: User){
        println("Borrando al usuario: ${user.id}")
    }

}

