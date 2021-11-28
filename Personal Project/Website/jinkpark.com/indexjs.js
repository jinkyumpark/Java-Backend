function showHide() {
    var doc = document.getElementById("investment")
    if(doc.style.display === "none") {
        doc.style.display = "block"
    } else {
        doc.style.display = "none"
    }
}

// Show Financial Subbutton
var topnavFinancial = document.getElementsById("topnavFinancial")
topnavFinancial.addEventListener("hover", function() {
    this.classList.toggle("active");
    var submenu = this.nextElementSibling;
    if(submenu.style.display === "block") {
        submenu.style.display = "none";
    } else {
        submenu.style.display = "block";
    }
});

// top menu active when clicked
var topnav = document.getElementsByClassName("topnav");
for(var i = 0; i < topnav.length; i++) {
    topnav[i].addEventListener("click", function() {
        if(topnav[i].style.backgroundColor === "darkred") {
            topnav[i].style.backgroundColor = "red";
        } else {
            topnav[i].style.backgroundColor = "darkred";
        }
    })
