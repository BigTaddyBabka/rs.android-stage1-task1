package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billArray:IntArray = bill
        var math:Int=0
        var needToPay:Int=b
        var index=billArray[k]
        for(z in 0..billArray.size-1){
            math=billArray.sum()-index
        }
        if((math/2)==needToPay){
            return ("bon appetit")
        }
        else{
            return (needToPay-(math/2)).toString()
        }

        throw NotImplementedError("Not implemented")
    }
}
