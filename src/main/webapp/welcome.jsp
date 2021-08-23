<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=devsice-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <title>SSO</title>

    <link rel="stylesheet" type="text/css" href="http://account.beta.doptor.gov.bd/sso/lib/style.css"/>
    <script type="text/javascript" src="http://account.beta.doptor.gov.bd/sso/lib/script.2.min.js"></script>

</head>
<body style="background:#d6dedd">

<nav class="navbar navbar-expand-lg navbar-light" style="color: #1d643b; background: green">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" style="font-weight: bold; color: #fff;" href="#">
                    SSO Dashboard
                    <span class="sr-only">(current)</span>
                    <span style="padding-left:5px; font-size:20px;cursor:pointer" onclick="openNav()">&#9776;</span>
                </a>
            </li>
        </ul>
        <div class="form-inline my-2 my-lg-0">
            <div class="align-div">
                <div class="mr-sm-2" style="padding-top: 15px">
                    <li class="dropdown dropdown-language" id="sso-widget"></li>
                </div>
                <div class="my-2 my-sm-0">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
                           style="color: #fff; font-size: 13px; font-weight: bold">
                            <%
                                HttpSession httpSession = request.getSession();
                                String name = (String) httpSession.getAttribute("name");
                                String designation = (String) httpSession.getAttribute("designation");
                                String officeName = (String) httpSession.getAttribute("officeName");
                            %>
                            <%=name%> <%=designation%>
                            <br>
                            <%=officeName%>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" style="color: red" href="/ssologout">Logout</a>
                        </div>
                    </li>
                </div>
            </div>
        </div>
    </div>
</nav>

<div id="sso-sidenav" class="sidenav" style="background:#fff">
    <span style="padding-left:30px">ড্যাশবোর্ড</span>
    <a href="javascript:void(0)" style="font-size:20px;" class="closebtn" onclick="closeNav()">
        &times;
    </a>
    <a href="javascript:void(0)" style="font-size:15px;">ব্যবস্থাপনা -
        ১</a>
    <a href="javascript:void(0)" style="font-size:15px;">ব্যবস্থাপনা - ২</a>
    <a href="javascript:void(0)" style="font-size:15px;">ব্যবস্থাপনা - ৩</a>
</div>

<script>
    function openNav() {
        document.getElementById("sso-sidenav").style.width = "250px";
    }

    function closeNav() {
        document.getElementById("sso-sidenav").style.width = "0";
    }
</script>

</body>
</html>

