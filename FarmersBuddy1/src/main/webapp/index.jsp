<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/style.css">
    
     <script src="vendor/jquery/jquery.min.js"></script>
     <script src="js/main.js"></script>
     <link rel="icon" href="https://image.shutterstock.com/image-vector/indian-farmer-character-logo-caricature-260nw-1925692910.jpg">
     
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
*{
    margin: 0;
    padding: 0;
    font-family: sans-serif;    
}
.main{
     width: 100%;
     height: 100vh;
     
      background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), 
     url(https://www.iplc-europe.com/wp-content/uploads/2019/11/nature-landscape-nature-landscape-hd-image-download-wheat-farm-hd-wallpaper-notebook-background-wheat-farmers-wheat-farming-process-wheat-farming-in-kenya-1030x644.jpg);
     background-size: cover;
     background-position: center;
}


.logo img
{
    float: left;
    width: 350px;
    height: 60px;
}
.title
{
    position: absolute;
    top: 26%;
    left: 50%;
    transform: translate(-50%,-50%);
}
.title h1{
   color:#fff;
   font-size: 40px; 
   font-style:oblique;
}

.roh
{
    position: absolute;
    top: 60%;
    left: 50%;
    transform: translate(-50%,-50%);  
}
.roh marquee
{
    color:#fff;
   font-size: 40px; 
   font-style:oblique; 
}
.marquee
{
    position: absolute;
    top: 35%;
    left: 50%;
    transform: translate(-50%,-50%);
    
}
.marquee marquee{
   color:#fff;
   font-size: 20px; 
   font-style:oblique;
}


</style>
<title>Crop Prediction</title>




<body>
 
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#"><img src="https://image.shutterstock.com/image-vector/indian-farmer-character-logo-caricature-260nw-1925692910.jpg" style="height: 50px;width: 50px;"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://www.thehindu.com/business/agri-business/">News</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
            </li>
        </ul>
        <ul class="navbar-nav mr-end">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Login
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="adminslogin.jsp">Admin</a>
                <a class="dropdown-item" href="farmerslogin.jsp">Farmer</a>
                <a class="dropdown-item" href="buyerslogin.jsp">Buyer</a>
                
                
              </div>
            </li>
            <li class="nav-item dropdown ">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  Signup
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="farmerssignup.jsp">Farmer</a>
                  <a class="dropdown-item" href="buyerssignup.jsp">Buyer</a>
                 </div>
              </li>
            </ul>
          
        </div>
        
      </nav>
      <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome To CROP TRACKING</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
        <header>
       
    
        <div class="main">
            
        
        </div> 

          <div class="title">
            <h1>WELCOME TO CROP TRACKING</h1>            
         </div>

         <div class="marquee">
            <marquee behaviour="slide" direction=""scrollamount="8"  >Agriculture That Works For Future</marquee>
            <marquee behaviour="slide" direction=""scrollamount="8"  >__ CROPS PREDICTION __ </marquee>

         </div>

         
         

         
         <div class="roh">
            <head>
         <center> 
            <marquee behaviour="" direction=""  scrollamount="10"><img src="https://image.shutterstock.com/image-photo/quotes-about-farming-agriculture-food-600w-1223364487.jpg" alt="image" height="200px">
            <img src="https://image.shutterstock.com/z/stock-photo-quotes-about-farming-and-agriculture-food-for-thought-from-our-growers-and-other-farmers-1223364520.jpg" alt="image" height="200px">
            <img src="https://image.shutterstock.com/image-photo/money-grows-rows-farming-quotes-600w-1120304147.jpg" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/farmer-are-planting-rice-in-the-rainy-season-picture-id1002917362?s=2048x2048" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/farmer-carrying-rice-paddy-bundle-for-harvesting-picture-id641189012?s=2048x2048" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/full-length-of-farmer-carrying-crops-in-sack-on-head-at-farm-during-picture-id1149439611?s=2048x2048" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/poor-women-cutting-grass-picture-id617773914?s=2048x2048" height="200px">
            <img src="https://media.gettyimages.com/photos/man-holding-rice-grains-oryza-sativa-in-hand-assam-india-picture-id520811714?s=2048x2048" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/farmer-loading-riding-bull-cart-outdoor-in-the-field-picture-id1137936826?s=2048x2048" alt="image" height="200px">
            <img src="https://media.gettyimages.com/photos/farmer-spreads-fertilizers-in-the-field-wheat-picture-id503160722?s=2048x2048" height="200px">
            <img src="https://media.gettyimages.com/photos/cheerful-farmer-sitting-in-the-green-field-picture-id508378308?s=2048x2048" alt="image" height="200px">
        </marquee>
   		</center>
         </head>

        </div>
    
  
</body>
</html>