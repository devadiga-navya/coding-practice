/***
* [ 2 , 7, 11, 15] --- target is 9 --> true
* [5, 6, 6 , 8] --- target is 12
* answer will be [0,1] - index of the number 
*/


function testTargetSum( int listNum[] , int target){
    int result = new array();
    for(int i=0;  i<listNum.length;i++){
        for(int j = i+1; j<listNum.length; j++){
            if(listNum[i] + listNum[j] == target){
                result.add(i);
                result.add(j) ;
                return result;
            }
        }
    }
}