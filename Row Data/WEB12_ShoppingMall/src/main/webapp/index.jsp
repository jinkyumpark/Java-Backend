<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<div id="main_img">
	<img src="images/main_img.jpg" style="border-radius: 20px 20px 20px 20px;" border: 2px solid white;">
</div>


<h2>New Item</h2>
<div id="bestProduct">
	<c:forEach items="${newList }" var="productVO">
		<div id="item">
			<img src="product_images/${productVO.image }"/>
			<h3>${productVO.name } - <fmt:formatNumber value="${productVO.price2 }" type="currency"/></h3>
		</div>
	</c:forEach>

</div>

<h2>Best Item</h2>
<div id="bestProduct">
	<c:forEach items="${bestList }" var="productVO">
		<img src="product_images/${productVO.image }"/>
		<h3>${productVO.name } - <fmt:formatNumber value="{productVO.price2}" type="currency"/></h3>
	</c:forEach>
</div>

<%@ include file="footer.jsp" %>
