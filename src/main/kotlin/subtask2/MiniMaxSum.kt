package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var a:Int
        var max:Int=0
        var min:Int
        var arrayNew:IntArray = intArrayOf()
        var arrayNewMaxMin:IntArray = intArrayOf()
        val array:IntArray=input
        for(index in 0..array.size - 1){
            a=array.sum()-array[index]
            arrayNew+=a
        }
        for (k in 0..arrayNew.size - 1){
            if(max < arrayNew[k]) max = arrayNew[k]
        }
        min=max
        for (k in 0..arrayNew.size - 1){
            if(min > arrayNew[k]) min = arrayNew[k]
        }
        return intArrayOf(min, max)

        throw NotImplementedError("Not implemented")
    }
}
