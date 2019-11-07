
    let username = document.getElementById("user");
    let password = document.getElementById("pass");  
    function check()
    {
        if(username.value == "admin" && password.value == "admin")
            {
                alert("Successfull login ");
            }
        else
            {
                alert("Incorrect Username or Password" );
            }
            
    }
