# JAVAEE FROM CDAC
Cookie and Httpsession is important in terms of session managemnet, Cookie will help to identify client even after logoff from session, but seesion maintains current activity while client is connected with server. <br>
## Session
HttpSession session=req.getSession(); <br>


## cookie
Cookie c= new Cookie("name"+,"value"); <br>
to access Cookie, we should store in an array and use foreach loop to getName() from cookies <br> 
Cookie[] c=req.getCookies();
