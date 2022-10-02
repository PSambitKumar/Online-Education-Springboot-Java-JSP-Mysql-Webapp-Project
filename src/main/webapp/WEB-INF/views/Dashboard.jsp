<%--
  Created by IntelliJ IDEA.
  User: sambit.pradhan
  Date: 10/2/2022
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>


<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">

    <!-- custom css file link  -->
    <link rel="stylesheet" href="css/style.css">

</head>

<body>
<c:if test="${not empty userType}">
    <c:choose>
        <c:when test="${userType == 'ADMIN'}">
            <c:set var="userType" value="ADMIN"/>
            <%--            For ADMIN--%>
            <header class="header">

                <section class="flex">

                    <a href="${pageContext.request.contextPath}/home" class="logo">Educa.</a>

                    <form action="search.html" method="post" class="search-form">
                        <input type="text" name="search_box" required placeholder="Search Courses..." maxlength="100">
                        <button type="submit" class="fas fa-search"></button>
                    </form>

                    <div class="icons">
                        <div id="menu-btn" class="fas fa-bars"></div>
                        <div id="search-btn" class="fas fa-search"></div>
                        <div id="user-btn" class="fas fa-user"></div>
                        <div id="toggle-btn" class="fas fa-sun"></div>
                    </div>

                    <div class="profile">
                        <img src="images/sambit.jpg" class="image" alt="">
                        <h3 class="name">${data.name}</h3>
                        <p class="role">${data.userType}</p>
                        <a href="profile.html" class="btn">View Profile</a>
                        <div class="flex-btn">
<%--                            <a href="login.html" class="option-btn">Change Password</a>--%>
                            <a href="register.html" class="option-btn">Logout</a>
                        </div>
                    </div>

                </section>

            </header>

            <div class="side-bar">

                <div id="close-btn">
                    <i class="fas fa-times"></i>
                </div>

                <div class="profile">
                    <img src="images/sambit.jpg" class="image" alt="profileImage">
                    <h3 class="name">${data.name}</h3>
                    <p class="role">${data.userType}</p>
                    <a href="profile.html" class="btn">View Profile</a>
                </div>

                <nav class="navbar">
                    <a href="javascript"><i class="fas fa-home"></i><span>Home</span></a>
                    <a href="teachers.html"><i class="fas fa-chalkboard-user"></i><span>Teachers</span></a>
                    <a href="teachers.html"><i class="fas fa-chalkboard-user"></i><span>Students</span></a>
                    <a href="courses.html"><i class="fas fa-graduation-cap"></i><span>Courses</span></a>
                    <a href="contact.html"><i class="fas fa-headset"></i><span>Contact us</span></a>
                    <a href="about.html"><i class="fas fa-question"></i><span>About</span></a>
                </nav>

            </div>

            <section class="home-grid">

                <h1 class="heading">quick options</h1>

                <div class="box-container">

                    <div class="box">
                        <h3 class="title">likes and comments</h3>
                        <p class="likes">total likes : <span>25</span></p>
                        <a href="#" class="inline-btn">view likes</a>
                        <p class="likes">total comments : <span>12</span></p>
                        <a href="#" class="inline-btn">view comments</a>
                        <p class="likes">saved playlists : <span>4</span></p>
                        <a href="#" class="inline-btn">view playlists</a>
                    </div>

                    <div class="box">
                        <h3 class="title">top categories</h3>
                        <div class="flex">
                            <a href="#"><i class="fas fa-code"></i><span>development</span></a>
                            <a href="#"><i class="fas fa-chart-simple"></i><span>business</span></a>
                            <a href="#"><i class="fas fa-pen"></i><span>design</span></a>
                            <a href="#"><i class="fas fa-chart-line"></i><span>marketing</span></a>
                            <a href="#"><i class="fas fa-music"></i><span>music</span></a>
                            <a href="#"><i class="fas fa-camera"></i><span>photography</span></a>
                            <a href="#"><i class="fas fa-cog"></i><span>software</span></a>
                            <a href="#"><i class="fas fa-vial"></i><span>science</span></a>
                        </div>
                    </div>

                    <div class="box">
                        <h3 class="title">popular topics</h3>
                        <div class="flex">
                            <a href="#"><i class="fab fa-html5"></i><span>HTML</span></a>
                            <a href="#"><i class="fab fa-css3"></i><span>CSS</span></a>
                            <a href="#"><i class="fab fa-js"></i><span>javascript</span></a>
                            <a href="#"><i class="fab fa-react"></i><span>react</span></a>
                            <a href="#"><i class="fab fa-php"></i><span>PHP</span></a>
                            <a href="#"><i class="fab fa-bootstrap"></i><span>bootstrap</span></a>
                        </div>
                    </div>

                    <div class="box">
                        <h3 class="title">become a tutor</h3>
                        <p class="tutor">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Perspiciatis, nam?</p>
                        <a href="teachers.html" class="inline-btn">get started</a>
                    </div>

                </div>

            </section>



            <section class="courses">

                <h1 class="heading">our courses</h1>

                <div class="box-container">

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-2.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-1.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete HTML tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-3.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-2.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete CSS tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-4.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-3.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete JS tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-5.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-4.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete Boostrap tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-6.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-5.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete JQuery tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                    <div class="box">
                        <div class="tutor">
                            <img src="images/pic-7.jpg" alt="">
                            <div class="info">
                                <h3>john deo</h3>
                                <span>21-10-2022</span>
                            </div>
                        </div>
                        <div class="thumb">
                            <img src="images/thumb-6.png" alt="">
                            <span>10 videos</span>
                        </div>
                        <h3 class="title">complete SASS tutorial</h3>
                        <a href="playlist.html" class="inline-btn">view playlist</a>
                    </div>

                </div>

                <div class="more-btn">
                    <a href="courses.html" class="inline-option-btn">view all courses</a>
                </div>

            </section>

            <footer class="footer">

                &copy; copyright @ 2022 by <span>Sambit Kumar Pradhan</span> | all rights reserved!

            </footer>

        </c:when>

    </c:choose>
</c:if>

<!-- custom js file link  -->
<script src="js/script.js"></script>
</body>

</html>