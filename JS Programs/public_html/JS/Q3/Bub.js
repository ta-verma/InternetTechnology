
function allDigits(e) {

    let arr = document.getElementById("arr").value;
    let res = arr.split(",").map(Number);
    let flag = true;
    for (var i=0 ; i< res.length ;++i)
    {
        if (!Number.isInteger(res[i]))
        { flag =false ;}
    }
    
    if(flag == false)
    {
        alert("Input not Accepted");
        e.preventDefault();
    }
 
}




function swap(arr, first, second){
    var temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}

function bubble_Sort(arr){


    var len = arr.length,
        i, j, stop;

    for (i=0; i < len; i++){
        for (j=0, stop=len-i; j < stop; j++){
            if (arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
    }

    return arr;
}


function bSort()
{
    
    let res = document.getElementById("arr").value;
    let arr = res.split(",").map(Number);
    arr = bubble_Sort(arr);
    
    alert("Array Sorted");

    document.write("<html><body><center>");
        document.write("<h1><b>Bubble Sort</b></h1><br><br>");
        document.write("<h2>Sorted Array :\t");
        for(let i =0 ; i< arr.length ;++i)
        {
            document.write(arr[i]+ " ");
        }
        document.write("</h2><br>")
        
        document.write("</center></body</html>");
}
