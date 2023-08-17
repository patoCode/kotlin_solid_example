package open_close

import utils.HeaderObject

class Openclose {

    fun Demo(){

        var headerForbidden = setOf("headerA", "headerB", "headerC")
        var dummyHeader = HeaderObject("headerB", "valor_B")
        var dummyHeader2 = HeaderObject("header2", "valor_h2")


        var noPrinciple = HeadersLogger()
        noPrinciple.log(dummyHeader)


        var withPrinciple = HeadersLogger(headerForbidden)
        withPrinciple.log(dummyHeader2)

    }

}