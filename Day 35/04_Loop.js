// 1
/*
var value = 1
var s = ""
while(value < 5) {
    alert(value)
    s += value
    value++
}
alert(s)
*/

// 2
/*
var value = 0
var startTime = new Date().getTime()
endTime = startTime + 1000

while(new Date().getTime() < endTime) {
    value++
}
alert("Start Time : " + startTime)
alert("End Time : " + endTime)
alert("Repeated Time : " + value)
*/

// 3 do-while
var value = 10
do {
    alert(value)
    value++
} while(value <= 5)
