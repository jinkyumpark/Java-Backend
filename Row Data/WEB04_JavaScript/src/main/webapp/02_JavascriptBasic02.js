// 13 Array
var array = [273, 'string', true, function(){}, {}, [150, 170]]
document.write("<h1>13. Array</h1>")
for(let i = 0; i < array.length; i++) {
    document.write("<h3>" +i + ". " + array[i] + "</h3>")
}

// 14 undefined
document.write("<h1>14. Undefined</h1>")
document.write("<h3>" + typeof(variable) + "</h3>")
var variable2
document.write("<h3>" + typeof(variable2) + "</h3>")
variable3 = 100
document.write("<h3>" + typeof(variable3) + "</h3>")

// 15 Type Casting
document.write("<h1>15. Type Casting</h1>")

document.writeln(52 + 273)
document.writeln('52' + '273')
document.writeln('52' + 273)
document.writeln(52 + '273')

document.writeln('12' + 52 + 4)
document.writeln(52 + 2 + '12')

document.writeln('52' * 2)
document.writeln('52' - 2)
document.writeln('52' / 2)
document.writeln('52' % 3)
document.writeln('박진겸' - 2)
document.writeln('52' * "2")
document.writeln('52' - "2")
document.writeln('52' / "2")
document.writeln('52' % "3")

// 16 Force Type Casting
// Number()
// String()
document.write("<h1>16. Force Type Casting</h1>")

// 17 Boolean Type Casting
// Boolean()
// 0 - false, else - true
// '' - false, 'anything' - true
document.write("<h1>17. Boolean Type Casting</h1>")

document.write('<h3>Boolean(Nan)->' + Boolean(NaN) + '</h3>')
document.write('<h3>Boolean(\'0\')->' + Boolean('0') + '</h3>')
document.write('<h3>Boolean(null)->' + Boolean(null) + '</h3>')
document.write('<h3>Boolean(\'false\')->' + Boolean('false') + '</h3>')

// 16 일치 연산자
document.write("<h1>16. 일치연산자</h1>")

document.write("<h3>\'\' == false -> " + ('' == false))
document.write("<h3>\'\' == 0 -> " + ('' == 0))
document.write("<h3>0 == false -> " + (0 == false))
document.write("<h3>273 == \'273\' -> " + (273 == '273'))

document.write("<h3>\'\' === false -> " + ('' === false))
document.write("<h3>\'\' === 0 -> " + ('' === 0))
document.write("<h3>0 === false -> " + (0 === false))
document.write("<h3>273 === \'273\' -> " + (273 === '273'))
