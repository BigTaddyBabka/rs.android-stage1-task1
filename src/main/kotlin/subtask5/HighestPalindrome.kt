package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val string=digitString
        var count:Int=0
        var numberOf:Int=n
        var numberOfact:Int=k
        var array=string.toCharArray()

        for(i in 0..n-1){
            if(array[i]!=array[n-i-1]){
                if(array[i]>array[n-i-1]){
                    array[n-i-1]=array[i]}
                else {
                    array[i]=array[n-i-1]}
                count++
            }


        }
        if(count<numberOfact)
        {
            array[0]='9'
            array[n-1]='9'

        }
        if(count>numberOfact)
        {
            return "-1"
        }
        else{
            return array.joinToString("")
        }
        throw NotImplementedError("Not implemented")
    }
}
