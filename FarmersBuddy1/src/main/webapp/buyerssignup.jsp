<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js">
<title>Insert title here</title>
</head>
<script>@import url('');
.card-registration .select-input.form-control[readonly]:not([disabled]) {
  font-size: 1rem;
  line-height: 2.15;
  padding-left: .75em;
  padding-right: .75em;
}
.card-registration .select-arrow {
  top: 13px;
}
  </script>
<body>

<section class="h-100 bg-dark">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col">
              <div class="card card-registration my-4">
                <div class="row g-0">
                  <div class="col-xl-6 d-none d-xl-block">
                    <img
                      src="https://us.123rf.com/450wm/angkritth/angkritth1901/angkritth190100127/115342431-reduction-free-agreement-flat-icon-disintermediation-vector-illustration.jpg?ver=6"
                      alt="Sample photo"
                      class="img-fluid"
                      style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;"
                    />
                  </div> 
                   
                  <div class="col-xl-6">
                    <div class="card-body p-md-5 text-black">
                        <form action="buyerssignup" method="POST"  id="buyersignup">
                      <h3 class="mb-5 text-uppercase">Buyer registration form</h3>
      
                      <div class="row">
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input type="text" id="form3Example1m" class="form-control form-control-lg" name="fname" />
                            <label class="form-label" for="form3Example1m">First name</label>
                          </div>
                        </div>
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <input type="text" id="form3Example1n" class="form-control form-control-lg" name="lname" />
                            <label class="form-label" for="form3Example1n">Last name</label>
                          </div>
                        </div>
                       </div>
                       <div class="form-outline mb-4">
                        <input type="email" id="email" class="form-control form-control-lg" name="email"/>
                        <label class="form-label" for="email">Email ID</label>
                      </div>
                      <div class="form-outline mb-4">
                        <input type="text" id="contact" class="form-control form-control-lg" name="contact" />
                        <label class="form-label" for="contact">Enter Contact Number</label>
                      </div>
                        <div class="form-outline mb-4">
                        <input type="password" id="pass" name="firstpass" class="form-control form-control-lg" />
                        <label class="form-label" for="form3Example90">Password</label>
                      </div>
      
                      <div class="form-outline mb-4">
                        <input type="password" id="form3Example99" class="form-control form-control-lg" name="secondpass" id="rpass" />
                        <label class="form-label" for="form3Example99">Confirm Password</label>
                      </div>
      
                      <div class="d-flex justify-content-end pt-3">
                        <button type="submit" class="btn btn-warning btn-lg ms-2"name="buyerssignupbtn">Submit form</button>
                     
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
    
    <!-- <form action="buyerssignup" method="POST"  id="buyersignup">
       
        First Name = <input type="text" name="fname"> 
        
        Last Name = <input type="text" name="lname">

        Password = <input type="password" name="firstpass" id="pass">

        Repeat password=<input type="password" name="secondpass" id="rpass">
        
        Enter Contact=<input type="text" name="contact" id="contact">

		Email:<input type="text" name="email">
		<input type="submit" name="buyerssignupbtn" value="SignupBuyer">
    </form> -->

</body>
</html>