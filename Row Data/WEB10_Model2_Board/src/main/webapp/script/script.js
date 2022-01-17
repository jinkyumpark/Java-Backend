function loginCheck() {
	if(document.frm.userid.value.length == 0) {
		alert("Enter ID")
		document.frm.userid.focus()
		return false
	}
	if(document.frm.pwd.value.length == 0) {
		alert("Enter Password")
		document.frm.pwd.focus()
		return false
	}
	return true
}