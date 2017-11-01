<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>

        <h5>Details:</h5>
        Product Name: ${product.name}<br/>
        Category: ${product.category.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}
    
    <form:form  modelAttribute="newProduct" action="listproducts" method="get">
           <input id="submit" type="submit"  
                value="List products">
	</form:form>
    
</div>
</body>
</html>