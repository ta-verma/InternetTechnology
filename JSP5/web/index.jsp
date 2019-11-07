

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 5</title>
    </head>
    <body><center><br><br><br><br>
        <form method="post">
            Input: <input type="text" name="vowel"><br/><br>
            Select :&ensp;
            <input type="radio" name="evod" value="odd" checked>&nbsp;Odd&ensp;
            <input type="radio" name="evod" value="even">Even <br><br>
            <input type="submit" value="submit" name="sub">
        </form>
    


        <c:if test="${param.sub=='submit'}">
    <c:set var="a" value="${param.vowel}"/>
    <c:set var="b" value="${param.evod}"/>
    <c:set var="c" value="${fn:split(a , '')}"/>
    <c:set var="f" value="true"/>
    <c:out value="${c[2]}"/>
    <c:choose>
        <c:when test="${b=='odd'}">
            <c:forEach var="k" begin="1" end="${fn:length(a)}"  step="2">
                <c:if test="${c[k]!='a'|| c[k]!='e'|| c[k]!='i'|| c[k]!='o'|| c[k]!='u'}">
                    <c:set var="f" value="false"/>
                </c:if>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <c:forEach begin="0" end="${fn:length(a)}" var="k" step="2">
                <c:if test="${c[k]!='a'|| c[k]!='e'|| c[k]!='i'|| c[k]!='o'|| c[k]!='u'}">
                    <c:set var="f" value="false"/>
                </c:if>
            </c:forEach>
        </c:otherwise>
    </c:choose>
    <br>
    <c:choose>
        <c:when test="${f=='false'}">
            <c:out value="You lose!!" />
        </c:when>
        <c:otherwise>
            <c:out value="You Win!!" />
        </c:otherwise>
    </c:choose>  
    </c:if>
    </center>
</body>
</html>
