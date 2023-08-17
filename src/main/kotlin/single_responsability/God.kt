package single_responsability

import utils.User

class God {
    // Como vemos aca se separan las funciones por clases,
    // obviamente esto se debe hacer segun la necesidad
}

class UserAccountService(){
    fun deleteUser(user: User){
        println("Deleting: ${user.id}")
    }
}


class EmailContentProvider(){
    fun prepareContent(){
        println("Return email content")
    }
}

class EmailService(){
    fun sendNotification(user: User){
        println("Send mail to ${user.email}")
    }
}