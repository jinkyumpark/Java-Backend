/*
// 1. Function Parameter
function add(a, b) {
    c = a + b
    document.write(a + "+" + b + "=" + c + "<br>")
    return c
}

var result = add(10, 20)

// 2. Use of Parameter
function f(x) {
    document.write(x + "*" + x + "=" + (x*x) + "<br>")
    return x*x;
}
result = f(5, 3)

// 3. Function Overloading
var array1 = Array()
var array2 = Array(10)
var array3 = Array(25, 35, 45, 55)
document.write("<h1>" + array1 + "<br>" + array2 + "<br>" + array3 + "</h1>")

// 4. Arguments Variable
function sumAll() {
    document.write("<h1>" + typeof(arguments) + " : " + arguments.length + "</h1>")
    var s = ""
    var sum = 0
    for(var i in arguments) {
        s += arguments[i] + " "
        sum += argument[i]
    }
    document.write("<h1>Argument:" + s + "</h1>")
    document.write("<h1>Sum:" + sum + "</h1>")
}

sumAll(1, 2, 3, 4, 5)
sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9)
*/

// 5. When return value is anonymous function
function returnFunc() {
    return function() {
        document.write("<h1>Returned Function</h1>")
    }
}

var value = returnFunc()
value()

returnFunc()() // Valid

// 6. Anonymous Function as a parameter
function varFunction(varFunc) {
    for(var i = 0; i < 5; i++)
        varFunc()
}

var func = function() {
    document.write("<h1>Hello Javascript...!</h1>")
}
varFunction(func)
varFunction(function(){
    document.write("<h1>Hello Javascript...!</h1>")
})

// 7. Declarative Function as a parameter
function justFunction() {
    document.write("<h1>Hello Javascript...#2 </h1>")
}
varFunction(justFunction)

// 8. Local Variable and 
function test(name) {
    var output = "Hello " + name + "..!"
}

var s = test("Jin")
document.write("<h1>" + s + "</h1>")

// 9. Closure : 지역변수의 값을 살리고 활용하기 위해
// 리턴되는 함수의 리턴값으로 활용. 리턴값 외에
// 함수 실행 후 없어지는 지역 변수 값을 활용하기 위한 방법

function test2(name) {
    var output = "Hello " + name + "..!"
    return function() {
        return output
    }
}

var func1 = test2("Jin Park")
var s = func1()
document.write("<h1>" + s + "</h1>")
document.write("<h1>" + func1() + "</h1>")
document.write("<h1>" + test2("Jin Park")() + "</h1>")
