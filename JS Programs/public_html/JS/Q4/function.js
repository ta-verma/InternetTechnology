var stack = [];

function pushS()
{
    let el = document.getElementById("n").value;
    stack.push(el);
}

function popS()
{   
    var value = stack.pop();
}

function dispS()
{
    var S="<table style='width:10%'>";
    for(var i=stack.length-1; i>=0;--i)
    { 
    S+= "<tr><td align='center'>"+stack[i]+"</td></tr>";
    }
    document.getElementById("para").innerHTML=S;
}