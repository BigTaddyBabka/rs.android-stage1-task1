package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val text: String = inputString
        var arrayNew = arrayOf<String>()
        var openB='p'
        var count=0
        var closeB='w'

        for(i in 0..text.length-1){
            if(text[i]=='(' || text[i]=='[' || text[i]=='<'){

                if(text[i]=='(')
                {
                    openB='('
                    closeB=')'
                }
                if(text[i]=='[')
                {
                    openB='['
                    closeB=']'
                }
                if(text[i]=='<')
                {
                    openB='<'
                    closeB='>'
                }

                for(k in i+1..text.length-1){
                    if(text[k]==openB) count++
                    if(text[k]==closeB){

                        if(count==0){
                            println('o')
                            arrayNew+=text.substring(i+1,k)
                        }else count--
                    }
                }
            }



        }
        return arrayNew
        throw NotImplementedError("Not implemented")
    }
}
