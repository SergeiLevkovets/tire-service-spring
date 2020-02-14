<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tire Service</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">
    <style>
        *, body {
            -webkit-font-smoothing: antialiased;
            text-rendering: optimizeLegibility;
            -moz-osx-font-smoothing: grayscale;
        }
        * {
            line-height: 1.2;
            margin: 0;
        }

        html {
            color: #888;
            display: table;
            font-family: 'Nunito Sans', sans-serif;
            height: 100%;
            text-align: center;
            width: 100%;
        }

        .h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {
            font-family: 'Nunito Sans', sans-serif;
        }

        body {
            display: table-cell;
            vertical-align: middle;
            margin: 2em auto;
        }

        h1 {
            color: #2c3742;
            text-shadow: rgba(101, 137, 152, 0.3) 5px 1px, rgba(158, 220, 238, 0.2) 10px 3px;
            font-size: 150px;
            font-weight: 800;
            margin-bottom: 10px;
            letter-spacing: 2px;
        }
        h4 {
            color: #4a5361;
            text-transform: capitalize;
            font-size: 28px;
        }

        p {
            margin: 0 auto;
            max-width: 790px;
            margin-top: 20px;
            color: #666 ;
            margin-bottom: 10px;
            font-size: 15px;
            line-height: 20px;
        }
        a {
            display: inline-block;
            padding: 8px 15px;
            background-color: #2c3742;
            color: #fff;
            text-decoration: none;
            border-radius: 4px;
            margin-top: 20px;
        }

        @media only screen and (max-width: 280px) {

            body, p {
                width: 95%;
            }

            h1 {
                font-size: 1.5em;
                margin: 0 0 0.3em;
            }

        }

    </style>
</head>
<body>
        <h1>404</h1>
        <h4>Page Not Found</h4>
        <p>It's looking like you may have taken a wrong turn. Don't worry... it happens to the best of us. Here's a little tip that might help you get back on track.</p>
        <c:url value="index" var="index_url"></c:url>
        <a href="${index_url}">Return to Home</a>
<%@include file="/WEB-INF/pages/parts/script-import.jsp" %>
</body>
</html>

