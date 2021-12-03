// 1. Redefine Anonymous Function
var func = function() {
    document.write("<h1>Anonymous Function 1</h1>")
}
func()
var func = function() {
    document.write("<h1>Anonymous Function 2")
}
func()

// 2. Redefine Declarative Function
function move() {
    document.write("<h1>move() Function 1 Calling</h1>")
}
move()
function move() {
    document.write("<h1>move() Function 2 Calling")
}
move()
function move() {
    document.write("<h1>move() Function 3 Calling</h1>")
}
move()
