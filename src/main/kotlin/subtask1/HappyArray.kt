package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray: IntArray= sadArray
        var bad:Int
        var badElementsNumber:Int
        var stopNumber:Boolean=true
        while(stopNumber == true){
            badElementsNumber=0
            for(index in 1..sadArray.size - 2){
                if(sadArray[index] > sadArray[index - 1] + sadArray[index + 1]){
                    for(i in index..sadArray.size - 2){
                        bad=sadArray[i]
                        sadArray[i] = sadArray[i + 1]
                        sadArray[i + 1] = bad
                    }
                    badElementsNumber += 1
                }
            }
            if(badElementsNumber==0) stopNumber=false
            sadArray = sadArray.dropLast(badElementsNumber).toIntArray()
        }
        return sadArray
        throw NotImplementedError("Not implemented")
    }
}
