<%--
  Created by IntelliJ IDEA.
  User: aethomas
  Date: 22/02/14
  Time: 19:44
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
    <!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
    <!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
    <!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
    <!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
    <!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title><g:layoutTitle default="Back Office"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
        <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
        <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
        <g:layoutHead/>
        <g:javascript library="application"/>
        <r:require module="blueprint"/>
        <r:layoutResources />
    </head>
    <body>

        <div class="navbar navbar-inverse navbar-fixed-top">

            <div class="container">
                <div class="navbar-header">
                    <a href="../" class="navbar-brand">Logo + Home Link</a>
                    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="navbar-collapse collapse" id="navbar-main">

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <form class="navbar-form navbar-left">
                                <input type="text" class="form-control col-lg-8" placeholder="Search">
                            </form>
                        </li>
                    </ul>

                </div>
            </div>

        </div>

        <div class="container page-header">

        <!-- Navbar
        ================================================== -->
        <div class="bs-docs-section page-header clearfix">
            <div class="row">
                <div class="col-lg-2">

                    <div class="bs-example">
                        <div class="navbar navbar-default">

                            <div class="navbar-collapse collapse navbar-responsive-collapse">
                                <ul class="nav navbar-nav">
                                    <li class="active"><a href="#">Dashboard</a></li>
                                    <li><a href="#">Orders</a></li>
                                    <li><a href="#">Customers</a></li>
                                    <li><a href="#">Discounts</a></li>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Products <b class="caret"></b></a>
                                        <ul class="dropdown-menu">
                                            <li><a href="#">Collections</a></li>
                                            <li><a href="#">Another action</a></li>
                                            <li><a href="#">Something else here</a></li>
                                            <li class="divider"></li>
                                            <li class="dropdown-header">Dropdown header</li>
                                            <li><a href="#">Separated link</a></li>
                                            <li><a href="#">One more separated link</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div><!-- /.nav-collapse -->
                        </div><!-- /.navbar -->

                    </div><!-- /example -->

                </div>

                <div class="col-lg-10">

                    <div class="page-header">
                        <h1 id="navbar">Navbar</h1>
                    </div>

                </div>

            </div>
        </div>

    </div>

    <r:layoutResources />
    </body>
</html>