<%@include file="Header.jsp" %>
<%@include file="Carousel.jsp" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html">
<title>Insert title here</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  
    body {
     background: url('file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/6.jpg') fixed;
    background-size: cover;}
    /* Add a brown background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }

  </style>
	
</head>

<body>
<br><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4" height="70pt">
      <div class="panel panel-primary">
        <div class="panel-heading">combo</div>
        <div class="panel-body"><img src="file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/8.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
      
      </div>
    </div>
    <div class="col-sm-4" height="70pt"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Best desls</div>
        <div class="panel-body"><img src="file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/special2.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">50% off</div>
      </div>
    </div>
    <div class="col-sm-4" height="70pt"> 
      <div class="panel panel-success">
        <div class="panel-heading">Best deals</div>
        <div class="panel-body"><img src="file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/special1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">50% off</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-6">
      <div class="panel panel-primary">
       <div class="panel-heading">Weekend specials</div>
        <div class="panel-body"><img src="file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/7.jpg" style="width:100%" "height:90pt" alt="Image"></div>
   
      </div>
    </div>
    <div class="col-sm-6"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Weekend specials</div>
        <div class="panel-body"><img src="file:///E:/eclipse/NIIT/ShopFrontend/src/main/webapp/resources/image/4.jpg" "height:80pt" alt="Image"></div>
       
      </div>
    </div>
  
      
  </div>
</div>
<br><br>
<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>


</body>
</html>