<script>

    // let config = {
    //     "protocol": "http",
    //     "server": "account.beta.doptor.gov.bd",
    //     "port": 80,
    //     "context": "/sso/lib",
    //     "icon_dir": "/icon"
    // };
    //
    // let services = [
    //     {
    //         "id": 46096,
    //         "name": "SSO Testing",
    //         "logo_caption": "",
    //         "icon": "http://training.beta.doptor.gov.bd/images/applicationLogo/46096.png",
    //         "landing-page-url": "'http://98892766.ngrok.io/home'",
    //         "login-page-url": ""
    //     },
    //     {
    //         "id": 29006,
    //         "name": "oisf",
    //         "logo_caption": "",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/oisf-logo.png",
    //         "landing-page-url": "userdashboard",
    //         "login-page-url": "'http://training.beta.doptor.gov.bd'"
    //     },
    //     {
    //         "id": 43110,
    //         "name": "Nothi",
    //         "logo_caption": "Nothi",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/nothi-logo.png",
    //         "landing-page-url": "http://demo-training.nothi.gov.bd/dashboard",
    //         "login-page-url": "'http://demo-training.nothi.gov.bd'"
    //         //"login-page-url":"'http://103.48.18.21:8080/nothi_new_sso/login/?landing_page_uri=http://103.48.18.21:8080/nothi_new_sso/dashboard/detailDashboard'"
    //     },
    //
    //     /*  {
    //           "id": 30010,
    //           "name": "grs",
    //           "logo_caption":"GRS",
    //           "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/grs-logo.png",
    //           "landing-page-url": "http://www.grs.gov.bd/dashboard.do",
    //           "login-page-url":"'http://www.grs.gov.bd/login?a=1'"
    //       },*/
    //     {
    //         "id": 38012,
    //         "name": "grs",
    //         "logo_caption": "GRS*",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/grs_sandbox.png",
    //         "landing-page-url": "http://training.grs.gov.bd/dashboard.do",
    //         "login-page-url": "'http://training.grs.gov.bd/login?a=1'"
    //     },
    //     /*
    //         {
    //             "id": 43105,
    //             "name": "Nothi",
    //             "logo_caption":"Nothi",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/nothi-logo.png",
    //             "landing-page-url": "http://nothi.tappware.com/dashboard/dashboard",
    //             "login-page-url":"'http://nothi.tappware.com'"
    //             //"login-page-url":"'http://103.48.18.21:8080/nothi_new_sso/login/?landing_page_uri=http://103.48.18.21:8080/nothi_new_sso/dashboard/detailDashboard'"
    //         },
    //
    //         {
    //             "id": 23007,
    //             "name": "admin ecourt",
    //             "logo_caption":"Admin ecourt",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/admin_ecourt.png",
    //             "landing-page-url": "'http://admin.ecourt.gov.bd/home'",
    //             "login-page-url":"'http://admin.ecourt.gov.bd/'"
    //         },
    //
    //
    //         {
    //             "id": 24006,
    //             "name": "appeal ecourt",
    //             "logo_caption":"Adalot",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/appeal_ecourt.png",
    //             "landing-page-url": "'http://appeal.ecourt.gov.bd/home'",
    //             "login-page-url":"'http://appeal.ecourt.gov.bd/'"
    //         },
    //         {
    //             "id": 30006,
    //             "name": "certificate ecourt",
    //             "logo_caption":"Certificate ecourt",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/certificate_ecourt.png",
    //             "landing-page-url": "'http://gcc.ecourt.gov.bd/home'",
    //             "login-page-url":"'http://gcc.ecourt.gov.bd/'"
    //         },
    //         {
    //             "id": 30008,
    //             "name": "appeal ecourt",
    //             "logo_caption":"Appeal ecourt*",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/appeal_ecourt_sandbox.png",
    //             "landing-page-url": "'http://appeal.ecourt.doptor.gov.bd:8080/home'",
    //             "login-page-url":"'http://appeal.ecourt.doptor.gov.bd:8080/'"
    //         },
    //         {
    //             "id": 30009,
    //             "name": "certificate ecourt",
    //             "logo_caption":"Certificate ecourt*",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/certificate_ecourt_sandbox.png",
    //             "landing-page-url": "'http://gcc.ecourt.doptor.gov.bd:8080/home'",
    //             "login-page-url":"'http://gcc.ecourt.doptor.gov.bd:8080/'"
    //         },
    //         {
    //             "id": 30007,
    //             "name": "admin ecourt",
    //             "logo_caption":"Admin ecourt*",
    //             "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/admin_ecourt_sandbox.png",
    //             "landing-page-url": "'http://admin.ecourt.doptor.gov.bd:8080/home'",
    //             "login-page-url":"'http://admin.ecourt.doptor.gov.bd:8080/'"
    //         },*/
    //     {
    //         "id": 43103,
    //         "name": "Training BSAP",
    //         "logo_caption": "BSAP",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/bsap_sandbox.png",
    //         "landing-page-url": "'http://office.training.service.gov.bd'",
    //         "login-page-url": "'http://office.training.service.gov.bd/users/login'"
    //     },
    //     {
    //         "id": 43109,
    //         "name": "Mutated Khatian",
    //         "logo_caption": "Mutated_Khatian",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/Mutated_sandbox.png",
    //         "landing-page-url": "'http://dev-emutation.eserve.org.bd:804'",
    //         "login-page-url": "'http://dev-emutation.eserve.org.bd:804'"
    //     },
    //     {
    //         "id": 43104,
    //         "name": "BTRC NOC IMEI Database",
    //         "logo_caption": "BTRC",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/BTRC_sandbox.png",
    //         "landing-page-url": "'http://training-btrc.eserve.org.bd/dashboard'",
    //         "login-page-url": "'http://training-btrc.eserve.org.bd'"
    //     },
    //     {
    //         "id": 43114,
    //         "name": "certificate ecourt",
    //         "logo_caption": "Certificate ecourt",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/certificate_ecourt.png",
    //         "landing-page-url": "'http://gcc.ecourt.doptor.gov.bd:8080/home'",
    //         "login-page-url": "'http://gcc.ecourt.doptor.gov.bd:8080'"
    //     },
    //     {
    //         "id": 43116,
    //         "name": "Admin E Court Sandbox",
    //         "logo_caption": "Admin E Court Sandbox",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/admin_ecourt.png",
    //         "landing-page-url": "'http://admin.ecourt.doptor.gov.bd:8080/home'",
    //         "login-page-url": "'http://admin.ecourt.doptor.gov.bd:8080'"
    //     },
    //     {
    //         "id": 43113,
    //         "name": "GRP",
    //         "logo_caption": "GRP",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/43113.png",
    //         "landing-page-url": "'http://grp.gov.bd/dashboard'",
    //         "login-page-url": "'http://grp.gov.bd'"
    //     }
    //     ,
    //     {
    //         "id": 43112,
    //         "name": "Automatic Report Generation System",
    //         "logo_caption": "Automatic Report Generation System",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/43112.png",
    //         "landing-page-url": "'http://args.bdspiderit.com/home'",
    //         "login-page-url": "'http://args.bdspiderit.com/'"
    //     }
    //     ,
    //     {
    //         "id": 43117,
    //         "name": "MMCM",
    //         "logo_caption": "MMCM",
    //         "icon": config["protocol"] + "://" + config["server"] + ":" + config["port"] + config["context"] + config["icon_dir"] + "/43117.png",
    //         "landing-page-url": "'http://mmcm.gov.bd'",
    //         "login-page-url": "'http://mmcm.gov.bd'"
    //     }
    //     /*
    //     {
    //         "id": 43106,
    //         "name": "Training BSAP",
    //         "logo_caption": "BSAP",
    //         "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/bsap_sandbox.png",
    //         "landing-page-url": "'http://training.service.gov.bd'",
    //         "login-page-url":"'http://training.service.gov.bd/doptor/login'"
    //     },*/
    //     /* {
    //          "id": 43097,
    //          "name": "eMutation",
    //          "logo_caption": "E Mutation",
    //          "icon": config["protocol"]+"://"+config["server"]+":"+config["port"]+config["context"]+config["icon_dir"]+"/emutation-logo.png",
    //          "landing-page-url": "'http://office.land.doptor.gov.bd:8083/dashboard'",
    //          "login-page-url":"'http://office.land.doptor.gov.bd:8083/'"
    //      }*/
    // ];
    //
    // function Widget() {
    // }
    //
    // let widgetColor, widgetSize, ajaxUrl, appPermissionURL;
    //
    // Widget.prototype.init = function (obj) {
    //     if (obj.hasOwnProperty("widgetColor")) widgetColor = obj["widgetColor"];
    //     if (obj.hasOwnProperty("widgetSize")) widgetSize = obj["widgetSize"];
    //     if (obj.hasOwnProperty("ajaxUrl")) ajaxUrl = obj["ajaxUrl"];
    //     if (obj.hasOwnProperty("appPermissionURL")) appPermissionURL = obj["appPermissionURL"];
    //
    //     this.getPermittedAppList(appPermissionURL);
    //     this.widgetDisposeHandler();
    // };
    //
    // Widget.prototype.widgetDisposeHandler = function () {
    //     $("body").click(
    //         function (e) {
    //             // language=JQuery-CSS
    //             let container = $(`#dropdownDiv`);
    //             let dropbtn = $('.oisf-widget-dropbtn');
    //
    //             if (!(!dropbtn.is(e.target) && dropbtn.has(e.target).length === 0)) {
    //                 container.toggle();
    //             } else if (!container.is(e.target) && container.has(e.target).length === 0) {
    //                 if (container.is(":visible")) {
    //                     container.hide();
    //                 }
    //             }
    //         }
    //     );
    // };
    //
    // Widget.prototype.drawWidget = function (widgetColor, widgetHeight, apps) {
    //     let widgetIcon = "";
    //     if (widgetColor === "dark") {
    //         widgetIcon = "http://103.48.18.28/sso/lib/icon/widget-icon-dark.png";
    //     } else if (widgetColor === "light") {
    //         widgetIcon = "http://103.48.18.28/sso/lib/icon/widget-icon-light.png";
    //     } else {
    //         widgetIcon = "http://103.48.18.28/sso/lib/icon/widget-icon-light.png";
    //     }
    //
    //     let widgetIconHeight = "20px;";
    //     if (widgetHeight !== "") {
    //         widgetIconHeight = widgetHeight;
    //     }
    //
    //     let widget;
    //     widget = `<img class="oisf-widget-dropbtn" src="${widgetIcon}" style="height:${widgetIconHeight}"  alt=""><div id="dropdownDiv" class="dropdown-content"style="position: relative; width: 0px; height: 0px; z-index: 2; display: none;"><div class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"style="margin:30px; position:absolute;width:320px;left:-330px;background-color:#f2f2f2;border:1px solid #d8dade;display:grid;grid-template-columns:100px 100px 100px;float: right">`;
    //
    //     for (let i in services) {
    //         if (apps.includes(services[i]["id"]))
    //             widget += `<div class="sso-logo-box"><a onclick="window.open(${services[i]["login-page-url"]})" target="_blank"><img class="sso-logo"data-landing-page-url="${services[i]["landing-page-url"]}" data-appName="${services[i]["name"]}" src="${services[i]["icon"]}" </a></div>`;
    //     }
    //     widget += '<form method="post" id="ialoginform" style="display:none" target="_blank">' +
    //         '<input type="hidden" name="appName" id="appName">' +
    //         '<input type="hidden" name="token" id="token">' +
    //         '</form>';
    //
    //     widget += '</div>' +
    //         '</div>';
    //
    //     let body = document.body;
    //     document.getElementById('sso-widget').innerHTML = widget;
    //
    //     // let mydiv = document.getElementById("sso-sidenav");
    //     // for (let i in services) {
    //     //     if (apps.includes(services[i]["id"])) {
    //     //
    //     //         mydiv.innerHTML += `<div class="sso-left-logo-box">
    //     //                 <a onclick="window.open(${services[i]["login-page-url"]})" target="_blank">
    //     //                     <img class="sso-left-logo"data-landing-page-url="${services[i]["landing-page-url"]}" data-appName="${services[i]["name"]}" src="${services[i]["icon"]}"
    //     //                 </a>
    //     //                 <span class="sso-service-name">
    //     //                     ${services[i]["name"]}
    //     //                 </span>
    //     //             </div>`;
    //     //     }
    //     // }
    // };
    //
    // function addWindowClickHandler() {
    //     window.onclick = function (event) {
    //         if (!event.target.matches('.oisf-widget-dropbtn')) {
    //             let dropdowns = document.getElementsByClassName("oisf-widget-dropdown-content");
    //             let i;
    //             for (i = 0; i < dropdowns.length; i++) {
    //                 let openDropdown = dropdowns[i];
    //                 if (openDropdown.classList.contains('oisf-widget-show')) {
    //                     openDropdown.classList.remove('oisf-widget-show');
    //                 }
    //             }
    //         }
    //     }
    // }
    //
    // function dropdown() {
    //     document.getElementById("oisf-widget-dropdownDiv").classList.toggle("oisf-widget-show");
    // }
    //
    // Widget.prototype.getPermittedAppList = function (url) {
    //     $.ajax({
    //         url: url,
    //         success: function (data) {
    //             if (typeof (data) == "string") widget.drawWidget(widgetColor, widgetSize, JSON.parse(data));
    //             else widget.drawWidget(widgetColor, widgetSize, data);
    //         },
    //         error: function () {
    //             console.log("error");
    //             widget.drawWidget(widgetColor, widgetSize, []);
    //         }
    //     });
    // };
    //
    // let widget = new Widget();

    widget.init({
        "widgetColor": "light",
        "widgetSize": "20px",
        "appPermissionURL": 'http://2d4897b2.ngrok.io/Widget'
    });
</script>

<style>
    li {
        list-style: none;
        margin: 0;
    }

    .align-div div {
        float: left;
        clear: none;
    }

    .sso-service-name {
        font-size: 14px;
    }

    /* Left side logo style */
    .sso-left-logo-box {
        margin: 10px;
    }

    .sso-left-logo {
        width: 45px;
        height: 45px;
    }

    /* Side bar style */

    .sidenav {
        height: 100%;
        width: 0;
        position: fixed;
        z-index: 1;
        top: 12%;
        left: 0;
        background-color: #111;
        overflow-x: hidden;
        transition: 0.5s;
        padding-top: 60px;
    }

    .sidenav a {
        padding: 8px 8px 8px 32px;
        text-decoration: none;
        font-size: 25px;
        color: #818181;
        display: block;
        transition: 0.3s;
    }

    .sidenav a:hover {
        color: #f1f1f1;
    }

    .sidenav .closebtn {
        position: absolute;
        top: 0;
        right: 25px;
        font-size: 36px;
        margin-left: 50px;
    }

    @media screen and (max-height: 450px) {
        .sidenav {
            padding-top: 15px;
        }

        .sidenav a {
            font-size: 18px;
        }
    }

</style>
