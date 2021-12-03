var date = new Date()

var hour = date.getHours()
/*
if(hour < 11) {
    alert(hour + " Time to eat breakfast!")
} else if(hour < 15) {
    alert(hour + " Time to eat lunch!")
} else {
    alert(hour + " Time to eat dinner!")
}
*/

alert(date.getHours() + " hour")
alert(date.getMinutes() + " minutes")
alert(date.getSeconds() + " seconds")
// alert(date.getDate())

var week = date.getDate()

if(week == 0) {
    alert("Sun")
} else if(week == 1) {
    alert("MON")
} else if(week == 2) {
    alert("TUE")
} else if(week == 3) {
    alert("WEN")
} else if(week == 4) {
    alert("THU")
} else if(week == 5) {
    alert("FRI")
} else if(week == 6) {
    alert("SAT")
}

 alert(date.getFullYear() + " Year")