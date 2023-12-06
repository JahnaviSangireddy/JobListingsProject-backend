<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <form:form method="post" action="hiresomeone" modelAttribute="jobPost">
                <div class="form-group">
                  <label for="profile">Profile</label>
                  <form:input type="profile" class="form-control" id="profile" placeholder="Java developer" path="profile"/>
                </div>
                <div class="form-group">
                  <label for="experience">Experience in years</label>
                  <form:input type="exp" class="form-control" id="exp" placeholder="1" path="exp"/>
                </div>
                <div class="form-group">
                  <label for="skills">Tech skills</label>
                  <form:select class="form-control" id="techs" path="techs">
                    <form:option value="Java"/>
                    <form:option value="Spring boot"/>
                    <form:option value="Phyton"/>
                    <form:option value="Django"/>
                    <form:option value="React"/>
                    <form:option value="Web technologies"/>
                    <form:option value="SQL"/>
                    <form:option value="MongoDb"/>
                  </form:select>
                </div>
                <div class="form-group">
                  <label for="description">Description</label>
                  <form:textarea class="form-control" id="desc" rows="3" path="desc"></form:textarea>
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-primary mb-2">Post a Job</button>
                  </div>
            </form:form>
        </div>
    </div>

<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>