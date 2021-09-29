<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>

<script src="C:\Users\DELL"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
var check = function() {
	  if (document.getElementById('pass').value ==
	    document.getElementById('rpass').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	  }
	}
</script>
</head>


<section class="h-100 bg-dark">
        <div class="container py-5 h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col">
                    <div class="card card-registration my-4">
                        <div class="row g-0">
                            <div class="col-xl-6 d-none d-xl-block">
                    <img
                      src="https://mir-s3-cdn-cf.behance.net/project_modules/fs/e78e0284953219.5d6d7407566e6.jpg"
                      alt="Sample photo"
                      class="img-fluid"
                      style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem; "
                      
                    />
                  </div>
                            <div class="col-xl-6">
                             <form action="farmersignup" method="POST"  id="farmerssignup"><!-- onsubmit="return myFunction()" -->
                                <div class="card-body p-md-5 text-black">
                                
                                    <h3 class="mb-5 text-uppercase">Farmer registration form</h3>
               
                                    <div class="row">
                                        <div class="col-md-6 mb-4">
                                            <div class="form-outline">
                                                <input type="text" id="form3Example1m"
                                                    class="form-control form-control-lg" name="fname" />
                                                <label class="form-label" for="form3Example1m">First name</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6 mb-4">
                                            <div class="form-outline">
                                                <input type="text" id="form3Example1n"
                                                    class="form-control form-control-lg"name="lname" />
                                                <label class="form-label" for="form3Example1n">Last name</label>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6 mb-4">
                                            <div class="form-outline">
                                                <input type="password" id="pass"
                                                    class="form-control form-control-lg" name="firstpass" onkeyup='check();' />
                                                <label class="form-label" for="pass">Password</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6 mb-4">
                                            <div class="form-outline">
                                                <input type="password" id="rpass"
                                                    class="form-control form-control-lg" name="secondpass" onkeyup='check();' />
                                                <label class="form-label" for="form3Example1n1">Confirm Password</label>
                                                <span id="message"></span>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <input type="tel" id="contact" class="form-control form-control-lg" name="contact" />
                                        <label class="form-label" for="contact">Contact</label>

                                        <div class="form-outline mb-4">
                                            <input type="email" id="form3Example97"
                                                class="form-control form-control-lg" name="email" />
                                            <label class="form-label" for="form3Example97">Email ID</label>
                                        </div>

                                        <div class="row">
                                            

                                            <!-- <div class="dropdown"> -->
                                                <!-- <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                  Dropdown button
                                                </button>
                                                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                                  <a class="dropdown-item" href="#">Action</a>
                                                  <a class="dropdown-item" href="#">Another action</a>
                                                  <a class="dropdown-item" href="#">Something else here</a>
                                                </div>
                                              </div> -->
                                              
                                            <div class="dropdown col-md-3 mb-2">
                                                Crop:
                                                <select class="select "name="crop" id="crop">
                                                    <option  value="1">Crop</option>
                                                    <option value="wheat">Wheat</option>
                                                    <option value="banana">Banana</option>
                                                    <option value="bajra">Bajra</option>
                                                    <option value="cotton">Cotton</option>
                                                    <option value="Sugercain">SugerCain</option>
                                                </select>

                                            </div>
                                           
                                            <div class="col-md-3 mb-2">
                                                City
                                                <select class="select" name="Town Name" id="town">
                                                    <option value="1">City</option>
                                                    <option value="pune">Pune</option>
                                                    <option value="Nashik">Nashik</option>
                                                    <!-- <option value="4">Nanded</option>
                                                    <option value="5">Parbhani</option>
                                                    <option value="6">Latur</option>
                                                    <option value="7">Jalna</option>
                                                    <option value="8">Aurangabad</option> -->
                                                </select>

                                            </div>
                                            <div class=" col-md-3 mb-2" style="border: 1;">
                                                Source
                                                <select class="select" name="Water Source" id="wsource">
                                                    <option value="1">Source</option>
                                                    <option value="well">well</option>
                                                    <option value="river">River</option>
                                                    <!-- <option value="4">Boaring</option> -->
                                                </select>

                                            </div>
                                            <br> <br><br>
                                        </div>
                                           
                                        
                                        <div class="form-outline mb-4">
                                            <input type="number" id="form3Example90"
                                                class="form-control form-control-lg" name="land" />
                                            <label class="form-label" for="form3Example90">Amount Of Land Owned</label>
                                        </div>
                                        <div class="col-md-3 mb-2">
                                            Repo Crop:
                                             <select class="select" name="repocrop" id="repocrop">
                                                 <option value="1">Crop</option>
                                                 <option value="wheat">Wheat</option>
                                                 <option value="banana">Banana</option>
                                                 <option value="bajra">Bajra</option>
                                                 <option value="cotton">Cotton</option>
                                                 <option value="Sugercain">SugerCain</option>
                                             </select>

                                         </div>
                                        <div class="form-outline mb-4">
                                            <input type="number" id="form3Example99"
                                                class="form-control form-control-lg" name="repoamount"/>
                                            <label class="form-label" for="form3Example99">Reposited Amount</label>
                                        </div>

                                       

                                        <div class="d-flex justify-content-end pt-3">
                                            <button type="reset" class="btn btn-light btn-lg">Reset all</button>
                                            <button type="submit" class="btn btn-warning btn-lg ms-2" name="farmersignupbtn" value="Signup">Submit
                                                form</button>
                                                
                                        </div>
										</form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
    </section>

	
	<!-- <form action="farmersignup" method="POST" onsubmit="return myFunction()" id="farmerssignup">
		First Name = <input type="text" name="fname"> 
		Last Name = <input type="text" name="lname">
		Crop: <select name="crop" id="crop">
    		<option value="wheat">Wheat</option>
    		<option value="banana">Banana</option>
			<option value="bajra">Bajra</option>
			<option value="cotton">Cotton</option>
			<option value="Sugercain">Sugercain</option>
    	</select>
		<select name="Water Source" id="wsource">
    		<option value="well">Well</option>
    		<option value="river">river</option>
			
		</select>
		
		<select name="Town Name" id="town">
    		<option value="pune">Pune</option>
    		<option value="Nashik">Nashik</option>
			
		</select>
		
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
			<label>
			Password = <input type="password" name="firstpass" id="pass" onkeyup='check();'>
			</label>
		<label >Confirm password
			Repeat password=<input type="password" name="secondpass" id="rpass" onkeyup='check();'>
			<span id='message'></span>
		</label>
		
		Amount of land Owned= <input type="number" name="land">
		
		Contact Number: <input type="text" name="contact" id="contact" >
		
		Repoisted Crop:<select name="repocrop" id="repocrop">
    		<option value="wheat">Wheat</option>
    		<option value="banana">Banana</option>
			<option value="bajra">Bajra</option>
			<option value="cotton">Cotton</option>
			<option value="Sugercain">Sugercain</option>
    	</select>
    	
    	Reposited amount:<input type="number" name="repoamount">
    	
    	Email:<input type="text" name="email">
		<input type="submit" name="farmersignupbtn" value="Signup" >
	</form> -->
</body>
</html>