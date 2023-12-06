<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>  
<html>
    <head>
        <title>online job portal</title>
        <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <link href="/webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.css" rel="stylesheet">
    </head>
<body>
    <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
        <a class="navbar-brand m-1" href="https://courses.in28minutes.com">Online Job Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/availableJobs">Look for a Job</a></li>
                <li class="nav-item"><a class="nav-link" href="/hiresomeone">Hire someone</a></li>
            </ul>
        </div>
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
        </ul>	
    </nav>

    <div class="container">
        <h1>welcome user</h1>
        <hr>
        <div>
            <c:forEach items="${posts}" var="post">
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action flex-column align-items-start active">
                        <div class="d-flex w-100 justify-content-between">
                          <h5 class="mb-1">${post.profile}</h5>
                        </div>
                        <p class="mb-1"><h6>Job description :</h6>${post.desc}</p>
                        <p class="mb-1"><h6>Experience required :</h6>${post.exp}</p>
                        <p class="mb-1"><h6>skills required :</h6><c:forEach items="${post.techs}" var="tech">${tech} , </c:forEach></p>
                      </a> 
                </div>
            <hr>    
            </c:forEach>                  
        </div>
    </div>
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>