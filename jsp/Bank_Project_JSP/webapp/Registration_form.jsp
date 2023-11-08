<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-11-2023
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        *{
            padding: 0;
            margin: 0;
        }
        body{
            background: url(http://wrbbradio.org/wp-content/uploads/2016/10/grey-background-07.jpg) no-repeat center fixed;
            background-size: cover;
        }

        .container{
            background: #2d3e3f;
            width: 350px;
            height: 400px;
            padding-bottom: 20px;
            position: absolute;
            top:50%;
            left: 50%;
            transform: translate(-50%, -50%);
            margin: auto;
            padding: 70px 50px 20px 50px;
        }


        .fl{
            float: left;
            width: 110px;
            line-height: 35px;
        }

        .fontLabel{
            color: white;
        }

        .fr{
            float: right;
        }

        .clr{
            clear: both;
        }

        .box{
            width: 360px;
            height: 35px;
            margin-top: 10px;
            font-family: verdana;
            font-size: 12px;
        }

        .textBox{
            height: 35px;
            width: 190px;
            border: none;
            padding-left: 20px;
        }

        .new{
            float: left;
        }

        .iconBox{
            height: 35px;
            width: 40px;
            line-height: 38px;
            text-align: center;
            background: #ff6600;
        }

        .radio{
            color: white;
            background: #2d3e3f;
            line-height: 38px;
        }

        .terms{
            line-height: 35px;
            text-align: center;
            background: #2d3e3f;
            color: white;
        }

        .submit{
            float: right;
            border: none;
            color: white;
            width: 110px;
            height: 35px;
            background: #ff6600;
            text-transform: uppercase;
            cursor: pointer;
        }

        ::-webkit-input-placeholder { /* Chrome/Opera/Safari */

        }


    </style>
</head>
<body>
<div class="container">
    <form method="post" autocomplete="on" action="Registrationjsp.jsp">
        <!--First name-->
        <div class="box">
            <label for="Name" class="fl fontLabel">Name</label>
            <div class="new iconBox">
                <i class="fa fa-user" aria-hidden="true"></i>
            </div>
            <div class="fr">
                <input type="text" name="Name" placeholder="Name"
                       class="textBox" autofocus="on" required>
            </div>
            <div class="clr"></div>
        </div>
        <!--First name-->



        <!--First name-->
        <div class="box">
            <label for="User_id" class="fl fontLabel">User_id </label>
            <div class="new iconBox">
                <i class="fa fa-user" aria-hidden="true"></i>
            </div>
            <div class="fr">
                <input type="text" name="User_id" placeholder="User_id"
                       class="textBox" autofocus="on" required>
            </div>
            <div class="clr"></div>
        </div>
        <!--First name-->
        <!---Password------>
        <div class="box">
            <label for="password" class="fl fontLabel"> Password </label>
            <div class="fl iconBox"><i class="fa fa-key" aria-hidden="true"></i></div>
            <div class="fr">
                <input type="Password" required name="password" placeholder="Password" class="textBox">
            </div>
            <div class="clr"></div>
        </div>

        <div class="box">
            <label for="mobile" class="fl fontLabel"> Mobile: </label>
            <div class="fl iconBox"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
            <div class="fr">
                <input type="text" required name="mobile" maxlength="10" placeholder="mobile"Phone No." class="textBox">
            </div>
            <div class="clr"></div>
        </div>
        <!---Address------>
        <div class="box">
            <label for="Address" class="fl fontLabel"> Address: </label>
            <div class="fl iconBox"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
            <div class="fr">
                <input type="text" required name="Address" maxlength="10" placeholder="Address"Phone No." class="textBox">
            </div>
            <div class="clr"></div>
        </div>
        <!---Phone No.---->


        <!---Email ID---->
        <div class="box">
            <label for="City" class="fl fontLabel"> City: </label>
            <div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
            <div class="fr">
                <input type="City" required name="City" placeholder="City" class="textBox">
            </div>
            <div class="clr"></div>
        </div>
        <!--Email ID----->


        <!---Password------>
        <div class="box">
            <label for="Balance" class="fl fontLabel"> Password </label>
            <div class="fl iconBox"><i class="fa fa-key" aria-hidden="true"></i></div>
            <div class="fr">
                <input type="Balance" required name="Balance" placeholder="Balance" class="textBox">
            </div>
            <div class="clr"></div>
        </div>



        <!---Submit Button------>
        <div class="box" style="background: #2d3e3f">
            <input type="Submit" name="Submit" class="submit" value="SUBMIT">
        </div>
        <!---Submit Button----->
    </form>
</div>




/

</body>
</html>
