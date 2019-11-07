let name = document.getElementById("n");
let roll = document.getElementById("rol_sect");
let date = document.getElementById("d");
let checkCount = 0;

console.log("Running");

function allLetter(e) {
    var letters = /^[A-Za-z]+$/;
    console.log(name);
    if (name.value.match(letters)) {
        checkCount++;
    }
    else {
        alert("Name not Accepted");
        e.preventDefault();
    }
}
function checkDigit(e) {
    var flag = false;
    var number = /^[0-9]+$/;
    if (roll.value.match(number)) {
        flag = true;
        checkCount++;
    }
    else {
        alert("Roll Not Accepted : Should be numeric");
        flag = false;
        e.preventDefault();
    }

    if (flag == true) {
        if (!(roll.value.toString().length == 7)) { alert("Roll Not Accepted : length should be 7") }
    }
}

function checkDate(e) {
    
    
    var number1 = /^(0[1-9]|1\d|2\d|3[01])\/(0[1-9]|1[0-2])\/(19|20)\d{2}$/
    if (date.value.match(number1)) {
      checkCount++;
    }   
    else{     
        e.preventDefault();
        alert("Date Not Accepted");
    }

    if(checkCount==3)
    {
        var d = date.value.split('/');
        var date1 = new Date(d[2],d[1],d[0]);
        alert("Form Accepted !!");
        document.write("<html><body><center>");
        document.write("<h1><b>Student Application Form</b></h1><br><br>");
        document.write("<h2>Name :\t"+ name.value+"<br>");
        document.write("Roll No. :\t"+ roll.value+"<br>");
        document.write("Date :\t"+ date1+"<br></h2>");
        document.write("</center></body</html>");

    } 

   
}
