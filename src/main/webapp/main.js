const form = document.querySelector("form"),
        nextBtn = form.querySelector(".nextBtn"),
        backBtn = form.querySelector(".backBtn"),
        allInput = form.querySelectorAll(".first input");
    


nextBtn.addEventListener("click", ()=> {
    allInput.forEach(input => {
        if(input.value != ""){
            form.classList.add('secActive');
        }else{
            form.classList.remove('secActive');
        }
    })
})

backBtn.addEventListener("click", () => form.classList.remove('secActive'));

function takevalue(){

    var fullname=document.getElementById("fullname").value;
    var dateofbirth =document.getElementById("dateofbirth").value;
    var email=document.getElementById("email").value;
    var mobilenumber=document.getElementById("mobilenumber").value;
    // var Gender=document.getElementById("Gender").value;
    var fathername=document.getElementById("fathername").value;
    var placeofbirth=document.getElementById("placeofbirth").value;
    var nationality=document.getElementById("nationality").value;
    // var bloodgroup=document.getElementById("bloodgroup").value;
    var passportnumber=document.getElementById("passportnumber").value;
    var aadharnumber=document.getElementById("aadharnumber").value;
    var pancardnumbar=document.getElementById("pancardnumbar").value;
    var housename=document.getElementById("housename").value;
    var street=document.getElementById("street").value;
    var area=document.getElementById("area").value;
    var city=document.getElementById("city").value;
    var state=document.getElementById("state").value;
    var pincode=document.getElementById("pincode").value;
    // // var qualification1=document.getElementById("qualification1").value;
    var percentage1=document.getElementById("percentage1").value;
    // // var qualification2=document.getElementById("qualification2").value;
    var percentage2=document.getElementById("percentage2").value;
    document.write("Entered full name is ="+ fullname + "<br>");
    document.write("Date Of Birth is ="+ dateofbirth + "<br>");
    document.write("Entered Email is ="+ email + "<br>");
    document.write("Entered Mobile Number is ="+ mobilenumber + "<br>");
    // document.write("Entered Gender is ="+ Gender + "<br>");
    document.write("Entered Father Name is ="+ fathername + "<br>");
    document.write("Entered Place Of Birth is ="+ placeofbirth + "<br>");
    document.write("Entered Nationality is ="+ nationality + "<br>");
    // document.write("Entered Blood Group is ="+ bloodgroup + "<br>");
    document.write("Entered Passport Number is ="+ passportnumber + "<br>");
    document.write("Entered Aadhar Number is ="+ aadharnumber + "<br>");
    document.write("Entered Pan Card Number is ="+ pancardnumbar + "<br>");
    document.write("Entered House Name/NUmber is ="+ housename + "<br>");
    document.write("Entered Street is ="+ street + "<br>");
    document.write("Entered Area is ="+ area + "<br>");
    document.write("Entered city is ="+ city + "<br>");
    document.write("Entered State is ="+ state + "<br>");
    document.write("Entered Pincode is ="+ pincode + "<br>");
    // // document.write("Entered Qualification is ="+ qualification1 + "<br>");
    document.write("Entered Percentage in Qualification Level 1 is ="+ percentage1 + "<br>");
    // // document.write("your qualification  is ="+ qualification2 + "<br>");
    document.write("Entered Percentage in Qialification  Level 2 is ="+ percentage2 + "<br>");
    
    var head=document.createElement("h1");
    head.innerHTML=" please confirm the data entered";
    document.body.appendChild(head);
 
   
   
    var btn=document.createElement("button");
    btn.innerHTML="Confirm";
    document.body.appendChild(btn);
    btn.addEventListener("click", subfun);
    
  
    var btn1=document.createElement("button");
    btn1.innerHTML="edit";
    document.body.appendChild(btn1);
    btn1.addEventListener("click", editfun);


    

}
function editfun(){
    window.location.href="main.html";
 };

function subfun(){
   window.location.href="logout.html";
};





function edit(){

    

}