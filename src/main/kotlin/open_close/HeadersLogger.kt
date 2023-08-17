package open_close

import utils.HeaderObject

class HeadersLogger(val addictionalForbiddenHeaders: Set<String> = setOf()) {

    companion object{
        private val forbiddenHeaders = setOf("header-one", "header-two")
    }

    fun log(header: HeaderObject){
        if(!forbiddenHeaders.contains(header.name)
            && !addictionalForbiddenHeaders.contains(header.name))
            println(header.value)
    }

}