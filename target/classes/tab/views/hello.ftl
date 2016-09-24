<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="University of San Francisco" content="ITS - Business Intelligence Portal, JavaScript, HTML, CSS, jquery, bootstrap">
	
	    <title>BIP Home</title>
	    <!-- favicon -->
	    <link rel="icon" href="/assets/img/favicon.ico">
	    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	    <!-- Bootstrap Core CSS -->
	    <link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.css">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
	    <!--Custom CSS -->
	    <link rel="stylesheet" type="text/css" href="/assets/css/custom.css">
	    <script src="/assets/js/jquery-1.12.4.min.js" type="text/javascript"></script>
	    <script src="/assets/js/userPopup.js" type="text/javascript"></script>
    </head>
  <body>
        


	<div class="wrapper">
	        <header class="site-header">
	            <nav class="site-nav navbar-default navbar-fixed-top col-xs-12">
	                <span><a href="index.html" class="logo">
	                <img src="/assets/img/usflogolgtrans.png" alt="USF Logo" />
	              </a></span>
	                        <ul>
	                            <li class="active"><a href="/">Home</a>
	                            </li>
	                            <li><a href="glossary">Glossary</a>
	                            </li>
	                            <li><a href="https://dataviz.usfca.edu/#/projects">Reports</a>
	                            </li>
	                            <li><a href="faq">FAQ</a>
	                            </li>
	                            <li>
	                        <form class="navbar-form" role="search">
	                            <div class="input-group">
	                                <input type="text" class="form-control" placeholder="Search" name="search" id="search">
	                                <div class="input-group-btn">
	                                    <button class="btn btn-default" type="submit">
	                                        <i class="glyphicon glyphicon-search"></i>
	                                    </button>
	                                </div>
	                            </div>
	                        </form>
	                    </li>
	                </ul>
	            </nav>
	        </header>
	        
	      <div class="container">

            <div class="grid text-center col-sm-12">
                <div class="row col-sm-12 general">



				<#list cards as card>
                    <div class="content category">
                        <a href="#">
                     
                                <div class="overlay">GENERAL<br>UNIVERSITY</div>
                          
                            <h3 class="content-title"><span >${card.displayName}</span></h3>
                        </a>
                    </div>
                    
                </#list>
                    
                    <!-- End of general row -->
                </div>
            </div>
	        
	        
	        
	        <h1>${message} rocks!</h1>
	
	<!-- End of Entire Wrapper at top of body -->
	</div>
        
        
        
    </body>
</html>