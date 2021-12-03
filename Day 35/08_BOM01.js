var child = window.open("http://www.google.com", "child1", "width=600, height=480")

window.setInterval(function() {
    child.moveBy(50, 50)
}, 1000)

var output = ""
for(var key in window) {
    output += "<h2> " + key + " : " + window[key] + "</h2>"
}
document.write(output)

var child = window.open('', '', "width=300, height=200")

child.moveTo(0, 0)
var width = screen.width
var height = screen.height
child.resizeTo(width, height)

setInterval(function() {
    child.resizeBy(-20, -20)
    child.moveBy(20, 20)
}, 1000)
