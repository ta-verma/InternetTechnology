/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validate() {
    var fname = document.getElementById("Fname").value;
    var lname = document.getElementById("Lname").value;
    var email = document.getElementById("email").value;
    var address = document.getElementById("Address").value;
    var city = document.getElementById("city").value;
    var state = document.getElementById("state").value;
    var pcode = document.getElementById("Pcode").value;
    var country = document.getElementById("country").value;
    var ele = document.getElementsByName("rsry");
    var radioVal;
    for (var i = 0; i < ele.length; i++) {
        if (ele[i].checked)
            radioVal = ele[i].value;
    }
//    var chk ="";
//    for (var i = 1; i < 7; i++) {
//        if (document.getElementById(""+i).checked)
//            chk = chk + document.getElementById(""+i). + "\n";
//    }
//    
    var opt = document.getElementById("opt");
    var selOpt = opt.options[opt.selectedIndex].text;
    
    
    var alpha = /^[A-Za-z ]+$/;
    var pdigi = /^[0-9]{6}$/;
    var em = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    
    if(!fname.match(alpha)){
         alert("First Name is Incorrect");
    }
    else if(!lname.match(alpha)){
         alert("Last Name is Incorrect");
    }
    else if(!email.match(em)){
         alert("E-mail is Incorrect");
    }
    else if(!pcode.match(pdigi)){
         alert("PinCode is Incorrect");
    }
    else if(!selOpt.match(alpha)){
         alert("Please select any option");
    }
    
    else{
        alert("Form Accepted !!");
//        document.write("<html><body>");
//        document.write("<h1><center>INFONET SERVICES</center></h1><b><hr><hr><br>");
//        document.write("<h2>Name :\t"+ fname+" "+lname+"<br>");
//        document.write("E-mail :\t"+ email+"<br>");
//        document.write("Address :\t"+ address+" ,"+city+" ,"+state+" ,"+pcode+" ,"+country+"<br></h2>");
//        document.write("<br><br><p><i>Please choose the most appropriate statement</i></p>");
//        document.write(""+radioVal);
//        document.write("<br><br><p><i>I'm interested in (choose all that apply) </i></p><br>");
//        document.write(chk);
//        document.write("<br><br><p><i>I learned about this site from </i></p>");
//        document.write(selOpt);
//        document.write("</body</html>");
    }
    

}

function clear(){
    
}

