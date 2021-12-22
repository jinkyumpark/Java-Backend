var output = ""
for(var key in location) {
    output += "<h3>@ " + key + ":" + location[key] + "</h3>"
}
document.write(output)

// 페이지 이동 방법 4가지
// location = "https://www.daum.net"
// location.href="https://www.google.com"
// location.assign("https://www.naver.com")
// location.replace("https://www.apple.com")

// 현재 페이지 새로 고침
// location = location
// location.href = location.href
// location.assign(location)
// location.replace(location)
// location.reload()
