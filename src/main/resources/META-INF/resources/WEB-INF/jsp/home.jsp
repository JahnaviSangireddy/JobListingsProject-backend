<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
        <img src="/WEB-INF/images/jobs.jpg"/>
    </div>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>